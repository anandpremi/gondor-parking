package org.gondor.parkinglotservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.gondor.parkinglotservice.model.parkingstructure.ParkingLot;

import java.math.BigInteger;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, BigInteger> {

}
