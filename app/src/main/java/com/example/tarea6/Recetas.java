package com.example.tarea6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Recetas extends AppCompatActivity implements View.OnClickListener {

    String comida;
    TextView txt, txt1, txt2, txt3, txt4, txt5;
    ImageView img1, img2, img3, img4, img5;
    LinearLayout lya, lyb, lyc, lyd, lye;

    String[] recetas_pescado = {
            "Precalienta el horno a 220 ºC.\n" +
                    "Corta las papas en rodajas finas, disponlas sobre una charola y barnízalas con aceite de oliva.\n" +
                    "Hornéalas por 30 minutos aproximadamente o hasta que notes que se encuentren cocidas.\n" +
                    "Retira del horno y agrega los filetes de pescado, añade la mantequilla, las hojas de salvia, estragón y la mantequilla en cubos; salpimienta y mete nuevamente al horno por 15 minutos. Sirve caliente.",
            "Licua un jitomate con la mitad de la cebolla y los dientes de ajo. Reserva un momento.\n" +
                    "Corta en cubos muy pequeños los jitomates y la cebolla restante. Aparta un instante.\n" +
                    "Fríe a fuego medio la cebolla hasta que se encuentre transparente, agrega los jitomates y remueve por dos minutos aproximadamente. Incorpora lo que licuaste, las aceitunas, las alcaparras, los chiles y el orégano. Salpimienta y fríe hasta que espese.\n" +
                    "Aparte, salpimienta el pescado y fríe los filetes por dos minutos de cada lado.\n" +
                    "Sirve el pescado con la salsa.",
            "Precalienta el horno a 200o C.\n" +
                    "Coloca los filetes en el papel aluminio. Sazónalos con la sal, la pimienta, una cucharadita de aceite y la paprika.\n" +
                    "Cierra bien el papel aluminio. Colócalos en una charola y hornéalos por 20 minutos Mientras, forma figuras de pez con la zanahoria. Haz los ojitos con una gotita de crema y colócalos en el plato acompañando el pescado.",
            "Bate las claras a velocidad alta hasta que se formen picos duros, sin dejar de batir añade las yemas, la harina, las finas hierbas y sal; bate bien después de cada adición.\n" +
                    "Sazona las tiras de pescado con sal y pimienta, sumérgelas (una por una) en la mezcla de harina y de inmediato ponlas en una cacerola con el aceite, muy caliente.\n" +
                    "Cuando estén doradas, sácalas con unas pinzas y ponlas sobre toallas de papel absorbente para quitar el exceso de grasa.",
            "Salpimienta los filetes de pescado, asa en una sartén a fuego medio con el aceite de oliva, cuando voltees los pescados agrega el ajo y mantequilla.\n" +
                    "Arma las hamburguesas con la lechuga, jitomate, pescado mayonesa, rábano, arúgula y pepinillos."
    };

    String[] recetas_pasta = {
            "En una olla fríe el ajo con la mantequilla; cuando comience a dorar agrega la crema, la nuez moscada y los quesos; salpimienta y mantén caliente.\n" +
                    "Blanquea el brócoli y agrégalo a la salsa. Incorpóralo.\n" +
                    "Cuece la pasta de acuerdo con las indicaciones del paquete, cuela y mezcla con la salsa; salpimienta y sirve decorando con los brotes.",
            "Cuece la pasta en agua hirviendo hasta que esté suave.\n" +
                    "Mientras tanto sofríe el ajo con la mantequilla, cuando comience a hervir agrega el vino blanco, deja hervir unos minutos. Agrega el jugo de limón, ralladura y crema.\n" +
                    "Integra la pasta y espinaca, salpimienta. Sirve y termina con el parmesano.",
            "En una olla grande pon a calentar el agua, al soltar el hervor agrega sal y la pasta; deja cocer el tiempo que te indique el paquete.\n" +
                    "Mientras tanto calienta la mantequilla y acitrona la cebolla, agrega el jugo de mandarina y la fécula, mezcla con un batidor de globo, salpimienta y deja a fuego bajo hasta que espese, enfría.\n" +
                    "Escurre muy bien la pasta y mézclala con la salsa de mandarina, incorpora el surimi.\n" +
                    "Sírvela fría o tibia decorando con gajos de mandarina y cebollín.",
            "Cuece la pasta conforme a las instrucciones del paquete para que esté al dente.\n" +
                    "Pon en una sartén la mantequilla con media cucharadita de aceite para que no se queme, agrega la cebolla a que acitrone e incorpora la crema hasta que suelte el hervor. Apaga y salpimienta. Muele en la licuadora la crema con las espinacas.\n" +
                    "Vacía sobre la pasta y sirve.",
            "Hierve la pasta conforme al empaque hasta que esté al dente.\n" +
                    "Mientras tanto, licua la albahaca con el queso parmesano y los piñones, agrega poco a poco el aceite de oliva tibio; salpimienta. Mezcla la pasta con el pesto y los chícharos.\n" +
                    "Termina con un poco más de queso parmesano y sirve."
    };

    String[] recetas_carnes = {
            "Enciende el carbón a flama media.\n" +
                    "Barniza la arrachera con el aceite para evitar que se pegue y coloca la arrachera sobre el grill y da vuelta cada 5 minutos hasta conseguir el término deseado.\n" +
                    "Rebana la arrachera en fajitas para colocar sobre la tortilla. Acompaña con una rebanada de aguacate y sirve. Puedes también acompañar con vegetales asados, salsa de molcajete y unas gotas de limón.",
            "Mezcla el jugo de piña con el azúcar, la salsa de soya, el vinagre y el aceite hasta que el azúcar se disuelva. Agrega la cebolla y el jengibre. Separa dos cucharadas para procesarla más tarde con la mantequilla.\n" +
                    "Cubre la carne con la mezcla y marínala desde el día anterior.\n" +
                    "Prende el asador. Mantén la carne a temperatura ambiente antes de ponerla a asar.",
            "Enciende el carbón a flama media.\n" +
                    "Barniza el corte con aceite.\n" +
                    "Mezcla el romero y la pimienta con la sal y aplica dando un masaje a todo el corte de manera uniforme.\n" +
                    "Coloca sobre el grill durante 15 minutos aproximadamente, posteriormente da vuelta y deja que se cocine otros 15 minutos, teniendo cuidado de que no se vaya a quemar.",
            "Enciende el carbón a fuego medio.\n" +
                    "Corta los chorizos por la mitad y colócalos sobre el grill durante 10 minutos aproximadamente dando vuelta constantemente para evitar que se quemen, sirve acompañado de cebollas asadas, tortillas recién hechas, salsa, queso y unas gotas de limón.\n",
            "Enciende el carbón a flama media.\n" +
                    "Barniza el corte con aceite, posteriormente cubre de manera uniforme con la sal, pimienta y perejil.\n" +
                    "Coloca el corte sobre el grill dando vuelta cada 10 minutos cuidando que no se queme hasta conseguir el termino deseado.\n" +
                    "Por último, antes de ser servido, envuelve en papel aluminio y deja reposar como mínimo 15 minutos para obtener una consistencia más jugosa en nuestro corte."
    };

    String[] recetas_postres = {
            "Estira el hojaldre a un grosor de un centímetro; trata de hacerlo en forma de rectángulo.\n" +
                    "Unta sobre el hojaldre la cajeta, reparte la nuez, los arándanos y la canela. Enrolla y corta en trozos de 7 centímetros de ancho. Colócalos en moldes para cupcakes previamente engrasados.\n" +
                    "Barniza con la yema y espolvorea sobre ellos el azúcar. Hornea durante 20 minutos o hasta que estén dorados a 180 ºC.",
            "En la batidora (de preferencia con el gancho) mezcla la harina con la sal, después agrega la mantequilla, bate hasta formar una textura arenosa. Añade el agua cucharada por cucharada, sigue batiendo hasta que la masa se despegue de las orillas.\n" +
                    "Forma una bola y corta en ocho trozos del mismo tamaño. Aplana las bolitas y enfría en una bolsa de plástico durante una hora.\n" +
                    "Estira con un rodillo en una superficie enharinada hasta lograr un espesor de dos centímetros.\n" +
                    "Con cuatro de ellas cubre las bases para pay chicas previamente engrasadas y enharinadas. Corta el excedente lateral.",
            "Precalienta el horno a 180 ºC.\n" +
                    "Mezcla la harina con el azúcar, la sal y la levadura. Después agrega el huevo y el agua tibia. Amasa hasta obtener una masa tersa.\n" +
                    "Añade la mantequilla; una vez incorporada agrega el jarabe de chocolate y la cocoa. Coloca sobre una charola y cubre con un trapo húmedo. Permite que fermente hasta que la masa duplique su volumen.\n" +
                    "Forma las donas con ayuda de un cortador, nuevamente permite que dupliquen su tamaño y hornéalas durante 10 minutos.",
            "Calienta la leche con la mantequilla, la sal y el azúcar; cuando comience a hervir agrega de golpe la harina, revuelve con un batidor de globo hasta formar una bola.\n" +
                    "Cuece un minuto a fuego alto hasta que la masa se despegue fácilmente de la cacerola.\n" +
                    "Transfiere a la batidora y comienza a batir con la pala, agrega los huevos uno por uno. Coloca la masa a una manga con punta de estrella y forma bolitas chicas sobre una charola con papel encerado.\n" +
                    "Hornea durante 15 minutos a 180 ºC o hasta que estén doradas.",
            "Funde el azúcar en una sartén a fuego medio. Cuando comience a tomar un color dorado, agrega la mantequilla y retira del fuego, mueve con una pala de madera e integra. Agrega poco a poco la crema sin dejar de mover.\n" +
                    "Trocea los plátanos y distribúyelos en los platos.\n" +
                    "Baña con el caramelo y termina con la granola. Decora con flores comestibles si lo deseas."
    };

    String[] getRecetas_sopas = {
            "En una olla con agua caliente coloca los chiles guajillo, la cebolla, el diente de ajo y los 4 jitomates. Hierve hasta que los jitomates estén suaves.\n" +
                    "Licúa todos los ingredientes, incluso el caldito.\n" +
                    "En una olla calienta coloca un poco de aceite y vacía la mezcla recién licuada para freírla. Salpimienta y mantenla caliente.\n" +
                    "Para servir coloca un puño de tortillas fritas en un plato, agrega la salsa, decora con rebanadas de aguacate, queso panela, un poco de crema y tiras de chile guajillo.",
            "Calienta el aceite en una sartén profunda y fríe las tortillas hasta que queden crujientes. Retira del fuego y reserva en un recipiente con papel absorbente.\n" +
                    "Licua los jitomates con el ajo y la cebolla. Cuela.\n" +
                    "En una olla calienta el aceite de oliva y vacía la mezcla de jitmate. Deja hervir por 10 minutos.\n" +
                    "Añade el caldo de pollo y el epazote. Sazona con sal.\n" +
                    "Adereza al gusto y deja hervir durante cinco minutos más.",
            "Calienta el caldo con los ajos, la mitad del epazote, la cebolla, los chipotles y el xoconostle; sazona con sal.\n" +
                    "Cuando suelte el hervor, añade la médula y cocina a fuego medio hasta que esté cocida (flota en la superficie).\n" +
                    "Incorpora el resto del epazote, rectifica la sazón y retira de la estufa; sirve las porciones y acompaña con jugo de limón si lo deseas.",
            "Dora los dientes de ajo en aceite de oliva, previamente pelados, a fuego muy suave.\n" +
                    "Corta el pan en cubos y agrégalo a la sartén para que se impregne de aceite. Añade el pimentón y el caldo.\n" +
                    "Cuando suelte hervor, reduce el fuego 10 minutos y agrega sal al gusto.\n" +
                    "Añade los huevos a la sopa, removiendo con un tenedor para que se formen hilos según se coce el huevo.\n" +
                    "Sirve de inmediato."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        //TITULO DE LA COMIDA
        comida = getIntent().getStringExtra("Comida");
        txt = (TextView) findViewById(R.id.textView);
        txt.setText(comida);

        //FIND_VIEW_BY_ID
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        lya = (LinearLayout) findViewById(R.id.lya);
        lyb = (LinearLayout) findViewById(R.id.lyb);
        lyc = (LinearLayout) findViewById(R.id.lyc);
        lyd = (LinearLayout) findViewById(R.id.lyd);
        lye = (LinearLayout) findViewById(R.id.lye);

        //SETONCLICLISTER LAYOUTS
        lya.setOnClickListener(this);
        lyb.setOnClickListener(this);
        lyc.setOnClickListener(this);
        lyd.setOnClickListener(this);
        lye.setOnClickListener(this);

        //CONDICIONALES DE LAS RECETAS
        if(txt.getText().toString().equals("Pescados")){
            //TEXTOS
            txt1.setText("PESCADO CON PAPA");
            txt2.setText("FILETE DE PESCADO A LA VERACRUZANA");
            txt3.setText("PESCADO EMPAPELADO ESPECIAL");
            txt4.setText("TIRAS DE PESCADO CAPEADO");
            txt5.setText("HAMBURGUESA CON PESCADO FRITO");
            //IMAGENES
            img1.setImageResource(R.drawable.fish_a);
            img2.setImageResource(R.drawable.fish_b);
            img3.setImageResource(R.drawable.fish_c);
            img4.setImageResource(R.drawable.fish_d);
            img5.setImageResource(R.drawable.fish_e);
        }
        else if(txt.getText().toString().equals("Pastas")){
            //TEXTOS
            txt1.setText("ESPAGUETI INTEGRAL CON BRÓCOLI Y SALSA");
            txt2.setText("PENNE AL LIMÓN");
            txt3.setText("SURIMI CON PASTA Y MANDARINA");
            txt4.setText("PASTA CON CREMA DE ESPINACA");
            txt5.setText("MOÑITOS EN SALSA PESTO CON CHÍCHAROS");
            //IMAGENES
            img1.setImageResource(R.drawable.pasta_a);
            img2.setImageResource(R.drawable.pasta_b);
            img3.setImageResource(R.drawable.pasta_c);
            img4.setImageResource(R.drawable.pasta_d);
            img5.setImageResource(R.drawable.pasta_e);
        }
        else if(txt.getText().toString().equals("Carnes")){
            //TEXTOS
            txt1.setText("TACOS DE ARRACHERA");
            txt2.setText("CARNE ASADA MARINADA ESTILO HAWAIANO");
            txt3.setText("RIB EYE TRADICIONAL");
            txt4.setText("CHORIZOS AL GRILL");
            txt5.setText("ASADO DE TIRA");
            //IMAGENES
            img1.setImageResource(R.drawable.carne_a);
            img2.setImageResource(R.drawable.carne_b);
            img3.setImageResource(R.drawable.carne_c);
            img4.setImageResource(R.drawable.carne_d);
            img5.setImageResource(R.drawable.carne_e);
        }
        else if(txt.getText().toString().equals("Postres")){
            //TEXTOS
            txt1.setText("ROLES DE CANELA Y ARÁNDANOS");
            txt2.setText("MINIPAY DE CEREZA");
            txt3.setText("DONAS DE CHOCOLATE HORNEADAS");
            txt4.setText("CHOUX");
            txt5.setText("PLÁTANOS CON CARAMELO SALADO Y GRANOLA");
            //IMAGENES
            img1.setImageResource(R.drawable.postre_a);
            img2.setImageResource(R.drawable.postre_b);
            img3.setImageResource(R.drawable.postre_c);
            img4.setImageResource(R.drawable.postre_d);
            img5.setImageResource(R.drawable.postre_e);
        }
        else if(txt.getText().toString().equals("Sopas")){
            //TEXTOS
            txt1.setText("SOPA DE TORTILLA");
            txt2.setText("SOPA DE TORTILLA TRADICIONAL");
            txt3.setText("SOPA DE MÉDULA");
            txt4.setText("SOPA CASTELLANA");
            txt5.setText("SOPA DE PAPA CON TOCINO");
            //IMAGENES
            img1.setImageResource(R.drawable.sopa_a);
            img2.setImageResource(R.drawable.sopa_b);
            img3.setImageResource(R.drawable.sopa_c);
            img4.setImageResource(R.drawable.sopa_d);
            img5.setImageResource(R.drawable.sopa_e);
        }
    }
    //Metodo para desplegar dialog
    public void showDialog(final String titulo, final String descripcion, ImageView imagen){
        AlertDialog.Builder builder = new AlertDialog.Builder(Recetas.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        builder.setView(view).setPositiveButton("Compartir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent share = new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.putExtra(Intent.EXTRA_TEXT, titulo + " " + descripcion);
                share.setType("text/plain");
                startActivity(share);
            }
        }).setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

        ImageView image_dialog = (ImageView)  view.findViewById(R.id.img_dialog);
        TextView title = (TextView) view.findViewById(R.id.title_dialog);
        TextView description = (TextView) view.findViewById(R.id.description);
        title.setText(titulo);
        description.setText(descripcion);
        image_dialog.setImageDrawable(imagen.getDrawable());
    }
    //Onclik de los layouts
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lya:
                if (txt.getText().toString().equals("Pastas")) {
                    showDialog(txt1.getText().toString(), recetas_pasta[0], img1);
                } else if (txt.getText().toString().equals("Pescados")) {
                    showDialog(txt1.getText().toString(), recetas_pescado[0], img1);
                } else if (txt.getText().toString().equals("Carnes")) {
                    showDialog(txt1.getText().toString(), recetas_carnes[0], img1);
                } else if (txt.getText().toString().equals("Postres")) {
                    showDialog(txt1.getText().toString(), recetas_postres[0], img1);
                } else if (txt.getText().toString().equals("Sopas")) {
                    showDialog(txt1.getText().toString(), getRecetas_sopas[0], img1);
                }
                break;
            case R.id.lyb:
                if (txt.getText().toString().equals("Pastas")) {
                    showDialog(txt2.getText().toString(), recetas_pasta[1], img2);
                } else if (txt.getText().toString().equals("Pescados")) {
                    showDialog(txt2.getText().toString(), recetas_pescado[1], img2);
                } else if (txt.getText().toString().equals("Carnes")) {
                    showDialog(txt2.getText().toString(), recetas_carnes[1], img2);
                } else if (txt.getText().toString().equals("Postres")) {
                    showDialog(txt2.getText().toString(), recetas_postres[1], img2);
                } else if (txt.getText().toString().equals("Sopas")) {
                    showDialog(txt2.getText().toString(), getRecetas_sopas[1], img2);
                }
                break;
            case R.id.lyc:
                if (txt.getText().toString().equals("Pastas")) {
                    showDialog(txt3.getText().toString(), recetas_pasta[2], img3);
                } else if (txt.getText().toString().equals("Pescados")) {
                    showDialog(txt3.getText().toString(), recetas_pescado[2], img3);
                } else if (txt.getText().toString().equals("Carnes")) {
                    showDialog(txt3.getText().toString(), recetas_carnes[2], img3);
                } else if (txt.getText().toString().equals("Postres")) {
                    showDialog(txt3.getText().toString(), recetas_postres[2], img3);
                } else if (txt.getText().toString().equals("Sopas")) {
                    showDialog(txt3.getText().toString(), getRecetas_sopas[2], img3);
                }
                break;
            case R.id.lyd:
                if (txt.getText().toString().equals("Pastas")) {
                    showDialog(txt4.getText().toString(), recetas_pasta[3], img4);
                } else if (txt.getText().toString().equals("Pescados")) {
                    showDialog(txt4.getText().toString(), recetas_pescado[3], img4);
                } else if (txt.getText().toString().equals("Carnes")) {
                    showDialog(txt4.getText().toString(), recetas_carnes[3], img4);
                } else if (txt.getText().toString().equals("Postres")) {
                    showDialog(txt4.getText().toString(), recetas_postres[3], img4);
                } else if (txt.getText().toString().equals("Sopas")) {
                    showDialog(txt4.getText().toString(), getRecetas_sopas[3], img4);
                }
                break;
            case R.id.lye:
                if (txt.getText().toString().equals("Pastas")) {
                    showDialog(txt5.getText().toString(), recetas_pasta[4], img5);
                } else if (txt.getText().toString().equals("Pescados")) {
                    showDialog(txt5.getText().toString(), recetas_pescado[4], img5);
                } else if (txt.getText().toString().equals("Carnes")) {
                    showDialog(txt5.getText().toString(), recetas_carnes[4], img5);
                } else if (txt.getText().toString().equals("Postres")) {
                    showDialog(txt5.getText().toString(), recetas_postres[4], img5);
                } else if (txt.getText().toString().equals("Sopas")) {
                    showDialog(txt5.getText().toString(), getRecetas_sopas[4], img5);
                }
                break;
        }
    }
}
