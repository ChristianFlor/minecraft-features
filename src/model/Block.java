package model;

public class Block {
	public static final String STONE="src/ui.Img/Stone.png";
	public static final String GRASS="src/ui.Img/Grass.png";
	public static final String DIRT="src/ui.Img/Dirt.png";
	public static final String COBBLESTONE="src/ui.Img/Cobblestone.png";
	public static final String WATER="src/ui.Img/Water.png";
	public static final String BROWN_MUSHROOM="src/ui.Img/Brown_Mushroom.png";
	public static final String RED_MUSHROOM="src/ui.Img/Red_Mushroom.png";
	public static final String OBSIDIAN="src/ui.Img/Obsidian.png";
	public static final String FIRE="src/ui.Img/Fire.png";
	public static final String SNOW="src/ui.Img/Snow.png";
	public static final String ICE="src/ui.Img/Ice.png";
	public static final String CACTUS="src/ui.Img/Cactus.png";
	public static final String REEDS="src/ui.Img/Reeds.png";
	public static final String VINE="src/ui.Img/Vine.png";
	public static final String MYCELIUM="src/ui.Img/Mycelium.png";
	
	private String type;
	private String img;
	public Block(String type) {
		this.type = type;
		this.img = img;
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
	
	public void uploadImage() {
		if(type=="Stone") {
			setImg(STONE);
		}else if(type=="Grass") {
			setImg(GRASS);
		}
	}
	
}
