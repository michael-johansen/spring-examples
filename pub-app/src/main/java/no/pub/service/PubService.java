package no.pub.service;

import no.pub.model.Pub;

import java.util.List;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:55
 */
public interface PubService {
    Pub getById(Long id);
    List<Pub> getAll();
    void save(Pub pub);

    void delete(Long id);
}
