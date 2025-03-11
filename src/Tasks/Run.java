package Tasks;

import java.util.Scanner;

public class Run {
    Scanner input = new Scanner(System.in);

    public void RunMain() {
        Menu();
    }

    private void Menu() {
        System.out.println("Zadania lab 1");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Wyjście\n");
        System.out.println("Wybierz zadanie:");

        int wybor = InputInt();
        if (wybor == 6) {
            System.out.println("Zakonczono program.");
            return;
        }

        RunTask(wybor);
    }

    private int InputInt() {
        while (!input.hasNextInt()) {
            System.out.println("Niepoprawna wartość! Podaj liczbę:");
            input.next(); // Odrzucamy błędne wejście
        }
        return input.nextInt();
    }

    public void RunTask(int wybor) {
        Task task = new Task(wybor);

        switch (wybor) {
            case 1:
                task.zadanie1();
                break;
            case 2:
                task.zadanie2();
                break;
            case 3:
                task.zadanie3();
                break;
            case 4:
                task.zadanie4();
                break;
            case 5:
                task.zadanie5();
                break;
            default:
                System.out.println("Nieznane zadanie!");
        }
    }

    public static void main(String[] args) {
        Run program = new Run();
        program.RunMain();
    }
}