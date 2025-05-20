package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableAnnotation(tableName = "Medicos", prefix = "medi_")
public class Medicos {

    private int id;
    private String nome;
    private String especialidade;
    private String crm;
    private String email;
    private String telefone;

    public Medicos() {
        super();
    }
}