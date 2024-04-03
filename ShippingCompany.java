import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
   private String name;
   private ArrayList<Transport> inService;
   
   public ShippingCompany(String name)
   {
        if(name != null)
            this.name = name;
        else
            this.name = "";
            
        inService = new ArrayList();
   }
   
   public String getName()
   {
       return name;
   }
   
   public ArrayList<Transport> getInService()
   {
       return inService;
   }
   
   @Override
   public String toString()
   {
       String string = "";
       
       for(Transport transport: this)
       {
           string += transport.toString();
       }
       
       return string;
   }
   
   public void makeTranportation(String id, String origin, String destination, double price)
   {
       Iterator<Transport> iterator = this.iterator();
       while(iterator.hasNext())
       {
           Transport transport = iterator.next();
           if(transport.getId().equals(id) && transport.isAvailable())
           {
               transport.setOrigin(origin);
               transport.setDestination(destination);
               transport.setPrice(price);
               transport.setAvailable(false);
               this.remove(transport);
               inService.add(transport);
           }
       }
   }
   
   public void finalizeTransportation(String id)
   {
        Iterator<Transport> iterator = inService.iterator();
       while(iterator.hasNext())
       {
            Transport transport = iterator.next();
           if(transport.getId().equals(id))
           {
                inService.remove(transport);
                transport.setOrigin("");
                transport.setDestination("");
                transport.setPrice(0.0);
                transport.setAvailable(true);
                this.add(transport);
           }
       }
   }
   
   
   

}
