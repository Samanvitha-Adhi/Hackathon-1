class SolarEnergyGenerator{
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
    {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        double morningEnergy = 5.0; 
        double eveningEnergy = 7.0; 

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");
    }
}
