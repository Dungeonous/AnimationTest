package main;

public class AnimationController {
	
	private Long animationSpeed;
	private int animationLength;
	
	public AnimationController () {
		this.animationSpeed = (long) 500;
		this.animationLength = 10;
	}
	
	public AnimationController (Long animationSpeed, int animationLength) {
		this.animationSpeed = animationSpeed;
		this.animationLength = animationLength;
	}
	
	public void printGuyOne() throws InterruptedException {
		Thread.sleep(animationSpeed);
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		
		System.out.println("       This is a test       ");
		System.out.println("              0             ");
		System.out.println("            \\ | /           ");
		System.out.println("             \\|/            ");
		System.out.println("              |             ");
		System.out.println("             / \\            ");
		System.out.println("            /   \\           ");
		System.out.print("hello ");
		System.out.print("world");
	}
	
	public void printGuyTwo() throws InterruptedException {
		Thread.sleep(animationSpeed);
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("                     ");
		
		System.out.println("       This is a test       ");
		System.out.println("              0             ");
		System.out.println("              |             ");
		System.out.println("           ___|___          ");
		System.out.println("              |             ");
		System.out.println("             / \\            ");
		System.out.println("            /   \\           ");
	}
	
	public void animateGuy() throws InterruptedException {
		for (int i = 0; i < animationLength; i++) {
			printGuyOne();
			printGuyTwo();
		}
	}

	public Long getAnimationSpeed() {
		return animationSpeed;
	}

	public void setAnimationSpeed(Long animationSpeed) {
		this.animationSpeed = animationSpeed;
	}

	public int getAnimationLength() {
		return animationLength;
	}

	public void setAnimationLength(int animationLength) {
		this.animationLength = animationLength;
	}
}
