package sales.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	private ProductService ps;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = ps.listAll();
		model.addAttribute("listProducts",listProducts);
		
		
		return "Index";
	}
}
