package no.pub.repository;

import no.pub.model.Info;


import java.util.List;

/**
 * Created by matmoe on 15.01.14.
 */
public interface InfoRepository {

   Info getById(Long id);
    List<Info> getAll();

}
