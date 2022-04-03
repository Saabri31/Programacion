package t6.AgenciaViajes;

/***********************************************************************
 * Module:  Pasajero.java
 * Author:  Sabri
 * Purpose: Defines the Class Pasajero
 ***********************************************************************/

import java.util.*;

/** @pdOid c6495a2d-8ec2-4a0e-9409-29e7ada105cb */
public class Pasajero {
   /** @pdOid b29b1dd2-9ca8-4886-bdcc-07e14f12fa6f */
   private String nombre;
   /** @pdOid 1d75eba5-9555-4f59-a2bd-05dcf2be5b2c */
   private String apellidos;
   /** @pdOid e451e4be-0032-4d34-85c1-44b15103fbea */
   private String dni;
   /** @pdOid 5567f234-6a57-471e-b2de-1668ca09946e */
   private String telefono;
   
   /** @pdRoleInfo migr=no name=Viaje assc=association1 mult=0..1 */
   public Viaje viaje;
   
   /** @pdOid 06c299d5-c264-41b8-9202-8e8b9a5355e2 */
   public Pasajero() {
      // TODO: implement
   }
   
   /** @pdOid d454d0f9-1414-426d-8c74-646e346c2e7e */
   public String getTelefono() {
      return telefono;
   }

}