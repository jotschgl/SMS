/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sms.competitionresults;

import Communication.CompetitionDTO;
import Communication.CompetitionDTOControllerFactoryRemote;
import Communication.MeetingDTO;
import Persistence.Meeting;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author rafa
 */
@WebService(serviceName = "CompetitionsResultsWS")
@Stateless()
public class CompetitionsResultsWS {

    @EJB
    private CompetitionDTOControllerFactoryRemote competitionDTOControllerFactoryRemote;

    @WebMethod(operationName = "getCompetitionById")
    public String getCompetitionResults(@WebParam(name = "id") String id) {

        String noResult = "No Results";

        try {
            int ID = Integer.parseInt(id);
            //GET THE COMPETITIONDTO THAT HAS THE ID
            if (competitionDTOControllerFactoryRemote != null) {
                return competitionDTOControllerFactoryRemote.getCompetitionByID(ID).getName();
            }
        } catch (Exception e) {
            System.out.println("Exception occured in getCompetitionResults WS: ");
            e.printStackTrace();
        }
        return noResult;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCompetitionResults")
    @RequestWrapper(className = "org.getCompetitionResults_1")
    @ResponseWrapper(className = "org.getCompetitionResults_1Response")
    public String getCompetitionResults(@WebParam(name = "liga") String liga, @WebParam(name = "sport") String sport, @WebParam(name = "datum") String datum) {
       
        String noResult = "No Results";
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
        CompetitionDTO comp = null;
        Collection<CompetitionDTO> competitions = null;
        
        try {
            date = formatter.parse(datum);

            if (date != null) {
                //GET ALL THE COMPETITIONS THE ARE ON THIS DATE
                competitions = competitionDTOControllerFactoryRemote.getCompetitionByDate(date);
                System.out.println("Getting competitions with length: " + competitions.size());
            }

            //PRECHECK IF THERE ARE ANY COMPETITIONS
            if (competitions.size() > 0) {

                //RUN THROUGH THE COMPETITIONS AND GET THE RIGHT ONE
                for (Object obj : competitions) {

                    //BECAUSE THE LEAGUE CAN BE NULL IT MUST BE CHECKED IF IT IS NOT NULL IN THE DATABASE
                    if (((CompetitionDTO) obj).getLeague() != null) {
                        System.out.println("Liga: " + ((CompetitionDTO) obj).getLeague().getName() );
                        System.out.println("Sport: " + ((CompetitionDTO) obj).getSport().getName() );
                        System.out.println("Datum: " + ((CompetitionDTO) obj).getDateOfCompetition() );
                        System.out.println("Completed: " + ((CompetitionDTO) obj).getCompleted() );
                        //THE SEARCHED COMPETITION MUST EQUALS WITH THE SPORT, THE LEAGUE AND THE GET COMPLETED FLAG MUST BE SET TRUE
                        if (((CompetitionDTO) obj).getSport().getName().equals(sport) && ((CompetitionDTO) obj).getLeague().getName().equals(liga) && ((CompetitionDTO) obj).getCompleted() == true) {
                            System.out.println("Competition was found");
                            comp = (CompetitionDTO) obj;
                            break;
                        }
                    }
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(CompetitionsResultsWS.class.getName()).log(Level.SEVERE, null, ex);
        }

        //WHEN NO COMP WAS FOUND
        if (comp == null) {
            System.out.println("CompetitionDTO is null. Return no result");
            return noResult;
        }
        
        System.out.println("CompetitionDTO is not null. Building return string");
        
        StringBuffer sb = new StringBuffer();
        Collection<MeetingDTO> meetings = comp.getAllCompetitionMeetings();
        for (Object obj : meetings) {
            sb.append(((MeetingDTO) obj).getTeamByTeamAId().getTeamName() + ":" + ((MeetingDTO) obj).getPointsA());
            sb.append(" " + ((MeetingDTO) obj).getTeamByTeamBId().getTeamName() + ":" + ((MeetingDTO) obj).getPointsB());
        }
        sb.append("\n");
        return sb.toString();
    }
}
