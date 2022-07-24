import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        System.out.print("Введите строку вида:\n" +
                "Расстояние, которое животное должно пройти по суше (в км)" +
                "<пробел>" +
                "Расстояние по воде (в км)" +
                "<пробел>" +
                "Наличие барьера (да/нет)\n" +
                "Пример: 1 3 да\n"
        );
        Scanner scanner = new Scanner(System.in);

        String request = scanner.nextLine();

        String[] parts = request.split(" ");

        // переведем из км в м
        int landDistance = Integer.parseInt(parts[0]) * 1000;
        int waterDistance = Integer.parseInt(parts[1]) * 1000;

        boolean barrier = parts[2].equals("да") || parts[2].equals("Да") || parts[2].equals("ДА");

        System.out.println(new Animal().calculateRoutes(landDistance, waterDistance, barrier));
        scanner.close();
    }
}
