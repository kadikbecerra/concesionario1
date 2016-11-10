package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistroEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField tfnombre;
	private JTextField tfapellido;
	private JTextField tfedad;
	private JTextField tfci;
	private JTextField tfdireccion;
	private JTextField tfsalario;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroEmpleado frame = new RegistroEmpleado();
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
	public RegistroEmpleado() {
		setTitle("Registro de Empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbnombre = new JLabel("Nombre");
		lbnombre.setBounds(10, 30, 46, 14);
		contentPane.add(lbnombre);
		
		JLabel lbapellido = new JLabel("Apellido");
		lbapellido.setBounds(10, 55, 46, 14);
		contentPane.add(lbapellido);
		
		JLabel lbedad = new JLabel("Edad");
		lbedad.setBounds(10, 80, 46, 14);
		contentPane.add(lbedad);
		
		JLabel lbci = new JLabel("C.I");
		lbci.setBounds(10, 105, 46, 14);
		contentPane.add(lbci);
		
		JLabel lbdireccion = new JLabel("Direccion");
		lbdireccion.setBounds(10, 130, 46, 14);
		contentPane.add(lbdireccion);
		
		tfnombre = new JTextField();
		tfnombre.setBounds(63, 27, 110, 20);
		contentPane.add(tfnombre);
		tfnombre.setColumns(10);
		
		tfapellido = new JTextField();
		tfapellido.setBounds(63, 52, 110, 20);
		contentPane.add(tfapellido);
		tfapellido.setColumns(10);
		
		tfedad = new JTextField();
		tfedad.setBounds(63, 77, 110, 20);
		contentPane.add(tfedad);
		tfedad.setColumns(10);
		
		tfci = new JTextField();
		tfci.setBounds(63, 102, 110, 20);
		contentPane.add(tfci);
		tfci.setColumns(10);
		
		tfdireccion = new JTextField();
		tfdireccion.setBounds(66, 127, 107, 20);
		contentPane.add(tfdireccion);
		tfdireccion.setColumns(10);
		
		JButton btguardar = new JButton("Guardar");
		btguardar.setBounds(342, 43, 89, 23);
		contentPane.add(btguardar);
		
		JButton btmodificar = new JButton("Modificar");
		btmodificar.setBounds(342, 146, 89, 23);
		contentPane.add(btmodificar);
		
		JButton bteliminar = new JButton("Eliminar");
		bteliminar.setBounds(342, 234, 89, 23);
		contentPane.add(bteliminar);
		
		JLabel lbsexo = new JLabel("Sexo");
		lbsexo.setBounds(10, 180, 46, 14);
		contentPane.add(lbsexo);
		
		JComboBox cboxsexo = new JComboBox();
		cboxsexo.setModel(new DefaultComboBoxModel(new String[] {"", "Femenino", "Masculino", "Otro"}));
		cboxsexo.setBounds(63, 177, 110, 20);
		contentPane.add(cboxsexo);
		
		JLabel lbsalario = new JLabel("Salario");
		lbsalario.setBounds(10, 238, 46, 14);
		contentPane.add(lbsalario);
		
		tfsalario = new JTextField();
		tfsalario.setBounds(63, 235, 110, 20);
		contentPane.add(tfsalario);
		tfsalario.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(601, 311, -599, 137);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellido", "Edad", "C.I", "Direccion", "Telefono", "Sexo", "Empleado", "Salario"
			}
		));
		table.setBounds(601, 311, -599, 137);
		contentPane.add(table);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 155, 46, 14);
		contentPane.add(lblTelefono);
		
		textField = new JTextField();
		textField.setBounds(66, 152, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setBounds(10, 213, 46, 14);
		contentPane.add(lblEmpleado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Mecanico", "Vendedor", "otro"}));
		comboBox.setBounds(63, 208, 110, 20);
		contentPane.add(comboBox);
	}
}

