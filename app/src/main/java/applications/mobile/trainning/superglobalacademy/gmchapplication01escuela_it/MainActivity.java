package applications.mobile.trainning.superglobalacademy.gmchapplication01escuela_it;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button boton1,boton2,boton3;//,boton2,boton3;
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.pepito);
        boton2 = (Button) findViewById(R.id.pepito2);
        boton3 = (Button) findViewById(R.id.pepito3);

        texto = (EditText) findViewById(R.id.texto);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);


    }


   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // codigo al ejecutar el click

            switch(v.getId()){
                case (R.id.pepito):

                    Intent intent=new Intent(this,Actividad2java.class);
                    startActivity(intent);

                    break;

                   case(R.id.pepito2):
                     Toast.makeText(getApplicationContext(),"hola soy Gonzalo diseñando",Toast.LENGTH_LONG).show();

                    break;

                case(R.id.pepito3):
                    String msg=texto.getText().toString();
                    Intent intent2=new Intent(this,Actividad2java.class);
                    intent2.putExtra("textocargado",msg);
                    startActivity(intent2);



                    break;





                default:


                    break;
            }
  }



/*

  //  import android.content.Intent;
  //  import android.view.View;

     //emlace mediante boton actividad 1 y actividad 2

    findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, Actividad2java.class));
        }
    });
    */




}
