package org.gondor.parkingservice.dto.parkingstructure;



import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

public class Floor {
    private BigInteger id;
    private Integer floorNumber;
    private List<ParkingSpace> parkingSpaceList;
    private ParkingLot parkingLot;

    public Floor() {
    }

    public Floor(BigInteger id, Integer floorNumber, List<ParkingSpace> parkingSpaceList, ParkingLot parkingLot) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.parkingSpaceList = parkingSpaceList;
        this.parkingLot = parkingLot;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpace> getParkingSpaceList() {
        return parkingSpaceList;
    }

    public void setParkingSpaceList(List<ParkingSpace> parkingSpaceList) {
        this.parkingSpaceList = parkingSpaceList;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Floor)) return false;
        Floor floor = (Floor) o;
        return Objects.equals(getId(), floor.getId()) &&
                Objects.equals(getFloorNumber(), floor.getFloorNumber()) &&
                Objects.equals(getParkingSpaceList(), floor.getParkingSpaceList()) &&
                Objects.equals(getParkingLot(), floor.getParkingLot());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFloorNumber(), getParkingSpaceList(), getParkingLot());
    }

    @Override
    public String toString() {
        return "Floor{" +
                "id=" + id +
                ", floorNumber=" + floorNumber +
                ", parkingSpaceList=" + parkingSpaceList +
                ", parkingLot=" + parkingLot +
                '}';
    }
}
