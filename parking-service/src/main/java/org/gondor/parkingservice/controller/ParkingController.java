package org.gondor.parkingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.gondor.parkingservice.dto.request.ParkingRequest;
import org.gondor.parkingservice.dto.request.VehicleDTO;
import org.gondor.parkingservice.exception.InvalidSSRException;
import org.gondor.parkingservice.exception.ParkingFullException;
import org.gondor.parkingservice.model.parkingprocess.Parking;
import org.gondor.parkingservice.repository.ParkingRepository;
import org.gondor.parkingservice.service.ParkingService;

import javax.validation.Valid;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(value = "/parkings", produces = "application/json")
public class ParkingController {
    @Autowired
    ParkingService parkingService;

    @GetMapping
    public List<Parking> getAllParkings() {
        return parkingService.findAll();
    }

    @PostMapping
    public Parking createParking(@RequestBody ParkingRequest parkingRequest) throws InvalidSSRException, ParkingFullException {
        return parkingService.createParking(parkingRequest);
    }
    @PostMapping("/free")
    public Parking freeUpParking(@RequestBody VehicleDTO vehicleDTO) {
        return parkingService.freeUpParking(vehicleDTO);
    }
    @GetMapping("/{id}")
    public Parking getParkingById(@PathVariable(value = "id") BigInteger parkingId) {
        return parkingService.findById(parkingId);
    }

    @PutMapping("/{id}")
    public Parking updateParking(@PathVariable(value = "id") BigInteger parkingId,
                                 @Valid @RequestBody Parking parkingDetails) {

        parkingService.findById(parkingId);

        parkingDetails.setId(parkingId);

        Parking updatedParking = parkingService.save(parkingDetails);
        return updatedParking;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteParking(@PathVariable(value = "id") BigInteger parkingId) {
        Parking parking = parkingService.findById(parkingId);

        parkingService.delete(parking);

        return ResponseEntity.ok().build();
    }

}
