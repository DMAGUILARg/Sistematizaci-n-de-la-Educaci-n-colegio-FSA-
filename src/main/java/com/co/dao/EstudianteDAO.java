
package com.co.dao;

import com.co.pojo.Estudiante;
import org.springframework.data.repository.CrudRepository;



public interface EstudianteDAO extends CrudRepository<Estudiante,Integer> {
    
}
