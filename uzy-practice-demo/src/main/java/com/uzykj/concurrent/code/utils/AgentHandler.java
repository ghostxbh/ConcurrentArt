package com.uzykj.concurrent.code.utils;

import com.uzykj.concurrent.code.lesson01.RunnableTest;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ghostxbh 2019-10-30
 */
public class AgentHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RunnableTest runnableTest = new RunnableTest(1);
        Object invoke = method.invoke(runnableTest, args);
        return invoke;
    }

    public static void main(String[] args) {
        AgentHandler agentHandler = new AgentHandler();
        // agentHandler.invoke()
    }
}
