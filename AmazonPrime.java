
class AmazonPrime{
public static void main(String[] movies){

String kannadaMovies[]= {"Kantara A Legend Chapter - 1","K.G.F Chapter 2","Sapta Sagaradaache Ello - Side A","Yuvarathnaa","BRAT","Kiss","Bank of Bhagyalakshmi","Andondittu Kaala","Forest","Udaala","Junior","777 Charlie","Maadeva","Dia","Case of Kondana","French Biriyani","Law","Mayabazar","Kavaludaari","Operation Alamelamma"};

String hindiMovies[]= {"Rocky Aur Rani Kii Prem Kahaani","Drishyam 2","Kanchana 3","Bachchhan Paandey","Section 375","Satyaprem Ki Katha","Gehraiyaan","Marjaavaan","Chhorii","Ram Setu","Phir Hera Pheri","Bholaa","Housefull 5A","Bawaal","Sonu Ke Titu Ki Sweety","Runway 34","Pati Patni Aur Woh","Thank God","Street Dancer 3D","Pagalpanti"};

String englishMovies[] = {"The Boy","Hotel Transylvania: Transformania","The Wrecking Crew","The Boss Baby","Tom & Jerry The Movie","The Nun II Extended Preview","The Angry Birds Movie","Madagascar","Spider-Man: Into The Spider-Verse","The Angry Birds Movie 2","Original Sin","Penguins of Madagascar","Kung Fu Panda 3","Mission: Impossible - The Final Reckoning","Spider-Man: No Way Home","Hereditary","The Only Living Boy in New York","Annabelle: Creation","IT Chapter Two","Interstellar"};

String tamilMovies[] = {"Jailer","Vaa Vaathiyaar","Jai Bhim","Varisu","Shaitan","Kaithi","Thiruchitrambalam","Bigil","VIP 2","Sarpatta Parambarai","Coolie","Udaan","Ponniyin Selvan Part 1","Mahaan","Whistle","Pathu Thala","Madharaasi","Kaashmora","Maaveeran","96","Vikram"};

String teluguMovies[] = {"Pushpa: The Rise","Spy","Cheekatilo","Yashoda","Maharshi","Jathi Ratnalu","Dhandoraa","V","Adipurush","Sita Ramam","HIT The Second Case","Vakeel Saab","Sarkaru Vaari Paata","World Famous Lover","Shaakuntalam","Dear Comrade","Kalki 2898 AD","Temper","Bhagavanth Kesari","Jersey"};

System.out.println("The available kannada movies are: " );
for(String movie:kannadaMovies){
System.out.println(movie);}

System.out.println();

System.out.println("The available Hindi movies are: " );
for(String movie:hindiMovies){
System.out.println(movie);}

System.out.println("The available English movies are: " );
for(String movie:englishMovies){
System.out.println(movie);}

System.out.println();


System.out.println("The available Tamil movies are: " );
for(String movie:tamilMovies){
System.out.println(movie);}

System.out.println();


System.out.println("The available Telugu movies are: " );
for(String movie:teluguMovies){
System.out.println(movie);}
}
}