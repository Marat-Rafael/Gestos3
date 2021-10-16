/*
 * Cuando creas una instancia de un objeto GestureDetectorCompat,
 * uno de los parámetros que toma es una clase que implementa la interfaz
 * GestureDetector.OnGestureListener. GestureDetector.OnGestureListener
 * notifica a los usuarios cuando ocurre un evento táctil en particular.
 * Para permitir que tu objeto GestureDetector reciba eventos,
 * anula el método onTouchEvent() de Vista o Actividad
 * y pasa todos los eventos observados a la instancia del detector.
 */
package com.example.gestos3;

import androidx.core.view.GestureDetectorCompat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends Activity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
    TextView mostrarCoordenadaX;
    TextView mostrarCoordenadaY;
    TextView tipoEvento;

    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiate the gesture detector with the
        // application context and an implementation of
        // GestureDetector.OnGestureListener
        mDetector = new GestureDetectorCompat(this, this);
        // Set the gesture detector as the double tap
        // listener.
        mDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDown: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onDown));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        // si retorna true sigue escuchando
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling: " + event1.toString() + event2.toString());

        int x = (int) event1.getX();
        int y = (int) event1.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onFling));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onLongPress: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onLongPress));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {

        int x = (int) event1.getX();
        int y = (int) event1.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onScroll));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onShowPress: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onShowPress));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapUp: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onSingleTapUp));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTap: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onDoubleTap));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTapEvent: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onDoubleTapEvent));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = findViewById(R.id.textEvento);
        tipoEvento.setText(getString(R.string.onSingleTapConfirmed));
        mostrarCoordenadaX =  findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText(getString(R.string.coordenada_x)+ x);
        mostrarCoordenadaY =  findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText((getString(R.string.coordenada_y)) + y);
        return true;
    }
}
