package com.monetization.ads.exo.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C25591a();

    /* renamed from: b */
    private final int f66425b;

    /* renamed from: com.monetization.ads.exo.scheduler.Requirements$a */
    /* loaded from: classes7.dex */
    final class C25591a implements Parcelable.Creator<Requirements> {
        C25591a() {
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.f66425b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r2.hasCapability(16) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m44305a(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = r6.m44302e()
            r1 = 2
            if (r0 != 0) goto L8
            goto L48
        L8:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r7.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()
            if (r2 == 0) goto L4a
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto L4a
            int r2 = com.yandex.mobile.ads.impl.y32.f88010a
            r3 = 24
            if (r2 >= r3) goto L26
            goto L3b
        L26:
            android.net.Network r2 = r0.getActiveNetwork()
            if (r2 != 0) goto L2d
            goto L4a
        L2d:
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r2)     // Catch: java.lang.SecurityException -> L3b
            if (r2 == 0) goto L4a
            r3 = 16
            boolean r2 = r2.hasCapability(r3)     // Catch: java.lang.SecurityException -> L3b
            if (r2 == 0) goto L4a
        L3b:
            int r2 = r6.f66425b
            r2 = r2 & r1
            if (r2 == 0) goto L48
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L48
            r0 = r1
            goto L4e
        L48:
            r0 = 0
            goto L4e
        L4a:
            int r0 = r6.f66425b
            r0 = r0 & 3
        L4e:
            boolean r2 = r6.m44304c()
            r3 = 0
            if (r2 == 0) goto L72
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r4)
            android.content.Intent r2 = r7.registerReceiver(r3, r2)
            if (r2 != 0) goto L63
            goto L70
        L63:
            java.lang.String r4 = "status"
            r5 = -1
            int r2 = r2.getIntExtra(r4, r5)
            if (r2 == r1) goto L72
            r1 = 5
            if (r2 != r1) goto L70
            goto L72
        L70:
            r0 = r0 | 8
        L72:
            boolean r1 = r6.m44303d()
            if (r1 == 0) goto La4
            java.lang.String r1 = "power"
            java.lang.Object r1 = r7.getSystemService(r1)
            r1.getClass()
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            int r2 = com.yandex.mobile.ads.impl.y32.f88010a
            r4 = 23
            if (r2 < r4) goto L90
            boolean r1 = r1.isDeviceIdleMode()
            if (r1 != 0) goto La4
            goto La2
        L90:
            r4 = 20
            if (r2 < r4) goto L9b
            boolean r1 = r1.isInteractive()
            if (r1 != 0) goto La2
            goto La4
        L9b:
            boolean r1 = r1.isScreenOn()
            if (r1 != 0) goto La2
            goto La4
        La2:
            r0 = r0 | 4
        La4:
            boolean r1 = r6.m44301f()
            if (r1 == 0) goto Lba
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.<init>(r2)
            android.content.Intent r7 = r7.registerReceiver(r3, r1)
            if (r7 != 0) goto Lb8
            goto Lba
        Lb8:
            r0 = r0 | 16
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.scheduler.Requirements.m44305a(android.content.Context):int");
    }

    /* renamed from: c */
    public final boolean m44304c() {
        if ((this.f66425b & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m44303d() {
        if ((this.f66425b & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m44302e() {
        if ((this.f66425b & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass() && this.f66425b == ((Requirements) obj).f66425b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m44301f() {
        if ((this.f66425b & 16) != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66425b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66425b);
    }
}
