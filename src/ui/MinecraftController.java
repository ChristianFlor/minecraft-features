package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import model.Block;
import model.Minecraft;

public class MinecraftController {
	
	private static final String BLANK = "File:imgs\"+File.separator+\"back.png";
	@FXML
    private ScrollPane scrollPane;
    
    private Minecraft minecraft;
    

    @FXML
    private ComboBox<String> optionsType;
    @FXML
    private VBox vBox;
    @FXML
    private HBox hBox;
    
    private static GridPane gridInventory;
    private static GridPane gridBlocks;
    private static GridPane gridFeature;
    
    private static int[][] sizeInventory= new int[9][4];
    private static int[][] sizeFeature;
    @FXML
    void grouBlocks(ActionEvent event) {

    }

    public void addBlockToInventory(String block) {
	   
    }

	public void initialize() {
		
		minecraft = new Minecraft();
		
		gridInventory = new GridPane();
		gridInventory.setHgap(3);
		gridInventory.setVgap(3);
		
		gridBlocks = new GridPane();
		gridBlocks.setHgap(3);
		gridBlocks.setVgap(3);
		
		gridFeature= new GridPane();
		gridFeature.setHgap(3);
		gridFeature.setVgap(3);
		
		scrollPane.setContent(gridFeature);
    	vBox.getChildren().add(gridInventory);
    	hBox.getChildren().add(gridBlocks);
    	
		Button b= new Button();
		b.setStyle( "-fx-background-color:  A9A9A9");
		b.setGraphic(new ImageView("File:imgs/Stone.png"));
		b.setOnAction(new EventHandler<ActionEvent>() {
			int cont=0;
			String msg=" ";
            @Override public void handle(ActionEvent e) {
            	if(cont<64) {
            	cont++;
            	gridInventory.add(new ImageView(Block.STONE), 0, 0);
            	Label cantidad=new Label(msg);
            	cantidad.setText(""+cont);
            	cantidad.setStyle( "-fx-text-fill: white;"+"-fx-font-size : 16pt;");
        		cantidad.setTranslateX(30);
        		cantidad.setTranslateY(20);
        		gridInventory.add(cantidad,0,0);
            	}
            }
        });
		gridBlocks.add(b, 0, 0);
		
		Button b1= new Button();
		b1.setStyle( "-fx-background-color:  A9A9A9");
		b1.setGraphic(new ImageView(Block.GRASS));
		b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("1");
                minecraft.addBlockToInventory(Minecraft.DIRT);
                
            }
        });
		gridBlocks.add(b1, 1, 0);
		
		Button b2= new Button();
		b2.setStyle( "-fx-background-color:  A9A9A9");
		b2.setGraphic(new ImageView(Block.DIRT));
		b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("2");
                minecraft.addBlockToInventory(Minecraft.STONE);
            }
        });
		gridBlocks.add(b2, 2, 0);
		
		Button b3= new Button();
		b3.setStyle( "-fx-background-color:  A9A9A9");
		b3.setGraphic(new ImageView(Block.COBBLESTONE));
		b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("3");
            }
        });
		gridBlocks.add(b3, 3, 0);
		
		Button b4= new Button();
		b4.setStyle( "-fx-background-color:  A9A9A9");
		b4.setGraphic(new ImageView(Block.WATER));
		b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("4");
            }
        });
		gridBlocks.add(b4, 4, 0);
		
		Button b5= new Button();
		b5.setStyle( "-fx-background-color:  A9A9A9");
		b5.setGraphic(new ImageView(Block.BROWN_MUSHROOM));
		b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("5");
            }
        });
		gridBlocks.add(b5, 5, 0);
		
		Button b6= new Button();
		b6.setStyle( "-fx-background-color:  A9A9A9");
		b6.setGraphic(new ImageView(Block.RED_MUSHROOM));
		b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("6");
            }
        });
		gridBlocks.add(b6, 6, 0);
		
		Button b7= new Button();
		b7.setStyle( "-fx-background-color:  A9A9A9");
		b7.setGraphic(new ImageView(Block.OBSIDIAN));
		b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("7");
            }
        });
		gridBlocks.add(b7, 7, 0);
		
		Button b8= new Button();
		b8.setStyle( "-fx-background-color:  A9A9A9");
		b8.setGraphic(new ImageView(Block.FIRE));
		b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("8");
            }
        });
		gridBlocks.add(b8, 0, 1);
		
		Button b9= new Button();
		b9.setStyle( "-fx-background-color:  A9A9A9");
		b9.setGraphic(new ImageView(Block.SNOW));
		b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("9");
            }
        });
		gridBlocks.add(b9, 1, 1);
		
		Button b10= new Button();
		b10.setStyle( "-fx-background-color:  A9A9A9");
		b10.setGraphic(new ImageView(Block.ICE));
		b10.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("10");
            }
        });
		gridBlocks.add(b10, 2, 1);
		
		Button b11= new Button();
		b11.setStyle( "-fx-background-color:  A9A9A9");
		b11.setGraphic(new ImageView(Block.CACTUS));
		b11.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("11");
            }
        });
		gridBlocks.add(b11, 3, 1);
		
		Button b12= new Button();
		b12.setStyle( "-fx-background-color:  A9A9A9");
		b12.setGraphic(new ImageView(Block.REEDS));
		b12.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("12");
            }
        });
		gridBlocks.add(b12,4, 1);
		
		Button b13= new Button();
		b13.setStyle( "-fx-background-color:  A9A9A9");
		b13.setGraphic(new ImageView(Block.VINE));
		b13.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("13");
            }
        });
		gridBlocks.add(b13,5, 1);
		
		Button b14= new Button();
		b14.setStyle( "-fx-background-color:  A9A9A9");
		b14.setGraphic(new ImageView(Block.MYCELIUM));
		b14.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("14");
            }
        });
		gridBlocks.add(b14,6, 1);
		
		for (int i = 0; i < sizeInventory.length; i++) {			
			for (int j = 0; j < sizeInventory[0].length; j++) {
				gridInventory.add(new ImageView("File:imgs/back.png"), i, j);
			}
    	}

		sizeFeature= new int[10][1];
		int cont= sizeFeature[0].length;
		for (int i = 0; i < sizeFeature.length; i++) {			
			for (int j = 0; j < sizeFeature[0].length; j++) {
				gridFeature.add(new ImageView("File:imgs/feature.png"), i, j);
			}
    	}
		Label la= new Label(""+cont);
		la.setTranslateX(20);
		la.setStyle( "-fx-text-fill: white;"+"-fx-font-size : 40pt;");
		gridFeature.add(la,0,cont-1);
		System.out.println(cont);
		Label mayor= new Label(">");
		mayor.setStyle( "-fx-text-fill: white;"+"-fx-font-size : 40pt;");
		
		Button b15= new Button();
		b15.setStyle( "-fx-background-color:  #1a4501");
		b15.setGraphic(mayor);
		b15.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            	addFeature(cont+1);
            }
        });
		gridFeature.add(b15,10, 0);
		optionsType.getItems().addAll("Stone","Grass","Dirt","CobbleStone","Water","Brown Mushroom","Red Mushroom","Obsidian","Fire","Snow","Ice","Cactus","Reeds","Vine","Mycelium");
		
	}
	
	public static void addFeature(int n) {
		
		sizeFeature= new int[10][n];
		int cont= sizeFeature[0].length;
	
		for (int i = 0; i < sizeFeature.length; i++) {			
			for (int j = 0; j < sizeFeature[0].length; j++) {
				gridFeature.add(new ImageView("File:imgs/feature.png"), i, j);
				addCont(cont);
				addButton(cont);
			}
    	}
		
	}
	public static void addCont(int cont) {
		Label la= new Label(""+(cont));
		la.setTranslateX(20);
		la.setStyle( "-fx-text-fill: white;"+"-fx-font-size : 40pt;");
		gridFeature.add(la,0,cont-1);
	}
	
	public static void addButton(int cont) {
		Label mayor= new Label(">");
		mayor.setStyle( "-fx-text-fill: white;"+"-fx-font-size : 40pt;");
		Button b15= new Button();
		b15.setStyle( "-fx-background-color:  #1a4501");
		b15.setGraphic(mayor);
		b15.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            	addFeature(cont+1);
            }
        });
		gridFeature.add(b15,10, cont-1);
	}
	
}
