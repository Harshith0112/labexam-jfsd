package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController 
{
	@GetMapping("/welcome")
	@ResponseBody
    public String welcome(Model model) {
        return "Welcome to Spring MVC! by 2200032343"; 
    }

    @GetMapping("/about")
    public String renderAboutPage() {
        return "about"; 
    }

    @GetMapping("/showInfo")
    public String showInfo(
        @RequestParam("id") int id,
        @RequestParam("name") String name,
        Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showinfo";
    }

    @GetMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "calculateSum";
    }

    @GetMapping("/product")
    public String product() {
        return "product";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "addNumbers";
    }

    @GetMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("combined", combined);
        return "combineStrings";
    }

    @GetMapping("/multiply")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculate";
    }

    @GetMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int subtraction = num1 - num2;
        int division = (num2 != 0) ? num1 / num2 : 0; // Avoid division by zero
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2";
    }
}
