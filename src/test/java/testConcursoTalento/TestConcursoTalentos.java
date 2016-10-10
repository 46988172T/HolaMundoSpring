package testConcursoTalento;

import com.leosssdroid.ConcursoTalentosV2.Concursante.Concursante;
import com.leosssdroid.ConcursoTalentosV2.Concursante.Malabarista;
import com.leosssdroid.ConcursoTalentosV2.Concursante.MalabaristaRecitador;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;


/**
 * Created by Leosss on 10/10/2016.
 */
public class TestConcursoTalentos {
    private static Log logger = LogFactory.getLog("TestConcursoTalentos");
    private Concursante malabarista1;
    private Concursante malabarista2;
    @Before
    public void before(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        malabarista1 = (Concursante)applicationContext.getBean("malabarista1");
        malabarista2 = (Concursante)applicationContext.getBean("malabarista2");
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
    }
}
