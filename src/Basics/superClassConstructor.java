package Basics;

//Parent class
class Sports {
 Sports() {
     System.out.println("Sports Class");
 }
}

//Child class of Sports
class IndoorGames extends Sports {
 IndoorGames() {
     super(); // Calls Sports constructor
     System.out.println("Indoor Games Class");
 }
}

//Child class of IndoorGames
class Chess extends IndoorGames {
 Chess() {
     super(); // Calls IndoorGames constructor
     System.out.println("Chess Game Class");
 }
}

//Main class to test
public class superClassConstructor {
 public static void main(String[] args) {
     Chess chessGame = new Chess(); // This will invoke all constructors in order
 }
}

