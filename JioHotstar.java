class JioHotstar{
	
public static void main (String[] user){
		
String hindiMovieNames[] = {"Housefull4","Kesari Chapter 1","Super 30","Brahmastra Part 1","Laxmii","Kill","Bhediya","OMG 2","Munjya","MS Dhoni","Chhichhore","Bloody Daddy","Kabir Singh","Cuttputlli","Sholay","Tadap","Hungama 2","Shiddat","Baaghi 3","Border","Total Dhammal"};
		
String malayalamMovieNames[] = {"Lokah","Padakkalam","thudarum","Vaazha","Avihitham","Ronth","Ponman","Tourist Family","Guruvayoor Ambalanadayil","Abraham Ozler","Falimy","Premalu","A.R.M","Romancham","Heaven","Neymar","Manjummel Boys","Vikram","Joe","Lover"};
		
String teluguMovieNames[] = {"Kill","IB71","Bhediya","Blood Daddy","King of Kotha","Mirai","Empuraan","Bhadrakaali","Veera simha redddy","Sundarakanda","Naa Saami Ranga","Liger","Sarvam Maya","Hridaya Poarram","Aaromaley","Anantha","Sister Midnight","Aan Paavam Pollathathu","Paranthu Po","Moonwalk","Mass","Police Police"};  

String kannadaMovieNames[] = {"Paramatma","Petromax","BellBottom","FirstRankRaju","Chamak","Goa","Ayogya","Pataki","Badava Rascal","Harikathe alla giri Kathe","Mark","Su from so","Kirik party","777 charlie","Pogaru","Porki","Kavacha","Dashavatar","Ajay","Manikya","Drishya","Ayogya","Appu"};

String englishMovieNames[] = {"Dolittle","Cash out","500 days of summer","Hangover","Beyond sky line","Claw","Survive","Weapons","Terrifier","Interstellar","Inception","Martian","Everest","Transformers","Geostorm","Godzilla","Avatar The way of water","Rememory","Man of steel","Water world"};
		
System.out.println("The available kannada movies are: " );
for(String movie:kannadaMovieNames){
System.out.println(movie);}

System.out.println();


System.out.println("The available Hindi movies are: " );
for(String movie:hindiMovieNames){
System.out.println(movie);}

System.out.println();


System.out.println("The available English movies are: " );
for(String movie:englishMovieNames){
System.out.println(movie);}

System.out.println();


System.out.println("The available Malyalam movies are: " );
for(String movie:malayalamMovieNames){
System.out.println(movie);}

System.out.println();


System.out.println("The available Telugu movies are: " );
for(String movie:teluguMovieNames){
System.out.println(movie);}


}
}