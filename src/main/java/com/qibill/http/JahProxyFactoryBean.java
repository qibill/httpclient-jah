package com.qibill.http;

import java.util.List;
import java.util.Map;

/**
 * 用于创建JA-H代理的工厂，此类提供对用于设置代理的内部属性的访问。
 * @author qibill
 * @date 2020/3/19 17:28
 **/
public class JahProxyFactoryBean {

    /**
     * url地址
     */
    private String address;

    /**
     * 被代理服务类
     */
    private Class<?> serviceClass;

    /**
     * 请求消息头
     */
    private List<Map<String, String>> requestHeader;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Class<?> getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(Class<?> serviceClass) {
        this.serviceClass = serviceClass;
    }

    public List<Map<String, String>> getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(List<Map<String, String>> requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * 创建可用于进行远程调用的JA-H代理。
     * @return  代理。在进行远程调用之前，必须将返回的对象强制转换为适当的类
     */
    public synchronized Object create() {
        return null;
    }
}
