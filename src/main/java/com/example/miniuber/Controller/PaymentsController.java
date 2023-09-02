package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import static com.example.miniuber.Controller.HelloController.emailadd;
import static com.example.miniuber.Controller.HelloController.usName;
import static com.example.miniuber.calculator.Calculator.price2;

public class PaymentsController implements Initializable {
    @FXML
    private TableView<PaymentModel> table;
    @FXML
    private TableColumn<PaymentModel,String> emailC;
    @FXML
    private TableColumn<PaymentModel,String> destC;
    @FXML
    private TableColumn<PaymentModel,String> typeC;
    @FXML
    private TableColumn<PaymentModel,Integer> priceC;

    ObservableList<PaymentModel> payment = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        emailC.setCellValueFactory(new PropertyValueFactory<PaymentModel, String>("email"));
        destC.setCellValueFactory(new PropertyValueFactory<PaymentModel, String>("dest"));
        typeC.setCellValueFactory(new PropertyValueFactory<PaymentModel, String>("type"));
        priceC.setCellValueFactory(new PropertyValueFactory<PaymentModel, Integer>("price"));
        try{
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from payment where email = '"+emailadd+"'");
            while (resultSet.next()){
                payment.add(new PaymentModel(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4)));
            }
            table.setItems(payment);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
