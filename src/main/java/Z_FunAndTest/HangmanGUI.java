package Z_FunAndTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanGUI extends JFrame {
    private String wordToGuess = "programming";
    private int attemptsLeft = 15;
    private boolean gameWon = false;
    private char[] displayWord;
    private JLabel wordLabel;
    private JLabel attemptsLabel;
    private JTextField guessField;
    private JButton guessButton;

    public HangmanGUI() {
        // Initialisierung des displayWord-Arrays
        displayWord = new char[wordToGuess.length()];
        for (int i = 0; i < displayWord.length; i++) {
            displayWord[i] = '_';
        }

        // Erstellen der GUI-Komponenten
        wordLabel = new JLabel(new String(displayWord));
        wordLabel.setFont(new Font("Monospaced", Font.BOLD, 24));
        attemptsLabel = new JLabel("Versuche übrig: " + attemptsLeft);
        guessField = new JTextField(1);
        guessButton = new JButton("Raten");

        // Layout der GUI
        setLayout(new GridLayout(3, 1));
        add(wordLabel);
        add(attemptsLabel);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Buchstabe eingeben: "));
        panel.add(guessField);
        panel.add(guessButton);
        add(panel);

        // ActionListener für den Raten-Button
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });

        // Fenster-Einstellungen
        setTitle("Hangman Spiel");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void handleGuess() {
        String input = guessField.getText();
        if (input.length() != 1) {
            JOptionPane.showMessageDialog(this, "Bitte einen einzelnen Buchstaben eingeben.");
            return;
        }

        char guess = input.charAt(0);
        boolean correctGuess = false;

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                displayWord[i] = guess;
                correctGuess = true;
            }
        }

        if (!correctGuess) {
            attemptsLeft--;
        }

        guessField.setText("");
        wordLabel.setText(new String(displayWord));
        attemptsLabel.setText("Versuche übrig: " + attemptsLeft--);

        // Überprüfen, ob das Wort vollständig erraten wurde
        gameWon = true;
        for (char c : displayWord) {
            if (c == '_') {
                gameWon = false;
                break;
            }
        }

        if (gameWon) {
            JOptionPane.showMessageDialog(this, "Herzlichen Glückwunsch! Du hast das Wort erraten: " + new String(displayWord));
            resetGame();
        } else if (attemptsLeft == 0) {
            JOptionPane.showMessageDialog(this, "Leider verloren. Das gesuchte Wort war: " + wordToGuess);
            resetGame();
        }
    }

    private void resetGame() {
        wordToGuess = "programming";  // Hier könnte man das Wort zufällig auswählen
        attemptsLeft = 15;
        gameWon = false;
        displayWord = new char[wordToGuess.length()];
        for (int i = 0; i < displayWord.length; i++) {
            displayWord[i] = '_';
        }
        wordLabel.setText(new String(displayWord));
        attemptsLabel.setText("Versuche übrig: " + attemptsLeft);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HangmanGUI().setVisible(true);
            }
        });
    }
}



