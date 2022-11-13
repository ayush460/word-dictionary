package sample.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.HashMap;

public class GamePageController {
wordDictionary dictionarylist;
    @FXML
    TextField searchword;
      @FXML
      TextField word;
      @FXML
      TextField meaning;
    @FXML
    public void newword(MouseEvent event) throws IOException{
        System.out.println("new word added");
        dictionarylist=new wordDictionary();
dictionarylist.deserializemap();
        Alert infoAlert=new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setHeaderText("NEW WORD ADDING");
dictionarylist.addword(word.textProperty().get(),meaning.textProperty().get());
dictionarylist.serializemap();
infoAlert.setContentText("new word added to distonary");
infoAlert.showAndWait();
    }
    @FXML

    public void search(MouseEvent event) throws IOException{
        System.out.println("searching");
        dictionarylist=new wordDictionary();
        dictionarylist.deserializemap();
        Alert infoAlert=new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setHeaderText("search result");

if(dictionarylist.getWordlist().containsKey(searchword.textProperty().get())){
    System.out.println(dictionarylist.getWordlist().get(searchword.textProperty().get()));
}
infoAlert.setContentText(dictionarylist.getWordlist().get(searchword.textProperty().get()));
    }
}
