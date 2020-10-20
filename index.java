

void setup() {
size(500, 500);
background(255);
//Draws first rectangle
fill((int) random(1,255), (int) random(1,255), (int) random(1,255));
rect((int) random(50,450), (int)random(50,450), (int)random(50,300), (int)random(50,300));

}

void draw() {
//variables for the ellipse
int eX =(int)random(mouseX + (int) random(-20,20), mouseX + random(-20,20));
int eY =(int)random(mouseY + random(-20,20), mouseY + random(-20,20));
fill((int) random(1,255), random(1,255), random(1,255));

//draws ellipse
ellipse(eX, eY, 10,10);
}

void mousePressed() {
//variables for the rectangle
int w = (int)random(50,300);
int z = (int)random(50,300);
int x = (int)random(0,500);
int y = (int)random(0,500);
//Resets the screen and then draws the rectangle
background(255);
fill((int) random(1,255), (int) random(1,255), (int) random(1,255));
rect(x, y, w, z);


}