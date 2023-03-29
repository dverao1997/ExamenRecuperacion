package com.dv.ExamenRecup.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tipoEmpleado")
public class TipoEmpleado {
    private String nombre_puesto;
    private String descripcion;
}
