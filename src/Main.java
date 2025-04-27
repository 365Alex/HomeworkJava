//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задача 1 и 2
        byte a = 67;
        short h = -159;
        short z = 569;
        int s = 27897;
        long k = 987678965549L;
        float p = 2.786f;
        double m = 27.12;

        //задача 3
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int children = ludmilaP + annaS + ekaterinaA;
        int paper = 480;
        paper = paper / children;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

        //задача4
        byte perMinute = 16/2;
        int minutes = perMinute * 20;
        int day = perMinute * 24;
        int days3 = perMinute * 72;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + minutes + " бутылок");
        System.out.println("За сутки машина произвела " + day + " бутылки");
        System.out.println("За 3 дня машина произвела " + days3 + " бутылок");
        System.out.println("За месяц машина произвела " + month + " бутылок");

        //задача 5
        int brown = 4;
        int white = 2;
        int dye = brown + white;
        int classes = 120/dye;
        brown = brown * classes;
        white = white * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //задача 6
        double bananas = 5 * 80;
        double milk = 200 * 1.05;
        double iceCream = 2 * 100;
        double egg = 4 * 70;
        double gr = bananas + milk + iceCream + egg;
        double kg = gr / 1000;
        System.out.println(gr);
        System.out.println(kg);

        //задача 7
        int v1 = 7000 / 250;
        int v2 = 7000/ 500;
        System.out.println("Если спортсмен будет в день терять 250гр, то для сброса веса в 7кг уйдёт " + v1 + " дней");
        System.out.println("Если спортсмен будет в день терять 500гр, то для сброса веса в 7кг уйдёт " + v2 + " дней");

        //задача 8
        byte c = 12;
        float j = 0.1f;
        double Masha = 67760 * j;
        Masha = Masha + 67760;
        double Masha1 = Masha * c;
        double incomeMasha = 67760 * c;
        incomeMasha = Masha1 - incomeMasha;
        System.out.println("Маша теперь получает " + Masha + " рублей. Годовой доход вырос на " + incomeMasha + " рублей");

        double Denis = 83690 * j;
        Denis = Denis + 83690;
        double Denis1 = Denis * c;
        double incomeDenis = 83690 * c;
        incomeDenis = Denis1 - incomeDenis;
        System.out.println("Денис теперь получает " + Denis + " рублей. Годовой доход вырос на " + incomeDenis + " рублей");

        double Kristina = 76230 * j;
        Kristina = Kristina + 76230;
        double Kristina1 = Kristina * c;
        double incomeKristina = 76230 * c;
        incomeKristina = Kristina1 - incomeKristina;
        System.out.println("Кристина теперь получает " + Kristina + " рублей. Годовой доход вырос на " + incomeKristina + " рублей");
    }
}