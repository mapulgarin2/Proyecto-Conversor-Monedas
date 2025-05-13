package com.cursoalura.conversor.model;

import com.google.gson.JsonObject;
//Obtener conversio_rate ,el cuales un objeto del JSON
public record Moneda(JsonObject conversion_rates) {
    public Double obtenerTasa(String codigoDivisa) {
        // Obtiene el valor del JSON de la API y lo convierte a Double
        return conversion_rates.get(codigoDivisa).getAsDouble();
    }
}
