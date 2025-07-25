package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new Parcelable.Creator<Requirements>() { // from class: com.google.android.exoplayer2.scheduler.Requirements.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    };
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;

    /* renamed from: b */
    private final int f34112b;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface RequirementFlags {
    }

    public Requirements(int i) {
        this.f34112b = (i & 2) != 0 ? i | 1 : i;
    }

    /* renamed from: a */
    private int m73927a(Context context) {
        if (!isNetworkRequired()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) Assertions.checkNotNull(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m73924f(connectivityManager)) {
            if (!isUnmeteredNetworkRequired() || !connectivityManager.isActiveNetworkMetered()) {
                return 0;
            }
            return 2;
        }
        return this.f34112b & 3;
    }

    /* renamed from: c */
    private boolean m73926c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m73925d(Context context) {
        PowerManager powerManager = (PowerManager) Assertions.checkNotNull(context.getSystemService("power"));
        int i = Util.SDK_INT;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m73924f(ConnectivityManager connectivityManager) {
        if (Util.SDK_INT < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    /* renamed from: g */
    private boolean m73923g(Context context) {
        if (context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) {
            return true;
        }
        return false;
    }

    public boolean checkRequirements(Context context) {
        if (getNotMetRequirements(context) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass() && this.f34112b == ((Requirements) obj).f34112b) {
            return true;
        }
        return false;
    }

    public Requirements filterRequirements(int i) {
        int i2 = this.f34112b;
        int i3 = i & i2;
        if (i3 == i2) {
            return this;
        }
        return new Requirements(i3);
    }

    public int getNotMetRequirements(Context context) {
        int m73927a = m73927a(context);
        if (isChargingRequired() && !m73926c(context)) {
            m73927a |= 8;
        }
        if (isIdleRequired() && !m73925d(context)) {
            m73927a |= 4;
        }
        if (isStorageNotLowRequired() && !m73923g(context)) {
            return m73927a | 16;
        }
        return m73927a;
    }

    public int getRequirements() {
        return this.f34112b;
    }

    public int hashCode() {
        return this.f34112b;
    }

    public boolean isChargingRequired() {
        if ((this.f34112b & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isIdleRequired() {
        if ((this.f34112b & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isNetworkRequired() {
        if ((this.f34112b & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isStorageNotLowRequired() {
        if ((this.f34112b & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isUnmeteredNetworkRequired() {
        if ((this.f34112b & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34112b);
    }
}
