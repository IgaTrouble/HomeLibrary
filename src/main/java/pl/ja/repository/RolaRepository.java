package pl.ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.ja.model.Role;

@Repository
public interface RolaRepository extends JpaRepository<Role, Integer>{
	
	
	Role findOneByRola(String rola);

}
