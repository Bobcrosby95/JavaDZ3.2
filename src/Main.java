public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        double bodymassindex = service.calculate(weight,height);
        System.out.println("Рост: " + height);
        System.out.println("Масса тела: " + weight);
        System.out.println("Индекс массы тела: " + bodymassindex);
    }
}