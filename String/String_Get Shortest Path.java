//CALCULATE SHORTEST PATH BY ANALYSE THE EAST,WEST,NORTH,SOUTH

public class main{
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){       //NORTH DIRECTION
                y++;
            }
            else if(dir=='S'){   //SOUTH DIRECTION
                y--;
            }
            else if(dir=='W'){   //WEST DIRECTION
                x--;
            }
            else{                //EAST DIRECTION 
                x++;
            }
        }
     
        int X2=x*x;              //FOR SHORTEST PATH CALCULATION
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2); //TYPECAST IS USED
    }
    public static void main(String[] args){
        String str="WNEENESENNN";
        System.out.println(getshortestpath(str));
    }
}
