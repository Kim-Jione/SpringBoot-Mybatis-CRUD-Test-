package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

@RequiredArgsConstructor
@Controller
public class ProductController {

	private final ProductDao productDao;
	
    @GetMapping({"/product", "/"})
    public String list(Model model) {
    	List<Product> findAll = productDao.findAll();
    	model.addAttribute("findAll", findAll);
        return "ProductList";
    }
    
    @GetMapping("/product/add")
    public String add() {
    	
        return "ProductSave";
    }
    
    
    
}
