class Box{
    double width , height , depth ;
    //constructor used when all the dimensions are specified
    Box(double depth , double height , double width ){
        this.height = height;
        this.width=width;
        this.depth =depth;

    }
    // this constructor used when no dimensions are specified

    Box(){
        // these lines are used when we have uninitilised Box dimensions
        height=-1;
        width=-1;
        depth=-1;

    }
    //this constructor is used when we have cube

    Box(double len){
        height=depth=width=len ;
    }
    //compute and return result
    double volume(){
        return width*height*depth;
    }


}


public class ConstructorOverloading {
    public static void main(String[] args) {
        //create boxes using various constructors
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol ;

        // getting volumes

        vol = mybox1.volume();
        System.out.println("volume of the first box :" +vol);
        // second
        vol = mybox2.volume();
        System.out.println("volume of second box :" +vol);
         // third
        vol = mybox3.volume();
        System.out.println("volume of third : " +vol);



    }
}
