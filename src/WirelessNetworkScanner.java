// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.net.NetworkInterface;
// import java.net.SocketException;
// import java.util.Enumeration;

// public class WirelessNetworkScanner extends JFrame {

//     private DefaultListModel<String> networkListModel;
//     private JList<String> networkList;

//     public WirelessNetworkScanner() {
//         setTitle("Wireless Network Scanner");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         networkListModel = new DefaultListModel<>();
//         networkList = new JList<>(networkListModel);

//         JScrollPane scrollPane = new JScrollPane(networkList);
//         getContentPane().add(scrollPane, BorderLayout.CENTER);

//         JButton connectButton = new JButton("Connect");
//         connectButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 String selectedNetwork = networkList.getSelectedValue();
//                 if (selectedNetwork != null) {
//                     connectToNetwork(selectedNetwork);
//                 }
//             }
//         });
//         getContentPane().add(connectButton, BorderLayout.SOUTH);

//         pack();
//         setLocationRelativeTo(null);
//     }

//     public void scanWirelessNetworks() {
//         try {
//             Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
//             while (networkInterfaces.hasMoreElements()) {
//                 NetworkInterface networkInterface = networkInterfaces.nextElement();
//                 String interfaceName = networkInterface.getName();
//                 if (isWirelessInterface(networkInterface)) {
//                     addNetworkInterfaceToList(interfaceName);
//                 }
//             }
//         } catch (SocketException ex) {
//             ex.printStackTrace();
//         }
//     }

//     public boolean isWirelessInterface(NetworkInterface networkInterface) {
//         String interfaceName = networkInterface.getName();
//         return interfaceName.contains("wlan") || interfaceName.contains("wifi");
//     }

//     public void addNetworkInterfaceToList(String interfaceName) {
//         networkListModel.addElement(interfaceName);
//     }

//     public void connectToNetwork(String networkName) {
//         System.out.println("Connecting to network: " + networkName);
//     }
// }

