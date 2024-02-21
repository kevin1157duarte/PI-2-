package aula2RPG;

public class Personagem {
	
	//variavel da calsse
	static String marca = "RPGSENAC";
	
	//variavel da instancia
	private String nome;
	private String rac;
	private String classe;
	
	private int inteligencia;
	private int destreza;
	private int forca;
	private int vida;
	private int xp;
	private int stamin;
	
	public static String getMarca() {
		return marca;
	}
	
	//metodo acessor / modificador
	public String getNome() {
		return this.nome.toUpperCase();
	}
	
	public void setNome(String pNome) {
		this.nome = pNome;
	}
	
	
	//----------------------------------------------------------
	public int getVida() {
		return this.vida;
	}
	public void setVida(int pVida) {
		this.vida = pVida;
	}
	
	
	//----------------------------------------------------------
	public int getXp() {
		return this.xp;
	}
	public void setXp (int pXp){
		this.xp = pXp;
	}
	
	//metordo
	void atacar() {
		System.out.println("atacar...");
		xp += 10;
		
	}
	
	//construtor
	public Personagem(){
	this.vida = 100;
		
	}
	public Personagem(String nome){
		this.vida = 100;
		this.nome = nome;
		}

	public String getRac() {
		return rac;
	}

	public void setRac(String rac) {
		this.rac = rac;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getStamin() {
		return stamin;
	}

	public void setStamin(int stamin) {
		this.stamin = stamin;
	}
}
