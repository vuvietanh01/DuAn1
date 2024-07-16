/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author ADMIN
 */
public class ModelCard {
    private Icon icon;
    private Color color1;
    private Color color2;
    private String values;
    private String description;
    
    public ModelCard(){
        
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelCard(Icon icon, Color color1, Color color2, String values, String description) {
        this.icon = icon;
        this.color1 = color1;
        this.color2 = color2;
        this.values = values;
        this.description = description;
    }
    
    
}
