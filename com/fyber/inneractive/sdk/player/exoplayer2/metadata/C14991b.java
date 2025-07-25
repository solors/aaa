package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC15006o;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.b */
/* loaded from: classes4.dex */
public final class C14991b implements Parcelable {
    public static final Parcelable.Creator<C14991b> CREATOR = new C14990a();

    /* renamed from: a */
    public final AbstractC15006o[] f29414a;

    public C14991b(ArrayList arrayList) {
        AbstractC15006o[] abstractC15006oArr = new AbstractC15006o[arrayList.size()];
        this.f29414a = abstractC15006oArr;
        arrayList.toArray(abstractC15006oArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14991b.class == obj.getClass()) {
            return Arrays.equals(this.f29414a, ((C14991b) obj).f29414a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29414a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29414a.length);
        for (AbstractC15006o abstractC15006o : this.f29414a) {
            parcel.writeParcelable(abstractC15006o, 0);
        }
    }

    public C14991b(Parcel parcel) {
        this.f29414a = new AbstractC15006o[parcel.readInt()];
        int i = 0;
        while (true) {
            AbstractC15006o[] abstractC15006oArr = this.f29414a;
            if (i >= abstractC15006oArr.length) {
                return;
            }
            abstractC15006oArr[i] = (AbstractC15006o) parcel.readParcelable(AbstractC15006o.class.getClassLoader());
            i++;
        }
    }
}
