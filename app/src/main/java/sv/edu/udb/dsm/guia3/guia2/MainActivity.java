package sv.edu.udb.dsm.guia3.guia2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText)findViewById(R.id.txtNombre);
        etEdad=(EditText)findViewById(R.id.txtEdad);
    }

    public void segundaActividad (View v) {
        Intent i = new Intent(getApplicationContext(), segundaActividad.class);
        i.putExtra("txtNombre" ,etNombre.getText().toString());
        i.putExtra("txtEdad", etEdad.getText().toString());
        startActivity(i);
    }
}