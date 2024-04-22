package com.riwi.Products.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.riwi.Products.Entity.Product;
import com.riwi.Products.Repository.ProdutRepository;
import com.riwi.Products.Services.Services_Abstract.IservicesAbstract;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class productService implements IservicesAbstract  {

    //el final no va a cambiar
    @Autowired
    private final ProdutRepository objProdutRepository;



    @Override
    public Product save(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Product> getAll() {
       return this.objProdutRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Product update(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<Product> search(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    //Bind De interfaces con clases

}
