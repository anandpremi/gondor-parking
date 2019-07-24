package org.gondor.parkingservice.ssr;

import org.gondor.parkingservice.dto.parkingstructure.Floor;
import org.gondor.parkingservice.dto.request.ParkingSpaceDTO;
import org.gondor.parkingservice.model.parkingprocess.Parking;

import java.math.BigInteger;
import java.util.List;

public interface ParkingSSR {

    ParkingSpaceDTO findNearestSlot(List<Parking> parkings, List<Floor> floors);
}
