package com.itver.alayon.automatizationtest11.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alayon on 09/11/2017.
 */

//Modelo del Edificio dentro del sistema
public class Build {

    //CArgar una imagen en listview
    private String nameBuild;
    private List<ClassRoom> listClassRoom;

    public Build(String name, List<ClassRoom> listClassRoom) {
        this.nameBuild = name;
        this.listClassRoom = listClassRoom;
    }

    public String getNameBuild() {
        return nameBuild;
    }

    public void setNameBuild(String name) {
        this.nameBuild = name;
    }

    public List<ClassRoom> getListClassRoom() {
        return listClassRoom;
    }

    public int getNumberClassRoom(){
        return listClassRoom.size();
    }

    public void setListClassRoom(List<ClassRoom> listClassRoom) {
        this.listClassRoom = listClassRoom;
    }




    public static ArrayList<Build> getAllBuilds(){

        return new ArrayList<Build>(){{
            add(new Build("Edificion J", new ArrayList<ClassRoom>(10)));
            add(new Build("Edificion K", new ArrayList<ClassRoom>(13)));
            add(new Build("Edificion E", new ArrayList<ClassRoom>(14)));
            add(new Build("Edificion L", new ArrayList<ClassRoom>(15)));
            add(new Build("Edificion M", new ArrayList<ClassRoom>(16)));
            add(new Build("Edificion N", new ArrayList<ClassRoom>(17)));
            add(new Build("Edificion O", new ArrayList<ClassRoom>(18)));
            add(new Build("Edificion P", new ArrayList<ClassRoom>(19)));
            add(new Build("Edificion R", new ArrayList<ClassRoom>(20)));
        }};

    }



}
