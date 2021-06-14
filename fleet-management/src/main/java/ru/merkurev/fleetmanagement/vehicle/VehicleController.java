package ru.merkurev.fleetmanagement.vehicle;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emergency/vehicles")
public class VehicleController {

  @GetMapping
  public List<VehicleDto> getVehicles() {
    throw new RuntimeException("Not Implemented");
  }

  @GetMapping("/{id}")
  public List<VehicleDto> getVehicleById(@PathVariable Long id) {
    throw new RuntimeException("Not Implemented");
  }

  @PostMapping
  public List<VehicleDto> createVehicle(@RequestBody VehicleDto vehicleDto) {
    throw new RuntimeException("Not Implemented");
  }

  @PutMapping("/{id}")
  public List<VehicleDto> editVehicle(@PathVariable Long id, @RequestBody VehicleDto vehicleDto) {
    throw new RuntimeException("Not Implemented");
  }

  @DeleteMapping("/{id}")
  public List<VehicleDto> deleteVehicle(@PathVariable Long id) {
    throw new RuntimeException("Not Implemented");
  }
}
