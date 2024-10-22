package med.voll.api.medicos;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DataEndereco;


public record UpdateDocData(
                            @NotNull
                            Long id,
                            String nome,
                            String telefone,
                            DataEndereco endereco
                            ) {
}
