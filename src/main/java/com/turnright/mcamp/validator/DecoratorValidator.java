package com.turnright.mcamp.validator;

public abstract class DecoratorValidator extends Validator{
	protected Validator	validator;
	public DecoratorValidator(Validator validator){
		this.validator = validator;
	}
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}
}
