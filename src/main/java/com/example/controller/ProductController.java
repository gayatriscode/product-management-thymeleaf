package com.example.controller;

import com.example.binding.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    //TODO- Method to display the form
    @GetMapping("/")
    public String loadForm(Product product, Model model) {
        model.addAttribute("product", product);
        return "index";
    }


    //TODO- Method to handle the form data
    @PostMapping("/product")
    public String handleFormData(Product product, Model model) {
        System.out.println(product);
        model.addAttribute("product", product);
        model.addAttribute("msg", "Product Saved");
        return "index";
    }
}
