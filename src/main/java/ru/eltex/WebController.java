package ru.eltex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Класс-контроллер
 * @author Alexey Derevtsov
 * @version v1.0
 */
@Controller
public class WebController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index1";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name",
                new User(1, "Boris", "900"));
        return "hello";
    }

    @RequestMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("name", new User(1, "Boris", "900"));
        return "bye";
    }

}
