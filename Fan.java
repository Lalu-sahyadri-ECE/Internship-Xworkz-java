class Fan{
	static boolean isRotating;
	static int currentSpeed;
	static int maxSpeed =5;
	static int minSpeed;

static boolean onOrOff(){
	if(isRotating == false){
		isRotating = true;
		System.out.println("The Fan is turned On...");
	}
	else{
		isRotating = false;
		System.out.println("The Fan is turned Off...");
	}
	return isRotating;
}

static void increaseSpeed(){
	System.out.println("Increase speed is invoked..");
	System.out.println("Number of arguments is 0..");
	if(isRotating == true){
		System.out.println("Proceed to increase speed");
		if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed +1;
			System.out.println("The current Speed is :"+currentSpeed);
		}
		else{
			System.out.println("Max Speed is Reached");
		}
	}
	else{
		System.out.println("First Turn on the Fan..");
	}
}

static void decreaseSpeed(){
	System.out.println("Decrease speed is invoked..");
	System.out.println("Number of arguments is 0..");
	if(isRotating == true){
		System.out.println("Proceed to Decrease speed");
		if(currentSpeed > minSpeed){
			currentSpeed = currentSpeed -1;
			System.out.println("The current Speed is :"+currentSpeed);
		}
		else{
			System.out.println("Minimum Speed is Reached");
		}
	}
	else{
		System.out.println("First Turn on the Fan..");
	}
}
}
