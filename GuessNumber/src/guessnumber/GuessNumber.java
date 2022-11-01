/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Erfan
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxRange=100;
        int minRange=0;
        Guess(maxRange, minRange,maxRange-1);
    }

    /**
     *
     * @param maxNumber maximum number range
     * @param minNumber minimum number range
     * @param midnumber default is maxNumber-1
     * @return true if found one natural number in range
     */
    public static boolean Guess(int maxNumber, int minNumber, int midnumber) {
        if (midnumber > minNumber && midnumber < maxNumber) {
            int midnum = 0;
            int average = (maxNumber + minNumber) / 2;
            int decide = JOptionPane.showConfirmDialog(new AbstractButton() {
            }, "Is Number between " + maxNumber + " - " + average + " ?", "Guess", JOptionPane.YES_NO_OPTION);
            if (decide == JOptionPane.YES_OPTION) {
                midnum = maxNumber - 1;
                return Guess(maxNumber, average, midnum);
            } else if(decide==JOptionPane.NO_OPTION){
                midnum = average - 1;
                return Guess(average, minNumber, midnum);
            }
            else{
                System.exit(0);
                return true;
            }
        } else {
            if (JOptionPane.showConfirmDialog(new AbstractButton() {
            }, "Your number is " + midnumber) == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                JOptionPane.showConfirmDialog(new AbstractButton() {
                }, "Your number is " + (midnumber + 1));
            }
            return true;
        }
    }

}
