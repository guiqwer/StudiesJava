package entities;

import java.util.Objects;

public class Register {
    private String name;
    private Integer vote;

    public Register(String name, Integer vote) {
        this.name = name;
        this.vote = vote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return Objects.equals(name, register.name) && Objects.equals(vote, register.vote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vote);
    }


}
