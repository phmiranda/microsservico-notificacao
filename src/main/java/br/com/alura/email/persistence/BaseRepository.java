/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): HUXXX
 * Description: N/A
 * Date: 30/09/2021
 */

package br.com.alura.email.persistence;

import br.com.alura.email.domain.dto.ContatoDto;

import java.util.List;

public interface BaseRepository {
    public List<ContatoDto> index();
    public void excluir();
    public void cadastrar();
    public void atualizar();
    public void pesquisarPorId(Long id);
    public void pesquisarPorNome(String nome);
    public void pesquisarPorEmail(String email);
    public void pesquisarPorDocumento(String documento);
}
