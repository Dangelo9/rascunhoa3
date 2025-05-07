package projetoA3.BackA3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoA3.BackA3.dto.OrderDTO;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody OrderDTO order) {
        System.out.println("Pedido recebido de: " + order.getName());
        System.out.println("Endereço: " + order.getAddress());
        System.out.println("Itens:");
        order.getCart().forEach(item -> System.out.println(item.getName()));

        // Aqui você poderia salvar no banco de dados

        return ResponseEntity.ok("Pedido recebido com sucesso!");
    }
}