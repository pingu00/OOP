//201810766  kimpilgyu
import java.util.Random;

public enum PremiumOK {

       PREMIUM(1.2), REGULAR(1.0);

        private double extraPoint;

        PremiumOK(double extraPoint) {
                this.extraPoint =extraPoint;
        }

        public double getExtraPoint() {
                return extraPoint;
        }

}
