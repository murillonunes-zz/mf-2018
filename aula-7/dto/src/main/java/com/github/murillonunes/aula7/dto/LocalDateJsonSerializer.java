/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.aula7.dto;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author murillonunes
 * @since 2018
 * @version 1.0
 */
public class LocalDateJsonSerializer implements JsonSerializer<LocalDate> {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;

    @Override
    public JsonElement serialize(final LocalDate src, final Type typeOfSrc, final JsonSerializationContext context) {
        final String dateText = src.format(DATE_FORMATTER);
        return context.serialize(dateText);
    }

}
