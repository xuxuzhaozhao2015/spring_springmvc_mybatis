package top.xuxuzhaozhao.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MyJsonMapper extends ObjectMapper {
    public MyJsonMapper(){
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
    }
}
