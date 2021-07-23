package strategy_FM;

import java.util.ArrayList;

import FactoryMethod.Transporte;

public interface StrategyDistribucion {
	void enviarProduct(ArrayList<Product> products, Transporte transporte);
	void planEntrega();
}