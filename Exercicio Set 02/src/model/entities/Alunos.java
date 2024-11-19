package model.entities;

import java.util.Objects;

public class Alunos {
    private Integer code;

    public Alunos(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(code, alunos.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
