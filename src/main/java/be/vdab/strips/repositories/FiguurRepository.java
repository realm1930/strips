package be.vdab.strips.repositories;

import be.vdab.strips.domain.Figuur;

import java.util.List;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public interface FiguurRepository {
    List<Figuur> findAll();
}
