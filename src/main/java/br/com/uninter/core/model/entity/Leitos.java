package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableAnnotation(tableName = "Leitos", prefix = "leit_")
public class Leitos {

    private int id;
    private String codigo;
    private String status;
    private int paci_id;
    private Date data_reserva;
    private Date data_liberacao;

    public Leitos() {
        super();
    }
}