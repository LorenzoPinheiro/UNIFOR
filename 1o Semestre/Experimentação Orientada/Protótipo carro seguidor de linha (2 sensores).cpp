
//MOTOR 1
int motor1H = 9; //Controle de acionamento do motor
int motor1L = 6;//Controle de acionamento do motor

//MOTOR 2
int motor2H = 5; //Controle de acionamento do motor
int motor2L = 3; //Controle de acionamento do motor

// COMP 
int sensorE = 10; // (usando analogico) 
int sensorD = 13; // (usando analogico) 
    
void setup()  
{  
  //Define os pinos como saida  
  
  pinMode(motor1H, OUTPUT);  
  pinMode(motor1L, OUTPUT);
  pinMode(motor2H, OUTPUT);
  pinMode(motor2L, OUTPUT);
  pinMode(sensorD, INPUT);  
  pinMode(sensorE, INPUT);  

  Serial.begin(9600);
}  
   
  //Motores para FRENTE 
  void frente()
  {
  analogWrite(motor1H, 110);  
  analogWrite(motor1L, 0);
  analogWrite(motor2H, 110);  
  analogWrite(motor2L, 0); 
//delay(3000);  
  }

  void pare()
  {
  analogWrite(motor1H, 0);  
  analogWrite(motor1L, 0);
  analogWrite(motor2H, 0);  
  analogWrite(motor2L, 0);  
 // delay(3000);  
  }
  void virarDireita()
  {
  digitalWrite(motor1H, HIGH);  
  digitalWrite(motor1L, LOW);
  digitalWrite(motor2H, LOW);  
  digitalWrite(motor2L, HIGH); 
  }
  
  void pare1()
  {
  analogWrite(motor1H, 130);  
  analogWrite(motor1L, 0);
  analogWrite(motor2H, 0);  
  analogWrite(motor2L, 130);  
 // delay(3000);  
  }

  void virarEsquerda()
  {
  digitalWrite(motor1H, LOW);  
  digitalWrite(motor1L, HIGH);
  digitalWrite(motor2H, HIGH);  
  digitalWrite(motor2L, LOW); 
  }

  void pare2()
  {
  analogWrite(motor1H, 0);  
  analogWrite(motor1L, 130);
  analogWrite(motor2H, 130);  
  analogWrite(motor2L, 0); 
 // delay(3000);  
  }

void loop()  
{  
  
  if(digitalRead(sensorD)==0 && digitalRead(sensorE)==1){
    pare1();
     
  }   
  
  else if(digitalRead(sensorE)==0 && digitalRead(sensorD)==1){
   pare2();
  }
  
  else if(digitalRead(sensorE)==0 && digitalRead(sensorD)==0){
    frente();
  }
  else if(digitalRead(sensorD)==1 && digitalRead(sensorE)==1){
    pare();
  }
}