package br.com.buscape.main.wrappers;

import br.com.buscape.main.Etapa;

public class EtapaWrapper implements Comparable<EtapaWrapper> {

	private Etapa etapa;
	private int sequencia;

	public EtapaWrapper(Etapa etapa, int sequencia) {
		super();
		this.etapa = etapa;
		this.sequencia = sequencia;
	}

	public int compareTo(EtapaWrapper etapa) {
		if (this.sequencia < etapa.sequencia) {
			return -1;
		} else if (this.sequencia > etapa.sequencia) {
			return 1;
		}
		return 0;
	}


	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

}
