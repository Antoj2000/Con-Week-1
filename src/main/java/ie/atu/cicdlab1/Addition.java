package ie.atu.cicdlab1;

import org.springframework.web.bind.annotation.*;

@RestController
public class Addition {
    @GetMapping("/addition")
    public String getAddition(@RequestParam int num1, int num2){
        int sum = num1 + num2;
        return "The sum of these two numbers is " + sum;}
    @GetMapping("/subtract")
    public String getSubtraction(@RequestParam int num1, int num2){
        int sum = num1 - num2;
        return "The answer is " + sum;}
    @GetMapping("/multiply")
    public String getMultiple(@RequestParam int num1, int num2){
        int sum = num1 * num2;
        return "The multiple of these two numbers is " + sum;}
    @GetMapping("/divide")
    public String getDivision(@RequestParam int num1, int num2){
        if (num2 == 0){
            return " Cannot divise by 0 ";
        }else {
        int sum = num1 / num2;
        return "The division is " + sum;}
}
}
