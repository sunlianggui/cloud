package com.example.cloud.api.fallback;

import com.example.cloud.api.callback.CarCallBackApi;
import com.example.cloud.car.model.Car;
import com.example.cloud.component.Result;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/1/7.
 */
@Component
public class CarFailBackApi implements CarCallBackApi {
    @Override
    public Result<Car> car() {
        return new Result<>("0", "失败");
    }
}
