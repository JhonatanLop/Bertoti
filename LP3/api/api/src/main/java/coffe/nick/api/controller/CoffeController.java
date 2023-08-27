package coffe.nick.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coffe.nick.api.records.DadosCoffe;

@RestController
@RequestMapping("/coffee")
public class CoffeController {

    @PostMapping
    public void Cadastrar(@RequestBody DadosCoffe json) {
        System.out.println(json);
    }
}
