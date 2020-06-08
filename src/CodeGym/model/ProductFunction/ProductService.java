package CodeGym.model.ProductFunction;

import CodeGym.model.ProductStone.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
     List<Product> AllProduct();
     void insertProduct() throws SQLException;
     Product selectProduct(int id);
     boolean deleteProduct(int id) throws SQLException;
     boolean updateProduct(Product product) throws  SQLException;
}
