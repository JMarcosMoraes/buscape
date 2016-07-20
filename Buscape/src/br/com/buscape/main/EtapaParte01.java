package br.com.buscape.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.buscape.main.wrappers.EtapaWrapper;

public class EtapaParte01 {

	public static void main(String[] args) {
		
		List<EtapaWrapper> listaWrapper = criarListaWrapper();
		Collections.sort(listaWrapper);
		for (EtapaWrapper etapaWrapper : listaWrapper) {
			System.out.println(etapaWrapper.getEtapa());
		}
	}

	public static List<EtapaWrapper> criarListaWrapper(){
			List<EtapaWrapper> listaWrapper = new ArrayList<>();
			
			EtapaWrapper etapaWrapperUm = new EtapaWrapper(new Etapa("Um"), 1);
			EtapaWrapper etapaWrapperDois = new EtapaWrapper(new Etapa("Tres"), 3);
			EtapaWrapper etapaWrapperTres = new EtapaWrapper(new Etapa("Dois"), 2);
			
			listaWrapper.add(etapaWrapperUm);
			listaWrapper.add(etapaWrapperDois);
			listaWrapper.add(etapaWrapperTres);
		return listaWrapper;
	}
	

}
