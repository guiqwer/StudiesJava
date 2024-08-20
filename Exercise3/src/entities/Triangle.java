package entities;

// Atributos
public class Triangle {
    public double a, b, c;

    // não precisa passar os parametros pq ja ta na classe triangulo
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

