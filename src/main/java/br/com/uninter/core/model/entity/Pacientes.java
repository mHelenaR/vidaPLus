package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableAnnotation(tableName = "Pacientes", prefix = "paci_")
public class Pacientes {

    private int id;
    private String nome;
    private Date data_nasc;
    private String sexo;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    public Pacientes() {
        super();
    }
}
