package org.discotools.gwt.leaflet.client.controls.search;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;
import org.discotools.gwt.leaflet.client.layers.ILayer;


/**
 * ControlZoomOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class SearchOptions extends ControlOptions  {

	public SearchOptions() {
		 super();
	}

	public void setSearchLayer(ILayer searchLayer) {
		getJSObject().setProperty("searchLayer",searchLayer.getJSObject());
	}
	
	public void setSearchLayerProp(String prop) {
		getJSObject().setProperty("searchLayerProp",prop);
	}
		
	public void setText(String text) {
		getJSObject().setProperty("text",text);
	}
	
	public void setTextErr(String errmsg) {
		getJSObject().setProperty("textErr",errmsg);
	}
	
	public void setZoom(int level) {
		getJSObject().setProperty("zoom",level);
	}
	
	
	
	public void setSearchJsonpUrl(String url) {
		getJSObject().setProperty("searchJsonpUrl",url);
	}	

}
