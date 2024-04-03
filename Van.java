
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(int packages, String licensePlate)
    {
        super(licensePlate);
        if(packages >= 0)
            this.packages = packages;
        else
            this.packages = -1;
            
    }
    
    public int getPackages()
    {
        return packages;
    }
    
    public void setPackages(int packages)
    {
        if(packages >= 0)
            this.packages = packages;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Nº de embalagens: " + packages;
    }
}
