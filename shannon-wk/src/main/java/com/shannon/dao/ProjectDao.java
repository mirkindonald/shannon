/**
 * 
 */
package com.shannon.dao;


import org.springframework.data.repository.CrudRepository;

import com.shannon.model.ProjectNumber;
import com.shannon.model.ProjectNumberPK;

/**
 * @author Mirkin
 *
 */
public interface ProjectDao extends CrudRepository<ProjectNumber, ProjectNumberPK> {
}
