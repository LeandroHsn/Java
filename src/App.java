public class App {
    public static void main(String[] args) throws Exception {
    Fita fita1 = new Fita();
    Fita fita2 = new Fita();
    Lampada lampada1 = new Lampada();

    fita1.cor = "Verde"; fita1.peso = 300; fita1.marca = "3M";
    fita2.cor = "Vermelha"; fita2.peso = 400; fita2.marca = "Duracel";

    fita1.colar();
    fita1.decorar();    
    fita2.colar();

    lampada1.cor = "Amarela"; lampada1.watts = 60; lampada1.acender = false;

    System.out.println("Cor da lampada: " + lampada1.cor);
    System.out.println("Watts da lampada: " + lampada1.watts);
    System.out.println("Ela está acesa? " + lampada1.acender);
    
    lampada1.acender();
    lampada1.apagar();       
}    
}
