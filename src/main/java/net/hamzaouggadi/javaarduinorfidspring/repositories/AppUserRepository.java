package net.hamzaouggadi.javaarduinorfidspring.repositories;

import net.hamzaouggadi.javaarduinorfidspring.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
