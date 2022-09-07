package br.com.residencia.poo.balancos;

public class BalancoAnual {

		
		private int gastosJulho = 10000;
		private int gastosAgosto = 10000;
		private int gastosSetembro = 10000;
		private int gastosOutubro = 10000;
		private int gastosNovembro = 10000;
		private int gastosDezembro = 10000;
		private int soma;
		
		public BalancoAnual(int soma) {
			this.soma = soma + gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro 
					+ gastosNovembro + gastosDezembro;
		}

		public int getSoma() {
			return soma;
		}

		public void setSoma(int soma) {
			this.soma = soma;
		}

}