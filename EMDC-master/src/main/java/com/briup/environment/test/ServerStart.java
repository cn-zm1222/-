package com.briup.environment.test;

import com.briup.environment.bean.Environment;
import com.briup.environment.server.ServerImpl;
import com.briup.environment.util.Logger;
import com.briup.environment.util.LoggerImpl;

import java.util.Collection;

/**
 * 启动服务端
 */
public class ServerStart {
    public static void main(String[] args) throws Exception {
        //开启服务器
        new ServerImpl().receive();
    }
}
