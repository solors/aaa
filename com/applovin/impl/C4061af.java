package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C5631ud;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.af */
/* loaded from: classes2.dex */
public final class C4061af implements Parcelable {
    public static final Parcelable.Creator<C4061af> CREATOR = new C4062a();

    /* renamed from: a */
    private final InterfaceC4063b[] f4709a;

    /* renamed from: com.applovin.impl.af$a */
    /* loaded from: classes2.dex */
    class C4062a implements Parcelable.Creator {
        C4062a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4061af[] newArray(int i) {
            return new C4061af[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4061af createFromParcel(Parcel parcel) {
            return new C4061af(parcel);
        }
    }

    /* renamed from: com.applovin.impl.af$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4063b extends Parcelable {
        /* renamed from: a */
        default void mo92341a(C5631ud.C5633b c5633b) {
        }

        /* renamed from: b */
        default C4310e9 mo93961b() {
            return null;
        }

        /* renamed from: a */
        default byte[] mo93962a() {
            return null;
        }
    }

    C4061af(Parcel parcel) {
        this.f4709a = new InterfaceC4063b[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC4063b[] interfaceC4063bArr = this.f4709a;
            if (i >= interfaceC4063bArr.length) {
                return;
            }
            interfaceC4063bArr[i] = (InterfaceC4063b) parcel.readParcelable(InterfaceC4063b.class.getClassLoader());
            i++;
        }
    }

    /* renamed from: a */
    public C4061af m100808a(InterfaceC4063b... interfaceC4063bArr) {
        return interfaceC4063bArr.length == 0 ? this : new C4061af((InterfaceC4063b[]) AbstractC5863xp.m92997a((Object[]) this.f4709a, (Object[]) interfaceC4063bArr));
    }

    /* renamed from: c */
    public int m100807c() {
        return this.f4709a.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4061af.class == obj.getClass()) {
            return Arrays.equals(this.f4709a, ((C4061af) obj).f4709a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4709a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f4709a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4709a.length);
        for (InterfaceC4063b interfaceC4063b : this.f4709a) {
            parcel.writeParcelable(interfaceC4063b, 0);
        }
    }

    /* renamed from: a */
    public C4061af m100809a(C4061af c4061af) {
        return c4061af == null ? this : m100808a(c4061af.f4709a);
    }

    /* renamed from: a */
    public InterfaceC4063b m100810a(int i) {
        return this.f4709a[i];
    }

    public C4061af(List list) {
        this.f4709a = (InterfaceC4063b[]) list.toArray(new InterfaceC4063b[0]);
    }

    public C4061af(InterfaceC4063b... interfaceC4063bArr) {
        this.f4709a = interfaceC4063bArr;
    }
}
