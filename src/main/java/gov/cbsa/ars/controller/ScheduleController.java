package gov.cbsa.ars.controller;

import gov.cbsa.ars.model.Schedule;
import gov.cbsa.ars.repository.PortRepository;
import gov.cbsa.ars.repository.ScheduleRepository;
import gov.cbsa.ars.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import javax.validation.Valid;

@Controller
@Transactional
public class ScheduleController {
    private ScheduleRepository schedules;
    private ShiftRepository shiftRepository;
    private PortRepository portRepository;
    @Autowired
    private HttpServletRequest request;

    public ScheduleController(ScheduleRepository scheduleRepository, ShiftRepository shiftRepository, PortRepository portRepository) {
        this.schedules = scheduleRepository;
        this.shiftRepository = shiftRepository;
        this.portRepository = portRepository;
    }


    @GetMapping("/schedules")
    public String schedules(Model model) {
        model.addAttribute("mapping", request.getServletPath());
        model.addAttribute("schedules", schedules);
        return "schedules";
    }

    @GetMapping("/schedules/create")
    public String create(Model model) {
        model.addAttribute("mapping", request.getServletPath());
        model.addAttribute("schedule", new Schedule());
        model.addAttribute("shifts", shiftRepository.findAll());
        model.addAttribute("ports", portRepository.findAll());
        return "schedule";
    }

    @PostMapping("/schedule")
    public String store(@Valid Schedule schedule, BindingResult bindingResult, Model model) {
        model.addAttribute("mapping", "/schedules");
        model.addAttribute("schedule", schedule);
        model.addAttribute("shifts", shiftRepository.findAll());
        model.addAttribute("ports", portRepository.findAll());

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.toString());
            model.addAttribute("noErrors", true);
        } else {
            this.schedules.save(schedule);  // !!!works via repository
        }

        return "schedule";
    }

}
