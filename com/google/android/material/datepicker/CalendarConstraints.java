package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    };
    @NonNull

    /* renamed from: b */
    private final Month f37264b;
    @NonNull

    /* renamed from: c */
    private final Month f37265c;
    @NonNull

    /* renamed from: d */
    private final DateValidator f37266d;
    @Nullable

    /* renamed from: f */
    private Month f37267f;

    /* renamed from: g */
    private final int f37268g;

    /* renamed from: h */
    private final int f37269h;

    /* renamed from: i */
    private final int f37270i;

    /* loaded from: classes5.dex */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f37264b.equals(calendarConstraints.f37264b) && this.f37265c.equals(calendarConstraints.f37265c) && ObjectsCompat.equals(this.f37267f, calendarConstraints.f37267f) && this.f37268g == calendarConstraints.f37268g && this.f37266d.equals(calendarConstraints.f37266d)) {
            return true;
        }
        return false;
    }

    public DateValidator getDateValidator() {
        return this.f37266d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Month m71628h(Month month) {
        if (month.compareTo(this.f37264b) < 0) {
            return this.f37264b;
        }
        if (month.compareTo(this.f37265c) > 0) {
            return this.f37265c;
        }
        return month;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37264b, this.f37265c, this.f37267f, Integer.valueOf(this.f37268g), this.f37266d});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public Month m71627i() {
        return this.f37265c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m71626j() {
        return this.f37268g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m71625k() {
        return this.f37270i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: l */
    public Month m71624l() {
        return this.f37267f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: m */
    public Month m71623m() {
        return this.f37264b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m71622n() {
        return this.f37269h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m71621o(long j) {
        if (this.f37264b.m71541h(1) <= j) {
            Month month = this.f37265c;
            if (j <= month.m71541h(month.f37399g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m71620p(@Nullable Month month) {
        this.f37267f = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37264b, 0);
        parcel.writeParcelable(this.f37265c, 0);
        parcel.writeParcelable(this.f37267f, 0);
        parcel.writeParcelable(this.f37266d, 0);
        parcel.writeInt(this.f37268g);
    }

    private CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3, int i) {
        this.f37264b = month;
        this.f37265c = month2;
        this.f37267f = month3;
        this.f37268g = i;
        this.f37266d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= UtcDates.m71491l().getMaximum(7)) {
            this.f37270i = month.m71536m(month2) + 1;
            this.f37269h = (month2.f37397d - month.f37397d) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: f */
        static final long f37271f = UtcDates.m71502a(Month.m71545c(1900, 0).f37400h);

        /* renamed from: g */
        static final long f37272g = UtcDates.m71502a(Month.m71545c(2100, 11).f37400h);

        /* renamed from: a */
        private long f37273a;

        /* renamed from: b */
        private long f37274b;

        /* renamed from: c */
        private Long f37275c;

        /* renamed from: d */
        private int f37276d;

        /* renamed from: e */
        private DateValidator f37277e;

        public Builder() {
            this.f37273a = f37271f;
            this.f37274b = f37272g;
            this.f37277e = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints build() {
            Month m71544d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f37277e);
            Month m71544d2 = Month.m71544d(this.f37273a);
            Month m71544d3 = Month.m71544d(this.f37274b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f37275c;
            if (l == null) {
                m71544d = null;
            } else {
                m71544d = Month.m71544d(l.longValue());
            }
            return new CalendarConstraints(m71544d2, m71544d3, dateValidator, m71544d, this.f37276d);
        }

        @NonNull
        public Builder setEnd(long j) {
            this.f37274b = j;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setFirstDayOfWeek(int i) {
            this.f37276d = i;
            return this;
        }

        @NonNull
        public Builder setOpenAt(long j) {
            this.f37275c = Long.valueOf(j);
            return this;
        }

        @NonNull
        public Builder setStart(long j) {
            this.f37273a = j;
            return this;
        }

        @NonNull
        public Builder setValidator(@NonNull DateValidator dateValidator) {
            this.f37277e = dateValidator;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(@NonNull CalendarConstraints calendarConstraints) {
            this.f37273a = f37271f;
            this.f37274b = f37272g;
            this.f37277e = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.f37273a = calendarConstraints.f37264b.f37400h;
            this.f37274b = calendarConstraints.f37265c.f37400h;
            this.f37275c = Long.valueOf(calendarConstraints.f37267f.f37400h);
            this.f37276d = calendarConstraints.f37268g;
            this.f37277e = calendarConstraints.f37266d;
        }
    }
}
