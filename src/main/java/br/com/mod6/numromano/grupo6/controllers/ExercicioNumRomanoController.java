package br.com.mod6.numromano.grupo6.controllers;

import br.com.mod6.numromano.grupo6.utils.NumeroRomanoConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExercicioNumRomanoController {

    @RequestMapping("/romano/{numero}")
    public String numRomano(@PathVariable String numero) {
        int n = 0;

        try {
            n = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            return "Não é possível converter strings.";
        }

        if( n >= 4000) {
            return "Número maior do que o esperado. Pegunte a um romano :)";
        } else if (n < 0) {
            return "Número negativo. Pergunte a um romano :)";
        } else if(n == 0) {
            return "Número zero não existe em algarismos romanos. Perguntamos a um romano!";
        }

        return numero + ": " + NumeroRomanoConverter.converteRomano(numero);
    }
}
