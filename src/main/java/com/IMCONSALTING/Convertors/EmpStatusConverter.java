package com.IMCONSALTING.Convertors;

import com.IMCONSALTING.empstatus.EmpStatus1;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmpStatusConverter implements AttributeConverter<EmpStatus1, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EmpStatus1 empStatus1) {
        Integer id_empStatus = empStatus1.getId();
        return id_empStatus;
    }

    @Override
    public EmpStatus1 convertToEntityAttribute(Integer id_empStatus) {
        switch (id_empStatus) {
            case 1:
                return EmpStatus1.Zaposlen;
            case 2:
                return EmpStatus1.Nezaposlen;
            case 3:
                return EmpStatus1.Penzioner;
            case 4:
                return EmpStatus1.Student;
        }
        return null;
    }
}