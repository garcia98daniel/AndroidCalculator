package co.edu.unimagdalena.apmoviles.tallerunimag1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView pantalla, pantallaResultado;
    Button number1, number2, number3, number4, number5, number6, number7 , number8, number9, number0,
            buttonSqrt, buttonResta, buttonSuma, buttonDiv, buttonMul, buttonCE, buttonIgual, buttonDel ;
    boolean digito1Undido ;
    long num1 ;
    String num2 ;
    double resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         digito1Undido = false;
         num1 = 0;
         num2 = "";
         operador = "";

        pantalla = findViewById(R.id.pantalla);
        pantallaResultado = findViewById(R.id.pantallaResultado);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number9);
        number0 = findViewById(R.id.number0);

        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
        number0.setOnClickListener(this);

        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonResta = findViewById(R.id.buttonResta);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMul = findViewById(R.id.buttonMul);
        buttonCE = findViewById(R.id.buttonCE);
        buttonIgual = findViewById(R.id.buttonIgual);
        buttonDel = findViewById(R.id.buttonDel);

        buttonSqrt.setOnClickListener(this);
        buttonResta.setOnClickListener(this);
        buttonSuma.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonCE.setOnClickListener(this);
        buttonIgual.setOnClickListener(this);
        buttonDel.setOnClickListener(this);
        pantalla.setText("0");
        pantallaResultado.setText("");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.number1:
                if(digito1Undido == false){
                    if( pantalla.getText().toString() == "0"){
                        pantalla.setText("1");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"1");
                    }
                }else if(operador != "sqrt"){
                    num2 += "1";
                    pantalla.setText(pantalla.getText().toString()+"1");
                }

                break;
            case R.id.number2:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("2");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"2");
                    }
                }else if(operador != "sqrt"){
                    num2 += "2";
                    pantalla.setText(pantalla.getText().toString()+"2");
                }
                break;
            case R.id.number3:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("3");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"3");
                    }
                }else if(operador != "sqrt"){
                    num2 += "3";
                    pantalla.setText(pantalla.getText().toString()+"3");
                }
                break;
            case R.id.number4:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("4");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"4");
                    }
                }else if(operador != "sqrt"){
                    num2 += "4";
                    pantalla.setText(pantalla.getText().toString()+"4");
                }
                break;
            case R.id.number5:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("5");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"5");
                    }
                }else if(operador != "sqrt"){
                    num2 += "5";
                    pantalla.setText(pantalla.getText().toString()+"5");
                }
                break;
            case R.id.number6:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("6");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"6");
                    }
                }else if(operador != "sqrt"){
                    num2 += "6";
                    pantalla.setText(pantalla.getText().toString()+"6");
                }
                break;
            case R.id.number7:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("7");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"7");
                    }
                }else if(operador != "sqrt"){
                    num2 += "7";
                    pantalla.setText(pantalla.getText().toString()+"7");
                }
                break;
            case R.id.number8:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("8");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"8");
                    }
                }else if(operador != "sqrt"){
                    num2 += "8";
                    pantalla.setText(pantalla.getText().toString()+"8");
                }
                break;
            case R.id.number9:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("9");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"9");
                    }
                }else if(operador != "sqrt"){
                    num2 += "9";
                    pantalla.setText(pantalla.getText().toString()+"9");
                }
                break;
            case R.id.number0:
                if(digito1Undido == false){
                    if(pantalla.getText().toString() == "0"){
                        pantalla.setText("0");
                    }else{
                        pantalla.setText(pantalla.getText().toString()+"0");
                    }
                }else if(operador != "sqrt"){
                    num2 += "0";
                    pantalla.setText(pantalla.getText().toString()+"0");
                }
                break;
            case R.id.buttonSqrt:
                if(digito1Undido == false ){
                    num1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText("sqrt("+pantalla.getText().toString()+")");
                    digito1Undido = true;
                    operador = "sqrt";
                }
                break;
            case R.id.buttonResta:
                if(digito1Undido == false){
                    num1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText(pantalla.getText().toString()+"-");
                    digito1Undido = true;
                    operador = "-";
                }
                break;
            case R.id.buttonSuma:
                if(digito1Undido == false ){
                    num1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText(pantalla.getText().toString()+"+");
                    digito1Undido = true;
                    operador = "+";
                }
                break;
            case R.id.buttonDiv:
                if(digito1Undido == false){
                    num1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText(pantalla.getText().toString()+"/");
                    digito1Undido = true;
                    operador = "/";
                }
                break;
            case R.id.buttonMul:
                if(digito1Undido == false){
                    num1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText(pantalla.getText().toString()+"*");
                    digito1Undido = true;
                    operador = "*";
                }
                break;
            case R.id.buttonCE:
                pantalla.setText("0");
                pantallaResultado.setText("");
                num1=0;
                num2 = "";
                operador = "";
                digito1Undido = false;

                break;
            case R.id.buttonIgual:
                //Toast.makeText(this, "num1 = "+ num1 +" num2 =  "+ num2, Toast.LENGTH_SHORT).show();
                if(num2 != "" && operador != "" || operador == "sqrt"){
                    //Toast.makeText(this, "Entro a operaciones" + operador, Toast.LENGTH_SHORT).show();

                    switch (operador) {
                        case "+":
                            pantalla.setText("0");
                            pantallaResultado.setText(""+sumar(num1, num2));
                            digito1Undido = false;
                            operador="";
                            num1 = 0;
                            num2 = "";
                            break;
                        case "-":
                            pantalla.setText("0");
                            pantallaResultado.setText(""+resta(num1, num2));
                            digito1Undido = false;
                            operador="";
                            num1 = 0;
                            num2 = "";
                            break;
                        case "*":
                            pantalla.setText("0");
                            pantallaResultado.setText(""+multiplicacion(num1, num2));
                            digito1Undido = false;
                            operador="";
                            num1 = 0;
                            num2 = "";
                            break;
                        case "/":
                            //resultado
                            pantalla.setText("0");
                            pantallaResultado.setText(division(num1, num2));
                            digito1Undido = false;
                            operador="";
                            num1 = 0;
                            num2 = "";
                            break;
                        case "sqrt":
                            pantalla.setText("0");
                            pantallaResultado.setText(""+sqrt(num1));
                            digito1Undido = false;
                            operador="";
                            num1 = 0;
                            num2 = "";
                            break;
                        default:
                            break;
                    }
                }
                break;
            case R.id.buttonDel:
                if(pantalla.getText().toString() != "0"){
                    pantalla.setText(pantalla.getText().subSequence(0, pantalla.getText().length() - 1).toString());
                    if(pantalla.getText().toString() == ""){
                        pantalla.setText("0");
                    }
                }
                break;
            default:
                break;
        }
    }

    private double sqrt(long num1) {
        double raiz = 0;
        raiz = Math.sqrt(num1);
        return raiz;
    }

    private String division(long num1, String num2) {
        double numero2 = Integer.parseInt(num2);
        if(numero2 == 0){
            Toast.makeText(this, "No es posible dividir entre 0", Toast.LENGTH_SHORT).show();
        }else{
            double residuo = 0;
            residuo = num1 / Integer.parseInt(num2);
            return ""+residuo;
        }
        return "Math Error";
    }

    private long multiplicacion(long num1, String num2) {
        long producto = 0;
        producto = num1 * Integer.parseInt(num2);
        return producto;
    }

    private long resta(long num1, String num2) {
        long resta = 0;
        resta = num1 - Integer.parseInt(num2);
        return resta;
    }

    public long sumar(long num1, String num2){
        long suma = 0;
        suma = num1 + Integer.parseInt(num2);
        return suma;
    }
}