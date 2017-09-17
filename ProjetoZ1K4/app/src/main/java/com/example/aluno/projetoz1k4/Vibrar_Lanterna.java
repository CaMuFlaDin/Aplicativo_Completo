package com.example.aluno.projetoz1k4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Vibrar_Lanterna extends AppCompatActivity {

    Button button;
    boolean hasFlash;
    boolean isFlashOn;
    Camera.Parameters params;
    Camera camera;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrar__lanterna);
        button = (Button) findViewById(R.id.buttonLanterna);
        hasFlash = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if(!hasFlash) {

            Toast alert = Toast.makeText(this,"Não tem flash!",Toast.LENGTH_SHORT);
            alert.show();
            return;
        }

        getCamera();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isFlashOn) {
                    turnOffFlash();
                } else {
                    turnOnFlash();
                }

            }
        });
    }

    private void getCamera() {

        if (camera == null) {
            try {
                camera = Camera.open();
                params = camera.getParameters();
            }catch (Exception e) {

            }
        }

    }

    private void turnOnFlash() {

        if(!isFlashOn) {
            if(camera == null || params == null) {
                camera = Camera.open();
                return;
            }

            params = camera.getParameters();
            params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            camera.setParameters(params);
            camera.startPreview();
            isFlashOn = true;
            Toast deu = Toast.makeText(this,"Ligado!",Toast.LENGTH_SHORT);
            deu.show();
        }

    }

    private void turnOffFlash() {

        if (isFlashOn) {
            if (camera == null || params == null) {
                camera = Camera.open();
                return;
            }

            params = camera.getParameters();
            params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
            camera.setParameters(params);
            camera.stopPreview();
            isFlashOn = false;
            Toast deu = Toast.makeText(this,"Desligado!",Toast.LENGTH_SHORT);
            deu.show();
        }
    }

    public void Vibrar(View v){

        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milliseconds = 3000;
        rr.vibrate(milliseconds);

    }

}