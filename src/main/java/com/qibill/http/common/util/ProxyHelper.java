package com.qibill.http.common.util;

/**
 * 代理工具类
 *
 * @author qibill
 * @date 2020/3/25 17:18
 **/
public class ProxyHelper {
    static final ProxyHelper HELPER;

    static {
        ProxyHelper theHelper = null;
        //TODO Cglib
        theHelper = new ProxyHelper();
        HELPER = theHelper;
    }

    protected ProxyHelper() {
    }
}
