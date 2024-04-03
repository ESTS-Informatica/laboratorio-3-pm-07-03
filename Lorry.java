
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets, trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        if(numberOfPallets >= 0)
            this.numberOfPallets = numberOfPallets;
        else
            this.numberOfPallets = -1;
        
        if(trailers >= 0)
            this.trailers = trailers;
        else
            this.trailers = -1;
    }
    
    public int getNumberOfPallets()
    {
        return numberOfPallets;
    }
    
    public int getTailers()
    {
        return trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets)
    {
        if(numberOfPallets >= 0)
            this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers(int trailers)
    {
         if(trailers >= 0)
             this.trailers = trailers;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Nº de Paletes: " + numberOfPallets + "\n Trailers: " + trailers;
    }
}
