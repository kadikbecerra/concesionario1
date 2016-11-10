package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
		
		JButton btregistrarempleado = new JButton("Registrar Empleado");
		btregistrarempleado.setBounds(41, 88, 147, 31);
		paneladmi.add(btregistrarempleado);
		
		JButton btregistrarvehiculos = new JButton("Registrar Vehiculos");
		btregistrarvehiculos.setBounds(41, 194, 147, 31);
		paneladmi.add(btregistrarvehiculos);
		
		JPanel panelvend = new JPanel();
		tabbedPane.addTab("Vendedor", null, panelvend, null);
		panelvend.setLayout(null);
		
		JButton btnRegistroCliente = new JButton("Registro cliente");
		btnRegistroCliente.setBounds(10, 65, 135, 31);
		panelvend.add(btnRegistroCliente);
		
		JButton btnConsultarDatos = new JButton("Consultar datos");
		btnConsultarDatos.setBounds(10, 152, 141, 31);
		panelvend.add(btnConsultarDatos);
		
		JButton btnConsultarVehiculos = new JButton("consultar vehiculos");
		btnConsultarVehiculos.setBounds(10, 236, 135, 31);
		panelvend.add(btnConsultarVehiculos);
		
		JPanel panelmeca = new JPanel();
		tabbedPane.addTab("Mecanico", null, panelmeca, null);
		panelmeca.setLayout(null);
		
		JButton btnRepuestos = new JButton("Repuestos");
		btnRepuestos.setBounds(41, 51, 115, 33);
		panelmeca.add(btnRepuestos);
		
		JButton btnMaquinaria = new JButton("Maquinaria");
		btnMaquinaria.setBounds(41, 122, 115, 33);
		panelmeca.add(btnMaquinaria);
		
		JButton btnVehiculos = new JButton("Vehiculos ");
		btnVehiculos.setBounds(41, 193, 115, 33);
		panelmeca.add(btnVehiculos);
	}
}

