/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insolina.genetics;

/**
 *
 * @author nigel_2
 */
public interface Crossover {
    ChromosomePair generateOffspring(final ChromosomePair parents);
}
