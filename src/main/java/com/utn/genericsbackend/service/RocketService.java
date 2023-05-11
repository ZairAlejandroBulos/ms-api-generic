package com.utn.genericsbackend.service;

import com.utn.genericsbackend.entity.Rocket;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RocketService extends BaseService<Rocket, Long> {
    List<Rocket> findByName(String name) throws Exception;
    List<Rocket> findByOrderLaunchAsc() throws Exception;
    List<Rocket> findByOrderLaunchDesc() throws Exception;
}
