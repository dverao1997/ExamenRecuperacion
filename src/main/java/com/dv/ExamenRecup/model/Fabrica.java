package com.dv.ExamenRecup.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "fabrica")
public class Fabrica {
    private String nombre;
    private String ruc;
    private String direccion;

    private List<Parqueadero> list_parqueadero;
}
