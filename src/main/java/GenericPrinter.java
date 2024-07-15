public class GenericPrinter<T extends Material> {

    private T meterial;

    public T getMeterial() {
        return meterial;
    }

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }

    public String toString(){
        return meterial.toString();
    }
}
