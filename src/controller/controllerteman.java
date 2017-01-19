/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.modelteman;
import util.Koneksi;

/**
 *
 * @author beni Acer
 */
public class controllerteman {

    Koneksi koneksi = new Koneksi();

    public void simpanData(modelteman mt) {
        try {
            String query = "insert into tbl_temanc(id,nama,nope,email) values ('" + mt.getId() + "','" + mt.getNama() + "','" + mt.getNope() + "','" + mt.getEmail() + "')";
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            koneksi.state.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("" + e);
            JOptionPane.showMessageDialog(null, "tidak berhasil disimpan");
        }
    }

}
