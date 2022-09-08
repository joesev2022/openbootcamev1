package model;

public class Coche {
    int numPuertas;

    public Coche(){
        this.numPuertas = 0;
    }

    public int incrementarNumPuertas(int cant){
        if (cant < 0 || cant >= 5){
            System.out.println("No es permitido.");
            numPuertas = 0;
        } else {
            numPuertas += cant;
        }
        return numPuertas;
    }
}
