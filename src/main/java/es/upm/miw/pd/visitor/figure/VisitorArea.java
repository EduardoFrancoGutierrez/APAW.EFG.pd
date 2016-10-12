package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends Visitor {
    
    private double area=0;
    
    @Override
    public void visitCircle(Circle e) {
        this.area= this.area+ (Math.PI * e.getRadius() * e.getRadius());
        
    }

    @Override
    public void visitSquare(Square e) {
        // side * side
        this.area= this.area+(e.getSide() * e.getSide());
        
    }

    @Override
    public void visitTriangle(Triangle e) {
        // TODO Auto- base * height * 0.5 method stub
        this.area=this.area+ (e.getBase()* e.getHeight() *0.5);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    

}
