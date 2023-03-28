public class boxPrice extends BoxWeight {
    double cost;

    boxPrice()
    {
        super();
        this.cost=-1;
    }

    boxPrice(boxPrice other)
    {
        super(other);
        this.cost=other.cost;
    }

    public boxPrice(double l, double w, double h, double weight,double cost) {
        super(l, w, h, weight);
        this.cost=cost;
    }

    public boxPrice(double side,double weight,double cost)
    {
        super(side,weight);
        this.cost=cost;
    }


    
}
