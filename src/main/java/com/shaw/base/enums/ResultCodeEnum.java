package com.shaw.base.enums;

import java.text.MessageFormat;

/**
 * Created by shaw on 2018/1/19.
 */
public enum ResultCodeEnum {

    SUCCESS("0000","{0}调用成功"),
    E9999_0001("E9999_0001","httpPost请求异常:{0}请求地址"),
    E9999_0002("E9999_0002","httpGet请求异常:{0}请求地址")
    ;

    public String code;
    private String resultMsg;

    private ResultCodeEnum(String code, String resultMsg){
        this.code = code;
        this.resultMsg = resultMsg;
    }

    /**
     * 绑定变量，可变入参
     * @param arg1
     * @return
     */
    public String getResultMsg(Object... arg1) {
        return MessageFormat.format(resultMsg, arg1);
    }
}
