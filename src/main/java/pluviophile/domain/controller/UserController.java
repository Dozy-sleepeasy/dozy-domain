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
        return "index3.html";
    }

    @GetMapping("/home")
    public String intro(){return "index.html";}

    @RequestMapping(value= "/preUser/home", method = RequestMethod.POST)
    public String createPreUserA(@RequestBody PreUserRequest preUserRequest){
        preUserService.createPreUser(preUserRequest, "a");
        return "success.html";
    }

    @RequestMapping(value= "/preUser", method = RequestMethod.POST)
    public String createPreUserB(@RequestBody PreUserRequest preUserRequest){
        preUserService.createPreUser(preUserRequest, "b");
        return "success.html";
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
