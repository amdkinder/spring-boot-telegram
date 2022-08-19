package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/")
public class MyController {

    @GetMapping
    public ResponseEntity<MyClass> getInfo() {
        var res = MyClass.builder()
                .MYFIELD("Abdurahim")
                .PUR("aqilli")
                .name("Dabdalaji")
                .build();
        return ResponseEntity.ok(res);
    }

}
