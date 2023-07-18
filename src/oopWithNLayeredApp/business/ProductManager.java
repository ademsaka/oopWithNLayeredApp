package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager { //classımızı olusturduk
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao,Logger[] loggers){
        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void add(Product product) throws Exception { //Ürün sınıfından ekleyeceğimiz ürünlerin sahip olmasını istediğimiz ozellikleri ile ilgili kuralların bulunduğu kısım
        //iş kuralları (buisness rule)
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10dan kucuk olamaz"); //uyarı atıyoruz ---> eger if blogu calısırsa uygulama durur
        }

        productDao.add(product);

        for (Logger logger:loggers) {
            logger.log(product.getName());
        }
    }
}
