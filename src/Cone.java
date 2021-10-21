
public class Cone {

	private float alt;
	private float raio;
	private int tipo;
	
	public Cone(float alt, float raio, int tipo) {   //Construtor
		setAlt(alt);
		setRaio(raio);
		setRaio(tipo);
	}
	
	public Cone(float alt, float raio){    //Construtor
		setAlt(alt);
		setRaio(raio);
	}
	
	public Cone(int tipo){    //Construtor
		setTipo(tipo);
	}
	
	public Cone(){     //Construtor
	}
	
	public float getAlt() {
		return alt;
	}

	public void setAlt(float alt) {
		if (alt > 0)
			this.alt = alt;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		if (raio > 0)
			this.raio = raio;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo > 0 && tipo < 3) 
			this.tipo = tipo;
	}

	public float ger() {
		return ((raio * raio) + (alt * alt));
	}

	public float ger1() {
		return (float) Math.sqrt(ger());
	}

	public float areat() {
		return (float) (3.14 * raio * (raio + ger1()));
	}

	public float areaf() {
		return (float) (3.14 * (raio * raio));
	}

	public float areal() {
		return (float) (3.14 * raio * ger1());
	}

	public float cobert() {
		return (float) (1 / 3.45);
	}

	public float litros() {
		return (float) (areat()/cobert());
	}
	
	public int lata() {
		return (int) Math.ceil((litros()/18));
	}
	
	public double valorlata() {
		if(tipo == 1)
			return 238.90;
		else if(tipo == 2 ) 
			return 467.98;
		else
			return 758.34;
	}
	
	public float total() {
		return (float)(lata()*valorlata());
	}

	@Override
	public String toString() {
		return "Cone [ger1()=" + ger1() + ", areat()=" + areat() + ", areaf()=" + areaf() + ", areal()=" + areal()
				+ ", litros()=" + litros() + ", lata()=" + lata() + ", total()=" + total() + "]";
	}
		
}
	
	
	

