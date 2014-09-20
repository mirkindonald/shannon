/**
 * 
 */
package com.shannon.dao;


import org.springframework.data.repository.CrudRepository;

import com.shannon.model.Labour;

/**
 * @author Mirkin
 *
 */
public interface LabourDao extends CrudRepository<Labour, String> {
}
