package com.IMCONSALTING.convertors;

import com.IMCONSALTING.profession.Profession;
import jakarta.persistence.*;


@Converter(autoApply = true)
public class ProfessionConverter implements AttributeConverter<Profession, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Profession profession) {
        Integer id_profession = profession.getId();
        return id_profession;
    }

    @Override
    public Profession convertToEntityAttribute(Integer id_profession) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projectPU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Profession profession = manager.find(Profession.class, id_profession);
        manager.getTransaction().commit();
        return profession;

    }
}