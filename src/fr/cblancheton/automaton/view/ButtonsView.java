package fr.cblancheton.automaton.view;

import fr.cblancheton.automaton.Automaton;
import javafx.scene.control.Button;

/**
 * Created by charles on 12/10/16.
 */
public class ButtonsView {
    private final Button nextGenButton;
    private final Automaton automaton;

    public ButtonsView(Automaton automaton) {
        this.automaton = automaton;
        this.nextGenButton = new Button("Next");
        this.nextGenButton.setOnMouseClicked(event -> this.automaton.nextGeneration());
    }
}
