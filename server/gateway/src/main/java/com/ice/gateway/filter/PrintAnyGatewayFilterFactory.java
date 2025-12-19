package com.ice.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class PrintAnyGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {
    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            // 获取请求
            ServerHttpRequest request = exchange.getRequest();
            // 编写过滤器逻辑
            System.out.println("过滤器执行了");
            System.out.println("request: " + request);
            // 放行
            return chain.filter(exchange);
        };
    }
}


