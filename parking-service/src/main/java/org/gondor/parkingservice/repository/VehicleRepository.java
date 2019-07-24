package org.gondor.parkingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.gondor.parkingservice.model.object.Vehicle;

import java.math.BigInteger;
import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, BigInteger> {
    Optional<Vehicle> findTopByVehicleNumberPlateAndVehicleTypeOrderByIdDesc(String vehicleNumberPlate, String vehicleType);

}
