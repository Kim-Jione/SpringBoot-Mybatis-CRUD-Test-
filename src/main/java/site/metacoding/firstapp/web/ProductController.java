package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

@RequiredArgsConstructor
@Controller
public class ProductController {

	private final ProductDao productDao;
	
    @GetMapping({"/product", "/"})
    public String list(Model model) {
    	List<Product> product = productDao.findAll();
    	model.addAttribute("product", product);
        return "ProductList";
    }
    
    @GetMapping("/product/{id}")
    public String detail(@PathVariable Integer id, Model model) {
    	model.addAttribute("detail", productDao.findById(id));
        return "ProductDetail";
    }
    
    @GetMapping("/product/add")
    public String save() {
        return "ProductSave";
    }
    
    @PostMapping("/product/add")
    public String add(Product product) {
    	productDao.insert(product);
        return "redirect:/";
    }
    
    
    
}
