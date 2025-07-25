package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@VisibleForTesting
/* loaded from: classes5.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @VisibleForTesting
    /* loaded from: classes5.dex */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;
        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @NonNull
        public Geofence build() {
            String str = this.zza;
            if (str != null) {
                int i = this.zzb;
                if (i != 0) {
                    if ((i & 4) != 0 && this.zzi < 0) {
                        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                    }
                    long j = this.zzc;
                    if (j != Long.MIN_VALUE) {
                        if (this.zzd != -1) {
                            int i2 = this.zzh;
                            if (i2 >= 0) {
                                return new com.google.android.gms.internal.location.zzbe(str, i, (short) 1, this.zze, this.zzf, this.zzg, j, i2, this.zzi);
                            }
                            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                        }
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                    throw new IllegalArgumentException("Expiration not set.");
                }
                throw new IllegalArgumentException("Transitions types not set.");
            }
            throw new IllegalArgumentException("Request ID not set.");
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, m105511to = 90.0d) double d, @FloatRange(from = -180.0d, m105511to = 180.0d) double d2, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (d >= -90.0d && d <= 90.0d) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid latitude: ");
            sb2.append(d);
            Preconditions.checkArgument(z, sb2.toString());
            if (d2 >= -180.0d && d2 <= 180.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("Invalid longitude: ");
            sb3.append(d2);
            Preconditions.checkArgument(z2, sb3.toString());
            if (f > 0.0f) {
                z3 = true;
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("Invalid radius: ");
            sb4.append(f);
            Preconditions.checkArgument(z3, sb4.toString());
            this.zzd = (short) 1;
            this.zze = d;
            this.zzf = d2;
            this.zzg = f;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j;
            }
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i) {
            this.zzi = i;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i) {
            this.zzh = i;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i) {
            this.zzb = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes5.dex */
    public @interface GeofenceTransition {
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes5.dex */
    public @interface TransitionTypes {
    }

    @NonNull
    String getRequestId();
}
