public class GPSLoc {

	public static void main(String[] args){
		GPSLoc_13020180138 gps = new GPSLoc_13020180138();
		GPSLoc_13020180138 data = new GPSLoc_13020180138("Hi, nama saya Rizky Dwi Amalia" , "Saya mahasiswi semester 4.");
		System.out.println(data.nama + ", " + data.deskripsi);
		System.out.println("Lokasi awal saya : ");
		System.out.println("Latitude : "+ gps.latitude + " dan Longitude : "+ gps.longitude);
		System.out.println("Lokasi saya saat ini : ");
		gps.moveTo(40,55);
	}
}