package com.zup.infrasctructure.controller;

import com.zup.domain.dto.BaseDTO;
import com.zup.domain.exception.message.AlreadySavedException;
import com.zup.domain.exception.message.NotFoundedException;
import java.util.Collection;
import java.util.UUID;

public interface CrudController<T extends BaseDTO> {

  Collection<T> listAll();

  T findOneById(UUID id) throws NotFoundedException;

  T save(T dto) throws AlreadySavedException;

  T update(T dto) throws NotFoundedException;

  T delete(T dto) throws NotFoundedException;
}
