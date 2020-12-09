package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TablesController {
	Connection conn = null;

	Tables tables;
    @FXML
    private TextField tfTableName;

    @FXML
    private TableView<Tables> tableView;
    ObservableList<Tables> tableList;

    @FXML
    private TableColumn<Tables, Integer> colId;

    @FXML
    private TableColumn<Tables, String> colName;

	@FXML
	private void initialize() {
		showTable();
	}
    @FXML
    void saveTable(ActionEvent event) {
    	insertRecord();
    }
    public void showTable() {
    	ObservableList<Tables> list = getTableList();
    	colId.setCellValueFactory(new PropertyValueFactory<Tables,Integer>("id"));
    	colName.setCellValueFactory(new PropertyValueFactory<Tables,String>("name"));

    	tableView.setItems(list);
    }
    
    private void insertRecord() {
    	String name = tfTableName.getText();
    	if(!name.isEmpty()) {
    		String query = "INSERT INTO tblTable (name) VALUES ('" + name +"')";
    		execteQuery(query);
    		
    		showTable();
    		tfTableName.setText("");
    		
    	}
    }

	private void execteQuery(String query) {
		conn = mysqlconnect.ConnectDb();
		Statement st;
		try {
			st = conn.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	private ObservableList<Tables> getTableList() {
		tableList = FXCollections.observableArrayList();
		conn = mysqlconnect.ConnectDb();
		String query = "SELECT * FROM tblTable";
		Statement st;
		ResultSet rs;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				tables = new Tables(rs.getInt("id"), rs.getString("name"));
				tableList.add(tables);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tableList;
	}
}