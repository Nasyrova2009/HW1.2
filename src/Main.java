public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    // Задача 1
    int dog = 5;
    byte apple = 7;
    long days = 65L;
    short sweets = 9;
    double fruitWeight = 5.2;
    float vegetablesWeight = 9.7f;
    boolean dogIsAdult = dog > 18;
    char bar = 23;

    // Задача 2
    double boxer1 = 78.2;
    double boxer2 = 82.7;
    double weightAllBoxers = boxer1 + boxer2;
    double weightDifference = boxer1 - boxer2;
    System.out.println(" Общий вес боксеров " + weightAllBoxers);
    System.out.println(" Разница в весе " + weightDifference);

    //Задача 3
    int bananas = 5;
    int weightBananas = bananas * 80;
    System.out.println( " Вес бананов " + weightBananas + " гр ");
    int milk = 105;
    int weightMilk = milk * 2;
    System.out.println(" Вес молока " + weightMilk + " гр ");
    int iceСream = 2;
    int weightIceCream = iceСream * 2;
    System.out.println(" Вес мороженого " + weightMilk + " гр ");
    int eggs = 4;
    int weightEggs = eggs * 70;
    System.out.println( " Вес яиц " + weightEggs + " гр ");
    int weightAllProducts = weightMilk + weightEggs + weightBananas + weightIceCream;
    System.out.println( " Общий вес продуктов " + weightAllProducts + " гр ");
    short weightBreakfast = 894;
    float weightAllBreakfast = weightBreakfast / 1000f;
    System.out.println( " Общий вес завтрака " + weightAllBreakfast + " кг ");

    // Задача 4
     int weight = 7;
     int weightInGrams = weight * 1000;
     int day1 = weightInGrams / 250;
     System.out.println( " Дней нужно " + day1 + " чтобы терять по 250 гр в день");
     int day2 = weightInGrams / 500;
     System.out.println( " Дней нужно " + day2 + " чтобы терять по 500 гр в день");

     // Задача 5
     int Masha = 67760;
     float MashasSalaryYear = Masha * 12f;
     float MashasRaising = Masha * 0.10f;
     float MashasSalary = MashasRaising + 67760f;
     float MashasSalaryYearNow = MashasSalary * 12f;
     float MashasDifference = MashasRaising - 67760f;
     float MashasDifference2 = MashasSalaryYearNow - 813120f;
     System.out.println( " Раньше Маша получала " + MashasSalaryYear + " в год ");
     System.out.println( " Теперь Маша получает " + MashasSalary + " в месяц " );
     System.out.println( " Теперь Маша получает " + MashasSalaryYearNow + " в год ");
     System.out.println( " Годовой доход вырос на " + MashasDifference2 + " рублей " );
     int Denis = 83690;
     float DenisSalaryYear = Denis * 12f;
     float DenisRaising = Denis * 0.10f;
     float DenisSalary = DenisRaising + 83690f;
     float DenisSalaryYearNow = DenisSalary * 12f;
     float DenisDifference = DenisRaising - 83690f;
     float DenisDifference2 = DenisSalaryYearNow - 1004280f;
     System.out.println( " Раньше Денис получал " + DenisSalaryYear + " в год " );
     System.out.println( " Теперь Денис получает " + DenisSalaryYearNow + " в год" );
     System.out.println( " Годовой доход вырос на " + DenisDifference2 + " рублей " );
     int Kristina = 76230;
     float KristinaSalaryYear = Kristina * 12f;
     float KristinaRaising = Kristina * 0.10f;
     float KristinaSalary = KristinaRaising + 76230f;
     float KristinaSalaryYearNow = KristinaSalary * 12f;
     float KristinaDifference = KristinaRaising - 76230f;
     float KristinaDifference2 = KristinaSalaryYearNow - 914760f;
     System.out.println( " Раньше Кристина получала " + KristinaSalaryYear + " в год ");
     System.out.println( " Теперь Кристина получает " +  KristinaSalaryYearNow + " в год");
     System.out.println( " Годовой доход вырос на " + KristinaDifference2 + " рублей");



    }
}