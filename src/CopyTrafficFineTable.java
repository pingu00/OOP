////201810766  kimpilgyu
//import java.util.Random;
//
//public enum CopyTrafficFineTable {
//
//    LIGHT(9,/*before: 7*/8,4), PEDESTRIAN(8,7,5),
//    YELLOW(10,9,0), BUSONLYHIGHWAY(10,9, 0),
//    LANE(4,4,3), OVER60(14,13, 9),
//    OVER4060(11,10, 7), OVER2040(12, 11, 8),
//    OVER20(4, 4, 3);
//
//    private int VAN;
//    private int CAR;
//    private int AUTO;
//
//    CopyTrafficFineTable(int VAN, int CAR, int AUTO) {
//        this.VAN = VAN;
//        this.CAR = CAR;
//        this.AUTO = AUTO;
//    }
//
//    public static CopyTrafficFineTable getRandomViolation(){
//        Random random = new Random();
//        return values()[random.nextInt(values().length)];
//    }
//
//    public int getVAN() {
//        return VAN;
//    }
//
//    public int getCAR() {
//        return CAR;
//    }
//
//    public int getAUTO() {
//        return AUTO;
//    }
//}
