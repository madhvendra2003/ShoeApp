package com.example.shoeapp.Utils.Model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "shoe_table")
public class Shoe implements Parcelable {



    private String shoeName , shoeBrand;

    private int shoeImage;
    private double shoeprice;

    private int quantity;
    private double totalItemPrice;

    public Shoe(String shoeName, String shoeBrand, int shoeImage, double shoeprice) {
        this.shoeName = shoeName;
        this.shoeBrand = shoeBrand;
        this.shoeImage = shoeImage;
        this.shoeprice = shoeprice;
    }

    protected Shoe(Parcel in) {
        shoeName = in.readString();
        shoeBrand = in.readString();
        shoeImage = in.readInt();
        shoeprice = in.readDouble();
        quantity = in.readInt();
        totalItemPrice = in.readDouble();
    }

    public static final Creator<Shoe> CREATOR = new Creator<Shoe>() {
        @Override
        public Shoe createFromParcel(Parcel in) {
            return new Shoe(in);
        }

        @Override
        public Shoe[] newArray(int size) {
            return new Shoe[size];
        }
    };

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public int getShoeImage() {
        return shoeImage;
    }

    public void setShoeImage(int shoeImage) {
        this.shoeImage = shoeImage;
    }

    public double getShoeprice() {
        return shoeprice;
    }

    public void setShoeprice(double shoeprice) {
        this.shoeprice = shoeprice;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
         dest.writeString(shoeName);
        dest.writeString(shoeBrand);
        dest.writeInt(shoeImage);
        dest.writeDouble(shoeprice);
    }
}
