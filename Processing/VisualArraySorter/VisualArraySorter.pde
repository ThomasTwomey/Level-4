//1. create int variables for the width and height
int width = 400;
int height = 250;

//2. create an array of ints that contain the same
//   number of ints as the size of your width variable
int[] arr = new int[width];

void setup(){
 //3.set the size of your window
   size(width, height);
 
 //4. initialize the int array with random numbers
 //   from 0 to you height variable
 for(int i = 0; i < arr.length; i++){
   arr[i] = (int)random(height);
 }
 
 //5. call the noStroke() method
  noStroke();
}

void draw(){
 //6. set the background color with background(r, g, b);
 background(119, 170, 153);
 
 //7. set the color for your graph
 fill(0);

 //8. draw a rectangle for each int in your array.
 //   the x value will be the element of the int
 //   the y value will be your height variable
 //   the width is 1
 //   the height is negative the value of the int at that element in the array
 for(int i = 0; i < arr.length; i++){
   rect(i, height, 1, -arr[i]);
 }

 //9. go through the array and swap any two values that are out of order
 //   Do a search for bubble sort for better clarification
 
     for(int j = 1; j < arr.length; j++){
       if(arr[j - 1] > arr[j]){
         int temp = arr[j - 1];
         arr[j - 1] = arr[j];
         arr[j] = temp;
       }
     }
 
 //10. reset the values of the array to a new random value
 //      whenever the mouse is clicked
 
 if(mousePressed){
     for(int i = 0; i < arr.length; i++){
     arr[i] = (int)random(height);
   }
 }
 
 //11. try using different sorting algorithms the see which ones are the fastest.
}


