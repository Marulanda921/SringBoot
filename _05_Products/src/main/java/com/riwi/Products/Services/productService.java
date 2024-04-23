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

    //el final no va a cambiar es bueno para añadir la inyeccion de dependencias
    //al darle valor tenemos que darle un constructor a la inyeccion de dependecias
    @Autowired
    private final ProdutRepository objProdutRepository;



    @Override
    public Product save(Product product) {
        return this.objProdutRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
       return this.objProdutRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        //validamos que tenga el valor, el trow rompe todo el programa al no encontrar un valor de id
        return this.objProdutRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        Product productFind = this.objProdutRepository.findById(id).orElseThrow();
        this.objProdutRepository.delete(productFind);

    }

    @Override
    public Product update(Long id, Product objProduct) {
       this.objProdutRepository.findById(id).orElseThrow();
        objProduct.setId(id);

        //si no existe la creas y si existe la actualizas
        return this.objProdutRepository.save(objProduct);
    }

    @Override
    public List<Product> search(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    //Bind De interfaces con clases

}
