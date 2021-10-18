/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): HUXXX
 * Description: N/A
 * Date: 30/09/2021
 */

package br.com.alura.email.persistence.repository;

import br.com.alura.email.domain.dto.ContatoDto;
import br.com.alura.email.persistence.BaseRepository;

import java.util.List;

public class ContatoRepository implements BaseRepository {

    @Override
    public List<ContatoDto> index() {
        return null;
    }

    @Override
    public void excluir() {

    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void pesquisarPorId(Long id) {

    }

    @Override
    public void pesquisarPorNome(String nome) {

    }

    @Override
    public void pesquisarPorEmail(String email) {

    }

    @Override
    public void pesquisarPorDocumento(String documento) {

    }
}
