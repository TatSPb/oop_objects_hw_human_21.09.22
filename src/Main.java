public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro" , 3.0, "черный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kiaSportage4 = new Car("Kia", "Sportage поколение 4", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println("\n" + "Тестовая - если отсутствуют параметры:");
        Car test = new Car(null, null, 0, null, 0, null);
    }
}

