package pe.com.nttdata.clientefeign.validar.cliente;

import org.springframework.cloud.openfeign.FeignClient;

public record ClienteCheckResponse(Boolean esEstafador) {
}
