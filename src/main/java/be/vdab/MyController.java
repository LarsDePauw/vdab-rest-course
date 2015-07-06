package be.vdab;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
    @Autowired
    private CarRepository repository;

    @RequestMapping(value = "/car/{carId}", produces = "application/xml")
    @ResponseBody
    public Car findById(@PathVariable("carId") int id) {
        return repository.findOne(id);
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return repository.findAll().toString();
    }

    @RequestMapping("/world/{id}")
    @ResponseBody
    public String world(@PathVariable("id") int abc) {
        return "hello 2";
    }
}
