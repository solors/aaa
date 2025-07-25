package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    };
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";

    /* renamed from: b */
    private final MaxInputValidator f38794b;

    /* renamed from: c */
    private final MaxInputValidator f38795c;

    /* renamed from: d */
    final int f38796d;

    /* renamed from: f */
    int f38797f;

    /* renamed from: g */
    int f38798g;

    /* renamed from: h */
    int f38799h;

    /* renamed from: i */
    int f38800i;

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    private static int m70396a(int i) {
        if (i >= 12) {
            return 1;
        }
        return 0;
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f38797f == timeModel.f38797f && this.f38798g == timeModel.f38798g && this.f38796d == timeModel.f38796d && this.f38799h == timeModel.f38799h) {
            return true;
        }
        return false;
    }

    public int getHourForDisplay() {
        if (this.f38796d == 1) {
            return this.f38797f % 24;
        }
        int i = this.f38797f;
        if (i % 12 == 0) {
            return 12;
        }
        if (this.f38800i == 1) {
            return i - 12;
        }
        return i;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.f38795c;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.f38794b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f38796d), Integer.valueOf(this.f38797f), Integer.valueOf(this.f38798g), Integer.valueOf(this.f38799h)});
    }

    public void setHour(int i) {
        if (this.f38796d == 1) {
            this.f38797f = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f38800i != 1) {
            i2 = 0;
        }
        this.f38797f = i3 + i2;
    }

    public void setHourOfDay(int i) {
        this.f38800i = m70396a(i);
        this.f38797f = i;
    }

    public void setMinute(@IntRange(from = 0, m105510to = 59) int i) {
        this.f38798g = i % 60;
    }

    public void setPeriod(int i) {
        if (i != this.f38800i) {
            this.f38800i = i;
            int i2 = this.f38797f;
            if (i2 < 12 && i == 1) {
                this.f38797f = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.f38797f = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f38797f);
        parcel.writeInt(this.f38798g);
        parcel.writeInt(this.f38799h);
        parcel.writeInt(this.f38796d);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f38797f = i;
        this.f38798g = i2;
        this.f38799h = i3;
        this.f38796d = i4;
        this.f38800i = m70396a(i);
        this.f38794b = new MaxInputValidator(59);
        this.f38795c = new MaxInputValidator(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
