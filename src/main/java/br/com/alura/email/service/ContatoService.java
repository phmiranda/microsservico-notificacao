/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): SRC-89
 * Description: APRESENTANDO EJB'S E O PROJETO DE AGENDAMENTO DE E-MAIL
 * Date: 30/09/2021
 */

package br.com.alura.email.service;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ContatoService {
    public List<String> listarEmail() {
        return List.of("aluno@alura.com.br");
    }
}
