package com.Anudip.FinalProject; // Change this to match your package name

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class WebController {

    // This handles the root URL (http://localhost:8080/)
    @GetMapping("/home")
    public String home() {
        return "Index";
    }
    @GetMapping("/cart")
    public String cart() {
        return "Cart";
    }
    @GetMapping("/wishlist")
    public String wishlist() {
        return "Wishlist";
    }
    @GetMapping("/profile")
    public String profile() {
        return "Profile";
    }
    @GetMapping("/orders")
    public String Orders() {
        return "Orders";
    }
}