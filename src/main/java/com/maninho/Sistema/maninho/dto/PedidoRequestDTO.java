package com.maninho.Sistema.maninho.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoRequestDTO {

    private Long clienteId;

    private List<ItemPedidoRequestDTO> itens;

}
