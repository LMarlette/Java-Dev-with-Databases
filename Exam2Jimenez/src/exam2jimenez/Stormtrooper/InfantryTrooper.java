/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez.Stormtrooper;

import exam2jimenez.Interfaces.Movement;
import exam2jimenez.Interfaces.Tactical;
import exam2jimenez.Location;

/**
 *
 * @author lillimj
 */
public class InfantryTrooper extends Stormtrooper implements Movement, Tactical{

    public InfantryTrooper(String STID, String Rank, String Gender, int ServiceYears, int Height, int weight, String DutyCategory, String DutyStatus, String UnitAssigned, String Role) {
        super(STID, Rank, Gender, ServiceYears, Height, weight, DutyCategory, DutyStatus, UnitAssigned, Role);
    }

    
    
    

    @Override
    public void firesWeapon(String tgt) {
        String fires = "This unit is firing his weapon";
    }

    @Override
    public void reconsPosition(exam2jimenez.Location L) {

      Location L1 = new Location(4,5);
               System.out.println("Unit is at location" + L1.toString());

                        
    }

      @Override
    public void MoveLeft() {
            String ml = "This unit moving left";
    }

    @Override
    public void MoveRight() {
            String mr = "This unit moving right";
    }

    @Override
    public void MoveFoward() {
            String mf = "This unit moving foward";
    }

    @Override
    public void MoveBackward() {
            String mb = "This unit moving backward";
    }
    
    @Override
     public void MoveTo(Location L) {
  
      Location L1 = new Location(4,5);
               System.out.println("Unit is at location" + L1.toString());

                        
     }
    
}
