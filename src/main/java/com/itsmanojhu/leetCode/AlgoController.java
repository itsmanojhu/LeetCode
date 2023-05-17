package com.itsmanojhu.leetCode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/algo1")
public class AlgoController {

    @GetMapping("/test")
    public String test(){
        return "All good";
    }
}
