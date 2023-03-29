package com.dv.ExamenRecup.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "empleado")
public class Empleado {
    private Long id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private List<Maquina> list_maquina;
    private List<Fabrica> list_fabrica;
    private List<TipoEmpleado>list_tipoEmpleado;
}
