package ru.merkurev.fleetmanagement.vehicle;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emergency/vehicles")
public class VehicleController {
  
  @GetMapping
  public List<VehicleDto> getVehicles() {
    throw new RuntimeException("Not Implemented");
  }
  
}
