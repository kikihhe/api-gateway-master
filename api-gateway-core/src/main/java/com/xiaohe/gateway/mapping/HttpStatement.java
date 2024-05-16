package com.xiaohe.gateway.mapping;

public class HttpStatement {
    /**
     * 应用名称
     */
    private String application;

    /**
     * 接口全限定类名
     */
    private String interfaceName;

    /**
     * 方法名称
     */
    private String methodName;

    /**
     * 路径
     */
    private String uri;

    /**
     * 接口类型
     */
    private HttpCommandType httpCommandType;


    public HttpStatement(String application, String interfaceName, String methodName, String uri, HttpCommandType httpCommandType) {
        this.application = application;
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.uri = uri;
        this.httpCommandType = httpCommandType;
    }

    public String getApplication() {
        return application;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getUri() {
        return uri;
    }

    public HttpCommandType getHttpCommandType() {
        return httpCommandType;
    }
}
