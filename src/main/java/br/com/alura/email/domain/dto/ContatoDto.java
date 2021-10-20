/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): HUXXX
 * Description: N/A
 * Date: 30/09/2021
 */

package br.com.alura.email.domain.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContatoDto {
    private Long id;
    private String email;
    private String assunto;
    private String mensagem;
    private Boolean agendado;
}
