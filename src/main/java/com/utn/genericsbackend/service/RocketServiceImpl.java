package com.utn.genericsbackend.service;

import com.utn.genericsbackend.entity.Rocket;
import com.utn.genericsbackend.repository.BaseRepository;
import com.utn.genericsbackend.repository.RocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RocketServiceImpl extends BaseServiceImpl<Rocket, Long> implements RocketService {

    @Autowired
    private RocketRepository rocketRepository;

    public RocketServiceImpl(BaseRepository<Rocket, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Rocket> findByName(String name) throws Exception {
        try {
            return rocketRepository.findByName(name);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Rocket> findByOrderLaunchAsc() throws Exception {
        try {
            return rocketRepository.findByOrderLaunchAsc();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Rocket> findByOrderLaunchDesc() throws Exception {
        try {
            return rocketRepository.findByOrderLaunchDesc();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
