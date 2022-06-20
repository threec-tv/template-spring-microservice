package co.uk.cloudam.streaming.template;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("isAnonymous()")
public class TestController {

    @GetMapping("")
    public String test() {
        return "Hello World";
    }
}
