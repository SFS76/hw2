package hw2;
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerSum = boxer1 + boxer2;
        System.out.println("Масса двух бойцов: " + boxerSum);
        var boxerDiff = boxer2 - boxer1;
        System.out.println("Разница веса бойцов: " + boxerDiff);
        var boxerRest = boxer2 % boxer1;
        System.out.println("Остаток от деления веса бойцов: " + boxerRest);
        var hour = 640;
        var crew = hour / 8;
        System.out.println("Всего работников в компании — " + crew + " человек");
        crew = crew + 94;
        hour = crew * 8;
        System.out.println("Если в компании работает " + crew + " человек, то всего " + hour + " часов работы может быть поделено между сотрудниками");

                    }
}