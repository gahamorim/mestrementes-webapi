package br.com.mestrementes.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "mestrementes", name = "TB_MESTREMENTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mestremente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    @Column(name = "id")
    private Long id;

    @JsonProperty("nome")
    @Column(name = "id")
    private String nome;

    @JsonProperty("dt_nascimento")
    @Column(name = "dt_nascimento")
    private Date dtNascimento;

    @JsonProperty("email")
    @Column(name = "email")
    private String email;

    @JsonProperty("pesagens")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cdLogAudit")
    private List<Pesagem> pesagens = new ArrayList<>();

}
