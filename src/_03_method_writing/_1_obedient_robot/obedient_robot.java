package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class obedient_robot {
public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog("What shape do you want?");
	if(shape.equals("square")) {
	drawSquare();
	}
	
}
	static void drawSquare(){
					Robot rob = new Robot();
					rob.penDown();
for(int square = 1; square <= 4; square +=1) {
	rob.setSpeed(100);		
	rob.move(100);
			rob.turn(90);
		}
	}
	static void drawTriangle() {
		Robot rob = new Robot();
		rob.penDown();
		for(int triangle = 1; triangle <= 4; triangle +=1) {
			rob.setSpeed(100);		
			rob.move(100);
					rob.turn(60);
	}
	
	}
	static void drawCircle() {
		Robot rob = new Robot();
		rob.penDown();
		
	}
}

