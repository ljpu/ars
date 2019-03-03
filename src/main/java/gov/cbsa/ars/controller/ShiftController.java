package gov.cbsa.ars.controller;

import gov.cbsa.ars.repository.ShiftRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ShiftController {
    private ShiftRepository shift;

    public ShiftController(ShiftRepository shift) {
        this.shift = shift;
    }

    @GetMapping("/shifts")
    public String users(Model model, HttpServletRequest request) {
        model.addAttribute("mapping", request.getServletPath());
        model.addAttribute("shifts", shift.findAll());
        return "shifts";
    }

}
