package ru.merkurev.fleetmanagement.vehicle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehicle", path = "vehicle")
public interface VehicleRepository extends CrudRepository<VehicleEntity, Long> {
}
