package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.d */
/* loaded from: classes4.dex */
public final class C14830d implements Comparator, Parcelable {
    public static final Parcelable.Creator<C14830d> CREATOR = new C14827a();

    /* renamed from: a */
    public final C14829c[] f28273a;

    /* renamed from: b */
    public int f28274b;

    /* renamed from: c */
    public final int f28275c;

    public C14830d(boolean z, C14829c... c14829cArr) {
        c14829cArr = z ? (C14829c[]) c14829cArr.clone() : c14829cArr;
        Arrays.sort(c14829cArr, this);
        for (int i = 1; i < c14829cArr.length; i++) {
            if (c14829cArr[i - 1].f28269b.equals(c14829cArr[i].f28269b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + c14829cArr[i].f28269b);
            }
        }
        this.f28273a = c14829cArr;
        this.f28275c = c14829cArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C14829c c14829c = (C14829c) obj;
        C14829c c14829c2 = (C14829c) obj2;
        UUID uuid = AbstractC14821b.f28248b;
        if (uuid.equals(c14829c.f28269b)) {
            if (uuid.equals(c14829c2.f28269b)) {
                return 0;
            }
            return 1;
        }
        return c14829c.f28269b.compareTo(c14829c2.f28269b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14830d.class == obj.getClass()) {
            return Arrays.equals(this.f28273a, ((C14830d) obj).f28273a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28274b == 0) {
            this.f28274b = Arrays.hashCode(this.f28273a);
        }
        return this.f28274b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f28273a, 0);
    }

    public C14830d(Parcel parcel) {
        C14829c[] c14829cArr = (C14829c[]) parcel.createTypedArray(C14829c.CREATOR);
        this.f28273a = c14829cArr;
        this.f28275c = c14829cArr.length;
    }
}
