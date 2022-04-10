import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int lengthArray = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        System.out.print("Вот случайный список: ");
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(lengthArray);
        for (int i =0; i < lengthArray; i++) {
           list.add(random.nextInt(maxValue));
        }
        System.out.println(list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        System.out.println("Отфильтрованный список: " + filter.filterOut(list));
        logger.log("Завершаем программу");
    }
}
