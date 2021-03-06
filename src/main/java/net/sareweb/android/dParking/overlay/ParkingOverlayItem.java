package net.sareweb.android.dParking.overlay;

import net.sareweb.android.dParking.model.Parking;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class ParkingOverlayItem extends OverlayItem{

	private Parking parking;
	
	public ParkingOverlayItem(GeoPoint point, String title, String snippet) {
		super(point, title, snippet);
	}
	
	public ParkingOverlayItem(GeoPoint point, String title, String snippet, Parking parking) {
		super(point, title, snippet);
		this.parking=parking;
	}

	public Parking getparking(){
		return parking;
	}
	
}
