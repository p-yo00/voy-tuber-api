package com.yeoff.voytuberapi.test;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping
  public Map<String, Object> hi() {
    return Map.of("hi", "bye");
  }
}
