package main;

import java.util.ArrayList;
import java.util.List;

// Class for ProductNotifier. It is the Subject in the Observer pattern.
public class ProductNotifier {
	private List<ProductObserver> observers = new ArrayList<>();

	 public void addObserver(ProductObserver observer) {
	     observers.add(observer);
	 }
	
	 public void removeObserver(ProductObserver observer) {
	     observers.remove(observer);
	 }
	
	 public void notifyObservers(Product product) {
	     for (ProductObserver observer : observers) {
	         observer.update(product);
	     }
	 }
}