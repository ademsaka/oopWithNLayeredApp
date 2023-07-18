package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;
    //diğer iki class birbirinin alternatidi olduğundan bu interface i olusturduk
public interface ProductDao {
    void add(Product product);      // yandaki kod blogu bizim imzamız bu interfacedeki imzaya diğer classların uyması gerekir
}
