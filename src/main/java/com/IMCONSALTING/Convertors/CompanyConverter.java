package com.IMCONSALTING.Convertors;

import com.IMCONSALTING.company.Company;
import jakarta.persistence.*;

@Converter(autoApply = true)
public class CompanyConverter implements AttributeConverter<Company, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Company company) {
        Integer id_company = company.getId();
        return id_company;
    }

    @Override
    public Company convertToEntityAttribute(Integer id_company) {

        if (id_company == null) return null;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projectPU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Company company = manager.find(Company.class, id_company);
        manager.getTransaction().commit();
        return company;

    }
}
