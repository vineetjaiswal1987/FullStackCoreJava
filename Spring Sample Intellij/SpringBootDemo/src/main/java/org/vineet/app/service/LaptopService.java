package org.vineet.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vineet.app.LaptopRepository;
import org.vineet.app.model.Laptop;
@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;
    public void addLaptop(Laptop laptop)
    {
        repository.save(laptop);
    }
    public boolean isGoodForProg(Laptop laptop)
    {
        return true;
    }
}
