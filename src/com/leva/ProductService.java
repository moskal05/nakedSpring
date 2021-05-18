package com.leva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    PromotionsService promotionsService;
    //private PromotionsService promotionsService;



    public PromotionsService getPromotionsService() {
        return promotionsService;
    }

    public void setPromotionsService(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }
}
