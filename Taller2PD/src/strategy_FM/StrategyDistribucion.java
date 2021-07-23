package strategy_FM;

import java.util.ArrayList;

import application.Transporte;

public interface StrategyDistribucion {
	void enviarProduct(ArrayList<Product> products, Transporte transporte);
	void planEntrega();
}