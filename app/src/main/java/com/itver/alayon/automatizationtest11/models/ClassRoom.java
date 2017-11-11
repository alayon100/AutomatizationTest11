package com.itver.alayon.automatizationtest11.models;

/**
 * Created by Alayon on 09/11/2017.
 */
//Modelo que representa un salon dentro del sistema
public class ClassRoom {

    private String nuumberClassRoom;
    private boolean stateAC; // estado del clima

    public ClassRoom(String nuumberClassRoom, boolean stateAC) {
        this.nuumberClassRoom = nuumberClassRoom;
        this.stateAC = stateAC;
    }

    public String getNuumberClassRoom() {
        return nuumberClassRoom;
    }

    public void setNuumberClassRoom(String nuumberClassRoom) {
        this.nuumberClassRoom = nuumberClassRoom;
    }

    public boolean isStateAC() {
        return stateAC;
    }

    public void setStateAC(boolean stateAC) {
        this.stateAC = stateAC;
    }


}
