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
import java.awt.geom.Rectangle2D;

public class DoThi extends Canvas{
    
    double x1,y1,w1,h1;
    double x2,y2,w2,h2;
    double x3,y3,w3,h3;
    double x4,y4,w4,h4;
    int sx1,sy1;
    int sx2,sy2;
    int sx3,sy3;
    int sx4,sy4;
  
    public DoThi(double x1,double y1,double w1,double h1,
               double x2,double y2,double w2,double h2,
               double x3,double y3,double w3,double h3,
               double x4,double y4,double w4,double h4,
               int sx1, int sy1,
               int sx2, int sy2,
               int sx3, int sy3,
               int sx4, int sy4){
        
        this.x1 = x1;
        this.y1 = y1;
        this.w1 = w1;
        this.h1 = h1;
        
        this.x2 = x2;
        this.y2 = y2;
        this.w2 = w2;
        this.h2 = h2;
        
        this.x3 = x3;
        this.y3 = y3;
        this.w3 = w3;
        this.h3 = h3;
        
        this.x4 = x4;
        this.y4 = y4;
        this.w4 = w4;
        this.h4 = h4;
        
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
        
        Rectangle2D hcn1 = new Rectangle2D.Double(x1,y1,w1,h1);
        Rectangle2D hcn2 = new Rectangle2D.Double(x2,y2,w2,h2);
        Rectangle2D hcn3 = new Rectangle2D.Double(x3,y3,w3,h3);
        Rectangle2D hcn4 = new Rectangle2D.Double(x4,y4,w4,h4);
    
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(hcn1);
        g2.fill(hcn2);
        g2.fill(hcn3);
        g2.fill(hcn4);
        
        g2.drawString("Du lieu 1", sx1, sy1);
        g2.drawString("Du lieu 2", sx2, sy2);
        g2.drawString("Du lieu 3", sx3, sy3);
        g2.drawString("Du lieu 4", sx4, sy4);
    }
}
