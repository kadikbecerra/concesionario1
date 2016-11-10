package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DetalleVenta extends JFrame {

	private JPanel contentPane;
	private JTextField PrecioVenta;
	private JTextField CodigoFactura;
	private JTextField CodAuto;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalleVenta frame = new DetalleVenta();
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
	public DetalleVenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PrecioVenta = new JTextField();
		PrecioVenta.setBounds(125, 11, 86, 20);
		contentPane.add(PrecioVenta);
		PrecioVenta.setColumns(10);
		
		JLabel lblPrecioventa = new JLabel("PrecioVenta");
		lblPrecioventa.setBounds(20, 14, 65, 14);
		contentPane.add(lblPrecioventa);
		
		CodigoFactura = new JTextField();
		CodigoFactura.setBounds(125, 42, 86, 20);
		contentPane.add(CodigoFactura);
		CodigoFactura.setColumns(10);
		
		JLabel lblCodfactura = new JLabel("CodFactura");
		lblCodfactura.setBounds(20, 45, 65, 14);
		contentPane.add(lblCodfactura);
		
		CodAuto = new JTextField();
		CodAuto.setBounds(125, 73, 86, 20);
		contentPane.add(CodAuto);
		CodAuto.setColumns(10);
		
		JLabel lblCodauto = new JLabel("CodAuto");
		lblCodauto.setBounds(20, 76, 46, 14);
		contentPane.add(lblCodauto);
		
		textField = new JTextField();
		textField.setBounds(125, 135, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCi = new JLabel("CI");
		lblCi.setBounds(20, 138, 46, 14);
		contentPane.add(lblCi);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 104, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 107, 46, 14);
		contentPane.add(lblNombre);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(286, 41, 89, 23);
		contentPane.add(btnRegistrar);
	}

}