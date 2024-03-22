package com.api.login.service.impl;

import com.api.login.DTO.CartaNombramientoDTO;
import com.api.login.dao.CartaNombramientoDao;
import com.api.login.mapper.CartaNombramientoMapper;
import com.api.login.pojo.CartaNombramiento;
import com.api.login.service.CartaNombramientoService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CartaNombramientoServiceImpl implements CartaNombramientoService {

    @Autowired
    private CartaNombramientoDao cartaNombramientoDao;

    @Autowired
    private CartaNombramientoMapper mapper;

    @Override
    public List<CartaNombramientoDTO> getAll() {
        List<CartaNombramiento> carta = cartaNombramientoDao.findAll();
        return carta.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CartaNombramientoDTO create(CartaNombramientoDTO cartaNombramientoDTO) {
        CartaNombramiento carta = mapper.toEntity(cartaNombramientoDTO);
        carta = cartaNombramientoDao.save(carta);
        return mapper.toDTO(carta);
    }

    @Override
    public CartaNombramientoDTO update(Integer id, CartaNombramientoDTO cartaNombramientoDTO) {
        Optional<CartaNombramiento> optional = cartaNombramientoDao.findById(id);
        if(optional.isPresent()){
            CartaNombramiento carta = optional.get();

            carta.setNumeroRevision(cartaNombramientoDTO.getNumeroRevision());
            carta.setCoDocumento(cartaNombramientoDTO.getCoDocumento());
            carta.setFechaRevision(cartaNombramientoDTO.getFechaRevision());
            carta.setFechaEmision(cartaNombramientoDTO.getFechaEmision());
            carta.setNombreRemitente(cartaNombramientoDTO.getNombreRemitente());
            carta.setCiudad(cartaNombramientoDTO.getCiudad());
            carta.setCodigoPostal(cartaNombramientoDTO.getCodigoPostal());
            carta.setFecha(cartaNombramientoDTO.getFecha());
            carta.setNombreDestinatario(cartaNombramientoDTO.getNombreDestinatario());
            carta.setCargoRemitente(cartaNombramientoDTO.getCargoRemitente());
            carta.setCargoDestinatario(cartaNombramientoDTO.getCargoDestinatario());
            carta.setFechaInicio(cartaNombramientoDTO.getFechaInicio());
            carta.setHorarioLaboral(cartaNombramientoDTO.getHorarioLaboral());
            carta.setBeneficiosAdicionales(cartaNombramientoDTO.getBeneficiosAdicionales());
            carta.setPoliticasNormativas(cartaNombramientoDTO.getPoliticasNormativas());
            carta.setCargoDelRemitente(cartaNombramientoDTO.getCargoDelRemitente());

            carta = cartaNombramientoDao.save(carta);
            return mapper.toDTO(carta);
        }

        return null;
    }

    @Override
    public void eliminar(Integer id) {
        Optional<CartaNombramiento> optional = cartaNombramientoDao.findById(id);
        if (optional.isPresent()){
            cartaNombramientoDao.deleteById(id);
        }
    }
}
