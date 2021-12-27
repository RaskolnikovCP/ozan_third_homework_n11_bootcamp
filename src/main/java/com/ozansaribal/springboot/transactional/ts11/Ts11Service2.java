package com.ozansaribal.springboot.transactional.ts11;

import com.ozansaribal.springboot.entity.Category;
import com.ozansaribal.springboot.service.entityservice.CategoryEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Ts11Service2 {

    @Autowired
    private CategoryEntityService categoryEntityService;

    @Transactional(propagation = Propagation.MANDATORY)
    public void save(){
        Category category = new Category();
        category.setAdi("transactional11-2");
        category.setKirilim(1L);
        categoryEntityService.save(category);
    }
}
