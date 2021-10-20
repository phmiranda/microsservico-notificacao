/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): SRC-89
 * Description: APRESENTANDO EJB'S E O PROJETO DE AGENDAMENTO DE E-MAIL
 * Date: 30/09/2021
 */

package br.com.alura.email.service;

import br.com.alura.email.domain.Contato;
import br.com.alura.email.repository.ContatoRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ContatoService {

    @Inject
    private ContatoRepository contatoRepository;

    public List<Contato> listar() {
        return contatoRepository.index();
    }

    public void inserir(Contato contato) {
        contato.setAgendado(false);
        contatoRepository.inserir(contato);
    }
}
