package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
class Vehicle {
    int wheels;
    double fuel;
    double mileage;

    Vehicle(int wheels,double fuel,double mileage) {
        this.wheels=wheels;
        this.fuel=fuel;
        this.mileage=mileage;
    }

    public int getWheels() {
        return wheels;
    }



    public double getFuel() {
        return fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void addFuel(double petrol) {
        this.fuel += petrol;
    }

    public double drive() {
        double distance = this.fuel * this.mileage;
        this.fuel = 0;
        return distance;
    }
}

class Sedan extends Vehicle {
      double MILES = 5;
     double FUEL = 2;

    public Sedan() {
        super(4,2,5);
    }

    @Override
    public double drive() {

        if(this.fuel>=FUEL)
        {
            this.mileage+=MILES;
            this.fuel-=FUEL;
        }
        else
        {
            this.fuel=0;

        }
        return 0;
    }
}
class motorcycle extends Vehicle {
    static double MILES = 1.5;
    double FUEL = 0.5;

    public motorcycle() {
        super(2,1.5,0.5);
    }

    @Override
    public double drive() {

        if(this.fuel>=FUEL)
        {
            this.mileage+=MILES;
            this.fuel-=FUEL;
        }
        else
        {
            this.fuel=0;

        }
        return 0;
    }
}
class suv extends Vehicle {
    static double MILES = 4;
    double FUEL = 2.5;

    public suv() {
        super(4,4,2.5);
    }

    @Override
    public double drive() {

        if(this.fuel>=FUEL)
        {
            this.mileage+=MILES;
            this.fuel-=FUEL;
        }
        else
        {
            this.fuel=0;

        }
        return 0;
    }
}

class color{
    public String name ;
    public color(String name){
        this.name = name ;
    }
    public String showColor() {
        return  name+"\n";
    }
}

class Red extends color{
    public Red(){
        super("Red");
    }
}

class Green extends color{
    public Green(){
        super("Green");
    }
}

class Blue extends color{
    public Blue(){
        super("Blue");
    }
}

public class MainActivity extends AppCompatActivity {

    public EditText Text1,Text2;
    public Button button;
    public TextView V1 ,V2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Text1 = findViewById(R.id.editTextText);
        Text2=findViewById(R.id.editTextText2);
        button=findViewById(R.id.button);
        V1=findViewById(R.id.textView);
        V2=findViewById(R.id.textView2);


    }
}