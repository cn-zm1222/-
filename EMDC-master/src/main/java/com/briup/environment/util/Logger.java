package com.briup.environment.util;


public interface Logger extends EmdcModule{
    void debug(String msg);
    void info(String msg);
    void warn(String msg);
    void error(String msg);
    void fatal(String msg);
}
