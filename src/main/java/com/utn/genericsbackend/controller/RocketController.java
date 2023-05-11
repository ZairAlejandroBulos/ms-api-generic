package com.utn.genericsbackend.controller;

import com.utn.genericsbackend.entity.Rocket;
import com.utn.genericsbackend.service.RocketServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/rockets")
public class RocketController extends BaseControllerImpl<Rocket, RocketServiceImpl> {

    @GetMapping("/byName/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.findByName(name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. No se pudieron recuperar los cohetes por nombre\"}");
        }
    }

    @GetMapping("/firstLaunchAsc")
    public ResponseEntity<?> getFirstLaunchAsc() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.findByOrderLaunchAsc());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. No se pudieron recuperar los cohetes en forma ascendente\"}");
        }
    }

    @GetMapping("/firstLaunchDesc")
    public ResponseEntity<?> getFirstLaunchDesc() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.findByOrderLaunchDesc());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. No se pudieron recuperar los cohetes en forma descendente\"}");
        }
    }
}
