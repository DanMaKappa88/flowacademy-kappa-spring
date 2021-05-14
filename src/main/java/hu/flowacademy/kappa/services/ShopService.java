package hu.flowacademy.kappa.services;

import hu.flowacademy.kappa.controllers.ShopController;
import hu.flowacademy.kappa.controllers.model.ShopRequest;
import hu.flowacademy.kappa.models.Shop;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShopService {
    private int id = 0;
    private final Map<Integer, Shop> shops = new HashMap<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, Shop> getShops() {
        return shops;
    }

    public void init(ShopRequest model) {
        var shop = new Shop();
        shop.setId(id++);
        shop.setName(model.getName());
        shop.setCategory(model.getCategory());
        shop.setSettlement(model.getSettlement());
        shop.setZip(model.getZip());
        shops.put(id, shop);
    }
}