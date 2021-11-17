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

    @GetMapping("/home")
    public String home(){
        return "index3.html";
    }

    @RequestMapping(value= "preUser", method = RequestMethod.POST)
    public String createPreUser(@RequestBody PreUserRequest preUserRequest){
        System.out.println(preUserRequest.getType());
        System.out.println(preUserRequest.getPhoneNum());
        preUserService.createPreUser(preUserRequest);
        return "index3.html";
    }
}
