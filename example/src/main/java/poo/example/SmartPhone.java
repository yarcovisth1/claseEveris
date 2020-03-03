package poo.example;

public class SmartPhone extends Celular{

	//constructor por defecto
	public SmartPhone() {
	}

	//constructor con los atributos de la clase incluso los heredados
	public SmartPhone(String marca, String modelo, String color, float pixelesCamara, float tamanioMemoriaRam,
			float tamaoDisco) {
		super(marca, modelo, color);
		///this.pixelesCamara = pixelesCamara;
		///this.tamanioMemoriaInterna = tamanioMemoriaRam;
		///this.tamanioMemoriaExterna = tamaoDisco;
	}
	// método sobrescrito (override), utilizo código de la clase Celular y añado código que necesito 
	@Override
	public void informarCaracteristicas() {
		// TODO Auto-generated method stub
		super.informarCaracteristicas();
		//System.out.println(String.format("SmartPhone calidad cámara: %s pixeles", pixelesCamara));
		//System.out.println(String.format("SmartPhone tamaño memoria interna: %s GB", tamanioMemoriaInterna));
		//System.out.println(String.format("SmartPhone tamaño memoria externa: %s GB", tamanioMemoriaExterna));
	}
	
}
