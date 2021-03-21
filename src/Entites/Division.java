/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entites;

import Connexions.ConnexionC;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MECHACK
 */
public class Division {
 String Id_DIVISION,Libelle,Id_DIRECTION;

    public String getId_DIVISION() {
        return Id_DIVISION;
    }

    public void setId_DIVISION(String Id_DIVISION) {
        this.Id_DIVISION = Id_DIVISION;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public String getId_DIRECTION() {
        return Id_DIRECTION;
    }

    public void setId_DIRECTION(String Id_DIRECTION) {
        this.Id_DIRECTION = Id_DIRECTION;
    }
  ConnexionC mct =new ConnexionC();
   public void Ajouter() {
        try {
            String req = "insert into DIVISION(Id_DIVISION,Libelle,Id_DIRECTION) values('" + getId_DIVISION()+ "','" + getLibelle() + "','" + getId_DIRECTION() + "')";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur AJOUT: " + e.getMessage());
        }
    }

    public void Modifier() {
        try {
            String req = "update DIVISION set Libelle='" + getLibelle() + "',Id_DIRECTION='" + getId_DIRECTION() + "' where Id_DIVISION='"+getId_DIVISION()+"'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de MODIFICATION: " + e.getMessage());
        }
    }

    public void Supprimer() {
        try {
            String req = "delete from DIVISION where Id_DIVISION='" +getId_DIVISION() + "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de SUPPRESSION: " + e.getMessage());
        }
    }

    public void remplir(JTable Grille,String req) {
        try {
            
            int c = 0;
            mct.Selection(req);
            while (mct.reponse.next()) {
                c++;
            }
            Object data[][] = new Object[c][3];
            String titre[] = {"Code de la Division", "Nom de la Division", "Direction"};
            mct.Selection(req);
            int i = 0;
            while (mct.reponse.next()) {
                data[i][0] = mct.reponse.getString(1);
                data[i][1] = mct.reponse.getString(2);
                data[i][2] = mct.reponse.getString(3);
                i++;
            }
            Grille.setModel(new DefaultTableModel(data,titre));
        } catch (Exception e) {
            System.out.println("Erreur du remplissage: "+ e.getMessage());
        }
    }
    public void Charger(JComboBox cmbx){
          try {
              String req="select Id_DIVISION from DIVISION";
              cmbx.setModel(new DefaultComboBoxModel(new String[]{""}));
              mct.Selection(req);
              while (mct.reponse.next()) {                  
               cmbx.addItem(mct.reponse.getString(1));
              }
          } catch (Exception e) {
              System.out.println("Erreur de CHARGEMENT du combobox : "+e.getMessage());
          }
      }
     public String IDDiv(String LibDiv) {
        String id = "";
        try {
            String req = "select Id_DIVISION from DIVISION where Libelle='" + LibDiv + "'";
            mct.Selection(req);
            while (mct.reponse.next()) {                
             id= mct.reponse.getString(1);
            }
            return id;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return id;
    }
}
