package model;

public class Block {
	public static final String STONE="File:imgs/Stone.png";
	public static final String GRASS="File:imgs/Grass.png";
	public static final String DIRT="File:imgs/Dirt.png";
	public static final String COBBLESTONE="File:imgs/Cobblestone.png";
	public static final String WATER="File:imgs/Water.png";
	public static final String BROWN_MUSHROOM="File:imgs/Brown_Mushroom.png";
	public static final String RED_MUSHROOM="File:imgs/Red_Mushroom.png";
	public static final String OBSIDIAN="File:imgs/Obsidian.png";
	public static final String FIRE="File:imgs/Fire.png";
	public static final String SNOW="File:imgs/SNOW.png";
	public static final String ICE="File:imgs/ICE.png";
	public static final String CACTUS="File:imgs/CACTUS.png";
	public static final String REEDS="File:imgs/Reeds.png";
	public static final String VINE="File:imgs/Vine.png";
	public static final String MYCELIUM="File:imgs/Mycelium.png";
	public static final int MAX_AMOUNT=64;
	private int amount;
	private String type;
	private String img;
	public Block(String type, int amount) {
		this.type = type;
		
		if (amount <= MAX_AMOUNT) {
			this.amount = amount;
		}
		uploadImage();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void uploadImage() {
		if(type=="Stone") {
			setImg(STONE);
		}else if(type=="Grass") {
			setImg(GRASS);
		}
	}
	public boolean incrementarCantidad(final int incremento) {
		boolean incrementado = false;

		if (amount + incremento <= MAX_AMOUNT) {
			amount += incremento;
			incrementado = true;
		}

		return incrementado;
	}
	public boolean reducirCantidad(final int reduccion) {
		boolean reducido = false;

		if (amount - reduccion >= 0) {
			amount -= reduccion;
			reducido = true;
		}

		return reducido;
	}
}
