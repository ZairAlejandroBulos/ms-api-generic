package com.utn.genericsbackend.repository;

import com.utn.genericsbackend.entity.Rocket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RocketRepository extends BaseRepository<Rocket, Long> {

    @Query(value = "SELECT * FROM Rocket WHERE name LIKE %:name%", nativeQuery = true)
    List<Rocket> findByName(@Param("name") String name);

    @Query(value = "SELECT * FROM Rocket ORDER BY year_first_launch ASC", nativeQuery = true)
    List<Rocket> findByOrderLaunchAsc();

    @Query(value = "SELECT * FROM Rocket ORDER BY year_first_launch DESC", nativeQuery = true)
    List<Rocket> findByOrderLaunchDesc();

}
