package com.unity3d.ads.core.data.datasource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class VolumeSettingsChange {

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z) {
            super(null);
            this.isMuted = z;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = muteChange.isMuted;
            }
            return muteChange.copy(z);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        @NotNull
        public final MuteChange copy(boolean z) {
            return new MuteChange(z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z = this.isMuted;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        @NotNull
        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d) {
            super(null);
            this.volume = d;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = volumeChange.volume;
            }
            return volumeChange.copy(d);
        }

        public final double component1() {
            return this.volume;
        }

        @NotNull
        public final VolumeChange copy(double d) {
            return new VolumeChange(d);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0) {
                return true;
            }
            return false;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            return Double.hashCode(this.volume);
        }

        @NotNull
        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    private VolumeSettingsChange() {
    }

    public /* synthetic */ VolumeSettingsChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
