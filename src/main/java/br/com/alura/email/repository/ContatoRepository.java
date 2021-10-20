/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): SRC-90
 * Description: PERSISTÊNCIA COM JPA
 * Date: 30/09/2021
 */

package br.com.alura.email.repository;

import br.com.alura.email.domain.Contato;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ContatoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Contato> index() {
        return entityManager.createQuery("SELECT c FROM contatos c", Contato.class).getResultList();
    }

    public void inserir(Contato contato) {
        entityManager.persist(contato);
    }
}
