package org.JapanesNamesGenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label NewName01;

    @FXML
    private Label NewName02;

    @FXML
    private Label NewName03;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public String generatorJmen() {
        ArrayList<String> japanWordsList = new ArrayList<>();
        japanWordsList.add("a");
        japanWordsList.add("i");
        japanWordsList.add("u");
        japanWordsList.add("e");
        japanWordsList.add("o");
        japanWordsList.add("ka");
        japanWordsList.add("ki");
        japanWordsList.add("ku");
        japanWordsList.add("ke");
        japanWordsList.add("ko");
        japanWordsList.add("sa");
        japanWordsList.add("shi");
        japanWordsList.add("su");
        japanWordsList.add("se");
        japanWordsList.add("so");
        japanWordsList.add("ta");
        japanWordsList.add("chi");
        japanWordsList.add("tsu");
        japanWordsList.add("te");
        japanWordsList.add("to");
        japanWordsList.add("na");
        japanWordsList.add("ni");
        japanWordsList.add("nu");
        japanWordsList.add("ne");
        japanWordsList.add("no");
        japanWordsList.add("ha");
        japanWordsList.add("hi");
        japanWordsList.add("fu");
        japanWordsList.add("he");
        japanWordsList.add("ho");
        japanWordsList.add("ma");
        japanWordsList.add("mi");
        japanWordsList.add("mu");
        japanWordsList.add("me");
        japanWordsList.add("mo");
        japanWordsList.add("ya");
        japanWordsList.add("yu");
        japanWordsList.add("yo");
        japanWordsList.add("ra");
        japanWordsList.add("ri");
        japanWordsList.add("ru");
        japanWordsList.add("re");
        japanWordsList.add("ro");
        japanWordsList.add("wa");
        japanWordsList.add("wo");
        japanWordsList.add("ga");
        japanWordsList.add("gi");
        japanWordsList.add("gu");
        japanWordsList.add("ge");
        japanWordsList.add("go");
        japanWordsList.add("za");
        japanWordsList.add("ji");
        japanWordsList.add("zu");
        japanWordsList.add("ze");
        japanWordsList.add("zo");
        japanWordsList.add("da");
        japanWordsList.add("de");
        japanWordsList.add("do");
        japanWordsList.add("kya");
        japanWordsList.add("kyu");
        japanWordsList.add("kyo");
        japanWordsList.add("gya");
        japanWordsList.add("gyu");
        japanWordsList.add("gyo");
        japanWordsList.add("sha");
        japanWordsList.add("shu");
        japanWordsList.add("sho");
        japanWordsList.add("ja");
        japanWordsList.add("ju");
        japanWordsList.add("jo");
        japanWordsList.add("cha");
        japanWordsList.add("chu");
        japanWordsList.add("cho");
        japanWordsList.add("nya");
        japanWordsList.add("nyu");
        japanWordsList.add("nyo");
        japanWordsList.add("hya");
        japanWordsList.add("hyu");
        japanWordsList.add("hyo");
        japanWordsList.add("rya");
        japanWordsList.add("ryu");
        japanWordsList.add("ryo");




        ArrayList<String> japanWordsListFirst = new ArrayList<>();
        japanWordsListFirst.add("A");
        japanWordsListFirst.add("I");
        japanWordsListFirst.add("U");
        japanWordsListFirst.add("E");
        japanWordsListFirst.add("O");
        japanWordsListFirst.add("Ka");
        japanWordsListFirst.add("Ki");
        japanWordsListFirst.add("Ku");
        japanWordsListFirst.add("Ke");
        japanWordsListFirst.add("Ko");
        japanWordsListFirst.add("Sa");
        japanWordsListFirst.add("Shi");
        japanWordsListFirst.add("Su");
        japanWordsListFirst.add("Se");
        japanWordsListFirst.add("So");
        japanWordsListFirst.add("Ta");
        japanWordsListFirst.add("Chi");
        japanWordsListFirst.add("Tsu");
        japanWordsListFirst.add("Te");
        japanWordsListFirst.add("To");
        japanWordsListFirst.add("Na");
        japanWordsListFirst.add("Ni");
        japanWordsListFirst.add("Nu");
        japanWordsListFirst.add("Ne");
        japanWordsListFirst.add("No");
        japanWordsListFirst.add("Ha");
        japanWordsListFirst.add("Hi");
        japanWordsListFirst.add("Fu");
        japanWordsListFirst.add("He");
        japanWordsListFirst.add("Ho");
        japanWordsListFirst.add("Ma");
        japanWordsListFirst.add("Mi");
        japanWordsListFirst.add("Mu");
        japanWordsListFirst.add("Me");
        japanWordsListFirst.add("Mo");
        japanWordsListFirst.add("Ya");
        japanWordsListFirst.add("Yu");
        japanWordsListFirst.add("Yo");
        japanWordsListFirst.add("Ra");
        japanWordsListFirst.add("Ri");
        japanWordsListFirst.add("Ru");
        japanWordsListFirst.add("Re");
        japanWordsListFirst.add("Ro");
        japanWordsListFirst.add("Wa");
        japanWordsListFirst.add("Wo");
        japanWordsListFirst.add("Ga");
        japanWordsListFirst.add("Gi");
        japanWordsListFirst.add("Gu");
        japanWordsListFirst.add("Ge");
        japanWordsListFirst.add("Go");
        japanWordsListFirst.add("Za");
        japanWordsListFirst.add("Ji");
        japanWordsListFirst.add("Zu");
        japanWordsListFirst.add("Ze");
        japanWordsListFirst.add("Zo");
        japanWordsListFirst.add("Da");
        japanWordsListFirst.add("De");
        japanWordsListFirst.add("Do");
        japanWordsListFirst.add("Kya");
        japanWordsListFirst.add("Kyu");
        japanWordsListFirst.add("Kyo");
        japanWordsListFirst.add("Gya");
        japanWordsListFirst.add("Gyu");
        japanWordsListFirst.add("Gyo");
        japanWordsListFirst.add("Sha");
        japanWordsListFirst.add("Shu");
        japanWordsListFirst.add("Sho");
        japanWordsListFirst.add("Ja");
        japanWordsListFirst.add("Ju");
        japanWordsListFirst.add("Jo");
        japanWordsListFirst.add("Cha");
        japanWordsListFirst.add("Chu");
        japanWordsListFirst.add("Cho");
        japanWordsListFirst.add("Nya");
        japanWordsListFirst.add("Nyu");
        japanWordsListFirst.add("Nyo");
        japanWordsListFirst.add("Hya");
        japanWordsListFirst.add("Hyu");
        japanWordsListFirst.add("Hyo");
        japanWordsListFirst.add("Rya");
        japanWordsListFirst.add("Ryu");
        japanWordsListFirst.add("Ryo");



            Random wordsNumber = new Random();
            int x = wordsNumber.nextInt(3);

            x = x + 2;

            ArrayList<Integer> myNumbers = new ArrayList<>();

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;


            Random ArraysNumbers = new Random();
            for (int iCount = 0; iCount < x; iCount = iCount + 1) {
                int z = ArraysNumbers.nextInt(81);

                if (iCount == 0) {
                    a = z;
                }
                if (iCount == 1) {
                    b = z;
                }
                if (iCount == 2) {
                    c = z;
                }
                if (iCount == 3) {
                    d = z;
                }
            }


            if (x == 4) {
                return japanWordsListFirst.get(a) + japanWordsList.get(b) + japanWordsList.get(c) + japanWordsList.get(d);
            }
            if (x == 3) {
                return japanWordsListFirst.get(a) + japanWordsList.get(b) + japanWordsList.get(c);
            }
            if (x == 2) {
                return japanWordsListFirst.get(a)+ japanWordsList.get(b);
            }

        return "";
    }

    public void GenerateAction(ActionEvent actionEvent) {
        NewName01.setText(generatorJmen());
        NewName02.setText(generatorJmen());
        NewName03.setText(generatorJmen());
    }
}
