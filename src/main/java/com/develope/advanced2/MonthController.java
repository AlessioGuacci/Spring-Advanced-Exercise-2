package com.develope.advanced2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
    @GetMapping
    public Month getMonth(HttpServletRequest request){
        return (Month) request.getAttribute("MonthInterceptor-Month");
    }
}
