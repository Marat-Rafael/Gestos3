/**
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
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onDown");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling: " + event1.toString() + event2.toString());

        int x = (int) event1.getX();
        int y = (int) event1.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onFling");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onLongPress: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onFling");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        int x = (int) event2.getX();
        int y = (int) event2.getY();
        Log.d(DEBUG_TAG, "onScroll: " + event1.toString() + event2.toString());
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onScroll");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onShowPress: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onShowPress");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapUp: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onSingleTapUp");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTap: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onDoubleTap");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTapEvent: " + event.toString());
        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onDoubleTapEvent");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + event.toString());

        int x = (int) event.getX();
        int y = (int) event.getY();
        tipoEvento = (TextView) findViewById(R.id.textEvento);
        tipoEvento.setText("Evento: onSingleTapConfirmed");
        mostrarCoordenadaX = (TextView) findViewById(R.id.textResultadoX);
        mostrarCoordenadaX.setText("coordenada X: " + x);
        mostrarCoordenadaY = (TextView) findViewById(R.id.textResultadoY);
        mostrarCoordenadaY.setText("coordenada Y: " + y);
        return true;
    }
}
