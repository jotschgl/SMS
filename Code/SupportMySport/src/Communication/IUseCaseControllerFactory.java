/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Controller.ClubMemberController;
import Controller.CompetitionController;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Johannes
 */
public interface IUseCaseControllerFactory extends Remote
{
    public ClubMemberController createClubMemberController() throws RemoteException;

    public CompetitionController createCompetitionController() throws RemoteException;
}
