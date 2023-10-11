public class BmiService {
    public int calculate (int weightInKg, double hightInMeters) {
           double bmi = weightInKg / (hightInMeters * hightInMeters);
           return (int) bmi;

    }
}
