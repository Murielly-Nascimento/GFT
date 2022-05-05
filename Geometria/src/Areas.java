package Geometria.src;

public class Areas {

    public static double calcula(double lado){
        return lado*lado;
    }

    public static double calcula(double base, double altura){

        return base*altura;
    }

    public static double calcula(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
}
