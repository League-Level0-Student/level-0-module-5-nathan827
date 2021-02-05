
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1000,500);
  /* Call the noFill() command so all the ellipses will be transparent */
noFill();
}


void draw() {

        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/  
        int speed = 10;
        for(int x = 250; x <= 750; x+= speed){
        for(int ellipse = 400; ellipse > 0; ellipse -= 1){
  if(ellipse % 100 == 0){
   
   ellipse(x,250,ellipse,ellipse);
  }
  if(ellipse % 100 == 50){
    
    ellipse(x,250,ellipse,ellipse);
  }
      
  }
  
    
}
        for(int x = 750; x >= 250; x-=speed){
         for(int ellipse = 400; ellipse > 0; ellipse -= 1){
  if(ellipse % 100 == 0){
   
   ellipse(250,250,ellipse,ellipse);
  }
  if(ellipse % 100 == 50){
    
    ellipse(250,250,ellipse,ellipse);
  }
        }
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
        }
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */

         
         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
