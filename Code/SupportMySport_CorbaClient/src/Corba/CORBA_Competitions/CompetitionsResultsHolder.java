package CORBA_Competitions;

/**
* CORBA_Competitions/CompetitionsResultsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GetCompetitionResults.idl
* Samstag, 17. November 2012 09:17 Uhr MEZ
*/

public final class CompetitionsResultsHolder implements org.omg.CORBA.portable.Streamable
{
  public CORBA_Competitions.CompetitionsResults value = null;

  public CompetitionsResultsHolder ()
  {
  }

  public CompetitionsResultsHolder (CORBA_Competitions.CompetitionsResults initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CORBA_Competitions.CompetitionsResultsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CORBA_Competitions.CompetitionsResultsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CORBA_Competitions.CompetitionsResultsHelper.type ();
  }

}