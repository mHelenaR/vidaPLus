package br.com.uninter.core.utils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TableAnnotation {
    String tableName();

    String prefix() default "";

    TableType tableType() default TableType.Default;

    String forwardMonths() default "1";

    EntityVersion version() default EntityVersion.V_2;

    enum TableType {
        Monthly,
        Default;

        private TableType() {
        }
    }

    enum EntityVersion {
        V_1,
        V_2;

        private EntityVersion() {
        }
    }
}