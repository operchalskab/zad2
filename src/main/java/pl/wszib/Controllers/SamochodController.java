package pl.wszib.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.Domains.Samochod;


import java.util.ArrayList;
import java.util.List;

@Controller
public class SamochodController {

    private List<Samochod> listSamochod;

    public SamochodController() {
        listSamochod = generateList();
    }

    @GetMapping("iteration")
    public String iteration(Model model) {
        List<Samochod> list = generateList();
        model.addAttribute("list", list);
        return "iterationTemplate";
    }

    @GetMapping("forms")
    public String forms(Model model){

        model.addAttribute("samochod", new Samochod());
        return "formsTemplate";
    }

    @PostMapping("formsSave")
    public String formsSave(Samochod samochod, Model model){
        listSamochod.add(samochod);

        return "successTemplate";

    }

    private List<Samochod> generateList() {
        List<Samochod> list = new ArrayList<>();

        Samochod samochod1 = new Samochod();
        samochod1.setModel("Opel");
        samochod1.setMarka("cos");
        samochod1.setRocznik("1987");
        samochod1.setCena(40440.00);
        samochod1.setPrzebieg(1212121);
        samochod1.setVisible(true);
        list.add(samochod1);

        Samochod samochod2 = new Samochod();
        samochod2.setModel("da");
        samochod2.setMarka("cosd1");
        samochod2.setRocznik("1917");
        samochod2.setCena(4040.00);
        samochod2.setPrzebieg(122121);
        samochod2.setVisible(true);
        list.add(samochod2);

        Samochod samochod3 = new Samochod();
        samochod3.setModel("BMWd");
        samochod3.setMarka("cos1d");
        samochod3.setRocznik("1917");
        samochod3.setCena(440.00);
        samochod3.setPrzebieg(121421);
        samochod3.setVisible(true);
        list.add(samochod3);

        Samochod samochod4 = new Samochod();
        samochod4.setModel("BMW");
        samochod4.setMarka("cos1");
        samochod4.setRocznik("1917");
        samochod4.setCena(40440.00);
        samochod4.setPrzebieg(1212121);
        samochod4.setVisible(true);
        list.add(samochod4);

        Samochod samochod6 = new Samochod();
        samochod6.setModel("BMW");
        samochod6.setMarka("cos1");
        samochod6.setRocznik("1917");
        samochod6.setCena(40440.00);
        samochod6.setPrzebieg(1212121);
        samochod6.setVisible(true);
        list.add(samochod6);

        return list;

    }
}
