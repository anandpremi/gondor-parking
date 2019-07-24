package org.gondor.parkingservice.ssr;

import org.gondor.parkingservice.dto.request.SSR;
import org.gondor.parkingservice.exception.InvalidSSRException;

public class SSRFactory {
    public static ParkingSSR getParkingSSR(String ssr) throws InvalidSSRException {
        ParkingSSR parkingSSR;
        if (ssr == null) {
            parkingSSR = new NoSSR();
        } else if (SSR.ELDER.name().equals(ssr)) {
            parkingSSR = new ElderSSR();
        } else if (SSR.ROYAL.name().equals(ssr)) {
            parkingSSR = new RoyalSSR();
        } else {
            throw new InvalidSSRException(ssr);
        }
        return parkingSSR;
    }
}
