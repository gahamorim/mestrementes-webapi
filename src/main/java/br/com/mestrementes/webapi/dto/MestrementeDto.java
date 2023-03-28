package br.com.mestrementes.webapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MestrementeDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("dt_nascimento")
    private Date dtNascimento;

    @JsonProperty("email")
    private String email;
}
