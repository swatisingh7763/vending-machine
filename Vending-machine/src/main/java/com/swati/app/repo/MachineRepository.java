package com.swati.app.repo;

import com.swati.app.models.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine,Integer> {
}
