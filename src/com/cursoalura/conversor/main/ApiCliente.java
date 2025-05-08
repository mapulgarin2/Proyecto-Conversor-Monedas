package com.cursoalura.conversor.main;

import com.cursoalura.conversor.model.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCliente {
    public Moneda LlamadaApiCliente(String opcion){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/11a51c75c5905f07c1e159f3/latest/" + opcion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
