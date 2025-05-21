package com.ejemplo.milog;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpLogger {
    public static void send(String message) {
        try {
            URL url = new URL("http://localhost:8080/log");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "text/plain");

            OutputStream os = conn.getOutputStream();
            os.write(message.getBytes());
            os.close();

            System.out.println("Mensaje enviado por HTTP: " + message);
        } catch (Exception e) {
            System.err.println("Error enviando por HTTP: " + e.getMessage());
        }
    }
}
