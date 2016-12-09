/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.telas;

/**
 *
 * @author GabrielRS
 */
public class GastoEnergetico {
    
    private float geb;
    private float get;

    public GastoEnergetico() {
    }

    public GastoEnergetico(float geb, float get) {
        this.geb = geb;
        this.get = get;
    }
    
    public float getGeb() {
        return geb;
    }

    public void setGeb(float geb) {
        this.geb = geb;
    }

    public float getGet() {
        return get;
    }

    public void setGet(float get) {
        this.get = get;
    }
    
    
    
}
