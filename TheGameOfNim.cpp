//File: Project2.cpp
//Name: Benjamin Medina
//Date: 11/23/2021
//Course: CompSci 1
//Description: This program demonstrates the rules of the Game of Nim to the player. 
//It will first ask for the difficulty mode. Then it will randomly select a number between 10-21. 
//And then it will ask the player to choose to remove 1, or 2, or 3 stones from the pile. 
//It will keep on going until one player takes the last stone and is declared the loser.

//Usage:  This program will ask the user for the difficulty (e) for Easy mode and (h) for Hard mode, 
//  then it asks them to choose a number between 1-3 for the removal of stones in the pile.
#include <iostream>
#include <iomanip>
#include <string>
#include <stdlib.h>
#include <time.h>
#include <Windows.h>
using namespace std;

// Functions

void easy(){

cout << "You have chosen the easy mode."<< endl;
cout << "\n";
// Pile setup
int upper = 21;
int lower = 10;
int stones=0;
srand(time(NULL)); 
stones = (rand() % (upper-lower+1)) + lower;
cout << "The initial number of stones is " << stones << endl;

//Determine starting player
cout << "Now a roll of the die to determine who plays first ..." << endl;
Sleep(1500);
bool compStart = true;
if(rand() % 2==1){compStart = false;}
if(rand() % 2==0){compStart = true;}
//while loop to keep the turns going until there are no stones left.
while(stones > 0){
    // Computer's turn.

    if (compStart == true ){
    cout << "The computer is choosing a move..." << endl;
    Sleep(1500);
    srand(time(NULL));
    int remove = rand() % 3 + 1;
    while (remove > 3 || remove <= 0 || remove > stones){
      srand(time(NULL));
      int remove = rand() % 3 + 1;
      if (remove <= 3 && remove > 0){
      break;
      }

    }
        if(stones==3){
            remove = rand() % 2 + 1;
            stones = stones - remove;   
        }
        
        else if(stones==2){
            remove = rand() % 1 + 1;
            stones = stones - remove;   
        }
        
        else if(stones==1){remove = 1;
        stones = stones - remove;} 

        else{srand(time(NULL));
        int remove = rand() % 3 + 1;
        stones = stones - remove;}

        
     if (remove == 1){
            cout << "The computer removed " << remove << " stone." << endl;}
                else{cout << "The computer removed " << remove <<" stones." << endl;} 
     if (stones == 1){
            cout << "The pile now has " << stones << " stone left." << endl;}
                else{cout << "The pile now has " << stones <<" stones left." << endl;} 
        if (stones == 0){cout << "Congratulations, you won! :)"; break;}


        else {compStart=false;}
    }


 // Player turn
 if (compStart == false) {cout << "It is your turn. Enter the number of stones you would like to remove: ";
    int playerNum=0;
    cin >> playerNum; 
    while (playerNum > 3 || playerNum <= 0 || playerNum > stones){
      cout << playerNum << " is not a valid move. Enter either 1,2, or 3 for the number of stones: ";
      cin >> playerNum;
      if (playerNum <= 3 && playerNum > 0){
      break;
      }
    }
        stones = stones - playerNum; 
         if (playerNum == 1){
            cout << "You removed " << playerNum << " stone from the pile." << endl;}
                else{cout << "You removed " << playerNum <<" stones from the pile." << endl;} 
        if (stones == 1){
            cout << "The pile now has " << stones << " stone left." << endl;}
                else{cout << "The pile now has " << stones <<" stones left." << endl;} 
                if (stones == 0) {cout << "Sorry, you lost the game :("; break;} 
                else {compStart=true;}
            }
}
}
// Hard mode function has similar format with changes noted.
void hard(){
cout << "You have chosen the hard mode."<< endl;
cout << "\n";
//Pile setup
int upper = 21;
int lower = 10;
int stones=0;
srand(time(NULL)); 
stones = (rand() % (upper-lower+1)) + lower;
cout << "The initial number of stones is " << stones << endl;
// Determine Starting Player
cout << "Now a roll of the die to determine who plays first ..." << endl;
Sleep(1500);
bool compStart = true;
if(rand() % 2==1){compStart = false;}
if(rand() % 2==0){compStart = true;}
// Loop for rotating turns
while(stones > 0){

    if (compStart == true ){
    cout << "The computer is choosing a move..." << endl;
    Sleep(1500);
    srand(time(NULL));
    int remove = rand() % 3 + 1;
    while (remove > 3 || remove <= 0 || remove > stones){
      srand(time(NULL));
      int remove = rand() % 3 + 1;
      if (remove <= 3 && remove > 0 && remove <= stones){
      break;
      }
    }
        // This system of stone removal for the computers turn is quite different from easy mode.
        if(stones%4==0){
            remove = 3;
            stones = stones - remove;
        }
        
        else if(stones%4==3){
            remove = 2;
            stones = stones - remove;
        }

        else{remove=1; stones = stones - remove;}
     // Outputs for Routine Pile updates   
     if (remove == 1){
            cout << "The computer removed " << remove << " stone." << endl;
            Sleep(2000);}
                else{cout << "The computer removed " << remove <<" stones." << endl;
                Sleep (2000);} 
     if (stones == 1){
            cout << "The pile now has " << stones << " stone left." << endl;}
                else{cout << "The pile now has " << stones <<" stones left." << endl;} 
        if (stones == 0){cout << "Congratulations, you won! :)"; break;}


        else {compStart=false;}
    }

 //Code for Player turn

 if (compStart == false) {cout << "It is your turn. Enter the number of stones you would like to remove: ";
    int playerNum=0;
    cin >> playerNum; 
    while (playerNum > 3 || playerNum <= 0 || playerNum > stones){
      cout << playerNum << " is not a valid move. Enter either 1,2, or 3 for the number of stones: ";
      cin >> playerNum;
      if (playerNum <= 3 && playerNum > 0){
      break;
      }
    }
     // Pile removal
        stones = stones - playerNum; 
         if (playerNum == 1){
            cout << "You removed " << playerNum << " stone from the pile." << endl;}
                else{cout << "You removed " << playerNum <<" stones from the pile." << endl;} 
        if (stones == 1){
            cout << "The pile now has " << stones << " stone left." << endl;}
                else{cout << "The pile now has " << stones <<" stones left." << endl;} 
                if (stones == 0) {cout << "Sorry, you lost the game :("; break;} 
                else {compStart=true;}
            }
}
}


// Main

int main(){
// Start Menu
cout << setw(59) << "*************** THE GAME OF NIM ***************" << endl;
cout << "\n";
cout << setw(32) << "Rules of the game:" << endl;
cout << "\n";
cout << setw(72) << "* Each player can remove 1, 2, or 3, stones from the pile." << endl;
cout << setw(57) << "* The player who makes the last move loses." << endl;
cout << "\n";   
// mode Var
char mode;
// Game mode choice
cout << setw(40) << "Please choose a difficulty. " << endl;
cout << setw(32) << "Easy(e) or Hard(h): ";
cin >> mode;
if (mode == 'e'|| mode == 'E'){easy();}

if(mode == 'h' || mode == 'H'){hard();}

return 0;
}

