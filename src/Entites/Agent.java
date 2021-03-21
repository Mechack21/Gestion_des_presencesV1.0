/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import Connexions.ConnexionC;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MECHACK
 */
public class Agent {

    String Matr, Nom, Postnom, Sexe, Idgrade, iddivision;
    Image Photo;

    public String getMatr() {
        return Matr;
    }

    public void setMatr(String Matr) {
        this.Matr = Matr;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPostnom() {
        return Postnom;
    }

    public void setPostnom(String Postnom) {
        this.Postnom = Postnom;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getIdgrade() {
        return Idgrade;
    }

    public void setIdgrade(String Idgrade) {
        this.Idgrade = Idgrade;
    }

    public String getIddivision() {
        return iddivision;
    }

    public void setIddivision(String iddivision) {
        this.iddivision = iddivision;
    }

    public Image getPhoto() {
        return Photo;
    }

    public void setPhoto(Image Photo) {
        this.Photo = Photo;
    }
    ConnexionC mct = new ConnexionC();

    public void Charger(JComboBox cmbx) {
        try {
            String req = "select Nom from AGENT";
            cmbx.setModel(new DefaultComboBoxModel(new String[]{""}));
            mct.Selection(req);
            while (mct.reponse.next()) {
                cmbx.addItem(mct.reponse.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Erreur de CHARGEMENT du combobox : " + e.getMessage());
        }
    }

    public String IDinterve(String NomAgent) {
        String id = "";
        try {
            String req = "select Id_Intervenant from Intervenants where Noms='" + NomAgent + "'";
            mct.Selection(req);
            while (mct.reponse.next()) {
                id = mct.reponse.getString(1);
            }
            return id;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return id;
    }

    public void Remplir(JTable grille, String req) {
        try {
            int c = 0;
            mct.Selection(req);
            while (mct.reponse.next()) {
                c++;
            }

            Object data[][] = new Object[c][6];
            String titre[] = {"Matricule", "Nom", "Postnom", "Sexe", "Grade", "Division"};
            mct.Selection(req);
            int i = 0;
            while (mct.reponse.next()) {

                data[i][0] = mct.reponse.getString(1);
                data[i][1] = mct.reponse.getString(2);
                data[i][2] = mct.reponse.getString(3);
                data[i][3] = mct.reponse.getString(4);
                data[i][4] = mct.reponse.getString(5);
                data[i][5] = mct.reponse.getString(6);
                i++;
            }

            grille.setModel(new DefaultTableModel(data, titre));
        } catch (Exception e) {
            System.out.println("Erreur du remplissage: " + e.getMessage());
        }
    }

    public void Ajouter() {
        try {
            String req = "insert into AGENT (Matricule,Nom,Postnom,Sexe,Photo,Id_Grade,Id_Division)values('" + getMatr() + "','" + getNom() + "','" + getPostnom() + "','" + getSexe() + "','" + getPhoto() + "','" + getIdgrade() + "','" + getIddivision() + "')";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'AJOUT: " + e.getMessage());
        }
    }

    public void Modifier() {
        try {
            String req = "update AGENT set Nom='" + getNom() + "',Postnom='" + getPostnom() + "',Sexe='" + getSexe() + "',Photo='" + getPhoto() + "',Id_Grade='" + getIdgrade() + "',Id_Division='" + getIddivision() + "' where Matricule='" + getMatr() + "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de MODIFICATION: " + e.getMessage());
        }
    }

    public void Supprimer() {
        try {
            String req = "delete from AGENT where Matricule='" + getMatr() + "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de SUPPRESSION: " + e.getMessage());
        }
    }
}
