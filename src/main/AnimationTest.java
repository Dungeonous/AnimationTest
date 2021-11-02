package main;

import main.AnimationController;

public class AnimationTest {
	public static void main(String[] args) throws InterruptedException {
		
		Long animationSpeed = (long) 500;
		
		AnimationController animationController = new AnimationController(animationSpeed);
		
		for (int i = 0; i < 100; i++) {
			animationController.printGuyOne();
			animationController.printGuyTwo();
		}
	}
}
