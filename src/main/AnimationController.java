package main;

public class AnimationController {
	
	private Long animationSpeed;
	
	public AnimationController () {
		this.animationSpeed = (long) 0;
	}
	
	public AnimationController (Long animationSpeed) {
		this.animationSpeed = animationSpeed;
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

	public Long getAnimationSpeed() {
		return animationSpeed;
	}

	public void setAnimationSpeed(Long animationSpeed) {
		this.animationSpeed = animationSpeed;
	}
}
