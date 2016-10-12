package es.upm.miw.pd.visitor.figure;

public class VisitorNumberOfSides  extends Visitor {
    private double numberOfSides = 0;
    
    @Override
    public void visitCircle(Circle e) {
        // TODO Auto-generated method stub
        this.numberOfSides=this.numberOfSides+ Double.POSITIVE_INFINITY;
        
    }

    @Override
    public void visitSquare(Square e) {
       this.numberOfSides=this.numberOfSides+4;
        
    }

    @Override
    public void visitTriangle(Triangle e) {
        this.numberOfSides=this.numberOfSides+3;
        
    }

    public double getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(double numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    

}
