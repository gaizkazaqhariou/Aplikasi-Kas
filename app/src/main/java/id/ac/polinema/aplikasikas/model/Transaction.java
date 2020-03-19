package id.ac.polinema.aplikasikas.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Transaction implements Parcelable {

    public static final Creator<Transaction> CREATOR = new Creator<Transaction>() {
        @Override
        public Transaction createFromParcel(Parcel in) {
            return new Transaction(in);
        }

        @Override
        public Transaction[] newArray(int size) {
            return new Transaction[size];
        }
    };
    private String description;
    private int amount;
    private Type type;

    protected Transaction(Parcel in) {

        this.description = in.readString();
        this.amount = in.readInt();
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : Type.values()[tmpType];
    }

    public Transaction(String description, int amount, Type type) {
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    public Transaction() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(description);
        dest.writeInt(amount);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        EMPTY,
        DEBIT,
        CREDIT
    }
}
