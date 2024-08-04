package light.polair.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("Hello")
   public String hello(Model model) {
        return "hello";
    }
}
