package com.ergo.insyst;
public class Main2 {
   public static void main(String[]args){
       Pamuk hammadde=new Pamuk();
       IplikMakinesi makine=new IplikMakinesi();
       Iplik urun=makine.pamuguIplikYap(hammadde);
   } 
}
