
package boletin.pkg4_2;

/**
 *
 * @author JULIO
 */
public class CalcularCobro {
    
    private float precioUnitario;
    private int cantidad;
    private float descuento=0f;
    
    public CalcularCobro(float precU,int cant){
        this.precioUnitario=precU;
        this.cantidad=cant;
        if(cant>=100&&cant<200){
           if(precU>4000){ 
               this.descuento=0.05f;
           }else{
               this.descuento=0.02f;
           }
        }else{
        if(cant>=200){
            if(precU>4000){
                           this.descuento=0.1f;
                          }else{
                                this.descuento=0.08f;
                               }
                    }
        }
    }
    public String cobroFinal(){
        String cobroF="";
        cobroF="Unidades "+this.cantidad+"\nPrecio Unitario "+this.precioUnitario+"\nDescuento "+this.descuento+"\nTotal a Pagar "+(this.cantidad*this.precioUnitario-(this.cantidad*this.precioUnitario*(this.descuento)));
        return cobroF;
    }
}

