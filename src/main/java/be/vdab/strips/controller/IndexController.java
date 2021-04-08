package be.vdab.strips.controller;

import be.vdab.strips.services.FiguurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Controller
@RequestMapping("/")
class IndexController {
    private final FiguurService figuurService;

    public IndexController(FiguurService figuurService) {
        this.figuurService = figuurService;
    }

    @GetMapping
    ModelAndView index() {
        return new ModelAndView("index", "figuren", figuurService.findAll());
    }
}
