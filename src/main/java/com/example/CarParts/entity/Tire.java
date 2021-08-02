package com.example.CarParts.entity;


import javax.persistence.*;

@Entity
@Table(name = "tires")
public class Tire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int tireId;

    @Column(name = "brand")
    private String tireBrand;

    @Column(name = "diameter")
    private int tireSize;

    @Column(name = "width")
    private String width;

    @Column(name = "ratio")
    private int ratio;

    public Tire() {
    }

    public Tire( String tireBrand, int diameter, String width, int ratio) {
        this.tireBrand = tireBrand;
        this.tireSize = diameter;
        this.width = width;
        this.ratio = ratio;
    }

    public int getTireId() {
        return tireId;
    }
    public void setTireId(int tireId) {
        this.tireId = tireId;
    }

    public String getTireBrand() {
        return tireBrand;
    }
    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public int getTireSize() {
        return tireSize;
    }
    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }

    public int getRatio() {
        return ratio;
    }
    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Tire{" +
                "id=" + tireId +
                ", brand='" + tireBrand + '\'' +
                ", diameter='" + tireSize + '\'' +
                ", width='" + width + '\'' +
                ", ratio='" + ratio + '\'' +
                '}';
    }
}
