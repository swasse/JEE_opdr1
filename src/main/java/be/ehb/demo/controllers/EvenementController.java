package be.ehb.demo.controllers;

import be.ehb.demo.model.DataSource;
import be.ehb.demo.model.Evenement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@Controller
@RequestMapping(value = "/events")
public class EvenementController {


    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public HashSet<Evenement> getAllEvents(){
        return DataSource.getInstance().getEvenementen();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Evenement getByID(@PathVariable(name = "id") int id){
        return DataSource.getInstance().findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity addEvent(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "name")String naam,
            @RequestParam(name = "type")String soort){
        DataSource.getInstance().addEvenement(id, naam, soort);

        return new ResponseEntity(HttpStatus.OK);
    }

}
