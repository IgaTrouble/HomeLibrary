package pl.ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.ja.model.Gatunek;


@Repository
public interface GatunekRepository extends JpaRepository<Gatunek, Integer> {

}
