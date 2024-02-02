/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxe;

/**
 *
 * @author hp
 */
public class ImageProxye implements Image
{
    RealImage Image;
    private String filename;

    public ImageProxye(String filename) {
        this.filename = filename;
    }
    
  
    @Override
    public void disply() {
  
        if(Image==null){
            Image=new RealImage(filename);
        }
        Image.disply();
        
    }
}