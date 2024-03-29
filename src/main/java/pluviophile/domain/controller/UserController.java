package pluviophile.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pluviophile.domain.domain.PreUser;
import pluviophile.domain.dto.PreUserRequest;
import pluviophile.domain.service.PreUserService;

@Controller
public class UserController {
    private final PreUserService preUserService;

    public UserController(PreUserService preUserService) {
        this.preUserService = preUserService;
    }

    @GetMapping("")
    public String home(){
        return "home1";
    }

    @GetMapping("/home")
    public String intro(){return "home2";}

    @GetMapping("/homeen")
    public String engHome(){return "home2_en";}

    @RequestMapping(value= "/preUser", method = RequestMethod.POST)
    public String createPreUserB(@RequestBody PreUserRequest preUserRequest){
        preUserService.createPreUser(preUserRequest, "a");
        return "success";
    }

    @RequestMapping(value= "/preUser/home", method = RequestMethod.POST)
    public String createPreUserA(@RequestBody PreUserRequest preUserRequest){
        preUserService.createPreUser(preUserRequest, "b");
        return "success";
    }



}
//
// Virual Memory Simulator Homework
// One-level page table system with FIFO and LRU
// Two-level page table system with LRU
// Inverted page table with a hashing system
// Submission Year:
// Student Name:
// Student Number:
//
