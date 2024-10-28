package model.entities;

import model.entities.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;


    //reforçar imutabilidade com o final
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut)  {
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }


    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration(){
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    //apenas jogando a exception quem trata é meu programa principal
    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Room ");
        builder.append(roomNumber);
        builder.append(", check-in: ");
        builder.append(formatter.format(checkIn));
        builder.append(", check-out: ");
        builder.append(formatter.format(checkOut));
        builder.append(", ");
        builder.append(duration());
        builder.append(" nights");
        return builder.toString();
    }


}
