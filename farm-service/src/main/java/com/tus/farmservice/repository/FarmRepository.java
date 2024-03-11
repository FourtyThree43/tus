/**
 * 
 */
package com.tus.farmservice.repository;

import com.tus.farmservice.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author User
 *
 */
public interface FarmRepository extends JpaRepository<Farm, Long> {
	
}