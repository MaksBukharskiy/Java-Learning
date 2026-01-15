package com.fleetScan.taxiService.repository;

import com.fleetScan.taxiService.entity.Admin.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FleetRepository extends JpaRepository<Fleet, Long> {

    Optional<Fleet> findById(Long id);
    Optional<Fleet> findByName(String name);
    Optional<Fleet> findByPublicId(String publicId);
    Optional<Fleet> findByAdminChatId(Long adminChatId);

}
