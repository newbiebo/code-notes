package org.icu.rocketmq.pushandgetmessage;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class Producer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException, MQBrokerException, RemotingException {

        // 1. 谁来发？生产者
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        // 2. 发给谁？命名服务器
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        // 3. 怎么发？
        // 4. 发什么？主题、标签、内容
        SendResult send = producer.send(new Message("topic1", "tag1", "hello world".getBytes()));
        // 5. 发的结果是什么？
        System.out.println(send);
        // 6. 关闭生产者
        producer.shutdown();
    }
}
