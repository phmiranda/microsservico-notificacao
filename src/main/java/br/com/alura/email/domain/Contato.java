/*
 * Author: phmiranda
 * Project: schedule-email
 * Task Number (Nº): HUXXX
 * Description: N/A
 * Date: 30/09/2021
 */

package br.com.alura.email.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode
@Entity(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "assunto")
    private String assunto;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "agendado")
    private Boolean agendado;
}
