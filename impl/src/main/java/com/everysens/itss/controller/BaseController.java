package com.everysens.itss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(
    path = "#{${itss-spring.base-path:/} + 'itss/' + ${itss-spring.specification-version:1.1}"
)
public class BaseController {

}
