package com.hmall.geteway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class MyGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // TODO 模拟登录校验逻辑
        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        //soutv
        System.out.println("headers = " + headers);
        //调用下一个过滤器，放行
        return chain.filter(exchange);
    }

    // 通过order规定过滤器优先级，实现上下层顺序
    // 需要在netty filter过滤器（请求转发）之前过滤，所以设置优先级
    @Override
    public int getOrder() {
        return 0;
    }
}
