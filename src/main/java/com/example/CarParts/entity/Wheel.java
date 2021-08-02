package com.example.CarParts.entity;

import javax.persistence.*;

@Entity
@Table(name = "wheels")
public class Wheel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int wheelId;

    @Column(name = "wheel_frame_id")
    private int wheelFrameId;

    @Column(name = "tire_id")
    private int tireId;

    @Column(name = "diameter")
    private int diameter;


    public Wheel() {
    }

    public Wheel( int wheelFrameId, int tireId, int diameter) {
        this.wheelFrameId = wheelFrameId;
        this.tireId = tireId;
        this.diameter = diameter;
    }

    public int getWheelId() {
        return wheelId;
    }
    public void setWheelId(int wheelId) {
        this.wheelId = wheelId;
    }

    public int getWheelFrame() {
        return wheelFrameId;
    }
    public void setWheelFrame(int wheelFrameId) {
        this.wheelFrameId = wheelFrameId;
    }

    public int getTireBrand() {
        return tireId;
    }
    public void setTireBrand(int tireId) {
        this.tireId = tireId;
    }

    public int getTireSize() {
        return diameter;
    }
    public void setTireSize(int diameter) {
        this.diameter = diameter;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Wheel{" +
                "id=" + wheelId +
                ", wheel_frame_id='" + wheelFrameId + '\'' +
                ", tire_id='" + tireId + '\'' +
                ", diameter='" + diameter + '\'' +
                '}';
    }
}
