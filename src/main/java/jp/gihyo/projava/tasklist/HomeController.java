package jp.gihyo.projava.tasklist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalTime;

@Controller
public class HomeController {
    @RequestMapping("/greeting")
    String hello(Model model) {
        LocalTime time = LocalTime.now();
        String greeting = "Morning";

        model.addAttribute("greeting", greeting);
        model.addAttribute("time", time);
        return "greeting";
    }
}