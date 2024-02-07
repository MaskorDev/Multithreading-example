import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Подаем на выполнение 10 задач
        for (int i = 1; i <= 10; i++) {
            Task task = new Task(i);
            executor.execute(task); // Подача задачи на выполнение в пул потоков
        }

        // Завершаем работу пула потоков после завершения всех задач
        executor.shutdown();
    }
}
