/**
 * 
 */
package com.tus.farmservice.service;

import com.tus.farmservice.model.Farm;
import com.tus.farmservice.repository.FarmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * @author User
 *
 */
@Service
public class FarmService {
    private final FarmRepository farmRepository;

    public FarmService(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    public List<Farm> getAllFarms() {
        return farmRepository.findAll();
    }

    public Optional<Farm> getFarmById(Long id) {
        return farmRepository.findById(id);
    }

    public Farm createFarm(Farm farm) {
        return farmRepository.save(farm);
    }

    public Farm updateFarm(Long id, Farm updatedFarm) {
        Optional<Farm> existingFarmOptional = farmRepository.findById(id);
        if (existingFarmOptional.isPresent()) {
            Farm existingFarm = existingFarmOptional.get();
            existingFarm.setFarmName(updatedFarm.getFarmName());
            existingFarm.setLocation(updatedFarm.getLocation());
            return farmRepository.save(existingFarm);
        } else {
            throw new IllegalArgumentException("Farm not found with id: " + id);
        }
    }

    public void deleteFarm(Long id) {
        farmRepository.deleteById(id);
    }
}