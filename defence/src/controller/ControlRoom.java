package controller;

import obs.Obsever;

public class ControlRoom {
    private Obsever[] obseverArray=new Obsever[100];
    private int nextIndex=0;
    
    public void addObsever(Obsever shanuka) {
        obseverArray[nextIndex]=shanuka;
        nextIndex++;
    }
    
    
    public void setArea(boolean areaClear) {
        for (int i=0;i<nextIndex;i++) {
            Obsever obsever=obseverArray[i];
            obsever.areaClear(areaClear);
        }
    }

    public void sendMessage(String sendMsg) {
        for (int i = 0; i <nextIndex; i++) {
            Obsever obsever=obseverArray[i];
            obsever.getMsgMain(sendMsg); 
        }
    }
    
    public void setPosition(int value) {
        for (int i = 0; i < nextIndex; i++) {
            Obsever obsever=obseverArray[i];
            obsever.setPosition(value);
        }
    }
   
    public void sendPrivateMsg(String defenceName,String sendMsg) {
        for (int i = 0; i < nextIndex; i++) {
            Obsever obsever=obseverArray[i];
            obsever.sendPrivate(defenceName,sendMsg);
        }
    }
    
}
