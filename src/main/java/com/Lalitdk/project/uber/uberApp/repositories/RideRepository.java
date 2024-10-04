package com.Lalitdk.project.uber.uberApp.repositories;

import com.Lalitdk.project.uber.uberApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}