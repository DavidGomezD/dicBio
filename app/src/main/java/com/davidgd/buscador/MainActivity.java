package com.davidgd.buscador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etBuscador;
    RecyclerView rvLista;
    AdaptadorUsuarios adaptador;

    List<Usuario> listaUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        etBuscador = findViewById(R.id.etBuscador);
        etBuscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filtrar(editable.toString());
            }
        });

        rvLista = findViewById(R.id.rvLista);
        rvLista.setLayoutManager(new GridLayoutManager(this, 1));

        listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Usuario("Atmósfera:", "Envoltura gaseosa de la Tierra (capa atmosférica). Contiene la sustancia gaseosa indispensable para la vida, como el oxígeno, el nitrógeno y el dióxido de carbono, y otras en mínimas proporciones (gas atmosférico)."));
        listaUsuarios.add(new Usuario("ATP:", "Trifosfato de adenosín, molécula esencial en los seres vivos para proporcionar energía."));
        listaUsuarios.add(new Usuario("Bacteria:", "Organismo unicelular procariota, carente de núcleo celular."));
        listaUsuarios.add(new Usuario("Biocenosis o factores bióticos:", "Conjunto de poblaciones de diferentes especies que habitan una zona geográfica determinada y que se ve influenciada por los factores físicos."));
        listaUsuarios.add(new Usuario("Biopiratería:", "Práctica en la cual, individuos, investigadores, instituciones o empresas, utilizan ilegalmente la biodiversidad de países en desarrollo para implementar por medio de la biotecnología, productos y servicios de los que se obtienen ganancias y patentes de uso exclusivo, sin autorización de los pueblos indígenas o campesinos que han utilizado de forma tradicional la diversidad biológica."));
        listaUsuarios.add(new Usuario("Bioprospección:", "Búsqueda e investigación sobre diversas formas de vida, con el propósito de evaluar sus potencialidades para obtener sustancias variadas que pueden redituar en beneficios económicos para sectores de diversas industrias e instituciones de investigación médica y biotecnológica."));
        listaUsuarios.add(new Usuario("Biosfera:", "Parte de la corteza terrestre en la cual es posible la vida."));
        listaUsuarios.add(new Usuario("Biotopo o factores abióticos:", "Conformado por factores químicos o físicos que afectan el ecosistema, pero que a diferencia de los bióticos, no tienen vida. Por ejemplo, la luz, el agua, la humedad, minerales, el aire, la temperatura y el suelo. Éstos influyen directamente en las comunidades que los habitan."));
        listaUsuarios.add(new Usuario("Cdks:", "Quinasas dependientes de las ciclinas, son enzimas que regulan el ciclo celular."));
        listaUsuarios.add(new Usuario("Centrómero:", "Estructura que mantiene unidas las cromátidas."));
        listaUsuarios.add(new Usuario("Clorofluorocarbonos (CFC):", "Hidrocarburos en los cuales los átomos de hidrógeno han sido sustituidos, totalmente o en parte, por átomos de Cloro y de Flúor."));
        listaUsuarios.add(new Usuario("Convección:", "Forma de propagación del calor de los líquidos y gases. Se produce por una traslación de las partículas, en el interior del fluido, debido a las diferencias de densidad. En términos geológicos es el movimiento vertical de las partículas de una masa de aire."));
        listaUsuarios.add(new Usuario("Covalente:", "Enlace que se forma cuando dos átomos comparten uno o más pares de electrones. La condición para que el enlace tenga un elevado carácter covalente es que la diferencia de electronegatividad entre ambos átomos sea cero o muy pequeña."));
        listaUsuarios.add(new Usuario("Cromátida:", "Dos hebras idénticas de DNA que forman un cromosoma doble."));
        listaUsuarios.add(new Usuario("Deriva génica:", "Cambio en la frecuencia de los alelos de una población debido a procesos aleatorios que pueden ser causados por el efecto fundador y el denominado “efecto cuello de botella”."));
        listaUsuarios.add(new Usuario("Diploide:", "Célula que presenta pares de cromosomas homólogos."));
        listaUsuarios.add(new Usuario("Diversidad de especies:", "Considera a la diversidad de formas de vida que existen en el planeta tales como bacterias, protistas, plantas y animales entre otras."));
        listaUsuarios.add(new Usuario("Diversidad ecológica:", "Variedad de ecosistemas propios de paisajes y regiones de todo nuestro planeta, tales como selvas, bosques, mares, entre otros."));
        listaUsuarios.add(new Usuario("Diversidad genética:", "Incluye a la diversidad de genes y características hereditarias que existen en una sola especie."));
        listaUsuarios.add(new Usuario("Ecosistema:", "Considerado como la unidad básica de la ecología y abarca todas las interacciones entre los organismos que viven juntos en un sitio particular y entre dichos organismos y sus ambientes abióticos."));
        listaUsuarios.add(new Usuario("Endemismo:", "Especies que tienen su distribución restringida a un territorio determinado, como puede ser el de un país, región, una sierra montañosa, cueva, lago, río, entre otros."));
        listaUsuarios.add(new Usuario("Especiación alopátrica:", "Poblaciones que quedan aisladas por barreras geográficas que impiden el flujo genético entre ellas. Divergen genéticamente y están sometidas a distintos procesos de selección natural y deriva génica, que las conduce a la formación de nuevas especies."));
        listaUsuarios.add(new Usuario("Especiación simpátrica:", "Poblaciones de una misma especie, que ocupan un mismo ambiente o región, se diversifican originando nuevas especies, debido a mecanismos de aislamiento distintos a las barreras geográficas, que pueden ser de tipo ecológico o por el efecto de mutaciones cromosómicas."));
        listaUsuarios.add(new Usuario("FAD:", "Flavín adenín dinucleótido, coenzima que interviene en el metabolismo oxidativo."));
        listaUsuarios.add(new Usuario("Genómica:", "Estudio del contenido, organización, función y evolución del genoma."));
        listaUsuarios.add(new Usuario("Haploide:", "Célula que sólo tiene uno de los cromosomas homólogos."));
        listaUsuarios.add(new Usuario("Hidrometeorología:", "Ciencia climática que reúne teorías y estudios de otras tantas ciencias como la meteorología, la climatología, se influencia de aspectos químicos y físicos y se enfoca principalmente en el estudio del agua de la tierra."));
        listaUsuarios.add(new Usuario("Leguminosa:", "Plantas dicotiledóneas (hierbas, matas, arbustos y árboles) de flores con corola amariposada, agrupadas en racimos o en espigas, con diez estambres, libres o unidos por sus filamentos, y fruto casi siempre en legumbre."));
        listaUsuarios.add(new Usuario("Locus:", "Lugar que ocupa un gen en un cromosoma."));
        listaUsuarios.add(new Usuario("Manglares:", "Formación vegetal leñosa, densa, arbórea o arbustiva de 1 a 30 metros de altura, compuesta por una o varias especies de mangle y con poca presencia de especies herbáceas y enredaderas."));
        listaUsuarios.add(new Usuario("Migración:", "Movimiento de individuos de la misma especie hacia fuera o dentro de una población, lo que promueve el flujo génico."));
        listaUsuarios.add(new Usuario("Miopatía:", "Enfermedad del tejido muscular."));
        listaUsuarios.add(new Usuario("Mutación:", "Cualquier cambio heredable en la secuencia del DNA de un gene o un cromosoma o inclusive, del genoma de una especie. La mutación es una de las fuentes de variabilidad biológica."));
        listaUsuarios.add(new Usuario("NAD:", "Nicotidamina adenín dinucleótido, coenzima importante en el metabolismo energético."));
        listaUsuarios.add(new Usuario("Nitrosoma sp:", "Comprende bacterias en forma de varilla quimioautotróficas. Esta bacteria rara oxida amoníaco en nitrito como un proceso metabólico."));
        listaUsuarios.add(new Usuario("Ozono:", "Sustancia cuya molécula está compuesta por tres átomos de oxígeno (O3), formada al disociarse los dos átomos que componen el gas de oxígeno."));
        listaUsuarios.add(new Usuario("País megadiverso:", "Países poseedores de gran parte de la diversidad de plantas y animales del mundo. Como ejemplo de estos países están México, Colombia, Ecuador, Madagascar, India, Malasia, Indonesia y Australia entre otros."));
        listaUsuarios.add(new Usuario("Peptidoglucano:", "Componente de las paredes celulares procariontes, formado por cadenas cortas de azúcares unidas a aminoácidos."));
        listaUsuarios.add(new Usuario("pH:", "Escala que indica el grado de acidez o basicidad de una solución, éste se mide por la concentración del ión hidrógeno; los valores de pH están comprendidos en una escala de 0 a 14, el valor medio es 7; el cual corresponde a solución neutra."));
        listaUsuarios.add(new Usuario("Proteómica:", "Estudia y compara las proteínas presentes en las células."));
        listaUsuarios.add(new Usuario("Quimioautotróficos:", "Organismos que utilizan la energía resultante de la ruptura de enlaces químicos de compuestos inorgánicos para sintetizar sustancias orgánicas, usando el dióxido de carbono como fuente de carbono."));
        listaUsuarios.add(new Usuario("Saprófitos:", "Seres vivos que se caracterizan por llevar principalmente una dieta a base de residuos o sustancias descompuestas. Es decir se alimentan a base de excrementos, animales muertos y hojas secas, entre otros."));
        listaUsuarios.add(new Usuario("Selección natural:", "Proceso de interacción entre los organismos y su ambiente que favorece la reproducción diferencial de los genotipos presentes en una población y que como consecuencia de ello, dará lugar con el tiempo, a la adaptación."));
        listaUsuarios.add(new Usuario("Servicios ecosistémicos:", "Beneficios que recibimos de nuestros ecosistemas ya sea de manera natural o por medio de su manejo."));
        listaUsuarios.add(new Usuario("Simbiosis:", "Asociación de organismos de especies diferentes para beneficiarse mutuamente en su desarrollo vital."));
        listaUsuarios.add(new Usuario("Sustentabilidad:", "Habilidad de lograr una prosperidad económica sostenida en el tiempo protegiendo al mismo tiempo los sistemas naturales del planeta y proveyendo una alta calidad de vida para las personas."));

        adaptador = new AdaptadorUsuarios(MainActivity.this, listaUsuarios);
        rvLista.setAdapter(adaptador);
    }

    public void filtrar(String texto) {
        ArrayList<Usuario> filtrarLista = new ArrayList<>();

        for(Usuario usuario : listaUsuarios) {
            if(usuario.getPalabra().toLowerCase().contains(texto.toLowerCase())) {
                filtrarLista.add(usuario);
            }
        }

        adaptador.filtrar(filtrarLista);
    }
}