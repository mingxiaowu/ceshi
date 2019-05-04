package com.demo.test;

import static com.com.framework.util.RequestBase.buildJsonrpcRequest;

import com.comm.util.HttpUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testclass {

  @Test
  public void test1() throws Exception {


    HttpUtil.doPost("http://127.0.0.1:1337",buildJsonrpcRequest("blockNumber"));

    System.out.println("-------------0--------");
    Assert.assertTrue(true);
  }

  @Test
  public void test2() {
    System.out.println("-------------1--------");
  }


}
