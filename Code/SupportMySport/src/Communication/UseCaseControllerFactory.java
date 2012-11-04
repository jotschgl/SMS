/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

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
    private UseCaseControllerFactory() throws RemoteException
    {
        super();
    }
    private static UseCaseControllerFactory instance;

    /**
     * gibt eine Instanz der Klasse zurück
     *
     * @return
     * eine Instanz der Klasse
     */
    public static UseCaseControllerFactory getInstance() throws RemoteException
    {
        if (instance == null)
        {
            instance = new UseCaseControllerFactory();
        }
        return instance;
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
