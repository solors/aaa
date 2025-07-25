package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new C10863a();
    @Nullable
    private final byte[] mParcelableBytes;

    /* renamed from: com.facebook.ads.internal.util.parcelable.WrappedParcelable$a */
    /* loaded from: classes3.dex */
    class C10863a implements Parcelable.Creator<WrappedParcelable> {
        C10863a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public WrappedParcelable[] newArray(int i) {
            return new WrappedParcelable[i];
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.mParcelableBytes = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.mParcelableBytes;
        if (bArr != null) {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(classLoader);
            obtain.recycle();
            return readParcelable;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.mParcelableBytes);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.mParcelableBytes = marshallParcelable(parcelable);
    }

    public WrappedParcelable(@Nullable byte[] bArr) {
        this.mParcelableBytes = bArr;
    }
}
