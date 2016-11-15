/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.model;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.woehlke.javaee7.petclinic.entities.Owner;
import org.woehlke.javaee7.petclinic.dao.OwnerDao;
import org.woehlke.javaee7.petclinic.dao.OwnerDaoImpl;

/**
 *
 * @author sies
 */
@RequestScoped
public class Ativo {
    
    //@Inject
    //private OwnerDao dao;

    public void setAtivo(Long id, OwnerDao dao) {
        dao.enableUser(id);
    }
    
    
}
