package pluviophile.domain.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import pluviophile.domain.domain.PreUser;
import pluviophile.domain.dto.MemberDto;
import pluviophile.domain.service.MemberService;
import pluviophile.domain.service.PreUserService;

import java.util.List;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;
    private final PreUserService preUserService;


    @GetMapping("/member/signup")
    public String signupForm(Model model) {
        model.addAttribute("member",new MemberDto());

        return "signupForm";
    }

    @PostMapping("/member/signup")
    public RedirectView signup(MemberDto memberDto) {
        memberService.signUp(memberDto);

        return new RedirectView("/member/login");
    }

    @GetMapping("/member/login")
    public String login() {
        return "loginForm";
    }

    @GetMapping("/admin/userList")
    public String userList(Model model) throws Exception{
        List<PreUser> users = preUserService.getPreUsers();
        model.addAttribute("userList", users);
        return "userList";
    }

//    @RequestMapping(value = "/admin/userList", method = RequestMethod.GET)
//    public String userList(Model model) throws Exception{
//        List<PreUser> users = preUserService.getPreUsers();
//        model.addAttribute("userList", users);
//        return "userList";
//    }

}


