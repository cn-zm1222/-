package com.briup.environment.server;

import com.briup.environment.bean.Environment;
import com.briup.environment.util.EmdcModule;

import java.io.IOException;
import java.util.Collection;

/**
 * 服务端网络模块
 */
public interface Server extends EmdcModule {
    public void receive() throws Exception;
    public void shutdown() throws Exception;
}
