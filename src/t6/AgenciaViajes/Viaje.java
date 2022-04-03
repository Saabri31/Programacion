package t6.AgenciaViajes;

/***********************************************************************
 * Module:  Viaje.java
 * Author:  Sabri
 * Purpose: Defines the Class Viaje
 ***********************************************************************/

import java.util.*;

/** @pdOid bdee60dc-5484-47e3-a4bc-eace876dd2f6 */
public class Viaje {
   /** @pdOid 87669888-2cac-4def-b6e1-cd7c5f7232e4 */
   private int codigo;
   /** @pdOid 9a46788f-b612-4238-aa07-56db9045aa3c */
   private String destino;
   /** @pdOid f3386686-290c-4266-95fb-f0eed8b29790 */
   private Date fechaSalida;
   /** @pdOid 4ebc09e5-f05a-4c59-aa2f-788da160db35 */
   private Date fechaRegreso;
   /** @pdOid b425bcdc-06d8-4929-b309-b959a10c28d7 */
   private double precio;
   /** @pdOid 11177438-4cef-4796-810e-a7dccd7a7406 */
   private Guia guia;
   
   /** @pdOid f459d936-1dcb-4c37-8348-03cbf041dc14 */
   public Viaje() {
      // TODO: implement
   }
   
   /** @pdOid 235e2793-a66a-4599-b3c8-612215d7176f */
   public String getDestino() {
      return destino;
   }
   
   /** @pdOid 39d1604c-8627-4723-b357-c17167f942b0 */
   public Date getFechaSalida() {
      return fechaSalida;
   }
   
   /** @pdOid 6f5175ce-971a-4ea5-8ad2-15a379c0c371 */
   public Date getFechaRegreso() {
      return fechaRegreso;
   }
   
   /** @pdOid cd9f867a-bb6f-4677-861f-0cd53669a026 */
   public double getPrecio() {
      return precio;
   }
   
   /** @pdOid ca27d8fb-8758-4486-ae56-337a6ff9d15d */
   public Guia getGuia() {
      return guia;
   }

}