package pe.com.nttdata.validar.cliente.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.nttdata.validar.cliente.dao.IClienteCheckDao;
import pe.com.nttdata.validar.cliente.model.ClienteCheck;
import pe.com.nttdata.validar.cliente.service.IClienteCheckService;

import java.util.Date;

@Service
@AllArgsConstructor
public class ClienteCheckServiceImpl implements IClienteCheckService {

    private final IClienteCheckDao iClienteCheckDao;
    public boolean esClienteFraudulento(Integer id){
        iClienteCheckDao.save(
                ClienteCheck.builder()
                        .clienteId(id)
                        .esEstafador(false)
                        .fechaCreacion(new Date())
                        .build()
        );
        return false;
    }
}
