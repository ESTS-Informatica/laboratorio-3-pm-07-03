
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
   
    public AirTransportation(String name, int numberOfContainers)
    {
        if(name != null)
            this.name = name;
        else
            this.name = "";
            
        if(numberOfContainers >= 0)
            this.numberOfContainers = numberOfContainers;
        else
            this.numberOfContainers = 0;
            
        super.setFees(0.4);
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public int getNumberOfContainers()
    {
        return numberOfContainers;
    }
    
    public void setName(String name)
    {
        if(name != null)
            this.name = name;    

    }
    
    public void setNumberOfContainers(int numberOfContainers)
    {
        if(numberOfContainers >= 0)
            this.numberOfContainers = numberOfContainers;
    }
    
    public double getPriceWithFees()
    {
        double extra = getPrice() * getFees();
        return getPrice() - extra;
    }
    
    @Override
    public String getTransportType()
    {
        return "Transporte Aéreo";
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "           Nome: " + getName() + "  NºContentores: " + getNumberOfContainers() + "\n";
    }
}
