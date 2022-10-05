public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car();
        ladaGrande.brand = "Lada";
        ladaGrande.model = "Grande";
        ladaGrande.color = "желтый";
        ladaGrande.productionYear = 2015;
        ladaGrande.productionCountry = "Россия";
        ladaGrande.engineVolume = 1.7;
        ladaGrande.show();

        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.color = "черный";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Германия";
        audiA8.engineVolume = 3.0;
        audiA8.show();

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.color = "черный";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германия";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.show();

        Car kiaSportage4 = new Car();
        kiaSportage4.brand = "Kia";
        kiaSportage4.model = "Sportage 4 поколение";
        kiaSportage4.color = "красный";
        kiaSportage4.productionYear = 2018;
        kiaSportage4.productionCountry = "Южная Корея";
        kiaSportage4.engineVolume = 2.4;
        kiaSportage4.show();

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южная Корея";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.show();
    }
}

//    Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.