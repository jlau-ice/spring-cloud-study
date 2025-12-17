package com.ice.api.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("trade-service")
public interface OrderClient {

}
