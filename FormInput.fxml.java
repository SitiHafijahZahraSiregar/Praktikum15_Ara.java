<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>


<AnchorPane id="AnchorPane" prefHeight="400.0" prefWidth="600.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/19" fx:controller="praktikum15_ara.FormInputController">
   <children>
      <Button fx:id="btnTambah" layoutX="495.0" layoutY="264.0" mnemonicParsing="false" onAction="#sendData" text="Tambah" />
      <Label layoutX="209.0" layoutY="14.0" prefHeight="43.0" prefWidth="182.0" text="Tambah Data Mahasiswa">
         <font>
            <Font name="System Bold" size="15.0" />
         </font>
      </Label>
      <TextField fx:id="fildNpm" layoutX="150.0" layoutY="102.0" prefHeight="26.0" prefWidth="418.0" />
      <TextField fx:id="fildNama" layoutX="150.0" layoutY="139.0" prefWidth="418.0" />
      <TextField fx:id="FildAlamat" layoutX="150.0" layoutY="178.0" prefHeight="43.0" prefWidth="418.0" />
      <Label layoutX="32.0" layoutY="105.0" prefHeight="18.0" prefWidth="46.0" text="NPM" />
      <Label layoutX="31.0" layoutY="138.0" prefHeight="26.0" prefWidth="93.0" text="Nama Lengkap" />
      <Label layoutX="31.0" layoutY="187.0" prefHeight="26.0" prefWidth="93.0" text="Alamat" />
   </children>
</AnchorPane>
