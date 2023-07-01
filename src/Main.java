public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaCarroSedan();
        Car sedan = fabrica.criandoCarro();
        sedan.montadora();

        FabricaDeCarro fabrica1 = new FabricaCarroSUV();
        Car suv = fabrica1.criandoCarro();
        suv.montadora();


    }
}