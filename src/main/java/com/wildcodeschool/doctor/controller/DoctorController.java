package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor doctor(@PathVariable int number) {
        if(number <13 ){
            throw  new ResponseStatusException(HttpStatus.SEE_OTHER,"oups, i did it again");
        }
        if(number>14){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Et non... ");
        }
        return new Doctor(13,"Jodie Whitteker");
    }
}
