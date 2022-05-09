package org.icu.json;

import com.alibaba.fastjson.JSON;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class JsonTest {

        @Before
        public void init() {
        System.out.println("开始测试-----------------");
    }

        @Test
        public void jsonToMap(){
            //String转Map
        Map<String,String> map = (Map) JSON.parse("{\"1\":\"03\",\"19\":\"02\",\"23\":\"03\",\"24\":\"03\",\"25\":\"03\",\"26\":\"03\",\"29\":\"03\",\"30\":\"03\",\"31\":\"03\",\"32\":\"03\",\"06\":\"02\"}");
        for (String s : map.keySet()) {
            System.out.println("key"+":"+s+"->"+"value"+":"+map.get(s));
        }
            //Map转String
            String toJSONString = JSON.toJSONString(map);
            System.out.println(toJSONString);
        }

        @After
        public void after() {
        System.out.println("测试结束-----------------");
    }

}
