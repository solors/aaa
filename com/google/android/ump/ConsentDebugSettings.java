package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public class ConsentDebugSettings {

    /* renamed from: a */
    private final boolean f39278a;

    /* renamed from: b */
    private final int f39279b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: b */
        private final Context f39281b;

        /* renamed from: d */
        private boolean f39283d;

        /* renamed from: a */
        private final List f39280a = new ArrayList();

        /* renamed from: c */
        private int f39282c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f39281b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f39280a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z = true;
            if (!zzct.zza(true) && !this.f39280a.contains(zzcl.zza(this.f39281b)) && !this.f39283d) {
                z = false;
            }
            return new ConsentDebugSettings(z, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.f39282c = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z) {
            this.f39283d = z;
            return this;
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    /* synthetic */ ConsentDebugSettings(boolean z, Builder builder, zza zzaVar) {
        this.f39278a = z;
        this.f39279b = builder.f39282c;
    }

    public int getDebugGeography() {
        return this.f39279b;
    }

    public boolean isTestDevice() {
        return this.f39278a;
    }
}
