/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): SRC-89
 * Description: APRESENTANDO EJB'S E O PROJETO DE AGENDAMENTO DE E-MAIL
 * Date: 30/09/2021
 */

package br.com.alura.email.controller;

import br.com.alura.email.domain.Contato;
import br.com.alura.email.service.ContatoService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("email")
public class ContatoController extends HttpServlet {

    @Inject
    private ContatoService contatoService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        contatoService.listar().forEach(resultado -> printWriter.print("Os e-mails disponíveis são: " + resultado.getEmail()));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        String[] email = reader.readLine().split(",");
        Contato contato = new Contato();
        contato.setEmail(email[0]);
        contato.setAssunto(email[1]);
        contato.setMensagem(email[2]);
        contatoService.inserir(contato);
    }
}
