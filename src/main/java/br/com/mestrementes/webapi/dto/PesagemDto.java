package br.com.mestrementes.webapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PesagemDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "id_mestremente")
    private Long idMestremente;

    @JsonProperty("data")
    private LocalDateTime data = LocalDateTime.now();

    @JsonProperty("vl_pesagem")
    private Float vlPesagem;
}
