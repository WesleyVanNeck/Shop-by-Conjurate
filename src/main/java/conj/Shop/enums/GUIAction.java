package conj.Shop.enums;

import org.bukkit.*;
import org.apache.commons.lang.*;

public enum GUIAction
{
    NONE("NONE", 0, "The item will do nothing when clicked"), 
    PURCHASE("PURCHASE", 1, "Buys item when clicked"), 
    SELL("SELL", 2, "Sells item when clicked");
    
    private String description;
    
    private GUIAction(final String s, final int n, final String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return ChatColor.translateAlternateColorCodes('&', this.description);
    }
    
    @Override
    public String toString() {
        return WordUtils.capitalizeFully(this.name().toLowerCase().replaceAll("_", " "));
    }
    
    public static GUIAction fromString(String string) {
        GUIAction action = GUIAction.NONE;
        string = string.replaceAll(" ", "_");
        string = string.toUpperCase();
        action = valueOf(string);
        return action;
    }
}
