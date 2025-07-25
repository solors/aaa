package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator<PrivFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f58755ID = "PRIV";
    public final String owner;
    public final byte[] privateData;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.owner = str;
        this.privateData = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (Util.areEqual(this.owner, privFrame.owner) && Arrays.equals(this.privateData, privFrame.privateData)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.owner;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31) + Arrays.hashCode(this.privateData);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f58753id + ": owner=" + this.owner;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.owner);
        parcel.writeByteArray(this.privateData);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.owner = parcel.readString();
        this.privateData = parcel.createByteArray();
    }
}
