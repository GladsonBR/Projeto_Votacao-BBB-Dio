package com.coding.votacaobbbapi.Controller;

import com.coding.votacaobbbapi.Model.ParametroModel;
import com.coding.votacaobbbapi.Repository.ParametroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
public class ParametroController {

    private final ParametroRepository parametroRepository;

    public ParametroController(ParametroRepository parametroRepository) {
        this.parametroRepository = parametroRepository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametroModel){
        ParametroModel entidade = parametroRepository.save(parametroModel);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParametroModel> consultar(@RequestParam String chave){
       Optional<ParametroModel> getBusca = parametroRepository.findById(chave);
        if (getBusca.isEmpty()) {return ResponseEntity.notFound().build();}

        return ResponseEntity.ok(getBusca.get());
    }
}
