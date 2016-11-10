package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	
	JButton btregistrarempleado ;
	JButton btregistrarvehiculos;
	JButton btnRegistroCliente ;
	JButton btnConsultarDatos;
	JButton btnConsultarVehiculos ;
	JButton btnRepuestos ;
	JButton btnMaquinaria ;
	JButton btnVehiculos ;
	
	public VentanaPrincipal() {
		setTitle("Concesionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 593, 414);
		contentPane.add(tabbedPane);
		
		JPanel paneladmi = new JPanel();
		tabbedPane.addTab("Administrador", null, paneladmi, null);
		paneladmi.setLayout(null);
		
		btregistrarempleado = new JButton("Registrar Empleado");
		btregistrarempleado.setBounds(41, 88, 147, 31);
		paneladmi.add(btregistrarempleado);
		
		btregistrarvehiculos = new JButton("Registrar Vehiculos");
		btregistrarvehiculos.setBounds(41, 194, 147, 31);
		paneladmi.add(btregistrarvehiculos);
		
		JPanel panelvend = new JPanel();
		tabbedPane.addTab("Vendedor", null, panelvend, null);
		panelvend.setLayout(null);
		
		btnRegistroCliente = new JButton("Registro cliente");
		btnRegistroCliente.setBounds(10, 65, 135, 31);
		panelvend.add(btnRegistroCliente);
		
		btnConsultarDatos = new JButton("Consultar datos");
		btnConsultarDatos.setBounds(10, 152, 141, 31);
		panelvend.add(btnConsultarDatos);
		
		btnConsultarVehiculos = new JButton("consultar vehiculos");
		btnConsultarVehiculos.setBounds(10, 236, 135, 31);
		panelvend.add(btnConsultarVehiculos);
		
		JPanel panelmeca = new JPanel();
		tabbedPane.addTab("Mecanico", null, panelmeca, null);
		panelmeca.setLayout(null);
		
		btnRepuestos = new JButton("Repuestos");
		btnRepuestos.setBounds(41, 51, 115, 33);
		panelmeca.add(btnRepuestos);
		
		btnMaquinaria = new JButton("Maquinaria");
		btnMaquinaria.setBounds(41, 122, 115, 33);
		panelmeca.add(btnMaquinaria);
		
		btnVehiculos = new JButton("Vehiculos ");
		btnVehiculos.setBounds(41, 193, 115, 33);
		panelmeca.add(btnVehiculos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btregistrarempleado){	
			new RegistroEmpleado().setVisible(true);
		} 
		if(e.getSource()==btregistrarvehiculos){	
			new RegistroAuto().setVisible(true);
		} 
		if(e.getSource()==btnRegistroCliente){
			
		} 
		if(e.getSource()==btnConsultarDatos){	} 
		if(e.getSource()==btnConsultarVehiculos){	} 
		if(e.getSource()==btnRepuestos){	} 
		if(e.getSource()==btnMaquinaria){	} 
		if(e.getSource()==btnVehiculos){	} 
		
		
	}
}

