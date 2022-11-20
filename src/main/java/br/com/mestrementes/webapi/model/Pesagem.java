package br.com.mestrementes.webapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(schema = "mestrementes", name = "TB_PESAGEM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pesagem implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mestremente")
    private Mestremente idMestremente;

    @JsonProperty("data")
    @Column(name = "data")
    private LocalDateTime data = LocalDateTime.now();

    @JsonProperty("vl_pesagem")
    @Column(name = "vl_pesagem")
    private Float vlPesagem;

    //to do: colocar a imagem

}
