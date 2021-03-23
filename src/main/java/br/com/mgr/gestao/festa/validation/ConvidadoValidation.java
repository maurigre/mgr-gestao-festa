package br.com.mgr.gestao.festa.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.mgr.gestao.festa.dataprovider.model.Convidado;

public class ConvidadoValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Convidado.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "quantidadeAcompanhantes", "field.required");

		Convidado convidado = (Convidado) target;
		if(convidado.getQuantidadeAcompanhantes() == null 
				|| convidado.getQuantidadeAcompanhantes() <=0) {
			//errors.rejectValue("quantidadeAcompanhantes", "field.required");
			errors.rejectValue("quantidadeAcompanhantes", "field.required", "A quantidade deve ser informada");
		}
	}

}
