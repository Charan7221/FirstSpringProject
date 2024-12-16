package com.example.JobApp.SpringProject;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }
//    @PostMapping("/submitJobPost")
//    public String submitJobPost(JobPost jobPost, Model model) {
//        // Add jobPost to the model
//        model.addAttribute("jobPost", jobPost);
//        return "success"; // This should match the JSP name
//    }

}
