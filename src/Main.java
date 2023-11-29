public class Main {

    public static void main(String[] args){

        System.out.println(rangeNUmb(10,20,15));
        System.out.println(rangeNUmb(10,20,25));
    }

    public static boolean rangeNUmb(int min, int max, int numb){
        if(numb >= min && numb <= max){
            return true;
        } else {
            throw new ArithmeticException("Errore: il numero non è compreso");
        }
    }
}
