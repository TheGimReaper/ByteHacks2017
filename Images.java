import java.util.ArrayList;
public class Images{
    private String color;
    private String material;
    private int id;
    private String pattern;
    private ArrayList<String> tags = new ArrayList<String>();

    public String getColor(){
	return color;
    }
    public String getMaterial(){
	return material;
    }
    public int getId(){
	return id;
    }
    public String getPattern(){
	return pattern;
    }
    public void setColor(String s){
	color = s;
    }
    public void setMaterial(String s){
	material = s;
    }
    public void setId(int i){
	id = i;
    }
    public void setPattern(String s){
	pattern = s;
    }
    public boolean hasTag(String s){
	int counter = 0;
	boolean retBool = false;
	while(counter < tags.size() && retBool == false){
	    if(tags.get(counter) == s){
		retBool = true;
	    }
	    counter++;
	}
	return retBool;
    }
    public void addTag(String s){
	tags.add(s);
    }
    public void removeTag(String s){
	tags.remove(s);
    }	
}
