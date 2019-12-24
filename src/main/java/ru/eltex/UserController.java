package ru.eltex;

import org.springframework.web.bind.annotation.*;

/**
 * Класс-контроллер
 * @author Alexey Derevtsov
 * @version v1.0
 */
@RestController
public class UserController {

    @RequestMapping("/get_user")
    public User getUser(@RequestParam(value = "id", required = false) Integer id) {
        System.out.println(id);
        return new User(1, "Boris", "900");
    }

    @RequestMapping("/get_user/{id}")
    public User getUser1(@PathVariable("id") Integer id) {
        System.out.println(id);
        return new User(1, "Boris", "939399393");
    }


}
