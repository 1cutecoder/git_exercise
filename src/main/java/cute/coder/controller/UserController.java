package cute.coder.controller;

import cute.coder.bean.MultiUser;
import cute.coder.bean.MyUser;
import cute.coder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by cute coder
 * 2019/5/15 17:03
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String login(String username,String password,Model model){
        if (userService.login(username,password)){
            model.addAttribute("username",username);
            model.addAttribute("msg","您已登录成功");
            return "hello";
        }
        return "login";
    }

    @RequestMapping("dateParse")
    public String dataParse(MyUser user, Model model){
        model.addAttribute("username",user.getUsername());
        model.addAttribute("date",user.getBirthday());
        return "showBirthday";
    }

    @RequestMapping("register")
    public String register(MultiUser user, MultipartFile headfile, Model model, HttpServletRequest request){
        String filename = headfile.getOriginalFilename();//headfile为null异常

        if (filename.contains("jpg") ||filename.contains("png")||filename.contains("jpeg")) {
            String newFileName = UUID.randomUUID().toString() + filename.substring(filename.lastIndexOf("."));
            try {
                headfile.transferTo(new File(request.getServletContext().getRealPath(newFileName)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("realpath = " + request.getServletContext().getRealPath(newFileName));
            user.setHeadImgUrl(request.getServletContext().getRealPath(newFileName));
            model.addAttribute("user",user);
            System.out.println("user = " + user);
        } else {
            return "registerfail";
        }
        return "registersucceed";
    }
    public UserController() {
        System.out.println("usercontroller init");
    }
}
