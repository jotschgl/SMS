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
            //"Liga 1", "Fussball", "2013-12-11"

            String liga = "";
            String sport = "";
            String datum = "";

            CompetitionResultsWS.CompetitionsResultsWSClient client = new CompetitionResultsWS.CompetitionsResultsWSClient();

            while (true) {
                Console.Write("Please enter Liga:");
                liga = Console.ReadLine();
                Console.Write("Please enter Sport:");
                sport = Console.ReadLine();
                Console.Write("Please enter date:");
                datum = Console.ReadLine();

                Console.WriteLine();

                Console.Write("Competition results:");
                Console.WriteLine(client.getCompetitionResults(liga, sport, datum));
                Console.Write("Competition status:");
                Console.WriteLine(client.isCompetitionCompleted(liga, sport, datum));
                Console.WriteLine();
            }


           
        }
    }
}
