package com.covid;

import com.covid.datafetch.model.CountryData;
import com.covid.datafetch.model.RegionData;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class launch extends Application {
    static CountryData countryData;
    static String inline = "";


    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane root = new AnchorPane();
        countryData = parse(inline);
        RegionData[] regionData2 = countryData.getRegionData();
        TableView<RegionData> table = new TableView<RegionData>();
        ObservableList<RegionData> data =
                FXCollections.observableArrayList(
                        new RegionData(regionData2[0].getRegion(),regionData2[0].getTotalCases(),regionData2[0].getNewCases(),regionData2[0].getRecovered(),regionData2[0].getNewRecovered(),regionData2[0].getDeceased(),regionData2[0].getNewDeceased()),
                        new RegionData(regionData2[1].getRegion(),regionData2[1].getTotalCases(),regionData2[1].getNewCases(),regionData2[1].getRecovered(),regionData2[1].getNewRecovered(),regionData2[1].getDeceased(),regionData2[1].getNewDeceased()),
                        new RegionData(regionData2[2].getRegion(),regionData2[2].getTotalCases(),regionData2[2].getNewCases(),regionData2[2].getRecovered(),regionData2[2].getNewRecovered(),regionData2[2].getDeceased(),regionData2[2].getNewDeceased()),
                        new RegionData(regionData2[3].getRegion(),regionData2[3].getTotalCases(),regionData2[3].getNewCases(),regionData2[3].getRecovered(),regionData2[3].getNewRecovered(),regionData2[3].getDeceased(),regionData2[3].getNewDeceased()),
                        new RegionData(regionData2[4].getRegion(),regionData2[4].getTotalCases(),regionData2[4].getNewCases(),regionData2[4].getRecovered(),regionData2[4].getNewRecovered(),regionData2[4].getDeceased(),regionData2[4].getNewDeceased()),
                        new RegionData(regionData2[5].getRegion(),regionData2[5].getTotalCases(),regionData2[5].getNewCases(),regionData2[5].getRecovered(),regionData2[5].getNewRecovered(),regionData2[5].getDeceased(),regionData2[5].getNewDeceased()),
                        new RegionData(regionData2[6].getRegion(),regionData2[6].getTotalCases(),regionData2[6].getNewCases(),regionData2[6].getRecovered(),regionData2[6].getNewRecovered(),regionData2[6].getDeceased(),regionData2[6].getNewDeceased()),
                        new RegionData(regionData2[7].getRegion(),regionData2[7].getTotalCases(),regionData2[7].getNewCases(),regionData2[7].getRecovered(),regionData2[7].getNewRecovered(),regionData2[7].getDeceased(),regionData2[7].getNewDeceased()),
                        new RegionData(regionData2[8].getRegion(),regionData2[8].getTotalCases(),regionData2[8].getNewCases(),regionData2[8].getRecovered(),regionData2[8].getNewRecovered(),regionData2[0].getDeceased(),regionData2[8].getNewDeceased()),
                        new RegionData(regionData2[9].getRegion(),regionData2[9].getTotalCases(),regionData2[9].getNewCases(),regionData2[9].getRecovered(),regionData2[9].getNewRecovered(),regionData2[9].getDeceased(),regionData2[9].getNewDeceased()),
                        new RegionData(regionData2[10].getRegion(),regionData2[10].getTotalCases(),regionData2[10].getNewCases(),regionData2[10].getRecovered(),regionData2[10].getNewRecovered(),regionData2[10].getDeceased(),regionData2[10].getNewDeceased()),
                        new RegionData(regionData2[11].getRegion(),regionData2[11].getTotalCases(),regionData2[11].getNewCases(),regionData2[11].getRecovered(),regionData2[11].getNewRecovered(),regionData2[11].getDeceased(),regionData2[11].getNewDeceased()),
                        new RegionData(regionData2[12].getRegion(),regionData2[12].getTotalCases(),regionData2[12].getNewCases(),regionData2[12].getRecovered(),regionData2[12].getNewRecovered(),regionData2[12].getDeceased(),regionData2[12].getNewDeceased()),
                        new RegionData(regionData2[13].getRegion(),regionData2[13].getTotalCases(),regionData2[13].getNewCases(),regionData2[13].getRecovered(),regionData2[13].getNewRecovered(),regionData2[13].getDeceased(),regionData2[13].getNewDeceased()),
                        new RegionData(regionData2[14].getRegion(),regionData2[14].getTotalCases(),regionData2[14].getNewCases(),regionData2[14].getRecovered(),regionData2[14].getNewRecovered(),regionData2[14].getDeceased(),regionData2[14].getNewDeceased()),
                        new RegionData(regionData2[15].getRegion(),regionData2[15].getTotalCases(),regionData2[15].getNewCases(),regionData2[15].getRecovered(),regionData2[15].getNewRecovered(),regionData2[15].getDeceased(),regionData2[15].getNewDeceased()),
                        new RegionData(regionData2[16].getRegion(),regionData2[16].getTotalCases(),regionData2[16].getNewCases(),regionData2[16].getRecovered(),regionData2[16].getNewRecovered(),regionData2[16].getDeceased(),regionData2[16].getNewDeceased()),
                        new RegionData(regionData2[17].getRegion(),regionData2[17].getTotalCases(),regionData2[17].getNewCases(),regionData2[17].getRecovered(),regionData2[17].getNewRecovered(),regionData2[17].getDeceased(),regionData2[17].getNewDeceased()),
                        new RegionData(regionData2[18].getRegion(),regionData2[18].getTotalCases(),regionData2[18].getNewCases(),regionData2[18].getRecovered(),regionData2[18].getNewRecovered(),regionData2[18].getDeceased(),regionData2[18].getNewDeceased()),
                        new RegionData(regionData2[19].getRegion(),regionData2[19].getTotalCases(),regionData2[19].getNewCases(),regionData2[19].getRecovered(),regionData2[19].getNewRecovered(),regionData2[19].getDeceased(),regionData2[19].getNewDeceased()),
                        new RegionData(regionData2[20].getRegion(),regionData2[20].getTotalCases(),regionData2[20].getNewCases(),regionData2[20].getRecovered(),regionData2[20].getNewRecovered(),regionData2[20].getDeceased(),regionData2[20].getNewDeceased()),
                        new RegionData(regionData2[21].getRegion(),regionData2[21].getTotalCases(),regionData2[21].getNewCases(),regionData2[21].getRecovered(),regionData2[21].getNewRecovered(),regionData2[21].getDeceased(),regionData2[21].getNewDeceased()),
                        new RegionData(regionData2[22].getRegion(),regionData2[22].getTotalCases(),regionData2[22].getNewCases(),regionData2[22].getRecovered(),regionData2[22].getNewRecovered(),regionData2[22].getDeceased(),regionData2[22].getNewDeceased()),
                        new RegionData(regionData2[23].getRegion(),regionData2[23].getTotalCases(),regionData2[23].getNewCases(),regionData2[23].getRecovered(),regionData2[23].getNewRecovered(),regionData2[23].getDeceased(),regionData2[23].getNewDeceased()),
                        new RegionData(regionData2[24].getRegion(),regionData2[24].getTotalCases(),regionData2[24].getNewCases(),regionData2[24].getRecovered(),regionData2[24].getNewRecovered(),regionData2[24].getDeceased(),regionData2[24].getNewDeceased()),
                        new RegionData(regionData2[25].getRegion(),regionData2[25].getTotalCases(),regionData2[25].getNewCases(),regionData2[25].getRecovered(),regionData2[25].getNewRecovered(),regionData2[25].getDeceased(),regionData2[25].getNewDeceased()),
                        new RegionData(regionData2[26].getRegion(),regionData2[26].getTotalCases(),regionData2[26].getNewCases(),regionData2[26].getRecovered(),regionData2[26].getNewRecovered(),regionData2[26].getDeceased(),regionData2[26].getNewDeceased()),
                        new RegionData(regionData2[27].getRegion(),regionData2[27].getTotalCases(),regionData2[27].getNewCases(),regionData2[27].getRecovered(),regionData2[27].getNewRecovered(),regionData2[27].getDeceased(),regionData2[27].getNewDeceased())
                );

        TableColumn region = new TableColumn("Region");
        region.setMinWidth(100);
        region.setCellValueFactory(
                new PropertyValueFactory<RegionData, String>("Region"));
        TableColumn TotalCases = new TableColumn("Total Cases");
        TotalCases.setMinWidth(100);
        TotalCases.setCellValueFactory(
                new PropertyValueFactory<RegionData, Integer>("TotalCases"));
        TableColumn new_cases = new TableColumn("New Cases");
        new_cases.setMinWidth(100);
        new_cases.setCellValueFactory(
                new PropertyValueFactory<RegionData, Integer>("newCases"));
        TableColumn recovered = new TableColumn("Recovered");
        recovered.setMinWidth(100);
        recovered.setCellValueFactory(
                new PropertyValueFactory<RegionData, Integer>("recovered"));
        TableColumn newrecovered = new TableColumn(" New Recovered");
        newrecovered.setMinWidth(100);
        newrecovered.setCellValueFactory(
                new PropertyValueFactory<RegionData, Integer>("newRecovered"));
        TableColumn deceased = new TableColumn("Deceased");
        deceased.setMinWidth(100);
        deceased.setCellValueFactory(
                new PropertyValueFactory<RegionData, Integer>("deceased"));
        TableColumn new_deceased = new TableColumn("New Deceased");
        new_deceased.setMinWidth(100);
        new_deceased.setCellValueFactory(
                new PropertyValueFactory<RegionData, Integer>("newDeceased"));
        table.setItems(data);
        table.getColumns().addAll(region, TotalCases,new_cases,recovered,newrecovered,deceased,new_deceased);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll( table);
        Group group = new Group();
        group.getChildren().addAll(vbox);

        Scene scene = new Scene(group, 1000, 1000);


        primaryStage.setScene(scene);
        primaryStage.show();
    }





    public static void main(String[] args) {



        try {
            URL url = new URL("https://api.apify.com/v2/key-value-stores/toDWvRj1JpTXiM8FF/records/LATEST?disableRedirect=true");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if (responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            else {
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }

                sc.close();
            }




        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        launch(args);
    }

    public static  CountryData parse(String responseBody) throws ParseException {
        
        JSONParser parse = new JSONParser();
        JSONObject jobj = (JSONObject)parse.parse(responseBody);
        JSONArray jsonarr_1 = (JSONArray) jobj.get("regionData");
        int activeCases = (int) jobj.get("activeCases");
        int activeCasesNew = (int) jobj.get("activeCasesNew");
        int recoveredC = (int) jobj.get("recovered");
        int recoveredNew = (int) jobj.get("recoveredNew");
        int deaths = (int) jobj.get("deaths");
        int deathsNew = (int) jobj.get("deathsNew");
        int previousDayTests = (int) jobj.get("previousDayTests");
        int totalCases = (int) jobj.get("totalCases");
        String sourceUrl = (String) jobj.get("sourceUrl");
        Date lastUpdatedAtApify = (Date) jobj.get("lastUpdatedAtApify");
        String readMe = (String) jobj.get("readMe");
        RegionData[] regionData = new RegionData[28];
        for(int i=0;i<jsonarr_1.size();i++) {
            JSONObject jsonobj_1 = (JSONObject) jsonarr_1.get(i);
            String State = (String) jsonobj_1.get("region");
            int totalInfected = (int) jsonobj_1.get("totalInfected");
            int newCases = (int) jsonobj_1.get("newInfected");
            int recovered = (int) jsonobj_1.get("recovered");
            int deceased = (int) jsonobj_1.get("deceased");
            int newRecovered = (int) jsonobj_1.get("newRecovered");
            int newDeceased = (int) jsonobj_1.get("newDeceased");
            RegionData regionData1 = new RegionData(State, totalInfected, newCases, recovered, newRecovered, deceased, newDeceased);
            regionData[i]=regionData1;


        }
        CountryData countryData = new CountryData(activeCases,activeCasesNew,recoveredC,recoveredNew,deaths,deathsNew,previousDayTests,totalCases,sourceUrl,lastUpdatedAtApify,readMe, regionData);


        return countryData;
    }


}

