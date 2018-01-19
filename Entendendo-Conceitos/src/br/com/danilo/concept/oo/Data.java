package br.com.danilo.concept.oo;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	int max[] = new int[12];
	
	public Data(int dia, int mes, int ano) {
		max[1] = 31;
		max[2] = 28;
		max[3] = 31;
		max[4] = 30;
		max[5] = 31;
		max[6] = 30;
		max[7] = 31;
		max[8] = 31;
		max[9] = 30;
		max[10] = 31;
		max[11] = 30;
		max[12] = 31;
		
		if(mes <= 12 && max[mes] <= dia) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else {
			System.out.println("Não foi possível definir a data!");
			System.out.println("Por favor insira uma data valida!");
		}
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getDataFormatada() {
		return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
	}
	
	/* Solução do Desafio 3 */
	private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao são 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            ultimoDiaDoMes = 28;
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                ultimoDiaDoMes = 29;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }
}
