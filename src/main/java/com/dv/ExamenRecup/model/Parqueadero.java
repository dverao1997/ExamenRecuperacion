package com.dv.ExamenRecup.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "parqueadero")
public class Parqueadero {
    private String nombre;
    private String n_plazas;
    private String descripcion;
}
