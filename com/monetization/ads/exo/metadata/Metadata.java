package com.monetization.ads.exo.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.v90;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C25524a();

    /* renamed from: b */
    private final Entry[] f66220b;

    /* loaded from: classes7.dex */
    public interface Entry extends Parcelable {
        @Nullable
        /* renamed from: a */
        default v90 mo44378a() {
            return null;
        }

        @Nullable
        /* renamed from: b */
        default byte[] mo44377b() {
            return null;
        }

        /* renamed from: a */
        default void mo44375a(mt0.C30881a c30881a) {
        }
    }

    /* renamed from: com.monetization.ads.exo.metadata.Metadata$a */
    /* loaded from: classes7.dex */
    final class C25524a implements Parcelable.Creator<Metadata> {
        C25524a() {
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f66220b = entryArr;
    }

    /* renamed from: a */
    public final Entry m44383a(int i) {
        return this.f66220b[i];
    }

    /* renamed from: c */
    public final int m44380c() {
        return this.f66220b.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            return Arrays.equals(this.f66220b, ((Metadata) obj).f66220b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66220b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f66220b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66220b.length);
        for (Entry entry : this.f66220b) {
            parcel.writeParcelable(entry, 0);
        }
    }

    /* renamed from: a */
    public final Metadata m44382a(@Nullable Metadata metadata) {
        return metadata == null ? this : m44381a(metadata.f66220b);
    }

    public Metadata(List<? extends Entry> list) {
        this.f66220b = (Entry[]) list.toArray(new Entry[0]);
    }

    /* renamed from: a */
    public final Metadata m44381a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) y32.m27065a((Object[]) this.f66220b, (Object[]) entryArr));
    }

    Metadata(Parcel parcel) {
        this.f66220b = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f66220b;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }
}
