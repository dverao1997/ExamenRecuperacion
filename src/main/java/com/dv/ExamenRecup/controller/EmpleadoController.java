package com.dv.ExamenRecup.controller;

import com.dv.ExamenRecup.model.Empleado;
import com.dv.ExamenRecup.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Empleado>> listarEmpleado(){
        return new ResponseEntity<>(empleadoService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Empleado> crearEMpleado(@RequestBody Empleado empleado){
        return new ResponseEntity<>(empleadoService.save(empleado),HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable Long id,@RequestBody Empleado empleado){
        Empleado e=empleadoService.findById(id);
        if (empleadoService==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            try{
                e.setNombre(empleado.getNombre());
                e.setApellido(empleado.getApellido());
                e.setCelular(empleado.getCelular());
                e.setCorreo(empleado.getCorreo());
                e.setDireccion(empleado.getDireccion());
                e.setList_fabrica(empleado.getList_fabrica());
                e.setList_maquina(empleado.getList_maquina());
                e.setList_tipoEmpleado(empleado.getList_tipoEmpleado());
                return new ResponseEntity<>(empleadoService.save(e),HttpStatus.OK);
            }catch(DataAccessException de){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Empleado> eliminarEmpleado(@PathVariable Long id){
        empleadoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
