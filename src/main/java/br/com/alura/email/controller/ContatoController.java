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
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("contatos")
public class ContatoController {

    @Inject
    private ContatoService contatoService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listar() {
        return Response.ok(contatoService.listar()).build();
    }
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response inserir(Contato contato) {
        contatoService.inserir(contato);
        return Response.status(201).build();
    }
}
