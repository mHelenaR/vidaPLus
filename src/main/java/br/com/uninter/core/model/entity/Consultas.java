package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableAnnotation(tableName = "Consultas", prefix = "cons_")
public class Consultas {

    private int id;
    private int paci_id;
    private int medi_id;
    private Date data;
    private String tipo;
    private String status;

    public Consultas() {
        super();
    }
}