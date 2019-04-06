package pl.wszib.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.wszib.Domains.Samochod;


import java.util.ArrayList;
import java.util.List;

@Controller
public class SamochodController {


    @GetMapping("iteration")
    public String iteration(Model model) {
        List<Samochod> list = generateList();
        model.addAttribute("list", list);
        return "iterationTemplate";
    }

    private List<Samochod> generateList() {
        List<Samochod> list = new ArrayList<>();

        Samochod car1 = new Samochod();
        car1.setModel("Opel");
        car1.setMarka("cos");
        car1.setRocznik("1987");
        car1.setCena(40440.00);
        car1.setPrzebieg(1212121);
        list.add(car1);

        Samochod car2 = new Samochod();
        car2.setModel("da");
        car2.setMarka("cosd1");
        car2.setRocznik("1917");
        car2.setCena(4040.00);
        car2.setPrzebieg(122121);
        list.add(car2);

        Samochod car3 = new Samochod();
        car3.setModel("BMWd");
        car3.setMarka("cos1d");
        car3.setRocznik("1917");
        car3.setCena(440.00);
        car3.setPrzebieg(121421);
        list.add(car3);

        Samochod car4 = new Samochod();
        car4.setModel("BMW");
        car4.setMarka("cos1");
        car4.setRocznik("1917");
        car4.setCena(40440.00);
        car4.setPrzebieg(1212121);
        list.add(car4);

        Samochod car5 = new Samochod();
        car5.setModel("BMW");
        car5.setMarka("cos1");
        car5.setRocznik("1917");
        car5.setCena(40440.00);
        car5.setPrzebieg(1212121);
        list.add(car5);

        return list;

    }
}
