package upeu.edu.pe.ExamU2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.ExamU2.models.Activities;
import upeu.edu.pe.ExamU2.models.Status;
import upeu.edu.pe.ExamU2.services.ActivitiesService;

@Controller
@RequestMapping("/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("activities", service.listar());
        return "activities/listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("activity", new Activities());
        model.addAttribute("statuses", Status.values());
        return "activities/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Activities activity) {
        service.guardar(activity);
        return "redirect:/activities/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("activity", service.buscar(id));
        model.addAttribute("statuses", Status.values());
        return "activities/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/activities/listar";
    }
}
