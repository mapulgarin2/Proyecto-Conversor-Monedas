package com.cursoalura.conversor.api;

import com.cursoalura.conversor.model.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCliente {
    public Moneda LlamadaApiCliente(String opcion){
        //Construye la URL de la API
        URI url = URI.create("https://v6.exchangerate-api.com/v6/11a51c75c5905f07c1e159f3/latest/" + opcion);
        //Crea el cliente http
        HttpClient client = HttpClient.newHttpClient();
        //Realiza la peticion HTTP GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            //Envia la peticion y obntiene la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //Parsea el JSON de respuesta a objeto Moneda
            return new Gson().fromJson(response.body(), Moneda.class);


        } catch (IOException | InterruptedException e) {
            //Manejo de errores
            throw new RuntimeException(e);
        }
    }
}
