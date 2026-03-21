package br.facens.proj01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{nome}")
    public ResponseEntity<String> hello(@PathVariable String nome) {
        if (nome.equals("Emerson")) {

            return ResponseEntity.ok("Boa noite! " + nome + ". Acesso permitido");
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Boa noite!");
       
    }

    @PostMapping("/{nome}")
    public ResponseEntity<String> insert(@PathVariable String nome) {
        return ResponseEntity.status(HttpStatus.CREATED).body(nome + " cadastrado com sucesso!");
    }



}
// http://localhost:8080/pedidos/12345
// http://localhost:8080/hello/emerson