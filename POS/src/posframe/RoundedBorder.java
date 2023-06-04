package posframe;

import java.awt.*;
import javax.swing.border.*;

public class RoundedBorder implements Border {
    private int radius;
    private int thickness;

    RoundedBorder(int radius, int thickness) {
        this.radius = radius;
        this.thickness = thickness;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}

