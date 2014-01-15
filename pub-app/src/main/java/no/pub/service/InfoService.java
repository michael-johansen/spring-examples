package no.pub.service;

import no.pub.model.Info;


import java.util.List;

/**
 * Created by matmoe on 15.01.14.
 */

public interface InfoService {

    Info getById(Long id);
    List<Info> getAll();
}
