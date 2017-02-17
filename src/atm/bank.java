/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Hyung
 */
public class bank {
    public static void main (String args[]){
        String str, str1;
        int choice,z,pin=1234,counter=0,a=3;
        int t,s,tab=50000;
        
        JOptionPane.showMessageDialog(null,"Selamat Datang\n ANJUNGAN TUNAI MANDIRI \n BNI SYARIAH-MALANG \n\nMasukkan 4 Digit PIN ANda","WELCOME",1);
        try{
            do{
                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:",
                        "ATM BNI SYARIAH-MALANG",0);
                pin = Integer.parseInt(str);
                counter+=1;
                
                if (pin==1234)
                    do{
                        str = JOptionPane.showInputDialog(null,"[1] INFORMASI SALDO \n[2] PENYETORAN \n[3] PENARIKAN \n[4] PETUNJUK \n[5] KELUAR \n\nMasukkan Pilihan Menu:","Pilih Transaksi",3);
                        choice = Integer.parseInt(str);
                        
                        switch (choice){
                            case 1:
                                JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar: "+tab);
                                z=JOptionPane.showConfirmDialog(null,"Melanjutkan Transaksi lain?","ATM BNI SYARIAH-MALANG",
                                        JOptionPane.YES_NO_OPTION, 3);
                                if(z==0)
                                    break;
                                else
                                    JOptionPane.showMessageDialog(null,"Terima Kasih telah menggunakan ATM BNI SYARIAH-MALANG, silahkan ambil kartu ATM Anda.");
                                System.exit(0);
                            case 2:
                                str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran: ");
                                s = Integer.parseInt(str1);
                                setor hasil = new setor();
                                hasil.menabung (tab, s);
                                tab = hasil.getsaldo();
                                
                                z=JOptionPane.showConfirmDialog(null,"Melanjutkan Transaksi Lain?","ATM BNI SYARIAH-MALANG",
                                        JOptionPane.YES_NO_OPTION, 3);
                                if (z==0)
                                    break;
                                else
                                    JOptionPane.showMessageDialog(null,"Terima kasih telah menggunakan ATM BNI SYARIAH-MALANG, silahkan ambil kartu ATM Anda.");
                                System.exit(0);
                                
                            case 3:
                                str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan: ");
                                t = Integer.parseInt(str1);
                                tarik mengambil = new tarik();
                                mengambil.ambil(tab,t);
                                tab = mengambil.getsaldo();
                                
                                z=JOptionPane.showConfirmDialog(null,"Melanjutkan Transaksi lain?","ATM BNI SYARIAH-MALANG",
                                        JOptionPane.YES_NO_OPTION, 3);
                                if (z==0)
                                    break;
                                else
                                    
                                    JOptionPane.showMessageDialog(null,"Terima kasih telah menggunakan ATM BNI-SYARIAH MALANG, silahkan ambil kartu ATM Anda.");
                                System.exit(0);
                                
                            case 4:
                                JOptionPane.showMessageDialog(null,"Cara penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung \n ","INFO", 1);
                                break;
                                
                            case 5:
                                z=JOptionPane.showConfirmDialog(null,"Anda ingin keluar?","Keluar", JOptionPane.YES_NO_OPTION, 0);
                                        
                                        if (z==0){
                                            JOptionPane.showMessageDialog(null,"Terima kasih telah menggunakan ATM BNI-SYARIAH MALANG, silahkan ambil kartu ATM Anda.");
                                            System.exit(0);
                                        }
                        else
                        break;
                        default: JOptionPane.showMessageDialog(null,"Pilihan menu tersebut tidak tersedia\nMohon cek kembali pilihan Anda.","EEROR (404 Not Found)", 0);
                    }
            }
        while (1==1);
        else if (counter<3){
                a--;
                JOptionPane.showMessageDialog(null,"PIN Anda salah,\nPastikan PIN yang Anda masukkan benar","ERROR (302 BAD_PASSWORD)", 0);
                JOptionPane.showMessageDialog(null,"\nKesempatan Login " + a + " kali lagi" + "\n");
                }
    else
    {
        JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah,\n silahkan menghubungi Call Center 555123(Gratis)","Kartu ATM Anda telah terblokir", 0);
        System.exit(0);
    }
                
    
            }
            while (1==1);
        }catch (NumberFormatException e){
    JOptionPane.showMessageDialog(null,"ERROR (22)\nPastikan format koda yang Anda masukkan benar.\nPROGRAM TERMINATED\nTerima kasih","ERROR (32)", 0);
                    }
        }
    }