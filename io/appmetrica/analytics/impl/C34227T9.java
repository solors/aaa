package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.T9 */
/* loaded from: classes9.dex */
public final class C34227T9 implements Parcelable {
    @NotNull
    public static final C34203S9 CREATOR = new C34203S9();

    /* renamed from: a */
    public final Boolean f93529a;

    /* renamed from: b */
    public final IdentifierStatus f93530b;

    /* renamed from: c */
    public final String f93531c;

    public C34227T9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f93529a = bool;
        this.f93530b = identifierStatus;
        this.f93531c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34227T9)) {
            return false;
        }
        C34227T9 c34227t9 = (C34227T9) obj;
        if (Intrinsics.m17075f(this.f93529a, c34227t9.f93529a) && this.f93530b == c34227t9.f93530b && Intrinsics.m17075f(this.f93531c, c34227t9.f93531c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.f93529a;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode2 = (this.f93530b.hashCode() + (hashCode * 31)) * 31;
        String str = this.f93531c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f93529a + ", status=" + this.f93530b + ", errorExplanation=" + this.f93531c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f93529a);
        parcel.writeString(this.f93530b.getValue());
        parcel.writeString(this.f93531c);
    }

    public C34227T9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
