public class Car {
    String brand; //default
    String model; //default
    String color; //белый
    int productionYear; //2000
    String productionCountry; //default
    double engineVolume; //1.5

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

        //this.brand = brand;
        if (brand == null) {
            brand = "DEFAULT";
        } else {
            this.brand = brand;
        }
       // this.model = model;
        if (model == null) {
            model = "DEFAULT";
        } else {
            this.model = model;
        }
        //this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        //this.color = color;
        if (color == null) {
            color = "БЕЛЫЙ";
        } else {
            this.color = color;
        }
        //this.productionYear = productionYear;
        if (productionYear == 0) {
            productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        //this.productionCountry = productionCountry;
        if (productionCountry == null) {
            productionCountry = "DEFAULT";
        } else {
            this.productionCountry = productionCountry;
        }

        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " + productionCountry + ", цвет кузова " + color + ", " +
                "объем двигателя - " + engineVolume + " литра.");
    }
}
