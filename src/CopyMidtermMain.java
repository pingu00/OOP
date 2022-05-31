////201810766 kimpilgyu
//
//public class CopyMidtermMain {
//    public static void main(String[] args) {
//        int sum = 0;
//        System.out.printf("CASE 1: fine: %d\n", PremiumOK.OVER2040.getAUTO());
//        System.out.printf("CASE 2: fine: %d\n", PremiumOK.LIGHT.getVAN() + PremiumOK.YELLOW.getVAN());
//        System.out.printf("CASE 3: fine: %d\n", PremiumOK.BUSONLYHIGHWAY.getCAR() + PremiumOK.OVER60.getCAR());
//
//        for (int i = 0; i < 10; i++) {
//            int randomCar = (int) Math.floor(Math.random() * 3) + 1;
//            PremiumOK randomViolation = PremiumOK.getRandomViolation();
//            switch (randomCar) {
//                case 1:
//                    System.out.println("car: VAN, violation: " + randomViolation + "," + " fine: " + randomViolation.getVAN());
//                    sum += randomViolation.getVAN();
//                    continue;
//                case 2:
//                    System.out.println("car: CAR, violation: " + randomViolation + "," + " fine: " + randomViolation.getCAR());
//                    sum += randomViolation.getCAR();
//                    continue;
//                case 3:
//                    System.out.println("car: AUTO, violation: " + randomViolation + "," + " fine: " + randomViolation.getAUTO());
//                    sum += randomViolation.getAUTO();
//                default:
//            }
//        }
//        System.out.println("Total fine: " + sum);
//    }
//}
