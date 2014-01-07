package no.pub.service;

import no.pub.model.Pub;
import no.pub.repository.PubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:56
 */
@Service
public class PubServiceImpl implements PubService {
    private final PubRepository pubRepository;

    @Autowired
    public PubServiceImpl(PubRepository pubRepository) {
        this.pubRepository = pubRepository;
    }

    @Override
    public Pub getById(Long id) {
        return pubRepository.getById(id);
    }

    @Override
    public List<Pub> getAll() {
        return pubRepository.getAll();
    }

    @Override
    public void save(Pub pub) {
        pubRepository.save(pub);
    }
}
