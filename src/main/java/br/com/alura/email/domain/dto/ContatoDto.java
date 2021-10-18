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

import java.time.LocalDate;

@Getter
@Setter
public class ContatoDto {
    public Long id;
    public String nome;
    public String email;
    public String documento;
    public String numeroCelular;
    public String numeroTelefone;
    public LocalDate dataDeNascimento;
    public String sexo;
}
