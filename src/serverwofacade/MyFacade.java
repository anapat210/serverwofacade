/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author asus
 */
public class MyFacade {
    private static MyFacade myFacadeObj = null;
    ScheduleServer scheduleServer = new ScheduleServer();
    private MyFacade(){}
    public static MyFacade getMyFacadeObject(){
        if(myFacadeObj == null){
            myFacadeObj = new MyFacade();
        }
        return myFacadeObj;
    }
    public void StartingFunc(){
        Starting obj = new Starting();
        obj.StartingFunc(scheduleServer);
    }
    public void ShutingDown(){
        ShutingDown obj = new ShutingDown();
        obj.ShutingDownFunc(scheduleServer);
    }
}
