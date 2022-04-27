package com.coding.votacaobbbapi.Repository;

import com.coding.votacaobbbapi.Model.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
