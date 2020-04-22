package hu.me.krz.haladojava.calculatorweb.service;

import org.springframework.stereotype.Service;

import szamolapi.Szamol;
import szamolapi.SzamolApi;

@Service
public class SzamolVS implements ISzamolVS {

	@Override
	public double calculate(Szamol calculation) {
		return SzamolApi.calculateResult(calculation);
	}

}
