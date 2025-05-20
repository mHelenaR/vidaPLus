package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableAnnotation(tableName = "Logs", prefix = "logs_")
public class Logs {

    private int id;
    private int codigo;
    private int usua_id;
    private String descricao;
    private Date data_criacao;

    public Logs() {
        super();
    }
}