
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class GroundTransportation extends Transport
{
    private String licensePlate;
    
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
        super.setFees(3);
    }
    
    public String getLicensePlate()
    {
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
    
    public double getPriceWithFees()
    {
        return super.getPriceWithFees();
    }
    
    @Override
    public String getTransportType()
    {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "      Matricula: " + getLicensePlate() + "\n";
    }
}
