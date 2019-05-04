package com.framework.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class RequestBase {

  public static String buildJsonrpcRequest(String method, Object... params) {
    RequestBody jsonrpcRequestBody = new RequestBody(method, params);
    JSON jsonObj = (JSON) JSONObject.toJSON(jsonrpcRequestBody);
    return jsonObj.toJSONString();
  }

}
