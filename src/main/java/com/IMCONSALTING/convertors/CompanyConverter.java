package com.IMCONSALTING.convertors;

import com.IMCONSALTING.company.Company;
import jakarta.persistence.*;

@Converter(autoApply = true)
public class CompanyConverter implements AttributeConverter<Company, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Company company) {
        Integer idCompany = company.getIdCompany();
        return idCompany;
    }

    @Override
    public Company convertToEntityAttribute(Integer id) {

        if (id == null) return null;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projectPU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Company company = manager.find(Company.class, id);
        manager.getTransaction().commit();
        return company;

    }
}
