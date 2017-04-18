package ar.edu.unlam.basica2;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	public Double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	public Double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	public Double conseguirPerimetroInterior(){
		Double perimetroInterior;
		perimetroInterior=2*Math.PI*getRadioInterior();
		return perimetroInterior;
	}
	public Double conseguirPerimetroExterior(){
		Double perimetroExterior;
		perimetroExterior=2*Math.PI*getRadioExterior();
		return perimetroExterior;
	}
	public Double conseguirSuperficie(){
		Double superficie;
		Double areaInterior;
		Double areaExterior;
		areaInterior=Math.PI*Math.pow(getRadioInterior(), 2);
		areaExterior=Math.PI*Math.pow(getRadioExterior(), 2);
		superficie=areaExterior-areaInterior;
		return superficie;
	}
	
}
