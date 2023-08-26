package Conditions;

public class Exercise1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);

        System.out.println(random);
//        double random = Math.random();
//        // random = 0.001
//        random = random*100;
//        // random = 0.1
//        random = random+1;
//        // random = 1.1
//
//        int randomInt =(int) random;
//        // randomInt = 1
//        if (random>50){
//            System.out.println("Big");
//        } else if (random<50) {
//            System.out.println("Small");
//
//        }else {
//            System.out.println("Bingo");
//        }
        if (random > 50) {
            System.out.println("Big");
            return;
        }
        if (random < 50) {
            System.out.println("Small");
            return;
        }
        System.out.println("Bingo");

    }
}
