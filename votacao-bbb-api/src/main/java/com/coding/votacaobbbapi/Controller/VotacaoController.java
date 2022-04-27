package com.coding.votacaobbbapi.Controller;

import com.coding.votacaobbbapi.Model.ParticipanteModel;
import com.coding.votacaobbbapi.Service.VotacaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/votacao")
@AllArgsConstructor
public class VotacaoController {

    private final VotacaoService servico;

    @PostMapping
    public ResponseEntity<String> votar(@RequestBody ParticipanteModel participante) {
        servico.adicionarEvento(participante);
        return ResponseEntity.ok("voto computado");
    }

}
