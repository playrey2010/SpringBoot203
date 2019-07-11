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
    public String loadSongForm(Model model){
        model.addAttribute ("song", new Song());
        return "songform";
    }
    //@PostMapping processes post requests
    @PostMapping("/songform")
    //The @ModelAttribute allows for the model created to be used in this method
    public String processSongForm(@ModelAttribute Song song,
                               Model model) {
        model.addAttribute ( "song", song );
        return "confirmsong";
    }
}
