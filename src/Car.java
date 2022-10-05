public class Car {
    String brand;
    String model;
    String color;
    int productionYear;
    String productionCountry;
    double engineVolume;

    void show(){
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " +
                productionCountry + ", цвет " + color + ", объем двигателя - " + engineVolume + " литра.");
    }
}
