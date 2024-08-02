package com.image;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class FilterClass implements GlobalFilter
{
	Logger logger = LoggerFactory.getLogger(FilterClass.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
	{
		logger.info("filter() method executed....");

		ServerHttpRequest request = exchange.getRequest();

		HttpHeaders header = request.getHeaders();

		Set<String> keyset = header.keySet();

		keyset.forEach(key -> {

			List<String> values = header.get(key);

			System.out.println(key + ": :" + values);

		});
		return chain.filter(exchange);
	}
}
