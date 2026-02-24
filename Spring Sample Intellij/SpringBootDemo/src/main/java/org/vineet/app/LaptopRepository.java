package org.vineet.app;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.vineet.app.model.Laptop;
@Repository
public class LaptopRepository {

    public void save(Laptop laptop)
    {
        System.out.println("Laptop Saved");
    }
}
