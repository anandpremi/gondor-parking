package org.gondor.parkingservice.exception;

import java.math.BigInteger;

public class ParkingFullException extends Exception {
    public ParkingFullException(String message) {
        super(message);
    }
}
