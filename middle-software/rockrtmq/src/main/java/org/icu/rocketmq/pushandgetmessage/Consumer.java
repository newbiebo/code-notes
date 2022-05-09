package org.icu.rocketmq.pushandgetmessage;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {

    public static void main(String[] args) throws MQClientException, MQClientException {

        //谁来收？消费者
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group1");
        //收哪儿的消息？命名中心获取消息服务器地址
        consumer.setNamesrvAddr("localhost:9876");
        //监听哪那个消息队列？
        consumer.subscribe("topic1","*");
        //处理业务流程
        //注册监听器
        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                //写业务逻辑
                //list中就说发送的消息
                for (MessageExt messageExt : list) {

                    System.out.println(messageExt);
                    System.out.println(new String(messageExt.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        //启动消费者
        consumer.start();
        System.out.println("消费者启动");
        //不用关掉消费者
    }
}
