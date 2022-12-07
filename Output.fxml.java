<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>


<AnchorPane id="AnchorPane" prefHeight="400.0" prefWidth="600.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/19" fx:controller=".OutputController">
   <children>
      <Label layoutX="42.0" layoutY="115.0" prefHeight="18.0" prefWidth="46.0" text="NPM" />
      <Label layoutX="41.0" layoutY="148.0" prefHeight="26.0" prefWidth="93.0" text="Nama Lengkap" />
      <Label layoutX="41.0" layoutY="197.0" prefHeight="26.0" prefWidth="93.0" text="Alamat" />
      <Label layoutX="242.0" layoutY="24.0" prefHeight="43.0" prefWidth="115.0" text="Data Mahasiswa">
         <font>
            <Font name="System Bold" size="15.0" />
         </font>
      </Label>
      <Button fx:id="btnNew" layoutX="505.0" layoutY="274.0" mnemonicParsing="false" onAction="#openForm" text="Data Baru" />
      <Label fx:id="lblNpm" layoutX="170.0" layoutY="115.0" prefHeight="18.0" prefWidth="46.0" text="NPM" />
      <Label fx:id="lblNama" layoutX="169.0" layoutY="148.0" prefHeight="26.0" prefWidth="93.0" text="Nama" />
      <Label fx:id="lblAlamat" layoutX="169.0" layoutY="197.0" prefHeight="26.0" prefWidth="93.0" text="Alamat" />
   </children>
</AnchorPane>
