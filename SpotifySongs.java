class SpotifySongs {
    public static void main(String[] song) {

        String[]availablesongs = {"Blinding Lights","Shape of You","Believer","Perfect","Levitating","Closer","Someone You Loved","Stay","Heat Waves","Counting Stars"};
        String song1 = availablesongs[0];
        String song2 = availablesongs[1];
        String song3 = availablesongs[2];
        String song4 = availablesongs[3];
        String song5 = availablesongs[4];
        String song6 = availablesongs[5];
        String song7 = availablesongs[6];
        String song8 = availablesongs[7];
        String song9 = availablesongs[8];
        String song10 = availablesongs[9];
		System.out.println("The Number of available songs are "+ availablesongs.length);
        //System.out.println(song1 + ", " + song2 + ", " + song3 + ", " + song4 + ", " + song5 + ", " +
                           //song6 + ", " + song7 + ", " + song8 + ", " + song9 + ", " + song10);
for(String songs : availablesongs){
System.out.println(songs);    
}
   }
}
