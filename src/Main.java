class ZeroDivisionException extends Exception {
    public ZeroDivisionException(){
        super("На ноль делить нельзя");
    }
}
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(division(8,0));
        } catch (Exception e){
            System.out.println("Что то пошло не так: " + e.getMessage());
        }

    }

    private static double division(int x, int y) throws ZeroDivisionException {
        if (y == 0) throw new ZeroDivisionException();
        return x/y;
    }
}
