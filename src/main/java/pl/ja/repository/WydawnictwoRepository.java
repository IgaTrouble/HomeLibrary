package pl.ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ja.model.Wydawnictwo;

public interface WydawnictwoRepository extends  JpaRepository<Wydawnictwo, Integer> {

	Wydawnictwo findOneByName (String name);
}
