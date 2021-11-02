package main;

public class AnimationTest {
	public static void main(String[] args) throws InterruptedException {
		
		Long animationSpeed = (long) 500;
		int animationLength = 10;
		
		AnimationController animationController = new AnimationController(animationSpeed, animationLength);
		
		animationController.animateGuy();
	}
}
