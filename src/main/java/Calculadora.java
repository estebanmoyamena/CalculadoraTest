
public class Calculadora {

    public static Integer sumar(Integer a, Integer b) {
        if (a != null && b !=null ) {
            return a+b;
        } else {
            return 0;
        }
    }

    public static Integer restar(Integer a, Integer b) {
        if (a !=null && b !=null ) {
            return a-b;
        } else {
            return 0;
        }
    }
    public static Integer multiplicar(Integer a, Integer b) {
        if (a != null && b != null) {
            return a*b;
        } else
            return 0;
    }

    public static Integer dividir(Integer a, Integer b) {
        if (a != null && b != null ) {
            return a/b;
        } else {
            return 0;
        }
    }
}
