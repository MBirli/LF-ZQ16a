package FoSProject;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TileAssetManager {
	public static final Map<String, Icon>IconCache = new HashMap<>();
	
	final static int ICONSIZEX = ((Board.getFramegroesse()/Board.getBreite())*90/100);
	final static int ICONSIZEY = ((Board.getFramegroesse()/Board.getHoehe())*90/100);
	
	public static Icon getIcon(String path) {
		if (IconCache.containsKey(path)) {
			return IconCache.get(path);
		}
		try {
			java.net.URL ImgURL = TileAssetManager.class.getResource(path);
			if (ImgURL == null) {
				System.out.println("Datei wurde nicht gefunden "+ path);
				return null;
			}
			ImageIcon original = new ImageIcon(ImgURL);
			Image scaled = original.getImage().getScaledInstance(ICONSIZEX, ICONSIZEY, Image.SCALE_SMOOTH);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			
			IconCache.put(path, scaledIcon);
			return scaledIcon;			
		} catch (Exception e) {
			System.out.println("Fehler beim Laden oder Skalieren der Grafik "+path);
			return null;		
			
		}
			
		
	}
	
	
}
