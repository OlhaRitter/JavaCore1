package lesson10.homework;

public enum Clothing {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private double euroSize;

    Clothing(double size) {
        this.euroSize = euroSize;
    }

    public double getsize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

}
