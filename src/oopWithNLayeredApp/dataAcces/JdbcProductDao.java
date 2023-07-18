package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{ //productDao nun kurallarına uymak zorunda demek ProductDao yu referans alıyor demek
public void  add(Product product){
    // sadece ve sadece db erişim kodları buraya yazılır... SQL
    System.out.println("JDBC ile veritabanına eklendi");
    }

}

//Hibernate JDBC kullanılarak olusturulmustur
