class Dabba {
    double width , height , depth ;
    //this constructor takes object as type Dabba
    Dabba(Dabba ob){
        //passing objects to the constructor
        width = ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    //constructor used when all  dimensions are specified
    Dabba(double width , double height , double depth){
        this.depth= depth;
        this.height=height;
        this.width=width;

    }
    //constructor used when no dimensions are specified
    Dabba(){
        //used to denote that  all the values are not specified
        width=height=depth= -1 ;

    }
    //constructor  used when cube is created
    Dabba(double len){
        width=height=depth=len;

    }
    //compute and return result
    double volume(){
        return  width*height*depth;
    }
}
public class ObjectsAsParameters {
    public static void main(String[] args) {

    }
}
