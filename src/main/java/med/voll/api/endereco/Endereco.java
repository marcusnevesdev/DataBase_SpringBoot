package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;


    public Endereco(DataEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.uf = endereco.uf();
        this.cidade = endereco.cidade();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
    }

    public void updateInfo(DataEndereco data) {
        if(data.logradouro() != null){
            this.logradouro = data.logradouro();
        }
        if(data.bairro() != null){
            this.bairro = data.bairro();
        }
        if(data.cep() != null){
            this.cep = data.cep();
        }
        if(data.uf() != null){
            this.uf = data.uf();
        }
        if(data.cidade() != null){
            this.cidade = data.cidade();
        }
        if(data.numero() != null){
            this.numero = data.numero();
        }
        if(data.complemento() != null){
            this.complemento = data.complemento();
        }
    }
}
