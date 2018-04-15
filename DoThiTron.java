/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoAnHa;

/**
 *
 * @author pc
 */
import java.awt.*;
import java.awt.geom.Arc2D;

public class DoThiTron extends Canvas{
    
    double x,y,w,h;
    double a11,a21;
    double a12,a22;
    double a13,a23;
    double a14,a24;
    int sx1,sy1;
    int sx2,sy2;
    int sx3,sy3;
    int sx4,sy4;
  
    public DoThiTron(double x,double y,double w,double h,
                     double a11,double a21,
                     double a12,double a22,
                     double a13,double a23,
                     double a14,double a24,
                     int sx1, int sy1,
                     int sx2, int sy2,
                     int sx3, int sy3,
                     int sx4, int sy4){
        
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        this.a11 = a11;
        this.a21 = a21;
        
        
        this.a12 = a12;
        this.a22 = a22;
              
        this.a13 = a13;
        this.a23 = a23;
                
        this.a14 = a14;
        this.a24 = a24;
        
        this.sx1 = sx1;
        this.sy1 = sy1;
        
        this.sx2 = sx2;
        this.sy2 = sy2;
        
        this.sx3 = sx3;
        this.sy3 = sy3;
        
        this.sx4 = sx4;
        this.sy4 = sy4;
    }
    
    public void paint(Graphics g){
        
        setForeground(Color.blue);  
        
        Arc2D c1 = new Arc2D.Double(x,y,w,h,a11,a21,Arc2D.PIE);
        Arc2D c2 = new Arc2D.Double(x,y,w,h,a12,a22,Arc2D.PIE);
        Arc2D c3 = new Arc2D.Double(x,y,w,h,a13,a23,Arc2D.PIE);
        Arc2D c4 = new Arc2D.Double(x,y,w,h,a14,a24,Arc2D.PIE);
        
    
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setStroke(new BasicStroke(2.0f));
        
        g2.setPaint(Color.GREEN);       
        g2.fill(c1);
        g2.drawString("Du lieu 1", sx1, sy1);
        
        g2.setPaint(Color.ORANGE);
        g2.fill(c2);
        g2.drawString("Du lieu 2", sx2, sy2);
        
        g2.setPaint(Color.BLUE);
        g2.fill(c3);
        g2.drawString("Du lieu 3", sx3, sy3);
        
        g2.setPaint(Color.RED);
        g2.fill(c4);                   
        g2.drawString("Du lieu 4", sx4, sy4);
    }
}
