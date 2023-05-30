package dol;

import misc.controlador;

public class Balance_general extends Estado_financiero{
public void realizar() {
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("ACTIVOS");
	System.out.println("ACTIVOS CIRCULANTES");
	controlador.mostrar(a, "activo", "circulante");
	System.out.println("El total de Activos Circulantes es:"+controlador.Suma(a, "activo", "circulante"));
	System.out.println("ACTIVOS FIJOS");
    controlador.mostrar(a, "activo", "fijo");
    System.out.println("El total de Activos FIjos es:"+controlador.Suma(a, "activo", "fijos"));
    System.out.println("ACTIVOS DIFERIDOS");
    controlador.mostrar(a, "activo", "diferidos");
    System.out.println("El total de Activos Diferidos es:"+controlador.Suma(a, "activos", "diferidos"));
    System.out.println("El total de los ACTIVOS es:"+(controlador.Suma(a, "activo", "circulante")+controlador.Suma(a, "activo", "fijos")+ controlador.Suma(a, "activo", "circulante" )));
    System.out.println("-------------------------------------------------------------------------------");
	System.out.println("PASIVOS");
	System.out.println("PASIVOS CIRCULANTES");
	controlador.mostrar(a, "pasivo", "circulante");
	System.out.println("El total de pasivos Circulantes es:"+controlador.Suma(a, "pasivo", "circulante"));
	System.out.println("PASIVOS NO FIJOS");
    controlador.mostrar(a, "pasivo", "nocirculante");
    System.out.println("El total de pasivos no circulantes es:"+controlador.Suma(a, "pasivo", "nocirculante"));
   
    System.out.println("El total de los PASIVOS es:"+(controlador.Suma(a, "pasivo", "circulante")+controlador.Suma(a, "pasivo", "nocirculabte")));
    System.out.println("El capital contable es :"+((controlador.Suma(a, "activo", "circulante")+controlador.Suma(a, "activo", "fijos")+ controlador.Suma(a, "activo", "circulante" ))-(controlador.Suma(a, "pasivo", "circulante")+controlador.Suma(a, "pasivo", "nocirculabte"))) );
}
}
