package ro.utcluj.model;

public class laptop extends Electronics{
    private double displaySize;
    private String processor;
    private String graphicsCard;

    public laptop(){

    }

    @Override
    public int getWarrantyExp(){
        return this.getYearOfManufacturing() + 3;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }
}
