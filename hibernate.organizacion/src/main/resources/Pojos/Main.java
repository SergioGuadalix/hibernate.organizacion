package Pojos;
/**
 * Autor: Sergio Guadalix Romero
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws ParseException, SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// crear la conexión
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder registry = new StandardServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		registry.build();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//Crear los empleados
		Empleado empleado1 = new Empleado("Javi");
		Empleado empleado2 = new Empleado("Jose");
		Empleado empleado3 = new Empleado("Robert");
		Empleado empleado4 = new Empleado("Tatiana");
		
		Empleado empleado5 = new Empleado("Iván");
		Empleado empleado6 = new Empleado("Miriam");
		Empleado empleado7 = new Empleado("Carmelo");
		Empleado empleado8 = new Empleado("Juan");

		Empleado empleado9 = new Empleado("Cristina");
		Empleado empleado10 = new Empleado("David");
		Empleado empleado11= new Empleado("Raquel");
		Empleado empleado12= new Empleado("Sara");
		
		Empleado empleado13 = new Empleado("Cindy");
		Empleado empleado14 = new Empleado("Miguel");
		Empleado empleado15= new Empleado("Raquel");
		Empleado empleado16= new Empleado("Sergio");
		
		Empleado empleado17 = new Empleado("Rodri");
		Empleado empleado18 = new Empleado("Paloma");
		Empleado empleado19= new Empleado("Lidia");
		Empleado empleado20= new Empleado("Fran");
		
		Empleado empleado21 = new Empleado("Almudena");
		Empleado empleado22 = new Empleado("Juancar");
		Empleado empleado23= new Empleado("Juanjo");
		Empleado empleado24= new Empleado("Elisa");
		
		//Crear datos
		Empleado_datos_prof datos1 = new Empleado_datos_prof("Junior", 1500);
		Empleado_datos_prof datos2 = new Empleado_datos_prof("Junior", 10000);
		Empleado_datos_prof datos3 = new Empleado_datos_prof("Junior", 1500);
		Empleado_datos_prof datos4 = new Empleado_datos_prof("Junior", 1500);
		
		Empleado_datos_prof datos5 = new Empleado_datos_prof("Junior", 1200);
		Empleado_datos_prof datos6 = new Empleado_datos_prof("Junior", 1200);
		Empleado_datos_prof datos7 = new Empleado_datos_prof("Junior", 1500);
		Empleado_datos_prof datos8 = new Empleado_datos_prof("Senior", 2100);

		Empleado_datos_prof datos9 = new Empleado_datos_prof("Junior", 1400);
		Empleado_datos_prof datos10 = new Empleado_datos_prof("Senior", 1800);
		Empleado_datos_prof datos11= new Empleado_datos_prof("Junior", 1500);
		Empleado_datos_prof datos12= new Empleado_datos_prof("Senior", 1800);
		
		Empleado_datos_prof datos13 = new Empleado_datos_prof("Senior", 1200);
		Empleado_datos_prof datos14 = new Empleado_datos_prof("Junior", 900);
		Empleado_datos_prof datos15= new Empleado_datos_prof("Senior", 1200);
		Empleado_datos_prof datos16= new Empleado_datos_prof("Senior", 3000);
		
		Empleado_datos_prof datos17 = new Empleado_datos_prof("Senior", 1100);
		Empleado_datos_prof datos18 = new Empleado_datos_prof("Junior", 900);
		Empleado_datos_prof datos19= new Empleado_datos_prof("Senior", 1200);
		Empleado_datos_prof datos20= new Empleado_datos_prof("Junior", 800);
		
		Empleado_datos_prof datos21 = new Empleado_datos_prof("Senior", 1100);
		Empleado_datos_prof datos22 = new Empleado_datos_prof("Senior", 1200);
		Empleado_datos_prof datos23= new Empleado_datos_prof("Junior", 900);
		Empleado_datos_prof datos24= new Empleado_datos_prof("Junior", 800);
		
		//Se fija la relación entre empleados y datos
		empleado1.setDatosempleado(datos1);
		datos1.setEmpleado(empleado1);
		empleado2.setDatosempleado(datos2);
		datos2.setEmpleado(empleado2);
		empleado3.setDatosempleado(datos3);
		datos3.setEmpleado(empleado3);
		empleado4.setDatosempleado(datos4);
		datos4.setEmpleado(empleado4);
		
		empleado5.setDatosempleado(datos5);
		datos5.setEmpleado(empleado5);
		empleado6.setDatosempleado(datos6);
		datos6.setEmpleado(empleado6);
		empleado7.setDatosempleado(datos7);
		datos7.setEmpleado(empleado7);
		empleado8.setDatosempleado(datos8);
		datos8.setEmpleado(empleado8);
		
		empleado9.setDatosempleado(datos9);
		datos9.setEmpleado(empleado9);
		empleado10.setDatosempleado(datos10);
		datos10.setEmpleado(empleado10);
		empleado11.setDatosempleado(datos11);
		datos11.setEmpleado(empleado11);
		empleado12.setDatosempleado(datos12);
		datos12.setEmpleado(empleado12);
		
		empleado13.setDatosempleado(datos13);
		datos13.setEmpleado(empleado13);
		empleado14.setDatosempleado(datos14);
		datos14.setEmpleado(empleado14);
		empleado15.setDatosempleado(datos15);
		datos15.setEmpleado(empleado15);
		empleado16.setDatosempleado(datos16);
		datos16.setEmpleado(empleado16);
		
		empleado17.setDatosempleado(datos17);
		datos17.setEmpleado(empleado17);
		empleado18.setDatosempleado(datos18);
		datos18.setEmpleado(empleado18);
		empleado19.setDatosempleado(datos19);
		datos19.setEmpleado(empleado19);
		empleado20.setDatosempleado(datos20);
		datos20.setEmpleado(empleado20);
		
		empleado21.setDatosempleado(datos21);
		datos21.setEmpleado(empleado21);
		empleado22.setDatosempleado(datos22);
		datos22.setEmpleado(empleado22);
		empleado23.setDatosempleado(datos23);
		datos23.setEmpleado(empleado23);
		empleado24.setDatosempleado(datos24);
		datos24.setEmpleado(empleado24);
		
		//Crear un departamento y se le setea a sus empleados
		Departamento departamento1 = new Departamento("Informática");
		empleado1.setDepartamento(departamento1);
		empleado2.setDepartamento(departamento1);
		empleado3.setDepartamento(departamento1);
		empleado4.setDepartamento(departamento1);
		
		Departamento departamento2 = new Departamento("Finanzas");
		empleado5.setDepartamento(departamento2);
		empleado6.setDepartamento(departamento2);
		empleado7.setDepartamento(departamento2);
		empleado8.setDepartamento(departamento2);
		
		Departamento departamento3 = new Departamento("RRHH");
		empleado9.setDepartamento(departamento3);
		empleado10.setDepartamento(departamento3);
		empleado11.setDepartamento(departamento3);
		empleado12.setDepartamento(departamento3);
		
		Departamento departamento4 = new Departamento("Marketing");
		empleado13.setDepartamento(departamento4);
		empleado14.setDepartamento(departamento4);
		empleado15.setDepartamento(departamento4);
		empleado16.setDepartamento(departamento4);
		
		Departamento departamento5 = new Departamento("Ventas");
		empleado17.setDepartamento(departamento5);
		empleado18.setDepartamento(departamento5);
		empleado19.setDepartamento(departamento5);
		empleado20.setDepartamento(departamento5);
		
		Departamento departamento6 = new Departamento("Mantenimiento");
		empleado21.setDepartamento(departamento6);
		empleado22.setDepartamento(departamento6);
		empleado23.setDepartamento(departamento6);
		empleado24.setDepartamento(departamento6);
		
		//Se crean los set de empleados y se añaden los empleados creados
		Set<Empleado> empleados1 = new HashSet<Empleado>();
		empleados1.add(empleado1);
		empleados1.add(empleado2);
		empleados1.add(empleado3);
		empleados1.add(empleado4);
		
		Set<Empleado> empleados2 = new HashSet<Empleado>();
		empleados2.add(empleado5);
		empleados2.add(empleado6);
		empleados2.add(empleado7);
		empleados2.add(empleado8);
		
		Set<Empleado> empleados3 = new HashSet<Empleado>();
		empleados3.add(empleado9);
		empleados3.add(empleado10);
		empleados3.add(empleado11);
		empleados3.add(empleado12);
		
		Set<Empleado> empleados4 = new HashSet<Empleado>();
		empleados4.add(empleado13);
		empleados4.add(empleado14);
		empleados4.add(empleado15);
		empleados4.add(empleado16);
		
		Set<Empleado> empleados5 = new HashSet<Empleado>();
		empleados5.add(empleado17);
		empleados5.add(empleado18);
		empleados5.add(empleado19);
		empleados5.add(empleado20);
		
		Set<Empleado> empleados6 = new HashSet<Empleado>();
		empleados6.add(empleado21);
		empleados6.add(empleado22);
		empleados6.add(empleado23);
		empleados6.add(empleado24);
		
		//Se guarda el set de empleados en el Departamento
		departamento1.setEmpleados(empleados1);
		departamento2.setEmpleados(empleados2);
		departamento3.setEmpleados(empleados3);
		departamento4.setEmpleados(empleados4);
		departamento5.setEmpleados(empleados5);
		departamento6.setEmpleados(empleados6);
				
		//Se crea la sede y se la seteamos a los departamentos que la componen
		Sede sede1= new Sede("Madrid");
		departamento1.setSede(sede1);
		departamento2.setSede(sede1);
		departamento3.setSede(sede1);
		Sede sede2= new Sede("Barcelona");
		departamento4.setSede(sede2);
		departamento5.setSede(sede2);
		departamento6.setSede(sede2);

		//Se crea el set de departamentos y se le añaden los departamentos creados
		Set<Departamento> departamentos1 = new HashSet<Departamento>();
		departamentos1.add(departamento1);
		departamentos1.add(departamento2);
		departamentos1.add(departamento3);

		Set<Departamento> departamentos2 = new HashSet<Departamento>();
		departamentos2.add(departamento4);
		departamentos2.add(departamento5);
		departamentos2.add(departamento6);
		//Se guarda el set de departamentos en las sedes
		sede1.setDepartamentos(departamentos1);
		sede2.setDepartamentos(departamentos2);
		
		//Se crean los proyectos y los objetos de la clase Date para las fechas
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        Date fecha1 = objSDF.parse("07-02-2022"); 
        Date fecha2 = objSDF.parse("21-03-2022"); 
		Proyecto proyecto1 = new Proyecto(fecha1, fecha2,"Proyecto 1");
		Proyecto proyecto2 = new Proyecto(fecha1, fecha2, "Proyecto 2");
		Proyecto proyecto3 = new Proyecto(fecha1, fecha2,"Proyecto 3");
		Proyecto proyecto4 = new Proyecto(fecha1, fecha2,"Proyecto 4");
		Proyecto proyecto5 = new Proyecto(fecha1, fecha2,"Proyecto 5");
		Proyecto proyecto6 = new Proyecto(fecha1, fecha2,"Proyecto 6");
		
		//Se añaden los proyectos a las sedes y las sedes a los proyectos
		sede1.addProyecto(proyecto1);
		sede1.addProyecto(proyecto2);
		sede1.addProyecto(proyecto3);
		sede2.addProyecto(proyecto4);
		sede2.addProyecto(proyecto5);
		sede2.addProyecto(proyecto6);
		proyecto1.addSedes(sede1);
		proyecto2.addSedes(sede1);
		proyecto3.addSedes(sede1);
		proyecto4.addSedes(sede2);
		proyecto5.addSedes(sede2);
		proyecto6.addSedes(sede2);

		//Se persiste
		session.save(sede1);
		session.save(sede2);
		
		session.getTransaction().commit();
		
		//Comenzamos las consultas
		
		//Listado de las sedes
		Query q1 = session.createNativeQuery("SELECT sede.nom_sede, sede.sede_id FROM organizacion.sede");
		List<Object[]> datos_sede = q1.getResultList();
		System.out.println("");
		System.out.println("");
		for (Object[] sede: datos_sede) {
			System.out.println("Sede:  "+ sede[0]+ ". --> ID: "+ sede[1]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//Listado departamento
		Query q2 = session.createNativeQuery("SELECT departamento.nom_depto, departamento.departamento_id, departamento.sede_id FROM organizacion.departamento");
		List<Object[]> datos_departamento = q2.getResultList();
		System.out.println("");
		System.out.println("");
		for (Object[] departamento: datos_departamento) {
			System.out.println("Departamento:  "+ departamento[0]+ ". --> Id del departamento: "+ departamento[1]+" --> Id de la sede: "+departamento[2]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//Listado Empleados
		Query q3 = session.createNativeQuery("SELECT empleado.nom_emp, empleado.dni FROM organizacion.empleado");
		List<Object[]> datos_empleado = q3.getResultList();
		System.out.println("");
		System.out.println("");
		for (Object[] empleado: datos_empleado) {
			System.out.println("Empleado:  "+ empleado[0]+ ". --> DNI: "+ empleado[1]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//Listado proyectos
		Query q4 = session.createNativeQuery("SELECT proyecto.nom_proy, proyecto.proyecto_id FROM organizacion.proyecto");
		List<Object[]> datos_proyecto = q4.getResultList();
		System.out.println("");
		System.out.println("");
		for (Object[] proyecto: datos_proyecto) {
			System.out.println("Proyecto:  "+ proyecto[0]+ ". --> Id del proyecto: "+ proyecto[1]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//Número de empleados y proyectos por sede.
		Query q5 = session.createNativeQuery("SELECT count(distinct empleado.dni) from organizacion.empleado "
				+ "inner join organizacion.departamento on (empleado.departamento_id = departamento.departamento_id) "
				+ "where departamento.sede_id=1");
		List listResult = q5.getResultList();
		Number numero_emp = (Number) listResult.get(0);
		System.out.println("");
		System.out.println("");
		System.out.println("Número de empleados en la sede 1 = "+ numero_emp.intValue()+".");
		System.out.println("");
		System.out.println("");
		
		Query q6 = session.createNativeQuery("SELECT count(distinct proyecto.proyecto_id) from organizacion.proyecto "
				+ "inner join organizacion.proyecto_sede on (proyecto.proyecto_id = proyecto_sede.proyecto_id) "
				+ "where proyecto_sede.sede_id=1");
		List listResult2 = q6.getResultList();
		Number numero_proy = (Number) listResult2.get(0);
		System.out.println("");
		System.out.println("");
		System.out.println("Número de proyectos en la sede 1 = "+ numero_proy.intValue()+".");
		System.out.println("");
		System.out.println("");
		
		//El número de departamentos buscados por nombre.
		Query q7 = session.createNativeQuery("SELECT count(distinct departamento.departamento_id) from organizacion.departamento "
				+ "where departamento.nom_depto='RRHH'");
		List listResult3 = q7.getResultList();
		Number numero_depto = (Number) listResult3.get(0);
		System.out.println("");
		System.out.println("");
		System.out.println("Número de departamentos con nombre RRHH = "+ numero_depto.intValue()+".");
		System.out.println("");
		System.out.println("");
		
		//El empleado con mayor sueldo.
		Query q8 = session.createNativeQuery("SELECT empleado.nom_emp FROM organizacion.empleado"
				+ " inner join empleado_datos_prof on (empleado.dni = empleado_datos_prof.dni) "
				+ "where empleado_datos_prof.sueldo_bruto_anual = (select max(empleado_datos_prof.sueldo_bruto_anual) from empleado_datos_prof)");
		List listResult4 = q8.getResultList();
		String empleado_max = (String) listResult4.get(0);
		System.out.println("");
		System.out.println("");
		System.out.println("El empleado con el sueldo más alto es: "+ empleado_max+".");
		System.out.println("");
		System.out.println("");
		
		//Utilice una Query nativa para mostrar un empleado con un dni concreto.
		Query q9 = session.createNativeQuery("SELECT empleado.nom_emp, empleado.dni FROM organizacion.empleado where empleado.dni=10");
		List<Object[]> empleados_dni = q9.getResultList();
		System.out.println("");
		System.out.println("");
		for (Object[] empleado_dni: empleados_dni) {
			System.out.println("El empleado con el dni:  "+ empleado_dni[1]+ " es: "+ empleado_dni[0]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//Añada dos querys más sobre los datos, las que considere.
		//1. Empleados con un sueldo superior a 2000
		Query q10 = session.createNativeQuery("SELECT empleado.nom_emp,empleado.dni,empleado_datos_prof.sueldo_bruto_anual FROM organizacion.empleado"
				+ " inner join empleado_datos_prof on (empleado.dni = empleado_datos_prof.dni) "
				+ "where empleado_datos_prof.sueldo_bruto_anual >=2000");
		List<Object[]> empleados_sueldo_mas_2000 = q10.getResultList();
		System.out.println("");
		System.out.println("");
		System.out.println("Los empleados con un sueldo superior a 2000 son:");
		for (Object[] empleado_sueldo_mas_2000: empleados_sueldo_mas_2000) {
			System.out.println("Empleado:  "+ empleado_sueldo_mas_2000[0]+ " --> DNI: "+ empleado_sueldo_mas_2000[1]+" --> Sueldo: "+empleado_sueldo_mas_2000[2]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//2. Empleados con un sueldo inferior a 2000
		Query q11 = session.createNativeQuery("SELECT empleado.nom_emp,empleado.dni,empleado_datos_prof.sueldo_bruto_anual FROM organizacion.empleado"
				+ " inner join empleado_datos_prof on (empleado.dni = empleado_datos_prof.dni) "
				+ "where empleado_datos_prof.sueldo_bruto_anual <=2000");
		List<Object[]> empleados_sueldo_menos_2000 = q11.getResultList();
		System.out.println("");
		System.out.println("");
		System.out.println("Los empleados con un sueldo inferior a 2000 son:");
		for (Object[] empleado_sueldo_menos_2000: empleados_sueldo_menos_2000) {
			System.out.println("Empleado:  "+ empleado_sueldo_menos_2000[0]+ " --> DNI: "+ empleado_sueldo_menos_2000[1]+" --> Sueldo: "+empleado_sueldo_menos_2000[2]+".");
		}
		System.out.println("");
		System.out.println("");
		
		//Modifique el sueldo de otro empleado para que supere el sueldo del empleado con mayor sueldo y muéstrelo.
		org.hibernate.Transaction t = session.beginTransaction();
		Query q12 = session.createNativeQuery("update empleado_datos_prof set empleado_datos_prof.sueldo_bruto_anual = 200000 where empleado_datos_prof.sueldo_bruto_anual = 3000");
		int rowsAffected = q12.executeUpdate();
		t.commit();
		if (rowsAffected > 0) {
			Query q13 = session.createNativeQuery("SELECT empleado.nom_emp FROM organizacion.empleado"
					+ " inner join empleado_datos_prof on (empleado.dni = empleado_datos_prof.dni) "
					+ "where empleado_datos_prof.sueldo_bruto_anual = (select max(empleado_datos_prof.sueldo_bruto_anual) from empleado_datos_prof)");
			List listResult5 = q13.getResultList();
			String empleado_max2 = (String) listResult5.get(0);
			System.out.println("");
			System.out.println("");
			System.out.println("El empleado con el sueldo más alto es: "+ empleado_max2+".");
			System.out.println("");
			System.out.println("");
		}
		  
		//Actualice el nombre de un proyecto.
		org.hibernate.Transaction t2 = session.beginTransaction();
		Query q13 = session.createNativeQuery("update proyecto set proyecto.nom_proy = 'Proyecto DAM' where proyecto.nom_proy = 'Proyecto 6'");
		int rowsAffected2 = q13.executeUpdate();
		t2.commit();
		if (rowsAffected2 > 0) {
			Query q14 = session.createNativeQuery("SELECT proyecto.nom_proy, proyecto.proyecto_id FROM organizacion.proyecto");
			List<Object[]> datos_nuevo_proyecto = q14.getResultList();
			System.out.println("");
			System.out.println("");
			for (Object[] nuevo_proyecto: datos_nuevo_proyecto) {
				System.out.println("Proyecto:  "+ nuevo_proyecto[0]+ ". --> Id del proyecto: "+ nuevo_proyecto[1]+".");
			}
			System.out.println("");
			System.out.println("");
		}
		//Borre un departamento.
		org.hibernate.Transaction t3 = session.beginTransaction();
		Query q15 = session.createNativeQuery("delete from departamento where departamento.nom_depto = 'Ventas'");
		int rowsAffected3 = q15.executeUpdate();
		t3.commit();
		if (rowsAffected3 > 0) {
			Query q16 = session.createNativeQuery("SELECT departamento.nom_depto, departamento.departamento_id, departamento.sede_id FROM organizacion.departamento");
			List<Object[]> datos_nuevos_departamento = q16.getResultList();
			System.out.println("");
			System.out.println("");
			for (Object[] nuevo_departamento: datos_nuevos_departamento) {
				System.out.println("Departamento:  "+ nuevo_departamento[0]+ ". --> Id del departamento: "+ nuevo_departamento[1]+" --> Id de la sede: "+nuevo_departamento[2]+".");
			}
			System.out.println("");
			System.out.println("");
		}
		session.close();
	}
		

}