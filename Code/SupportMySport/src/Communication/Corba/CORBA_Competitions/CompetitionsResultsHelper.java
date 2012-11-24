package CORBA_Competitions;


/**
* CORBA_Competitions/CompetitionsResultsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GetCompetitionResults.idl
* Wednesday, November 14, 2012 1:56:05 PM CET
*/

abstract public class CompetitionsResultsHelper
{
  private static String  _id = "IDL:CORBA_Competitions/CompetitionsResults:1.0";

  public static void insert (org.omg.CORBA.Any a, CORBA_Competitions.CompetitionsResults that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CORBA_Competitions.CompetitionsResults extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CORBA_Competitions.CompetitionsResultsHelper.id (), "CompetitionsResults");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CORBA_Competitions.CompetitionsResults read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CompetitionsResultsStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CORBA_Competitions.CompetitionsResults value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CORBA_Competitions.CompetitionsResults narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CORBA_Competitions.CompetitionsResults)
      return (CORBA_Competitions.CompetitionsResults)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CORBA_Competitions._CompetitionsResultsStub stub = new CORBA_Competitions._CompetitionsResultsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CORBA_Competitions.CompetitionsResults unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CORBA_Competitions.CompetitionsResults)
      return (CORBA_Competitions.CompetitionsResults)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CORBA_Competitions._CompetitionsResultsStub stub = new CORBA_Competitions._CompetitionsResultsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}