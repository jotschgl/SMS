using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SupportMySportWebServiceClient {
    class Program {
        static void Main(string[] args) {
            SmsWebService.CompetitionsResultsWSClient proxy = new SmsWebService.CompetitionsResultsWSClient();
            bool finish = false;
            string league;
            string sport;
            string date;
            string isFinish;
            while (!finish) {
                Console.WriteLine("Enter league (for Example:JoggingLeague): ");
                league = Console.ReadLine();
                Console.WriteLine("Enter sport (for Example:Joggen): ");
                sport = Console.ReadLine();
                Console.WriteLine("Enter date (Format: year-month-day example:2013-04-11): ");
                date = Console.ReadLine();
                Console.WriteLine(proxy.getCompetitionResults(league, sport, date));
                Console.WriteLine(proxy.isCompetitionCompleted(league, sport, date));
                Console.WriteLine("Enter 0 to finish or any key to continue: ");
                isFinish = Console.ReadLine();
                if (isFinish.Equals("0")) {
                    finish = true;
                }
            }
        }
    }
}
