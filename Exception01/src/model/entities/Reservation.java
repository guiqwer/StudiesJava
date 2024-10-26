package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;


    //reforçar imutabilidade com o final
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
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

    public void upDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();

        // Verifica se as datas são hoje ou futuras
        if (checkIn.isAfter(now) || checkOut.isAfter(now)) {
            throw new IllegalArgumentException("Reservation dates for update must be future dates");
        }

        // Verifica se a data de check-out é depois da data de check-in
        if (!checkOut.isAfter(checkIn)) {
            throw new IllegalArgumentException("Check-out date must be after check-in date");
        }

        // Atualiza as datas
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
