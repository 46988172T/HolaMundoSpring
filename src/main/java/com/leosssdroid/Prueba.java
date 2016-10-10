package com.leosssdroid;

import com.leosssdroid.ConcursoTalentosV1.Concursante.Concursante;
import com.leosssdroid.ProyectoInterpreteV1.InterpreteEs;
import com.leosssdroid.ProyectoInterpreteV1.Traductor;
import com.leosssdroid.ProyectoInterpreteV2.InterpreteEspanol;
import com.leosssdroid.ProyectoInterpreteV2.TraductorSpring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leosss on 09/10/2016.
 * ---------EJERCICIO 2 HOLAMUNDO --------
 */
public class Prueba {
    public static void main(String[] args) {

        /* HOLAMUNDO con SPRING
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory bf = applicationContext;
        HolaMundo bean = (HolaMundo)bf.getBean("holaMundo");
        System.out.println(bean.getMensaje());
        */

        /* INTERPRETE v1
        Traductor traductor = new Traductor();
        InterpreteEs interpreteEs = new InterpreteEs();

        traductor.setInterpreteEs(interpreteEs);
        traductor.setNombre("Marcos");
        traductor.hablar();
        */

        /* INTERPRETE v2 (con Spring)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory bf = applicationContext;
        TraductorSpring iesBean = (TraductorSpring) bf.getBean("traductorEspanol");
        iesBean.hablar();
        TraductorSpring ienBean = (TraductorSpring) bf.getBean("traductorIngles");
        ienBean.hablar();
        */

        /* ConcursoTalentoV1
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory bf = applicationContext;
        Concursante malabarista = (Concursante)applicationContext.getBean("malabarista");
        malabarista.ejecutar();
        */

        /* ConcursoTalentoV2*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory bf = applicationContext;
        Concursante malabarista = (Concursante)applicationContext.getBean("malabarista");
        malabarista.ejecutar();


    }
}
