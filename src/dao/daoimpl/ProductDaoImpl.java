package dao.daoImpl;

import dao.ProductDao;
import db.DataBase;
import db.DataBaseOrder;
import db.DataBase;
import model.Product;

import java.util.*;

public class ProductDaoImpl implements ProductDao {

    @Override
    public void save(Product p) {
        DataBase.products.add(p);


    }

    @Override
    public List<Product> findAll() {
        return DataBase.products;
    }

    @Override
    public Optional<Product> findById(int id) {
        for (Product product:DataBase.products){
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }else {
                return null;
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Product> findByCategory(String cat) {
List<Product> result = new ArrayList<>();

for (Product p : DataBase.products){
    if (p.getCategory().equals(cat)){
        result.add(p);

    }
}
return result;
    }

    @Override
    public void update(Product p) {
        for (Product product:DataBase.products){
            if (product.getId().equals(p.getId())){
                product.setName(p.getName());
                product.setPrice(p.getPrice());
                product.setQuantity(p.getQuantity());
                product.setCategory(p.getCategory());

            }
        }
    }


    @Override
    public boolean delete(int id) {
        Iterator<Product> iterator = DataBase.products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;

    }
}
