/**
 * 
 */
package com.shannon.dao;


import org.springframework.data.repository.CrudRepository;

import com.shannon.model.ProjectCode;

/**
 * @author Mirkin
 *
 */
public interface ProjectCodeDao extends CrudRepository<ProjectCode, String> {
}
