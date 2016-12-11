package fr.cblancheton.automaton.view;

import fr.cblancheton.automaton.model.Automaton;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * Created by charles on 12/10/16.
 */
public class TopView extends Group{
    private final Button nextGenButton;
    private final Text numGenText;

    private final Automaton automaton;
    private final AutomatonView automatonView;

    public TopView(Automaton automaton, AutomatonView automatonView) {
        this.automaton = automaton;
        this.automatonView = automatonView;

        this.nextGenButton = new Button("Next");
        this.numGenText = new Text();
        this.numGenText.setLayoutX(this.nextGenButton.getWidth() + 10);

        this.nextGenButton.setOnAction(event -> {
            this.automaton.nextGeneration();
            this.automatonView.update();
        });

        this.getChildren().addAll(this.nextGenButton, this.numGenText);
    }

    public void update(){
        this.numGenText.setText("Generation number: " + this.automaton.getNumGen());
    }
}
