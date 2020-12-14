package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
