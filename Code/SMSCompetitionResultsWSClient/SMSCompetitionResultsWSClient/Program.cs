using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SMSCompetitionResultsWSClient
{
    class Program
    {
        static void Main(string[] args)
        {
            CompetitionResultsWS.CompetitionsResultsWSClient client = new CompetitionResultsWS.CompetitionsResultsWSClient();
            Console.WriteLine(client.getCompetitionResults("Liga 1", "Fussball", "2013-12-11"));
            Console.WriteLine("Press any key to exit");
            Console.ReadKey();
        }
    }
}
