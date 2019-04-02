package com.example.cloud.web.api.callback;

import com.example.cloud.web.api.fallback.CarFailBackApi;
import com.example.cloud.car.api.CarRemoteServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by Administrator on 2019/1/7.
 */
@FeignClient(value = "car", fallback = CarFailBackApi.class)
public interface CarCallBackApi extends CarRemoteServiceApi {
}
