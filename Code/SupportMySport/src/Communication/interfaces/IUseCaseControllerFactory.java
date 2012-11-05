/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.interfaces;

import Controller.interfaces.IClubMemberController;
import Controller.interfaces.ICompetitionController;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Johannes
 */
public interface IUseCaseControllerFactory extends Remote
{
    public IClubMemberController createClubMemberController() throws RemoteException;

    public ICompetitionController createCompetitionController() throws RemoteException;
}
