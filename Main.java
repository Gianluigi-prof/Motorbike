
class Motorbike {
    private String brand = "The brand";

    public String getBrand() {
        return brand;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Motorbike moto = new Motorbike();
        System.out.println(moto.getBrand());
    }
}
