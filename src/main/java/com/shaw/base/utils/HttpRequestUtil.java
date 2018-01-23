package com.shaw.base.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shaw.base.enums.ResultCodeEnum;
import com.shaw.base.exception.BusinessException;
import okhttp3.*;

/**
 * Http请求工具类
 * Created by shaw on 2018/1/18.
 */
public class HttpRequestUtil {

    public static final MediaType JSONTYPE = MediaType.parse("application/json; charset=utf-8");
    /**
     * http post
     * @param url
     * @return
     */
    public JSONObject httpGet(String url) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        JSONObject result = null;
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()){
                result = JSON.parseObject(response.body().toString());
            }
        } catch (Exception e) {
            throw new BusinessException(ResultCodeEnum.E9999_0002.code,ResultCodeEnum.E9999_0002.getResultMsg(url),e);
        }
        return result;
    }

    /**
     * http post
     * @param url
     * @param inParam
     * @return
     */
    public static JSONObject httpPost(String url,String inParam){
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(JSONTYPE,inParam);
        Request request = new Request.Builder().url(url).post(requestBody).build();
        JSONObject result = null;
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()){
                result = JSON.parseObject(response.body().toString());
            }
        } catch (Exception e) {
            throw new BusinessException(ResultCodeEnum.E9999_0001.code,ResultCodeEnum.E9999_0001.getResultMsg(url),e);
        }
        return result;
    }
}
