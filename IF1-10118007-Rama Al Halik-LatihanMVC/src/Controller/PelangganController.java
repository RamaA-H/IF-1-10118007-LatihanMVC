/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.PelangganModel;
import View.PelangganView;
import javax.swing.JOptionPane;

         
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * @author Rama
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String no = view.getTxtNo().getText();
        
        if (nama.equals("") && email.equals("") && no.equals("")){
        }else{
            model.resetForm();
        }
    }
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String no = view.getTxtNo().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view ,"Nama Masih Kosong");
        }else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view ,"Email Masih Kosong");
        }else if (no.trim().equals("")){
            JOptionPane.showMessageDialog(view ,"Nomor Masih Kosong");
        }else {
            model.simpanForm();
        }
    }
}

