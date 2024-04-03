
/**
 * Escreva uma descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppStart
{
    public static void main(String[] args)
    {
        ShippingCompany sc = new ShippingCompany("RELIABLE-MOVING");
        
        sc.add(new GroundTransportation("AA-BB-11"));
        sc.add(new AirTransportation("TAP", 5));
        sc.add(new AirTransportation("RYANAIR", 10));
        sc.add(new Lorry(5, 10, "CC-DD-22"));
        sc.add(new Van(5, "EE-FF-33"));
        
       for(Transport transport : sc)
       {
           System.out.println(transport.toString());
       }
        
    }
}
