package CORBA_Competitions;


/**
* CORBA_Competitions/_CompetitionsResultsStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GetCompetitionResults.idl
* Wednesday, November 14, 2012 1:56:05 PM CET
*/

public class _CompetitionsResultsStub extends org.omg.CORBA.portable.ObjectImpl implements CORBA_Competitions.CompetitionsResults
{

  public String getCompetitionResults (String liga, String sport, String datum)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCompetitionResults", true);
                $out.write_string (liga);
                $out.write_string (sport);
                $out.write_string (datum);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getCompetitionResults (liga, sport, datum        );
            } finally {
                _releaseReply ($in);
            }
  } // getCompetitionResults

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CORBA_Competitions/CompetitionsResults:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _CompetitionsResultsStub
