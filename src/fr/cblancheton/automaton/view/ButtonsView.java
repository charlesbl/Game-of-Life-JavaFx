package fr.cblancheton.automaton.view;

import fr.cblancheton.automaton.model.Automaton;
import javafx.scene.Group;
import javafx.scene.control.Button;

/**
 * Created by charles on 12/10/16.
 */
public class ButtonsView extends Group{
    private final Button nextGenButton;
    private final Automaton automaton;
    private final AutomatonView automatonView;

    public ButtonsView(Automaton automaton, AutomatonView automatonView) {
        this.automaton = automaton;
        this.automatonView = automatonView;
        this.nextGenButton = new Button("Next");
        this.nextGenButton.setOnMouseClicked(event -> {
            this.automaton.nextGeneration();
            this.automatonView.update();
        });

        this.getChildren().addAll(this.nextGenButton);
    }
}
