package be.vdab.strips.services;

import be.vdab.strips.domain.Figuur;

import java.util.List;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public interface FiguurService{
    List<Figuur> findAll();
}
