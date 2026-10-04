package Arusok.service;

import Arusok.model.Rendezveny;
import Arusok.repository.RendezvenyRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RendezvenyService {
    private final RendezvenyRepositoy rendezvenyRepositoy;

    public List<Rendezveny> getAllEvent()
    {
        return rendezvenyRepositoy.findAll();
    }
}
