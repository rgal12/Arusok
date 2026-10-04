package Arusok.controller;

import Arusok.model.Rendezveny;
import Arusok.service.RendezvenyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RendezvenyController {
    private final RendezvenyService rendezvenyService;

    public RendezvenyController(RendezvenyService rendezvenyService)
    {
        this.rendezvenyService = rendezvenyService;
    }

    @GetMapping("/rendezvenyek")
    public List<Rendezveny> getAllEvent()
    {
        return rendezvenyService.getAllEvent();
    }
}
