package net.lump.print.snmp;


/**
 * Printer Alert Severity.
 *
 * @author troy
 * @version $Id: AlertSeverityLevel.java,v 1.2 2009/08/21 16:51:41 bowmant Alpha $
 */
@SuppressWarnings({"UnusedDeclaration"})
public enum AlertSeverityLevel
{
   None,
   Other,
   Unknown,
   Critical,
   Warning,
   WarningBinaryChangeEvent;

   public static AlertSeverityLevel fromId(int value) {
      if (value < values().length && value > -1) return values()[value];
      else return Unknown;
   }
}
