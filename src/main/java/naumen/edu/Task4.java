package naumen.edu;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Task4 {
    public void showHostFromResponse(){
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/get"))
                    .build();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> body = objectMapper.readValue(response.body(), new TypeReference<>(){});
            Map<String, Object> headers = (Map<String, Object>) body.get("headers");
            System.out.println("Значение хоста сервера (поле “Host”): " + headers.get("Host"));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
