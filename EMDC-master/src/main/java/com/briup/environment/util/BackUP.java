package com.briup.environment.util;

import java.io.IOException;

/**
 * 公共的备份模块

 */
public interface BackUP extends EmdcModule{
    void store(String filePath,Object obj,boolean append) throws Exception;
    Object load(String filePath, boolean del) throws Exception;
}
