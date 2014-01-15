package no.pub.service;

import no.pub.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import no.pub.repository.InfoRepository;

import java.util.List;

/**
 * Created by matmoe on 15.01.14.
 */
@Service
public class InfoServiceImpl implements InfoService {
    private final InfoRepository infoRepository;

    @Autowired
    public InfoServiceImpl(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    @Override
    public Info getById(Long id) {
        return infoRepository.getById(id);
    }

    @Override
    public List<Info> getAll() {
        return infoRepository.getAll();
    }
}
