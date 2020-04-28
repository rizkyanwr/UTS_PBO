public class GPSLoc_13020180138 {
	String nama, deskripsi;
	int longitude, latitude, baruLat, baruLong;

	public GPSLoc_13020180138(){
		longitude = 55;
		latitude = 90;
	}

	public GPSLoc_13020180138(String namabaru, String deskripsibaru){
		nama = namabaru;
		deskripsi = deskripsibaru;
	}
	
	void moveTo(int dLat, int dLong){
		GPSLoc_13020180138 g = new GPSLoc_13020180138();
		g.baruLat = dLat + g.latitude;
		g.baruLong = dLong + g.longitude;
		System.out.println("Latitude : " + g.baruLat + " dan Longitude : " + g.baruLong);
	}
}