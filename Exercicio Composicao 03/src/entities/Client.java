package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private String email;
    private LocalDate birthdate;

    public Client(){

    }

    public Client(String nome, String email, LocalDate birthdate) {
        this.nome = nome;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Client: ");
        sb.append(getNome());
        sb.append(formatter.format(getBirthdate()));
        sb.append(" - ");
        sb.append(getEmail());
        return sb.toString();
    }

}
