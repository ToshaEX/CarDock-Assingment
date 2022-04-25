package com.example.cardock_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegCar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_car);
        ArrayList<Car> carList=new ArrayList<>();
        final EditText vRegNum=findViewById(R.id.editText_vReg);
        final EditText vBrand=findViewById(R.id.editText_vbrand);
        final EditText vModel=findViewById(R.id.editText_vModel);
        final EditText vYear=findViewById(R.id.editText_vYear);
        final EditText vSeat=findViewById(R.id.editText_vSeat);
        final EditText vPrice=findViewById(R.id.editText_vPrice);

        final Button registerVehicleBtn=findViewById(R.id.button_rVehicle);

        registerVehicleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String regNum = vRegNum.getText().toString();
                final String brand = vBrand.getText().toString();
                final String model = vModel.getText().toString();
                final int year = Integer.parseInt(vYear.getText().toString());
                final int seat = Integer.parseInt(vSeat.getText().toString());
                final int price = Integer.parseInt(vPrice.getText().toString());

                /*******************************************************************************************************************************
                                                                    * 5:Handle validation Part*
                 ******************************************************************************************************************************/
                if ((regNum.isEmpty() || brand.isEmpty() || model.isEmpty() )|| (year<1900 || year>2022 ) || (seat<1 || seat>100) ||(price<0)) {
                    Toast.makeText(RegCar.this, "Please fill the all fields", Toast.LENGTH_SHORT).show();
                }else{
                    try{
                    Car car =new Car(regNum, model,brand,year,seat,price);
                    carList.add(car);
                        }catch (Exception e){
                        Toast.makeText(RegCar.this,"Type Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    String msg="Object List\n";
                    for (int i=0; i<carList.size();i++) {
                       msg=msg+"\n"+carList.get(i).showCars();
                    }
                    Toast.makeText(RegCar.this,""+msg, Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}