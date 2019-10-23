package com.briup.environment.client;

import com.briup.environment.bean.Environment;
import com.briup.environment.util.EmdcModule;

import java.io.IOException;
import java.util.Collection;

/**
 * 
 * 客户端-网络模块
 * 
 */
public interface Client extends EmdcModule{
    public void send(Collection<Environment> e) throws Exception;
}
