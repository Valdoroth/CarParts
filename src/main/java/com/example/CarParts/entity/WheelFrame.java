package com.example.CarParts.entity;

import javax.persistence.*;


@Entity
@Table(name = "wheel_frame")
public class WheelFrame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int wheelFrameId;

    @Column(name = "brand")
    private String frameBrand;

    @Column(name = "name")
    private String frameName;

    @Column(name = "diameter")
    private int frameSize;

    @Column(name = "color")
    private String frameColor;

    @Column(name = "type")
    private String frameType;

    public WheelFrame() {
    }

    public WheelFrame(String frameBrand, String frameName, int frameSize, String frameColor, String frameType) {
        this.frameBrand = frameBrand;
        this.frameName = frameName;
        this.frameSize = frameSize;
        this.frameColor = frameColor;
        this.frameType = frameType;
    }

    public int getWheelFrameId() {
        return wheelFrameId;
    }

    public void setWheelFrameId(int wheelFrameId) {
        this.wheelFrameId = wheelFrameId;
    }

    public String getFrameBrand() {
        return frameBrand;
    }

    public void setFrameBrand(String frameBrand) {
        this.frameBrand = frameBrand;
    }

    public String getFrameName() {
        return frameName;
    }

    public void setFrameName(String frameName) {
        this.frameName = frameName;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    @Override
    public String toString() {
        return "WheelFrame{" +
                "wheelFrameId=" + wheelFrameId +
                ", frameBrand='" + frameBrand + '\'' +
                ", frameName='" + frameName + '\'' +
                ", frameSize=" + frameSize +
                ", frameColor='" + frameColor + '\'' +
                ", frameType='" + frameType + '\'' +
                '}';
    }
}
