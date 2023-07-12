package br.com.treinaweb.ediaristas.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.ComponentScan;

import br.com.treinaweb.ediaristas.core.models.Usuario;
import br.com.treinaweb.ediaristas.web.dtos.UsuarioCadastroForm;
import br.com.treinaweb.ediaristas.web.dtos.UsuarioEdicaoForm;

@ComponentScan(basePackages = "br.com.treinaweb.ediaristas.web.mappers")
@Mapper(componentModel = "spring")
public interface WebUsuarioMapper {

   WebUsuarioMapper  INSTANCE = Mappers.getMapper(WebUsuarioMapper.class);

   Usuario toModel(UsuarioCadastroForm form);

   Usuario toModel(UsuarioEdicaoForm form);

   UsuarioEdicaoForm  toForm(Usuario model);
    
}
