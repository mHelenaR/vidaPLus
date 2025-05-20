package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableAnnotation(tableName = "Receitas", prefix = "rece_")
public class Receitas {

    private int id;
    private int cons_id;
    private int medi_id;
    private int paci_id;
    private Date data_criacao;
    private String descricao;

    public Receitas() {
        super();
    }
}
