package com.ergo.insyst;
public class Insan {
    private String isim;
    
    public Insan(){
        
    }
    
    public Insan(String isim){
        this.isim=isim;
    }
    
    public String ismininIkiVeUcuncuHarfiniSoyle(){
        return isim.substring(1,3);
    }
            
    
//    public Dusunce dusun(){
//        Dusunce fikir=new Dusunce();
//        return fikir;
//    }
//    
//    public Dusunce kalpAt(){
//        Dusunce fikir=new Dusunce();
//        return fikir;
//    }
//    
//    public Dusunce yuru(){
//        Dusunce fikir=new Dusunce();
//        return fikir;
//    }
//    
//    public Dusunce atla(){
//        Dusunce fikir=new Dusunce();
//        return fikir;
//    }   
}
