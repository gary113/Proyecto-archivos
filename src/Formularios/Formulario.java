package Formularios;

import Clases.ObtenerLista;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario extends javax.swing.JFrame {

    public ArrayList<String> listados;
    DefaultTableModel tabla;

    private void iniciarTabla() {
        tabla = new DefaultTableModel();
        String columnas[] = {"Nombre del archivo", "Tamaño (MB)", "Ruta"};
        for (String columna : columnas) {
            tabla.addColumn(columna);
        }

        frmTabla.setModel(tabla);

        frmTabla.getColumnModel().getColumn(0).setPreferredWidth(150);
        frmTabla.getColumnModel().getColumn(1).setPreferredWidth(50);
        frmTabla.getColumnModel().getColumn(2).setPreferredWidth(250);
    }

    private void listarJlist(ArrayList<String> listaSeleccionados) {
        DefaultListModel<String> modeloJlist = new DefaultListModel<>();
        listaSeleccionados.forEach((seleccionado) -> {
            modeloJlist.addElement(seleccionado.substring(seleccionado.lastIndexOf("\\") + 1));
        });
        JlistSeleccionados.setModel(modeloJlist);
    }

    public Formulario() {
        initComponents();
        listados = new ArrayList<>();
        iniciarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtEstado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        frmTabla = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        txtInformacion = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnExaminar = new javax.swing.JButton();
        btnSeleccionarTodo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistSeleccionados = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        txtEstado2 = new javax.swing.JLabel();
        btnQuitarTodo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnMoverTodo = new javax.swing.JButton();
        txtDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExaminar2 = new javax.swing.JButton();
        btnCopiarTodo = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de archivos");
        setResizable(false);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtEstado.setText("Esperando una búsqueda");

        frmTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        frmTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmTablaMouseClicked(evt);
            }
        });
        frmTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frmTablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(frmTabla);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel3.setText("Ruta:");

        txtRuta.setText("C:\\");
            txtRuta.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtRutaActionPerformed(evt);
                }
            });

            txtInformacion.setText("Esperando una búsqueda");

            btnSeleccionar.setText("Listar");
            btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSeleccionarActionPerformed(evt);
                }
            });

            btnExaminar.setText("Examinar");
            btnExaminar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnExaminarActionPerformed(evt);
                }
            });

            btnSeleccionarTodo.setText("Listar todo");
            btnSeleccionarTodo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSeleccionarTodoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtInformacion))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnSeleccionar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSeleccionarTodo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                            .addComponent(txtNombre))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnExaminar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))))
                            .addGap(0, 18, Short.MAX_VALUE))))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnExaminar, javax.swing.GroupLayout.Alignment.LEADING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtInformacion)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeleccionar)
                            .addComponent(btnSeleccionarTodo)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtEstado)
                    .addContainerGap())
            );

            jTabbedPane1.addTab("Busqueda", jPanel2);

            JlistSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    JlistSeleccionadosMouseClicked(evt);
                }
            });
            JlistSeleccionados.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    JlistSeleccionadosKeyPressed(evt);
                }
            });
            jScrollPane2.setViewportView(JlistSeleccionados);

            jLabel2.setText("Archivos listados:");

            btnQuitar.setText("Quitar");
            btnQuitar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnQuitarActionPerformed(evt);
                }
            });

            txtEstado2.setText("Esperando operación");

            btnQuitarTodo.setText("Limpiar lista");
            btnQuitarTodo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnQuitarTodoActionPerformed(evt);
                }
            });

            btnAbrir.setText("Abrir archivo");
            btnAbrir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAbrirActionPerformed(evt);
                }
            });

            btnMoverTodo.setText("Mover todo");
            btnMoverTodo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnMoverTodoActionPerformed(evt);
                }
            });

            jLabel4.setText("Destino:");

            btnExaminar2.setText("Examinar");
            btnExaminar2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnExaminar2ActionPerformed(evt);
                }
            });

            btnCopiarTodo.setText("Copiar todo");
            btnCopiarTodo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCopiarTodoActionPerformed(evt);
                }
            });

            btnEliminarTodo.setText("Eliminar todo");
            btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarTodoActionPerformed(evt);
                }
            });

            jLabel5.setText("Operaciones en la lista:");

            jLabel6.setText("Operaciones con los archivos");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtEstado2))
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnExaminar2))
                                        .addComponent(txtDestino, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(28, 28, 28))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSeparator1)
                                    .addContainerGap())
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnMoverTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCopiarTodo)
                                    .addGap(105, 105, 105))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnQuitarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEliminarTodo)
                                                .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstado2)
                    .addGap(9, 9, 9))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAbrir))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnQuitarTodo)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCopiarTodo)
                        .addComponent(btnMoverTodo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExaminar2)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnEliminarTodo)
                    .addGap(27, 27, 27))
            );

            jTabbedPane1.addTab("Listado de archivos", jPanel1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
            );

            getAccessibleContext().setAccessibleName("Manejo de Archivos");

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        listados = new ArrayList<>();
        listarJlist(listados);
        txtDestino.setText("");

        String ruta = txtRuta.getText();
        String nombre = txtNombre.getText();
        if (!"\\".equals(ruta.substring(ruta.length() - 2))) {
            ruta += "\\";
        }

        ObtenerLista Lista = new ObtenerLista();
        String temp = ruta;

        long tiempoInicial = System.currentTimeMillis();

        while (!"&%@#".equals(temp)) {
            File dir = new File(temp);
            String[] directorios = dir.list();
            if (directorios != null) {
                for (String nomb : directorios) {
                    if (new File(temp + nomb).isDirectory()) {  //Si es una carpeta
                        Lista.push(temp + nomb + "\\");
                    } else if (new File(temp + nomb).isFile() && nomb.contains(nombre)) {  //Si es un archivo y concuerda contiene el nombre
                        Lista.rutasEncontradas.add(temp + nomb);
                    }
                }
            }
            temp = Lista.pop();
        }

        if (Lista.rutasEncontradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            long tiempoFinal = System.currentTimeMillis() - tiempoInicial;

            iniciarTabla();

            DecimalFormat df = new DecimalFormat("0.000"); //Para tener 3 decimales

            for (int i = 0; i < Lista.rutasEncontradas.size(); i++) {
                File archivo = new File(Lista.rutasEncontradas.get(i));
                Object datos[] = new Object[3];
                datos[0] = archivo.getName();
                datos[1] = df.format(archivo.length() * 1.0 / 1024000);
                datos[2] = archivo.getAbsolutePath();
                tabla.addRow(datos);
            }

            frmTabla.setModel(tabla);
            txtInformacion.setText(Lista.rutasEncontradas.size() + " Resultados en " + df.format(tiempoFinal * 1.0 / 1000) + " segundos");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void frmTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmTablaMouseClicked
        int fila = frmTabla.getSelectedRow();
        String ruta = frmTabla.getValueAt(fila, 2).toString();
        txtEstado.setText(ruta);
    }//GEN-LAST:event_frmTablaMouseClicked

    private void JlistSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlistSeleccionadosMouseClicked
        if (!listados.isEmpty()) {
            int elemento = JlistSeleccionados.getSelectedIndex();
            txtEstado2.setText(listados.get(elemento));
        }
    }//GEN-LAST:event_JlistSeleccionadosMouseClicked

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if (!listados.isEmpty() && JlistSeleccionados.getSelectedIndex() != -1) {
            int seleccionado = JlistSeleccionados.getSelectedIndex();
            txtEstado2.setText("Se ha borrado el archivo " + listados.get(seleccionado) + " de la lista");
            listados.remove(seleccionado);
            listarJlist(listados);
        } else {
            JOptionPane.showMessageDialog(null, "No hay archivos seleccionados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnQuitarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTodoActionPerformed
        if (!listados.isEmpty()) {
            listados = new ArrayList<>();
            listarJlist(listados);
            txtEstado2.setText("Se han borrado todos los archivos de la lista");
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarTodoActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int fila = frmTabla.getSelectedRow();
        String ruta = frmTabla.getValueAt(fila, 2).toString();
        if (!listados.contains(ruta)) {
            listados.add(ruta);
            txtEstado.setText("Se ha listado la ruta del archivo: " + ruta.substring(ruta.lastIndexOf("\\") + 1));
        } else {
            txtEstado.setText("Esa ruta ya se ha listado");
        }
        listarJlist(listados);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        JFileChooser Examinador = new JFileChooser();
        Examinador.setCurrentDirectory(new File("D:\\"));
        Examinador.setDialogTitle("Elija la carpeta donde desea buscar");
        Examinador.setFileSelectionMode(1);
        Examinador.setApproveButtonText("Seleccionar");
        if (Examinador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            txtRuta.setText(Examinador.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void frmTablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frmTablaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSeleccionar.doClick();
        }
    }//GEN-LAST:event_frmTablaKeyPressed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (!listados.isEmpty() && JlistSeleccionados.getSelectedIndex() != -1) {
            try {
                File arch = new File(listados.get(JlistSeleccionados.getSelectedIndex()));
                Desktop.getDesktop().open(arch);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex, "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado un archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void JlistSeleccionadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JlistSeleccionadosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            btnQuitar.doClick();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAbrir.doClick();
        }
    }//GEN-LAST:event_JlistSeleccionadosKeyPressed

    private void btnExaminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminar2ActionPerformed
        JFileChooser Examinador = new JFileChooser();
        Examinador.setCurrentDirectory(new File(txtRuta.getText()));
        Examinador.setDialogTitle("Seleccione la carpeta a donde desea mover sus archivos");
        Examinador.setFileSelectionMode(1);
        Examinador.setApproveButtonText("Seleccionar");
        if (Examinador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            txtDestino.setText(Examinador.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnExaminar2ActionPerformed

    private void btnSeleccionarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTodoActionPerformed
        if (frmTabla.getRowCount() > 0) {
            for (int i = 0; i < frmTabla.getRowCount(); i++) {
                String ruta = frmTabla.getValueAt(i, 2).toString();
                if (!listados.contains(ruta)) {
                    listados.add(ruta);
                }
            }
            txtEstado.setText("Se han listado todos los archivos");
            listarJlist(listados);
        } else {
            JOptionPane.showMessageDialog(null, "No hay archivos para listar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarTodoActionPerformed

    private void btnMoverTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverTodoActionPerformed
        if ("".equals(txtDestino.getText())) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un destino", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (listados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea mover todo?", "Elija una opción", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            boolean error = false;
            ArrayList<String> errores = new ArrayList<>();

            if (resp == 0) {
                String rutaDestino = txtDestino.getText();
                if (!"\\".equals(rutaDestino.substring(rutaDestino.length() - 2))) {
                    rutaDestino += "\\";
                }
                for (String seleccionado : listados) {
                    Path origenPath = FileSystems.getDefault().getPath(seleccionado);
                    Path destinoPath = FileSystems.getDefault().getPath(rutaDestino + seleccionado.substring(seleccionado.lastIndexOf("\\")));
                    try {
                        Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        Date fecha = new Date();
                        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        errores.add(formato.format(fecha) + " --- Error: " + e);
                        error = true;
                    }
                }
            }

            if (error == false) {
                txtEstado2.setText("Operación realizada con éxito");
            } else {
                txtEstado2.setText("Ocurrieron algunos errores");
                File archivo = new File("Errores.txt");
                FileWriter escribir;
                PrintWriter linea;

                if (archivo.exists() == true) {
                    try {
                        escribir = new FileWriter(archivo, false);
                        linea = new PrintWriter(escribir);
                        for (int i = 0; i < errores.size(); i++) {
                            linea.println(errores.get(i));
                        }

                        linea.close();
                        escribir.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    try {
                        archivo.createNewFile();
                        escribir = new FileWriter(archivo, false);
                        linea = new PrintWriter(escribir);

                        for (int i = 0; i < errores.size(); i++) {
                            linea.println(errores.get(i));
                        }

                        linea.close();
                        escribir.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(null, "Algunos archivos no pudieron ser movidos\nRevise el archivo Errores.txt generado", "Error", JOptionPane.ERROR_MESSAGE);
                //Abrir errores.txt
                try {
                    Desktop.getDesktop().open(archivo);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            listados = new ArrayList<>();
            listarJlist(listados);
            txtDestino.setText("");
        }
    }//GEN-LAST:event_btnMoverTodoActionPerformed

    private void btnCopiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarTodoActionPerformed
        if ("".equals(txtDestino.getText())) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un destino", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (listados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea copiar todo?", "Elija una opción", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            boolean error = false;
            ArrayList<String> errores = new ArrayList<>();

            if (resp == 0) {
                String rutaDestino = txtDestino.getText();
                if (!"\\".equals(rutaDestino.substring(rutaDestino.length() - 2))) {
                    rutaDestino += "\\";
                }
                for (String seleccionado : listados) {
                    Path origenPath = FileSystems.getDefault().getPath(seleccionado);
                    Path destinoPath = FileSystems.getDefault().getPath(rutaDestino + seleccionado.substring(seleccionado.lastIndexOf("\\")));
                    try {
                        Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        Date fecha = new Date();
                        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        errores.add(formato.format(fecha) + " --- Error: " + e);
                        error = true;
                    }
                }
            }

            if (error == false) {
                txtEstado2.setText("Operación realizada con éxito");
            } else {
                txtEstado2.setText("Ocurrieron algunos errores");
                File archivo = new File("Errores.txt");
                FileWriter escribir;
                PrintWriter linea;

                if (archivo.exists() == true) {
                    try {
                        escribir = new FileWriter(archivo, false);
                        linea = new PrintWriter(escribir);
                        for (int i = 0; i < errores.size(); i++) {
                            linea.println(errores.get(i));
                        }

                        linea.close();
                        escribir.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    try {
                        archivo.createNewFile();
                        escribir = new FileWriter(archivo, false);
                        linea = new PrintWriter(escribir);

                        for (int i = 0; i < errores.size(); i++) {
                            linea.println(errores.get(i));
                        }

                        linea.close();
                        escribir.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(null, "Algunos archivos no pudieron ser copiados\nRevise el archivo Errores.txt generado", "Error", JOptionPane.ERROR_MESSAGE);
                //Abrir Errores.txt
                try {
                    Desktop.getDesktop().open(archivo);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            listados = new ArrayList<>();
            listarJlist(listados);
            txtDestino.setText("");
        }
    }//GEN-LAST:event_btnCopiarTodoActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        if (listados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea borrar todo? \nESTO NO SE PODRÁ DESHACER", "Elija una opción", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            boolean error = false;
            ArrayList<String> errores = new ArrayList<>();
            if (resp == 0) {
                for (String seleccionado : listados) {
                    Path ruta = FileSystems.getDefault().getPath(seleccionado);
                    try {
                        Files.delete(ruta);
                    } catch (IOException e) {
                        Date fecha = new Date();
                        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        errores.add(formato.format(fecha) + " --- Error: " + e);
                        error = true;
                    }
                }

                if (error == false) {
                    txtEstado2.setText("Operación realizada con éxito");
                } else {
                    txtEstado2.setText("Ocurrieron algunos errores");
                    File archivo = new File("Errores.txt");
                    FileWriter escribir;
                    PrintWriter linea;

                    if (archivo.exists() == true) {
                        try {
                            escribir = new FileWriter(archivo, false);
                            linea = new PrintWriter(escribir);
                            for (int i = 0; i < errores.size(); i++) {
                                linea.println(errores.get(i));
                            }

                            linea.close();
                            escribir.close();
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        try {
                            archivo.createNewFile();
                            escribir = new FileWriter(archivo, false);
                            linea = new PrintWriter(escribir);

                            for (int i = 0; i < errores.size(); i++) {
                                linea.println(errores.get(i));
                            }

                            linea.close();
                            escribir.close();
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Algunos archivos no pudieron ser borrados\nRevise el archivo Errores.txt generado", "Error", JOptionPane.ERROR_MESSAGE);
                    //Abrir Errores.txt
                    try {
                        Desktop.getDesktop().open(archivo);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                listados = new ArrayList<>();
                listarJlist(listados);
                txtDestino.setText("");
            }
        }

    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistSeleccionados;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCopiarTodo;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnExaminar2;
    private javax.swing.JButton btnMoverTodo;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnQuitarTodo;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSeleccionarTodo;
    private javax.swing.JTable frmTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtEstado2;
    private javax.swing.JLabel txtInformacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
