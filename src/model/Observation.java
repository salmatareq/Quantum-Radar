package model;

import utils.CarType;
import utils.ErrorMessages;
import exeptions.InvalidPlateException;
import exeptions.InvalidSpeedException;

import java.time.LocalDate;

public class Observation {

    String plateNumber;
    LocalDate date;
    CarType carType;
    double speed;
    Boolean seatbeltFastened;

    public Observation(String plateNumber, LocalDate date, CarType carType, int speed, boolean seatbeltFastened)
            throws InvalidPlateException, InvalidSpeedException {
        if (plateNumber == null || plateNumber.isEmpty())
            throw new InvalidPlateException(ErrorMessages.INVALID_PLATE);
        if (speed < 0)
            throw new InvalidSpeedException(ErrorMessages.INVALID_SPEED);
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
    }

    public Boolean getSeatbeltFastened() {
        return seatbeltFastened;
    }

    public double getSpeed() {
        return speed;
    }

    public CarType getCarType() {
        return carType;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
