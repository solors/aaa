package com.monetization.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.cc1;
import com.yandex.mobile.ads.impl.y32;

/* loaded from: classes7.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C25552a();

    /* renamed from: b */
    public final long f66313b;

    /* renamed from: c */
    public final long f66314c;

    /* renamed from: d */
    public final byte[] f66315d;

    /* renamed from: com.monetization.ads.exo.metadata.scte35.PrivateCommand$a */
    /* loaded from: classes7.dex */
    final class C25552a implements Parcelable.Creator<PrivateCommand> {
        C25552a() {
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PrivateCommand m44370a(cc1 cc1Var, int i, long j) {
        long m35268v = cc1Var.m35268v();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        cc1Var.m35294a(bArr, 0, i2);
        return new PrivateCommand(m35268v, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f66313b);
        parcel.writeLong(this.f66314c);
        parcel.writeByteArray(this.f66315d);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.f66313b = j2;
        this.f66314c = j;
        this.f66315d = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f66313b = parcel.readLong();
        this.f66314c = parcel.readLong();
        this.f66315d = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
