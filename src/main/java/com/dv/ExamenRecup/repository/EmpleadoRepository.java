package com.dv.ExamenRecup.repository;

import com.dv.ExamenRecup.model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepository extends MongoRepository<Empleado,Long> {
}
