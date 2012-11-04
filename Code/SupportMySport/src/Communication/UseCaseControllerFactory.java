/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Communication.interfaces.IUseCaseControllerFactory;
import Controller.ClubMemberController;
import Controller.CompetitionController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Johannes
 */
public class UseCaseControllerFactory extends UnicastRemoteObject implements IUseCaseControllerFactory
{
    public UseCaseControllerFactory() throws RemoteException
    {
        super();
    }
  
    @Override
    public ClubMemberController createClubMemberController() throws RemoteException
    {
        return new ClubMemberController();
    }

    @Override
    public CompetitionController createCompetitionController() throws RemoteException
    {
        return new CompetitionController();
    }
}
