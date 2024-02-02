/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxe;

/**
 *
 * @author hp
 */
public class RealImage  implements Image
        
{
private String filename;
    public RealImage(String filename ) {
        this.filename=filename;   
        LoadImage(filename);
    }
    
    

    @Override
    public void disply() {
        System.err.println("the image :"+filename+"has been show ");
    }
    
    private void LoadImage(String filename){
        System.err.println("image :"+filename+" -has been loaded-. ");
    }
    
}
