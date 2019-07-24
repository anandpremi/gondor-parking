package org.gondor.parkingservice.service;

import org.gondor.parkingservice.dto.request.ParkingRequest;
import org.gondor.parkingservice.dto.request.VehicleDTO;
import org.gondor.parkingservice.exception.InvalidSSRException;
import org.gondor.parkingservice.exception.ParkingFullException;
import org.gondor.parkingservice.model.parkingprocess.Parking;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface ParkingService {
    List<Parking> findAll();

    Parking findById(BigInteger parkingId);

    Parking save(Parking parkingDetails);

    void delete(Parking parking);

    Parking createParking(ParkingRequest parkingRequest) throws InvalidSSRException, ParkingFullException;

    Parking freeUpParking(VehicleDTO vehicleDTO);
}
