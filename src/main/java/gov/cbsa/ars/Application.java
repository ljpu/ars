package gov.cbsa.ars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

// todo: http://www.baeldung.com/spring-data-rest-validators
// todo: https://hellokoding.com/form-data-binding-and-validation-example-with-java-spring-boot-and-freemarker/

@Controller
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("mapping", request.getServletPath());
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model, HttpServletRequest request, @RequestParam(value = "username", required = false) String username) {
        model.addAttribute("username", username);
        model.addAttribute("mapping", request.getServletPath());
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpServletRequest request) {
        model.addAttribute("mapping", request.getServletPath());
        return "dashboard";
    }

//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

}
