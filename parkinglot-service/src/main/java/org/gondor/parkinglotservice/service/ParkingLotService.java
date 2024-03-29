package org.gondor.parkinglotservice.service;


import org.gondor.parkinglotservice.model.parkingstructure.ParkingLot;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface ParkingLotService {
    List<ParkingLot> findAll();

    ParkingLot save(ParkingLot parkingLot);

    ParkingLot findById(BigInteger parkingLotId);

    void delete(ParkingLot parkingLot);
}
