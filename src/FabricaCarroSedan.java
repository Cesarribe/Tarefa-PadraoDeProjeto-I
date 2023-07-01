public class FabricaCarroSedan implements FabricaDeCarro{
    @Override
    public Car criandoCarro() {
        return new CarroSedan();
    }
}
