package com.facebook.ads.internal.androidx.support.p368v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.p368v4.view.AbsSavedState;
import java.util.Arrays;

/* renamed from: com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState */
/* loaded from: assets/audience_network.dex */
public abstract class AbsSavedState implements Parcelable {
    public static byte[] A01;
    public static final AbsSavedState A02;
    public static final Parcelable.Creator<AbsSavedState> CREATOR;
    public final Parcelable A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{85, 83, 86, 67, 84, 117, 82, 71, 82, 67, 6, 75, 83, 85, 82, 6, 72, 73, 82, 6, 68, 67, 6, 72, 83, 74, 74};
    }

    static {
        A01();
        A02 = new AbsSavedState() { // from class: com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState.1
        };
        CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() { // from class: com.facebook.ads.redexgen.X.32
            public static byte[] A00;

            static {
                A03();
            }

            public static String A02(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A00 = new byte[]{23, 25, 20, 9, 22, -9, 24, 5, 24, 9, -60, 17, 25, 23, 24, -60, 6, 9, -60, 18, 25, 16, 16};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00 */
            public final AbsSavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: A01 */
            public final AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcelable superState = parcel.readParcelable(classLoader);
                if (superState == null) {
                    return AbsSavedState.A02;
                }
                throw new IllegalStateException(A02(0, 23, 86));
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A04 */
            public final AbsSavedState[] newArray(int i) {
                return new AbsSavedState[i];
            }
        };
    }

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable superState = parcel.readParcelable(classLoader);
        this.A00 = superState == null ? A02 : superState;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A02 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException(A00(0, 27, 76));
    }

    public final Parcelable A02() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
