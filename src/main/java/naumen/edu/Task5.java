package naumen.edu;

import java.io.IOException;

import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task5 implements Task{

    private final String host = "127.0.0.1";
    private volatile boolean scanning = false;
    private ExecutorService executorService;

    @Override
    public void start() {
        if (scanning) {
            System.out.println("Scanning is already in progress.");
            return;
        }
        scanning = true;
        executorService = Executors.newFixedThreadPool(3);
        System.out.println("Starting port scan...");

        int startPort = 1;
        int endPort = 100000;
        for (int port = startPort; port <= endPort; port++) {
            final int currentPort = port;
            executorService.submit(() -> {
                if (!scanning) return;
                try (Socket socket = new Socket(host, currentPort)) {
                    System.out.println("Port " + currentPort + " is open.");
                } catch (IOException e) {
                    // Порт закрыт или недоступен
                }
            });
        }
        executorService.shutdown();
    }

    @Override
    public void stop() {
        if (!scanning) {
            System.out.println("No scanning in progress.");
            return;
        }
        scanning = false;
        executorService.shutdownNow();
        System.out.println("Port scan stopped.");
    }
}

