public class BmiService {
    public double calculate(
            double height, double weight
    ) {
        double heightSquare = height * height;
        double ibm = weight / heightSquare;
        return ibm;
    }
}
