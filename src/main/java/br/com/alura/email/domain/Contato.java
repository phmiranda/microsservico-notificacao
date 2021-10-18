/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): HUXXX
 * Description: N/A
 * Date: 30/09/2021
 */
package br.com.alura.email.domain;

import br.com.alura.email.domain.enums.Sexo;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "nome")
    public String nome;

    @Column(name = "email")
    public String email;

    @Column(name = "documento")
    public String documento;

    @Column(name = "numero_celular")
    public String numeroCelular;

    @Column(name = "numero_telefone")
    public String numeroTelefone;

    @Column(name = "data_de_nascimento")
    public LocalDate dataDeNascimento;

    @Column(name = "sexo")
    @Enumerated(EnumType.STRING)
    public Sexo sexo = Sexo.PADRAO;
}
