package modelo;

import java.awt.Panel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Email implements IConstants{
    
    
    public boolean enviarMail(String pMailCliente, String pNombreEstudiante, int pCedulaEstudiante){
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth","true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnvia = EMAIL;
        String contrasena = CONTRASENNA;
        String Receptor = pMailCliente;
        String Asunto = "Solicitud de servicio de horas comunitarias";
        String Mensaje = "Por este medio, se certifica que " + pNombreEstudiante + ", con cédula " + pCedulaEstudiante + ", "
                + "es beneficiario del programa de becas de FONABE. En razón de lo anterior, "
                + "el estudiante debe cumplir con varios requisitos, entre los cuales "
                + "está brindar su colaboración a través de la realización de 90 horas de Proyección social al año. "
                + "Para esto se les solicita la colaboración de brindarle un espacio con el fin de que "
                + "el estudiante pueda retribuir al estado parte del apoyo económico que "
                + "recibe para cubrir los gastos directos e indirectos.";
        
                MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (Receptor));
            mail.setSubject(Asunto);
            mail.setText(Mensaje);
            
            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            JOptionPane.showMessageDialog(null, "Mail Enviado", "Correo", JOptionPane.INFORMATION_MESSAGE);
            return true;
            
        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(null, "No se pu", "Correo", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Mail Enviado", "Correo", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

