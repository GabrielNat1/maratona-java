package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Desktop;
import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Television;
import academy.devdojo.maratona.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratona.javacore.Npolimorfismo.service.TaxCalculate;

public class ProductTest01 {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("Desktop Gamer", 5000);
        Tomato tomato = new Tomato("Tomato", 10);
        Television tv = new Television("Smart TV", 3000);

        TaxCalculate.calculateTax(desktop);
        TaxCalculate.calculateTax(tomato);
        TaxCalculate.calculateTax(tv);
    }
}
