package br.com.uninter.core.model.entity;

import br.com.uninter.core.utils.annotations.TableAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableAnnotation(tableName = "Usuarios", prefix = "usua_")
public class Usuarios {

    private int id;
    private String nome;
    private String senha;
    private String status;
    private String tipo;
    private Date data_criacao;

    public Usuarios() {
        super();
    }
}