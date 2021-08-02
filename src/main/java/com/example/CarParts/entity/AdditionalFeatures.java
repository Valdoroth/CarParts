package com.example.CarParts.entity;

import javax.persistence.*;

@Entity
@Table(name = "additional_features")
public class AdditionalFeatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int featuresId;

    @Column(name = "disc")
    private boolean cdPlayer;

    @Column(name = "aux")
    private boolean auxIn;

    @Column(name = "touchscreen_display")
    private boolean touchscreen;

    @Column(name = "radio")
    private String radio;

    @Column(name = "rear_camera")
    private boolean rearCamera;

    @Column(name = "heated_seats")
    private boolean heatedSeats;

    @Column(name = "seat_style")
    private String seatStyle;

    @Column(name = "mechanized_seats")
    private boolean mechanizedSeats;

    @Column(name = "subwoofer")
    private boolean subwoofer;

    public AdditionalFeatures(){
    }

    public AdditionalFeatures(boolean cdPlayer, boolean auxiliary, boolean touchscreen, String radioType, boolean rearCamera, boolean heatedSeats, String seatStyle, boolean mechanizedSeats, boolean subwoofer){
        this.cdPlayer = cdPlayer;
        this.auxIn = auxiliary;
        this.touchscreen = touchscreen;
        this.radio = radioType;
        this.rearCamera = rearCamera;
        this.heatedSeats = heatedSeats;
        this.seatStyle = seatStyle;
        this.mechanizedSeats = mechanizedSeats;
        this.subwoofer = subwoofer;
    }

    public int getFeaturesId() {
        return featuresId;
    }
    public void setFeaturesId(int featuresId) {
        this.featuresId = featuresId;
    }

    public boolean isCdPlayer() {
        return cdPlayer;
    }
    public void setCdPlayer(boolean cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public boolean isAuxIn() {
        return auxIn;
    }
    public void setAuxIn(boolean auxIn) {
        this.auxIn = auxIn;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }
    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getRadio() {
        return radio;
    }
    public void setRadio(String radio) {
        this.radio = radio;
    }

    public boolean isRearCamera() {
        return rearCamera;
    }
    public void setRearCamera(boolean rearCamera) {
        this.rearCamera = rearCamera;
    }

    public boolean isHeatedSeats() {
        return heatedSeats;
    }
    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    public String getSeatStyle() {
        return seatStyle;
    }
    public void setSeatStyle(String seatStyle) {
        this.seatStyle = seatStyle;
    }

    public boolean isMechanizedSeats() {
        return mechanizedSeats;
    }
    public void setMechanizedSeats(boolean mechanizedSeats) {
        this.mechanizedSeats = mechanizedSeats;
    }

    public boolean isSubwoofer() {
        return subwoofer;
    }
    public void setSubwoofer(boolean subwoofer) {
        this.subwoofer = subwoofer;
    }

    @Override
    public String toString() {
        return "AdditionalFeatures{" +
                "featuresId=" + featuresId +
                ", cdPlayer=" + cdPlayer +
                ", auxIn=" + auxIn +
                ", touchscreen=" + touchscreen +
                ", radio='" + radio + '\'' +
                ", rearCamera=" + rearCamera +
                ", heatedSeats=" + heatedSeats +
                ", seatStyle='" + seatStyle + '\'' +
                ", mechanizedSeats=" + mechanizedSeats +
                ", subwoofer=" + subwoofer +
                '}';
    }
}
