// C++ code
//
#include <Servo.h>

int direita = 0;

int esquerda = 0;

Servo servo;

//MOTOR 1   
int motor1H = 2; //Controle de acionamento do motor
int motor1L = 7; //Controle de acionamento do motor

//MOTOR 2
int motor2H = 12; //Controle de acionamento do motor
int motor2L = 13; //Controle de acionamento do motor


long readUltrasonicDistance(int triggerPin, int echoPin)
{
  pinMode(triggerPin, OUTPUT);
  digitalWrite(triggerPin, LOW);
  delayMicroseconds(2);
  // Sets the trigger pin to HIGH state for 10 microseconds
  digitalWrite(triggerPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(triggerPin, LOW);
  pinMode(echoPin, INPUT);
  // Reads the echo pin, and returns the sound wave travel time in microseconds
  return pulseIn(echoPin, HIGH);
}

void setup()
{
  servo.attach(3, 500, 2500);
  //Manda o servo rodar de 0 graus(500) à 180 graus(2500)
  Serial.begin(9600);

  servo.write(90);
  pinMode(velM1, OUTPUT);  
  pinMode(motor1H, OUTPUT);  
  pinMode(motor1L, OUTPUT);
  pinMode(velM2, OUTPUT);
  pinMode(motor2H, OUTPUT);
  pinMode(motor2L, OUTPUT);
  Serial.begin(9600);
}



//Motores para FRENTE 
  void frente()
  {
  digitalWrite(motor1H, HIGH);  
  digitalWrite(motor1L, LOW);
  digitalWrite(motor2H, HIGH);  
  digitalWrite(motor2L, LOW); 
  delay(3000);  
  }

  void direita()
  {
  digitalWrite(motor1H, HIGH);  
  digitalWrite(motor1L, LOW);
  digitalWrite(motor2H, LOW);  
  digitalWrite(motor2L, HIGH); 
  delay(1000);  
  }
  void esquerda()
  {
  digitalWrite(motor1H, LOW);  
  digitalWrite(motor1L, HIGH);
  digitalWrite(motor2H, HIGH);  
  digitalWrite(motor2L, LOW); 
  delay(1000);  
  }

void loop()
{


  if (0.01723 * readUltrasonicDistance(4, 5) < 50) {
    servo.write(0);
    delay(3000); // Wait for 3000 millisecond(s)
    if (servo.read() == 0) {
      esquerda = 0.01723 * readUltrasonicDistance(4, 5);
    }
    servo.write(180);
    delay(4000); // Wait for 4000 millisecond(s)
    if (servo.read() == 180) {
      direita = 0.01723 * readUltrasonicDistance(4, 5);
    }
    if (direita >= esquerda) {
    
    

     



      servo.write(90);
    } else {



      servo.write(90);
    }
  }
}
 