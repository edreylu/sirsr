/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modules.sirsr.unidadResponsable;

import com.modules.sirsr.persistence.repository.UnidadResponsableRepository;


import com.modules.sirsr.utils.Mensaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edward Reyes
 */
@Service
public class UnidadResponsableService {
    
    private final UnidadResponsableRepository unidadResponsableRepository;
    private final UnidadResponsableMapper unidadResponsableMapper;
    private Mensaje msg;

    @Autowired
    public UnidadResponsableService(UnidadResponsableRepository unidadResponsableRepository, UnidadResponsableMapper unidadResponsableMapper) {
        this.unidadResponsableRepository = unidadResponsableRepository;
        this.unidadResponsableMapper = unidadResponsableMapper;
    }

    public List<UnidadResponsableDTO> findAll() {
        return unidadResponsableMapper.toUnidadResponsableDTOs(unidadResponsableRepository.findAll());
    }

    public UnidadResponsableDTO findById(String id) {
        UnidadResponsableDTO unidadResponsableDTO = unidadResponsableMapper.toUnidadResponsableDTO(unidadResponsableRepository.findById(id).get());
        return unidadResponsableDTO;
    }

    public UnidadResponsableDTO findByClaveUr(String claveUr) {
        UnidadResponsableDTO unidadResponsableDTO = unidadResponsableMapper.toUnidadResponsableDTO(unidadResponsableRepository.findByClaveUr(claveUr));
        return unidadResponsableDTO;
    }


}
