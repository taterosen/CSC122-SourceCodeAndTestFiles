package javaFX;

/**
 * Graphics Lab: Create a drawing of a playing card.
 * @author taterosen
 * 10/22/2020
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GraphicsPlayCard extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Group shapes = new Group();
		
		Rectangle r = new Rectangle(70, 50, 245, 545);
		r.setStroke(Color.BLUE);
		r.setFill(null);
		
		Polygon d1 = new Polygon();
		d1.getPoints().addAll(new Double[] {110.0,55.0, 145.0,100.0, 
											110.0,145.0, 75.0,100.0});
		d1.setFill(Color.FIREBRICK);
		
		Polygon d2 = new Polygon();
		d2.getPoints().addAll(new Double[] {275.0,500.0, 240.0,545.0, 
											275.0,590.0, 310.0,545.0});
		d2.setFill(Color.FIREBRICK);
		
		Polygon d3 = new Polygon();
		d3.getPoints().addAll(new Double[] {45.0,80.0, 30.0,100.0, 
											45.0,120.0, 60.0,100.0});
		d3.setFill(Color.FIREBRICK);
		
		Polygon d4 = new Polygon();
		d4.getPoints().addAll(new Double[] {340.0,525.0, 325.0,545.0, 
											340.0,565.0, 355.0,545.0});
		d4.setFill(Color.FIREBRICK);
		
		Polygon sword1 = new Polygon();
		sword1.getPoints().addAll(new Double[] {70.0,130.0, 90.0,140.0,
												90.0,555.0, 70.0,565.0});
		sword1.setStroke(Color.DARKGOLDENROD);
		
		Line l1 = new Line(80,135, 80,560);
		l1.setStroke(Color.DARKGOLDENROD);
		
		Polygon sword2 = new Polygon();
		sword2.getPoints().addAll(new Double[] {315.0,100.0, 295.0,110.0,
												295.0,505.0, 315.0,515.0});
		sword2.setStroke(Color.DARKGOLDENROD);
		
		Line l2 = new Line(305,105, 305,510);
		l2.setStroke(Color.DARKGOLDENROD);
		
		Polygon c1 = new Polygon(135,50, 175,90, 250,90, 290,50);
		c1.setFill(Color.FIREBRICK);
		
		Polygon c2 = new Polygon(115,595, 150,555, 225,555, 265,595);
		c2.setFill(Color.FIREBRICK);
		
		Polygon outline = new Polygon(70,160, 193,130, 315,160, 315,485,
										193,515, 70,485);
		outline.setStroke(Color.BLUE);
		outline.setFill(null);
		
		Ellipse head1 = new Ellipse(212,90, 38,60);
		head1.setStroke(Color.BLUE);
		head1.setFill(Color.WHITE);
		
		Rectangle cover1 = new Rectangle(135,0, 155,50);
		cover1.setFill(Color.WHITE);
		
		Ellipse head2 = new Ellipse(187,555, 38,60);
		head2.setStroke(Color.BLUE);
		head2.setFill(Color.WHITE);
		
		Rectangle cover2 = new Rectangle(135,595, 155,50);
		cover2.setFill(Color.WHITE);
		
		Polygon hair1 = new Polygon(230,90, 250,90, 270,150, 240,155);
		hair1.setStroke(Color.BLUE);
		hair1.setFill(Color.DARKGOLDENROD);
		
		Polygon hair2 = new Polygon(169,555, 149,555, 129,495, 159,490);
		hair2.setStroke(Color.BLUE);
		hair2.setFill(Color.DARKGOLDENROD);
		
		Polygon neck1 = new Polygon(170,136, 210,165, 240,140, 255,150,
									210,180, 150,141);
		
		Polygon neck2 = new Polygon(216,510, 176,479, 144,504, 131,494,
				176,464, 236,505);
		
		Line n1 = new Line(202,105, 198,123);
		n1.setStroke(Color.BLUE);
		
		Line n3 = new Line(198,123, 207,123);
		n3.setStroke(Color.BLUE);
		
		Line n2 = new Line(195,539, 199,521);
		n2.setStroke(Color.BLUE);
		
		Line n4 = new Line(199,521, 190,521);
		n4.setStroke(Color.BLUE);
		
		Ellipse eye1 = new Ellipse(190,107, 10,5);
		eye1.setStroke(Color.BLUE);
		eye1.setFill(Color.WHITE);
		
		Ellipse eye2 = new Ellipse(217,107, 10,5);
		eye2.setStroke(Color.BLUE);
		eye2.setFill(Color.WHITE);
		
		Line mouth1 = new Line(195,132, 212,132);
		mouth1.setStroke(Color.BLUE);
		
		Ellipse eye3 = new Ellipse(207,537, 10,5);
		eye3.setStroke(Color.BLUE);
		eye3.setFill(Color.WHITE);
		
		Ellipse eye4 = new Ellipse(180,537, 10,5);
		eye4.setStroke(Color.BLUE);
		eye4.setFill(Color.WHITE);
		
		Line mouth2 = new Line(202,512, 185,512);
		mouth2.setStroke(Color.BLUE);
		
		
		
		Ellipse eye11 = new Ellipse(190,107, 5,5);
		eye11.setStroke(Color.BLUE);
		eye11.setFill(Color.BLUE);
		
		Ellipse eye21 = new Ellipse(217,107, 5,5);
		eye21.setStroke(Color.BLUE);
		eye21.setFill(Color.BLUE);
		
		Ellipse eye31 = new Ellipse(207,537, 5,5);
		eye31.setStroke(Color.BLUE);
		eye31.setFill(Color.BLUE);
		
		Ellipse eye41 = new Ellipse(180,537, 5,5);
		eye41.setStroke(Color.BLUE);
		eye41.setFill(Color.BLUE);
		
		
		
		
		
		
		Rectangle j1 = new Rectangle(20,10, 40,10);
		j1.setFill(Color.FIREBRICK);
		Rectangle j2 = new Rectangle(35,10, 10,40);
		j2.setFill(Color.FIREBRICK);
		Rectangle j3 = new Rectangle(15,50, 30,10);
		j3.setFill(Color.FIREBRICK);
		
		Rectangle j4 = new Rectangle(325,625, 40,10);
		j4.setFill(Color.FIREBRICK);
		Rectangle j5 = new Rectangle(340,595, 10,40);
		j5.setFill(Color.FIREBRICK);
		Rectangle j6 = new Rectangle(340,585, 30,10);
		j6.setFill(Color.FIREBRICK);
		
		Rectangle b1 = new Rectangle(70,180, 200,30);
		b1.setStroke(Color.BLUE);
		b1.setFill(Color.BLUE);
		
		Rectangle b2 = new Rectangle(100,240, 140,50);
		b2.setStroke(Color.DARKGOLDENROD);
		b2.setFill(Color.DARKGOLDENROD);
		
		Rectangle b3 = new Rectangle(180,220, 120,10);
		b3.setStroke(Color.FIREBRICK);
		b3.setFill(Color.FIREBRICK);
		
		Rectangle b4 = new Rectangle(110,280, 200,50);
		b4.setStroke(Color.BLACK);
		b4.setFill(Color.BLACK);
		
		Rectangle b5 = new Rectangle(80,310, 220,35);
		b5.setStroke(Color.FIREBRICK);
		b5.setFill(Color.FIREBRICK);
		
		Rectangle b6 = new Rectangle(150,350, 100,30);
		b6.setStroke(Color.BLUE);
		b6.setFill(Color.BLUE);
		
		Rectangle b7 = new Rectangle(120,370, 150,18);
		b7.setStroke(Color.DARKGOLDENROD);
		b7.setFill(Color.DARKGOLDENROD);
		
		Rectangle b8 = new Rectangle(90,410, 190,25);
		b8.setStroke(Color.BLACK);
		b8.setFill(Color.BLACK);
		
		Rectangle b9 = new Rectangle(100,400, 130,20);
		b9.setStroke(Color.FIREBRICK);
		b9.setFill(Color.FIREBRICK);
		
		Rectangle b10 = new Rectangle(130,440, 160,30);
		b10.setStroke(Color.FIREBRICK);
		b10.setFill(Color.FIREBRICK);
		
		Rectangle b11 = new Rectangle(210,460, 50,30);
		b11.setStroke(Color.BLUE);
		b11.setFill(Color.BLUE);
		
		Rectangle b12 = new Rectangle(105,450, 130,10);
		b12.setStroke(Color.DARKGOLDENROD);
		b12.setFill(Color.DARKGOLDENROD);
		
		Text name = new Text(5, 640, "Tate");
		
		
		
		Scene scene = new Scene(shapes, 385, 645);
		shapes.getChildren().addAll(outline, d1, d2, d3, d4, b1, b2, b3, b4, b5, 
									b6, b7, b8, b9, b10, b11, b12, sword1, 
									l1, sword2, l2,
									head1, cover1, head2, cover2, neck1, neck2, hair1, 
									hair2, c1, c2, n1, n2, n3, n4, eye1, eye2, mouth1,
									eye3, eye4, mouth2, j1, j2, j3, j4, j5, j6,
									eye11, eye21, eye31, eye41, r, name);
		
		
		
		primaryStage.setTitle("Jack of Diamonds");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}


}
