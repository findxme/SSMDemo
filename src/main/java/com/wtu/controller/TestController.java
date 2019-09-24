package com.wtu.controller;

import com.wtu.pojo.User;
import com.wtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class TestController {


   @Autowired
   UserService userService;

   @RequestMapping("/login")
   public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session){
     String username= request.getParameter("fAccount");
      String password= request.getParameter("fPassword");
      List<Map<String, Object>> list = userService.seleteUser();
      System.out.println(list);
      for (Map<String, Object> map : list) {
         if (map.get("name").equals(username)&&map.get("password").equals(password)){
            ModelAndView view =new ModelAndView("home");
           // view.addObject()
            return view;
         }
      }
    //   System.out.println("123456");
       session.setAttribute("msg5","559assdsa55");
      ModelAndView view2 =new ModelAndView("redirect:/registered.jsp");
      return view2;
   }
    @RequestMapping("/SignUp")
    public ModelAndView logUp(HttpServletRequest request, HttpServletResponse response){
        User user = new User();
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        System.out.println(username);
        user.setUsername(username);
        user.setPassword(password);
//        System.out.println(user.toString());
        userService.insertUser(user);
        request.setAttribute("msg","odk应该插入成功了");
        ModelAndView view =new ModelAndView("home");
        return view;
    }
}
