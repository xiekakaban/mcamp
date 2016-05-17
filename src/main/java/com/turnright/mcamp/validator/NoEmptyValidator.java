package com.turnright.mcamp.validator;

public class NoEmptyValidator extends DecoratorValidator{
	
	public NoEmptyValidator(Validator validator){
		super(validator);
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

}
