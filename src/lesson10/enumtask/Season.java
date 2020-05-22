package lesson10.enumtask;

public enum Season {
    WINTER(-3),SPRING(15),SUMMER(27){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8);
    private double avrTmp;

    Season(double avrTmp) {
        this.avrTmp = avrTmp;
    }

    public double getAvrTmp() {
        return avrTmp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}
