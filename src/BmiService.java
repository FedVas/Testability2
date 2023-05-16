public class BmiService {
    public int calculate(double meters, int kilograms) {
        meters = meters * meters;
        double result = kilograms / meters;
        return (int) result;
    }
}

// рост в метрах умножить на рост в метрах и разделить на вес в кг
