package com.coding.votacaobbbapi.Service;

import com.coding.votacaobbbapi.Model.ParticipanteModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class VotacaoService {

    private static final String Topico_Votacao = "votacao";

    private final KafkaTemplate<Object, Object> template;

    public VotacaoService(KafkaTemplate<Object, Object> template) {
        this.template = template;
    }

    public void adicionarEvento(ParticipanteModel participante) {
        template.send(Topico_Votacao, participante);
    }
}
