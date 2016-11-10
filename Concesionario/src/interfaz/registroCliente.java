package interfaz;

//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

public class registroCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	JPanel panelRergistroCliente;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public registroCliente() {
		setLayout(null);
		panelRergistroCliente=new JPanel();
		panelRergistroCliente.setLayout(null);
		panelRergistroCliente.setBounds(100, 100, 1000 ,1400);
		panelRergistroCliente.setBackground(Color.red);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(26, 56, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(26, 98, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setBounds(26, 179, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(26, 225, 46, 14);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(88, 53, 118, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 95, 118, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 176, 118, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 222, 118, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setBounds(26, 264, 89, 23);
		add(btnNewButton);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(178, 264, 89, 23);
		add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(334, 264, 89, 23);
		add(btnEliminar);
		
		JLabel lblCi = new JLabel("C.I");
		lblCi.setBounds(26, 139, 46, 14);
		add(lblCi);
		
		textField_4 = new JTextField();
		textField_4.setBounds(88, 136, 118, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSexo = new JLabel("sexo");
		lblSexo.setBounds(377, 77, 46, 14);
		add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "FEMENINO", "MASCULINO"}));
		comboBox.setBounds(238, 74, 110, 20);
		add(comboBox);

	}
}

