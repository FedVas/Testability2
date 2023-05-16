public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("рост 1.87м вес 98кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.87, 98)));
        System.out.println();
        System.out.println("рост 1.7м вес 70кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.7, 70)));
        System.out.println();
        System.out.println("рост 1.75м вес 60кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.75, 60)));



    }
}
