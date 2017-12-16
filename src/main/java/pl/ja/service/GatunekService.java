package pl.ja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.ja.model.Gatunek;
import pl.ja.repository.GatunekRepository;

@Service
public class GatunekService {
	
	@Autowired
	GatunekRepository gatunekRepository;
	
	public List<Gatunek> listAllGatunek() {
		return gatunekRepository.findAll();
	}
	
	
}
