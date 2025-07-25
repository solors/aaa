package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q */
/* loaded from: classes4.dex */
public final class C15008q extends AbstractC15006o {
    public static final Parcelable.Creator<C15008q> CREATOR = new C15007p();

    /* renamed from: b */
    public final String f29444b;

    /* renamed from: c */
    public final byte[] f29445c;

    public C15008q(String str, byte[] bArr) {
        super("PRIV");
        this.f29444b = str;
        this.f29445c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15008q.class != obj.getClass()) {
            return false;
        }
        C15008q c15008q = (C15008q) obj;
        if (AbstractC15133z.m77159a(this.f29444b, c15008q.f29444b) && Arrays.equals(this.f29445c, c15008q.f29445c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f29444b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.f29445c) + ((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29444b);
        parcel.writeByteArray(this.f29445c);
    }

    public C15008q(Parcel parcel) {
        super("PRIV");
        this.f29444b = parcel.readString();
        this.f29445c = parcel.createByteArray();
    }
}
