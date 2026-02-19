package service.serviceimpl;

import dao.ProductDao;
import dao.daoImpl.ProductDaoImpl;
import model.Product;
import service.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private final ProductDao dao = new ProductDaoImpl();

    @Override
    public void addProduct(String name, double price, int qty, String cat) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(qty);
        dao.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return dao.findAll();
    }

    @Override
    public List<Product> searchByCategory(String cat) {
        return dao.findByCategory(cat);
    }

    @Override
    public boolean updatePrice(int id, double newPrice) {
        Optional<Product> optionalProduct = dao.findById(id);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setPrice(newPrice);
            dao.update(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean isInStock(int id, int qty) {


        Optional<Product> optionalProduct = dao.findById(id);

        if (optionalProduct.isPresent()) {

            {
                return optionalProduct.get().getQuantity() >= qty;
            }


        }
        return false;
    }
        @Override
        public List<Product> getLowStockProducts (int threshold){
        if (threshold <0){
            throw new IllegalArgumentException("Threshold cannot be negative");
        }
            return dao.findAll()
                    .stream()
                    .filter(p -> p.getQuantity() <= threshold)
                    .collect(Collectors.toList());

    }}

