package testConcursoTalento;

import com.leosssdroid.ConcursoTalentosV3.Concursante.Concursante;
import com.leosssdroid.ConcursoTalentosV3.Concursante.Malabarista;
import com.leosssdroid.ConcursoTalentosV3.Concursante.MalabaristaRecitador;
import com.leosssdroid.ConcursoTalentosV3.Concursante.Musico;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Leosss on 10/10/2016.
 */
public class TestConcursoTalentosV3 {
    private static Log logger = LogFactory.getLog("TestConcursoTalentos");
    private Concursante malabarista1;
    private Concursante malabarista2;
    private Concursante musico1;
    private Concursante musico2;
    @Before
    public void before(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        malabarista1 = (Concursante)applicationContext.getBean("malabaristaV3-1");
        malabarista2 = (Concursante)applicationContext.getBean("malabaristaV3-2");
        musico1 = (Concursante)applicationContext.getBean("jasonPiano");
        musico2 = (Concursante)applicationContext.getBean("jasonSax");
    }

    @Test
    public void testMalabarista(){
        logger.info("Inicio de ejecutar malabarista1");
        int pelotas = 5;
        malabarista1.ejecutar();
        assertEquals(pelotas, ((Malabarista)malabarista1).getPelotas());
        logger.info("Fin de la ejecución de malabarista1");

        logger.info("Inicio de ejecutar malabarista2");
        int pelotas2 = 10;
        malabarista2.ejecutar();
        assertEquals(pelotas2, ((MalabaristaRecitador)malabarista2).getPelotas());
        logger.info("Fin de la ejecución de malabarista2");

        logger.info("El músico 1 empieza a tocar...");
        String cancionPiano = "Para Elisa de Beethoven";
        musico1.ejecutar();
        assertEquals(cancionPiano, ((Musico)musico1).getCancion());
        logger.info("Fin de la canción");

        logger.info("El músico 2 empieza a tocar...");
        String cancionSax = "Jazz de Louis Armstrong";
        musico2.ejecutar();
        assertEquals(cancionSax, ((Musico)musico2).getCancion());
        logger.info("Fin de la canción");

    }
}
