package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    int[] schritte = { 4500, 10200, 8100, 12000, 3900, 9500, 11000 };

    int max = schritte[0];
    int min = schritte[0];

    int erfolgreicheTage = 0;

    int summe = 0;
    for (int i : schritte) {
        summe += i;

        if (i >= 10000) {
            erfolgreicheTage++;
        }

        if (i > max) {
            max = i;
        }
            else if (i < min) {
                min = i;
            }
            System.out.println("Schritte pro Tag: " + i + " Summe: " + summe);
        }
            int average = summe / schritte.length;
            System.out.println("Durchschnitt der Schritte pro Tag: " + average);

            System.out.println("die meisten Schritte: " + max);

            System.out.println("die wenigsten Schritte: " + min);

            System.out.println("geschaffte über 10000 Schritte: " + erfolgreicheTage);
    }
}
