/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author filipzelic
 */
class ArrayListComboBoxModel extends AbstractListModel implements ComboBoxModel {
    private Object selectedItem;

  private ArrayList anArrayList;

  public ArrayListComboBoxModel(ArrayList arrayList) {
    anArrayList = arrayList;
  }
  
  public ArrayListComboBoxModel(List<Kolegij> listaKolegija) {
      for(Kolegij k: listaKolegija) {
          this.anArrayList.add(1, k.getNaziv());
      }
  }

  public Object getSelectedItem() {
    return selectedItem;
  }

  public void setSelectedItem(Object newValue) {
    selectedItem = newValue;
  }

  public int getSize() {
    return anArrayList.size();
  }

  public Object getElementAt(int i) {
    return anArrayList.get(i);
  }
}
