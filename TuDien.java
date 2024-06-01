
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIGABYTE
 */
public class TuDien {
    private Map<String, String> Vocab = new TreeMap<String , String>();

    public TuDien() {
    }
    
    
    public String themTu(String tuKhoa,String yNghia){
        return this.Vocab.put(tuKhoa, yNghia);
    }
    public String xoaTu(String tuKhoa){
        return this.Vocab.remove(tuKhoa);
    }
    public String traTu(String tuKhoa){
        //return this.Vocab.get(tuKhoa);
    String yNghia = this.Vocab.get(tuKhoa);
    return yNghia;
    }
    public void inTuKhoa(){
        Set<String> tapHopTuKhoa = this.Vocab.keySet();// keySet: lay het tap hop tu khoa 
        
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    public  int soLuongTu(){
        return this.Vocab.size();
    }
   public void xoaAllTu(){
       this.Vocab.clear();
   } 
   
   
}
