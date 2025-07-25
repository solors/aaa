package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.m71545c(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month[] newArray(int i) {
            return new Month[i];
        }
    };
    @NonNull

    /* renamed from: b */
    private final Calendar f37395b;

    /* renamed from: c */
    final int f37396c;

    /* renamed from: d */
    final int f37397d;

    /* renamed from: f */
    final int f37398f;

    /* renamed from: g */
    final int f37399g;

    /* renamed from: h */
    final long f37400h;
    @Nullable

    /* renamed from: i */
    private String f37401i;

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar m71498e = UtcDates.m71498e(calendar);
        this.f37395b = m71498e;
        this.f37396c = m71498e.get(2);
        this.f37397d = m71498e.get(1);
        this.f37398f = m71498e.getMaximum(7);
        this.f37399g = m71498e.getActualMaximum(5);
        this.f37400h = m71498e.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public static Month m71545c(int i, int i2) {
        Calendar m71491l = UtcDates.m71491l();
        m71491l.set(1, i);
        m71491l.set(2, i2);
        return new Month(m71491l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public static Month m71544d(long j) {
        Calendar m71491l = UtcDates.m71491l();
        m71491l.setTimeInMillis(j);
        return new Month(m71491l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: f */
    public static Month m71543f() {
        return new Month(UtcDates.m71493j());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f37396c == month.f37396c && this.f37397d == month.f37397d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m71542g(int i) {
        int i2 = this.f37395b.get(7);
        if (i <= 0) {
            i = this.f37395b.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + this.f37398f;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m71541h(int i) {
        Calendar m71498e = UtcDates.m71498e(this.f37395b);
        m71498e.set(5, i);
        return m71498e.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37396c), Integer.valueOf(this.f37397d)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m71540i(long j) {
        Calendar m71498e = UtcDates.m71498e(this.f37395b);
        m71498e.setTimeInMillis(j);
        return m71498e.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: j */
    public String m71539j() {
        if (this.f37401i == null) {
            this.f37401i = DateStrings.m71597i(this.f37395b.getTimeInMillis());
        }
        return this.f37401i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public long m71538k() {
        return this.f37395b.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: l */
    public Month m71537l(int i) {
        Calendar m71498e = UtcDates.m71498e(this.f37395b);
        m71498e.add(2, i);
        return new Month(m71498e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m71536m(@NonNull Month month) {
        if (this.f37395b instanceof GregorianCalendar) {
            return ((month.f37397d - this.f37397d) * 12) + (month.f37396c - this.f37396c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f37397d);
        parcel.writeInt(this.f37396c);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Month month) {
        return this.f37395b.compareTo(month.f37395b);
    }
}
