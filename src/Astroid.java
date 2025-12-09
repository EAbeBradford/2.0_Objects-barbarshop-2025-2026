public class Astroid {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.


    // METHOD DEFINITION SECTION

    // Constructor Definition
    // A constructor builds the object when called and sets variable values.


    //This is a SECOND constructor that takes 3 parameters.  This allows us to specify the hero's name and position when we build it.
    // if you put in a String, an int and an int the program will use this constructor instead of the one above.
    public Astroid(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx =2;
        dy =5;
        width = 85;
        height = 85;
        isAlive = false;

    } // constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() {
        if(xpos >= 1000){ //wrap when hits right wall
            xpos = 0-width;
        }
        if(xpos<= 0){ //wrap when hits the left wall
            xpos = 999-width;
        }
        //todo: maked it wrap when hit the top and bottom
        if(ypos<=0){//wrap when hits the top wall
            ypos = 699;
        }

        if(ypos >= 700){ //wrap when hits the bottom wall
            ypos = 1;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

    }
}
