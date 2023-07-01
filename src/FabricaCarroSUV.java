public class FabricaCarroSUV implements FabricaDeCarro{
    @Override
    public Car criandoCarro() {
        return new CarroSUV();
    }
}
