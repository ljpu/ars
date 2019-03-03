package gov.cbsa.ars.controller;

import gov.cbsa.ars.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    private UserRepository users;

    public UserController(UserRepository repository) {
        this.users = repository;
    }

    @GetMapping("/users")
    public String users(Model model, HttpServletRequest request) {
        model.addAttribute("users", users.findAll());
        model.addAttribute("mapping", request.getServletPath());
        return "users";
    }

}
