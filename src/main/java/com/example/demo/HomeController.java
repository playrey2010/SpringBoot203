package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    //@GetMapping processes the GET requests
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        // Here we say the model will have an "attribute", in this case, called "song", which is actually a Song object.
        // i.e. there will be an empty copy for the user once (and every time) this page is accessed
        model.addAttribute ("song", new Song());
        return "songform";
    }
    //@PostMapping processes post requests
    @PostMapping("/songform")
    //The @ModelAttribute allows for the model created to be used in this method
    // Syntax roughly goes "@Model Attribute ClassName objectName"
    public String loadFromPage(@ModelAttribute Song song,
                               Model model) {
        model.addAttribute ( "song", song );
        return "confirmsong";
    }
}
