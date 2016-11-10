package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroAuto extends JFrame {

	private JPanel contentPane;
	private JTextField Codauto;
	private JTextField Modelo;
	private JTextField Estado;
	private JTextField Fecha;
	private JTextField PrecioVenta;
	private JTextField PrecioCompra;
	private JTextField Placa;
	private JTextField Cantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroAuto frame = new RegistroAuto();
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
	public RegistroAuto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Codauto = new JTextField();
		Codauto.setBounds(129, 11, 86, 20);
		contentPane.add(Codauto);
		Codauto.setColumns(10);
		
		JLabel lblCodauto = new JLabel("Codauto");
		lblCodauto.setBounds(27, 14, 46, 14);
		contentPane.add(lblCodauto);
		
		Modelo = new JTextField();
		Modelo.setBounds(129, 42, 86, 20);
		contentPane.add(Modelo);
		Modelo.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(27, 45, 46, 14);
		contentPane.add(lblModelo);
		
		Estado = new JTextField();
		Estado.setBounds(129, 225, 86, 20);
		contentPane.add(Estado);
		Estado.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(27, 231, 46, 14);
		contentPane.add(lblEstado);
		
		Fecha = new JTextField();
		Fecha.setBounds(129, 104, 86, 20);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		JLabel lblFechaentrega = new JLabel("FechaEntrega");
		lblFechaentrega.setBounds(27, 107, 80, 14);
		contentPane.add(lblFechaentrega);
		
		PrecioVenta = new JTextField();
		PrecioVenta.setBounds(129, 135, 86, 20);
		contentPane.add(PrecioVenta);
		PrecioVenta.setColumns(10);
		
		JLabel lblPrecioventa = new JLabel("PrecioVenta");
		lblPrecioventa.setBounds(27, 138, 80, 14);
		contentPane.add(lblPrecioventa);
		
		PrecioCompra = new JTextField();
		PrecioCompra.setBounds(129, 166, 86, 20);
		contentPane.add(PrecioCompra);
		PrecioCompra.setColumns(10);
		
		JLabel lblPreciocompra = new JLabel("PrecioCompra");
		lblPreciocompra.setBounds(27, 169, 80, 14);
		contentPane.add(lblPreciocompra);
		
		Placa = new JTextField();
		Placa.setBounds(129, 197, 86, 20);
		contentPane.add(Placa);
		Placa.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(27, 200, 46, 14);
		contentPane.add(lblPlaca);
		
		Cantidad = new JTextField();
		Cantidad.setBounds(129, 73, 86, 20);
		contentPane.add(Cantidad);
		Cantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(27, 76, 46, 14);
		contentPane.add(lblCantidad);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(296, 41, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(296, 72, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(296, 103, 89, 23);
		contentPane.add(btnInsertar);
	}
}