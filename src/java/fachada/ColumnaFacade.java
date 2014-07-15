/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import entidad.Columna;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo
 */
@Stateless
public class ColumnaFacade extends AbstractFacade<Columna> {
    @PersistenceContext(unitName = "AutoScriptWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColumnaFacade() {
        super(Columna.class);
    }
    
}
