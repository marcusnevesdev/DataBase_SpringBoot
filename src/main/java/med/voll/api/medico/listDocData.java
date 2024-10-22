package med.voll.api.medico;

import med.voll.api.doctor.Especialidade;
import med.voll.api.doctor.Medico;

public record listDocData(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public listDocData(Medico medico){
        this(medico.getId(), medico.getNome(), medico.GetEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
