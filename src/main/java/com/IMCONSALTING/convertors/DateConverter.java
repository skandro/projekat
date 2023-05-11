package com.IMCONSALTING.convertors;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
public class DateConverter implements AttributeConverter<LocalDate, Date> {
    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        Date date = Date.valueOf(localDate);
        return date;
    }

    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        System.out.println("sgsdghsdgsdgsdgsdg");
        LocalDate localDate = date.toLocalDate();
        return localDate;
    }
}