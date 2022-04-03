package t6.AgenciaViajes;

/***********************************************************************
 * Module:  Cliente.java
 * Author:  Sabri
 * Purpose: Defines the Class Cliente
 ***********************************************************************/

import java.util.*;

/** @pdOid ff2ed144-c950-4282-9ed9-a49320b867bc */
public class Cliente extends Pasajero {
   /** @pdOid 94866b05-67f8-4cbe-a724-7abc9865c729 */
   private Viaje viaje;
   
   /** @pdOid 92348a5e-8023-4ca0-a1ee-0fe482a35500 */
   public Cliente() {
      // TODO: implement
   }
   
   /** @pdOid f3c99b56-7bf6-46a2-9b8f-bb16652f9161 */
   public Viaje getViaje() {
      return viaje;
   }

}