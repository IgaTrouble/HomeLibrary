package pl.ja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.ja.model.Wydawnictwo;
import pl.ja.repository.WydawnictwoRepository;
@Service
public class WydawnictwoService {
	@Autowired
	WydawnictwoRepository wydawnictwoRepository;

}
