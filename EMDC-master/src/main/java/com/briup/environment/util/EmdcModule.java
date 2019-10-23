package com.briup.environment.util;

import java.util.Properties;

/**
 * 所有模块接口的父接口
 */
public interface EmdcModule {
    public void init(Properties prop) throws Exception;
}
