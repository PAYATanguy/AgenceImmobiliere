/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TypeTransaction;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author merieme
 */
@Stateless
public class TypeTransactionFacade extends AbstractFacade<TypeTransaction> {

    @PersistenceContext(unitName = "projet_agence_immobilerePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeTransactionFacade() {
        super(TypeTransaction.class);
    }
    
}
