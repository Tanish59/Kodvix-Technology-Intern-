package com.spring.Controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.spring.Entity.Product;
import com.spring.Service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/add")
	public String addPage(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Product product) {
		service.add(product);
		return "redirect:/view";
	}

	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("products", service.getAll());
		return "viewAllProducts";
	}
}










package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.spring.Entity.Product;
import com.spring.Service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/add")
	public String addPage(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Product product) {
		service.add(product);
		return "redirect:/view";
	}

	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("products", service.getAll());
		return "viewAllProducts";
	}
}
