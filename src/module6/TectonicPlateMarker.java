package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.ShapeFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePolygonMarker;
import de.fhpotsdam.unfolding.utils.MapPosition;




public class TectonicPlateMarker extends SimplePolygonMarker{
		
		public TectonicPlateMarker(ShapeFeature feature) {
			super(feature.getLocations(), feature.getProperties());
			
		}
			
		
	
}
