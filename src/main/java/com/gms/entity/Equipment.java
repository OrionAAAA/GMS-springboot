package com.gms.entity;

public class Equipment {
    private String equipmentId;
    private String equipmentIdOld;
    private String equipmentName;
    private int equipmentCost;
    private String equipmentStatus;
    private long equipmentTime;
    private int equipmentRenterId;
    private int gameId;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentIdOld() {
        return equipmentIdOld;
    }

    public void setEquipmentIdOld(String equipmentIdOld) {
        this.equipmentIdOld = equipmentIdOld;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentCost() {
        return equipmentCost;
    }

    public void setEquipmentCost(int equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public long getEquipmentTime() {
        return equipmentTime;
    }

    public void setEquipmentTime(long equipmentTime) {
        this.equipmentTime = equipmentTime;
    }

    public int getEquipmentRenterId() {
        return equipmentRenterId;
    }

    public void setEquipmentRenterId(int equipmentRenterId) {
        this.equipmentRenterId = equipmentRenterId;
    }

}
