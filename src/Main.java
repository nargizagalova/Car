public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.name = "toyota";
        car.year0fProduction = 2022;
        car.color = "black";
        System.out.println("Name:" +car.name);
        System.out.println("year0fProduction;" +car.year0fProduction);
        System.out.println("Color;" +car.color);
        car.jurot();

    }
}