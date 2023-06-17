package com.example.train;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TrainController {
    @FXML private TableView<Train> trainTableView;
    @FXML private TableColumn<Train, String> nameColumn;
    @FXML private TableColumn<Train, Integer> numberOfCarsColumn;
    @FXML private TableColumn<Train, Integer> numberOfSeatsPerCarColumn;
    @FXML private TextField nameTextField;
    @FXML private TextField numberOfCarsTextField;
    @FXML private TextField numberOfSeatsPerCarTextField;

    private ObservableList<Train> trains;

    public void initialize() {
        // Заполните таблицу данными
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        numberOfCarsColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfCars"));
        numberOfSeatsPerCarColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfSeatsPerCar"));

        trains = FXCollections.observableArrayList();
        trains.add(new Train("Поезд №1", 5, 50));
        trains.add(new Train("Поезд №2", 3, 30));
        trains.add(new Train("Поезд №3", 2, 20));

        trainTableView.setItems(trains);
    }

    @FXML
    public void addTrain(ActionEvent event) {
        String name = nameTextField.getText();
        int numberOfCars = Integer.parseInt(numberOfCarsTextField.getText());
        int numberOfSeatsPerCar = Integer.parseInt(numberOfSeatsPerCarTextField.getText());

        Train train = new Train(name, numberOfCars, numberOfSeatsPerCar);
        trains.add(train);

        nameTextField.clear();
        numberOfCarsTextField.clear();
        numberOfSeatsPerCarTextField.clear();
    }
}

