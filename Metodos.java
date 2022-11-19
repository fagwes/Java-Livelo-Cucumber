package metodos;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {
	
	/**Método para escrever passando o parametro By e String com texto
	 * 
	 * @param elemento
	 * @param texto
	 */
	
	
	public void escrever (By elemento, String texto) {
		try {
			
			driver.findElement(elemento).sendKeys(texto);
			
			
		} catch (Exception e) {
			System.err.println("erro ao tentar escrever no elemento" + elemento);
		}
		
		
	}
	
public void clicar(By elemento) {
	try {
		
		/** Metodo para clicar passando o parametro By
		 * 
		 */
		
		driver.findElement(elemento).click();
		
		
	} catch (Exception e) {
		System.err.println("erro ao tentar clicar no elemento" + elemento);
	}
	
	

	
}
}
