package Ficheros;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author <Pon aquí tu nombre>
 */
public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txtBillete, txtPremio;
	private JLabel lblInfo;

	public Vista() {

		setTitle("Tarea Ficheros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 275);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBillete = new JLabel("Billete:");
		lblBillete.setBounds(10, 75, 75, 14);
		contentPane.add(lblBillete);

		JLabel lblPremio = new JLabel("Premio:");
		lblPremio.setBounds(10, 117, 75, 14);
		contentPane.add(lblPremio);

		txtBillete = new JTextField();
		txtBillete.setBounds(95, 72, 86, 20);
		contentPane.add(txtBillete);
		txtBillete.setColumns(10);

		txtPremio = new JTextField();
		txtPremio.setBounds(95, 114, 86, 20);
		contentPane.add(txtPremio);
		txtPremio.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Borra esta línea
				lblInfo.setText("Sin hacer Guardar");
			}
		});
		btnGuardar.setBounds(255, 71, 104, 23);
		contentPane.add(btnGuardar);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Borra esta línea
				lblInfo.setText("Sin hacer Borrar");
			}
		});
		btnBorrar.setBounds(255, 113, 104, 23);
		contentPane.add(btnBorrar);

		JLabel lblPto3_1 = new JLabel("3 ptos");
		lblPto3_1.setBounds(399, 75, 46, 14);
		contentPane.add(lblPto3_1);

		JLabel lbl3_2 = new JLabel("3 ptos");
		lbl3_2.setBounds(399, 117, 46, 14);
		contentPane.add(lbl3_2);

		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Borra esta línea
				lblInfo.setText("Sin hacer Comprobar");
			}
		});
		btnComprobar.setBounds(255, 155, 104, 23);
		contentPane.add(btnComprobar);

		JLabel lbl3_3 = new JLabel("4 ptos");
		lbl3_3.setBounds(399, 159, 46, 14);
		contentPane.add(lbl3_3);
		
		JLabel lblRes3 = new JLabel("Resultado:");
		lblRes3.setBounds(10, 197, 75, 14);
		contentPane.add(lblRes3);
		
		// Etiqueta para mostrar los resultados
		lblInfo = new JLabel("");
		lblInfo.setBounds(95, 197, 159, 14);
		contentPane.add(lblInfo);

	}
}
