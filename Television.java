class Television{
	static boolean isSwitchedOn;
	static int currentChannel;
	static int maxChannel =10;
	static int minChannel =1;

static boolean onOrOff(){
	if(isSwitchedOn == false){
		isSwitchedOn = true;
		System.out.println("The Television is turned On...");
	}
	else{
		isSwitchedOn = false;
		System.out.println("The Television is turned Off...");
	}
	return isSwitchedOn;
}

static void nextChannel(){
	System.out.println("Next channel is invoked..");
	System.out.println("Number of arguments is 0..");
	if(isSwitchedOn == true){
		System.out.println("Proceed to change channel");
		if(currentChannel < maxChannel){
			currentChannel = currentChannel +1;
			System.out.println("The current Channel is :"+currentChannel);
		}
		else{
			System.out.println("Max Channel is Reached");
		}
	}
	else{
		System.out.println("First Turn on the Television..");
	}
}

static void previousChannel(){
	System.out.println("Previous channel is invoked..");
	System.out.println("Number of arguments is 0..");
	if(isSwitchedOn == true){
		System.out.println("Proceed to change channel");
		if(currentChannel > minChannel){
			currentChannel = currentChannel -1;
			System.out.println("The current Channel is :"+currentChannel);
		}
		else{
			System.out.println("Minimum Channel is Reached");
		}
	}
	else{
		System.out.println("First Turn on the Television..");
	}
}
}
