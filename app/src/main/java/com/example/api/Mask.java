package com.example.api;

import android.os.Parcel;
import android.os.Parcelable;

public class Mask implements Parcelable {

    private int Id_zakaz;
    private String Users;
    private String Nazvanie;
    private String Zena;
    private byte Image;

    public Mask(int Id_zakaz, String user, String nazvanie, String zena, byte image) {
        this.Id_zakaz = Id_zakaz;
        Users = user;
        Nazvanie = nazvanie;
        Zena = zena;
        Image = image;
    }

    protected Mask(Parcel in) {
        Id_zakaz = in.readInt();
        Users = in.readString();
        Nazvanie = in.readString();
        Zena = in.readString();
        Image = in.readByte();
    }

    public static final Creator<Mask> CREATOR = new Creator<Mask>() {
        @Override
        public Mask createFromParcel(Parcel in) {
            return new Mask(in);
        }

        @Override
        public Mask[] newArray(int size) {
            return new Mask[size];
        }
    };


    public void setId_zakaz(int Id_zakaz) {
        this.Id_zakaz = Id_zakaz;
    }

    public void setUsers(String user) {
        Users = user;
    }

    public void setNazvanie(String nazvanie) {
        Nazvanie = nazvanie;
    }

    public void setZena(String zena) {
        Zena = zena;
    }

    public void setImage(Byte image) {
        Image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(Id_zakaz);
        parcel.writeString(Users);
        parcel.writeString(Nazvanie);
        parcel.writeString(Zena);
        parcel.writeByte(Image);
    }

    public int getId_zakaz() {
        return Id_zakaz;
    }

    public String getUsers() {
        return Users;
    }

    public String getNazvanie() {
        return Nazvanie;
    }

    public String getZena() {
        return Zena;
    }

    public Byte getImage() {
        return Image;
    }
}
