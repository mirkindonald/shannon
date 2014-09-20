/**
 * 
 */
package com.shannon.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.shannon.model.Timesheet;
import com.shannon.model.TimesheetPK;

/**
 * @author Mirkin
 *
 */
public interface TimeSheetDao extends CrudRepository<Timesheet, TimesheetPK> {
	@Query("SELECT t FROM Timesheet t WHERE LOWER(t.id.employeeId) = LOWER(:employeeId) and  LOWER(t.id.date)=LOWER(:date)")
	public Timesheet findByEmpId(@Param("employeeId")String employeeId,@Param("date")String date);
}
