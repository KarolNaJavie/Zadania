public static Integer podzielne3(List<Integer> lista) {
    Integer podzielnePrzez3 = 0;
    for (Integer number : lista) {
        if ((number % 3) == 0) {
            podzielnePrzez3++;
        }
    }
    return podzielnePrzez3;
}

public static Integer podzielne3i5(List<Integer> lista) {
    Integer podzielnePrzez3i5 = 0;
    for (Integer number : lista) {
        if ((number % 3) == 0 && (number % 5) == 0) {
            podzielnePrzez3i5++;
        }
    }
    return podzielnePrzez3i5;
}

public static Integer podzielne3lub5(List<Integer> lista) {
    Integer podzielnePrzez3lub5 = 0;
    for (Integer number : lista) {
        if ((number % 3) == 0 || (number % 5) == 0) {
            podzielnePrzez3lub5++;
        }
    }
    return podzielnePrzez3lub5;
}

public static Integer podzielne3nie5(List<Integer> lista) {
    Integer podzielnePrzez3nie5 = 0;
    for (Integer number : lista) {
        if ((number % 3) == 0 && (number % 5) > 0) {
            podzielnePrzez3nie5++;
        }
    }
    return podzielnePrzez3nie5;
}

public static Integer najmniejsza(List<Integer> lista) {
    Integer najmniejsza = null;
    for (Integer number : lista) {
        if ((najmniejsza == null) || (najmniejsza > number)) {
            najmniejsza = number;
        }
    }
    return najmniejsza;
}

public static Integer najwieksza(List<Integer> lista) {
    Integer najwieksza = null;
    for (Integer number : lista) {
        if ((najwieksza == null) || (najwieksza < number)) {
            najwieksza = number;
        }
    }
    return najwieksza;
}

void main() {
    //Sworz metodym i je wywolaj
    // Zadanie 1 – policz ile liczb jest podzielnych przez 3
    // Zadanie 2 – policz ile liczb jest podzielnych przez 3 i 5 jednocześnie
    // Zadanie 3 – zwróć liczby podzielne przez 3 lub przez 5
    // Zadanie 4 – liczby podzielne przez 3 ALE nie przez 5 (lub odwrotnie)
    // Zadanie 5 – najmniejsza liczba
    // Zadanie 6 – największa liczba|
    List<Integer> lista = new ArrayList<>();
    for (int i = 1; i <= 25; i++) {
        lista.add(i);
    }
    System.out.println("Podzielne przez 3: " + podzielne3(lista));
    System.out.println("Podzielne przez 3 i 5: " + podzielne3i5(lista));
    System.out.println("Podzielne przez 3 lub 5: " + podzielne3lub5(lista));
    System.out.println("Podzielne przez 3 ale nie  5: " + podzielne3nie5(lista));
    System.out.println("Najmniejsza liczba: " + najmniejsza(lista));
    System.out.println("Najwieksza liczba: " + najwieksza(lista) + "\n");

    // Zadanie 2
    //  - Stwórz interface Figura z metodami:
    //        double obliczPole();
    //        double obliczObwod();
    //  - Stwórz 2 klasy implementujące (np. Kwadrat, Prostokat)
    //  - Każda figura ma kolor i liczbę kątów
    //  - W Main utwórz listę figur i wypisz:
    //        kolor, liczba kątów, pole, obwód

    List<Figura> figury = new ArrayList<>();       // musialem dodac w klasach pole bok zeby uniknac uzycia klasy abstrakcyjnej
    Kwadrat kwadrat1 = new Kwadrat(5, "czarny", 4);
    Kwadrat kwadrat2 = new Kwadrat(3, "zielony", 4);
    Kwadrat kwadrat3 = new Kwadrat(5, "niebieski", 4);
    Prostokat prostokat1 = new Prostokat(5, 4, "niebieski", 4);
    Prostokat prostokat2 = new Prostokat(6, 2, "fioletowy", 4);
    Prostokat prostokat3 = new Prostokat(12, 2, "szary", 4);
    figury.add(kwadrat1);
    figury.add(kwadrat2);
    figury.add(kwadrat3);
    figury.add(prostokat1);
    figury.add(prostokat2);
    figury.add(prostokat3);
    for (Figura figura : figury) {
        System.out.println(figura);
        System.out.println("Kolor: " + figura.getKolor());
        System.out.println("Liczba katow: " + figura.getKaty());
        System.out.println("Pole: " + figura.obliczPole());
        System.out.println("Obwod: " + figura.obliczObwod() + "\n");
    }

    // Zadanie 3
    //  - Stwórz interfejs Movable (move())
    //  - Stwórz interfejs Speakable (speak())
    //  - Klasa Robot implementuje tylko Movable
    //  - Klasa Human implementuje oba
    //  - W Main wywołaj zachowania w pętli
    Human adix = new Human();
    Human karol = new Human();
    Robot adixtron9000 = new Robot();
    Robot karoltron9000 = new Robot();
    List<Speakable> speakers = new ArrayList<>();
    List<Movable> movers = new ArrayList<>();
    speakers.add(adix);
    speakers.add(karol);
    movers.add(adix);
    movers.add(adixtron9000);
    movers.add(karol);
    movers.add(karoltron9000);
    for (Speakable speaker : speakers) {
        System.out.println(speaker.speak());
    }
    for (Movable mover : movers) {
        System.out.println(mover.move());
    }

    // Zadanie 5 (ENUM)
    //  - Program pyta użytkownika o kraj i kwotę brutto
    //  - Enum Kraj zwraca kwotę netto
    //  - Walidacja kraju ignoruje wielkość liter
    //  - Zły kraj → komunikat, brak wyjątku dla użytkownika


    //usun te ktore robiles i przypomnij mi zeby przerobic klasy abstrakcyjne
    //jak sie bedziesz nudzil to obczaj co to sa regexy, to takie patterny np do znajdowania konkretnych fragmentow tekstu
    //i obczaj te streingi co ci wyslalem


}
