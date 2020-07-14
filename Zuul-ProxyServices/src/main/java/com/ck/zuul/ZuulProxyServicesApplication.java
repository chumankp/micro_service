package com.ck.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.ck.zuul.filters.ErrorFilter;
import com.ck.zuul.filters.PostFilter;
import com.ck.zuul.filters.Prefilter;
import com.ck.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProxyServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyServicesApplication.class, args);
	}

	@Bean
	public Prefilter preFilter() {
		return new Prefilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
