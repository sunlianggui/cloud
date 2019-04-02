package com.example.cloud.web.api.fallback;

import com.example.cloud.web.api.callback.CarCallBackApi;
import com.example.cloud.car.model.Car;
import com.example.cloud.component.Response;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/1/7.
 */
@Component
public class CarFailBackApi implements CarCallBackApi {
    @Override
    public Response<Car> car() {
        return new Response<>("0", "失败");
    }
}
