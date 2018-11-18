/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.dto;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author murillonunes
 * @since 2018
 * @version 1.0
 */
public class LocalDateJsonDeserializer implements JsonDeserializer<LocalDate> {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;

    @Override
    public LocalDate deserialize(final JsonElement json, final Type date, final JsonDeserializationContext context) {
        return LocalDate.parse(json.getAsString(), DATE_FORMATTER);
    }
}
