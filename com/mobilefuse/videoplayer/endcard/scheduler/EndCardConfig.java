package com.mobilefuse.videoplayer.endcard.scheduler;

import com.mobilefuse.videoplayer.model.VastCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EndCardConfig.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EndCardConfig {
    @NotNull
    private final Functions<Boolean> autoCloseAllowed;
    private final long autoCloseDelayMillis;
    private final float closeButtonDelaySeconds;
    @NotNull
    private final VastCompanion companion;
    private final boolean isClosable;
    private final boolean isThumbnailSize;

    public EndCardConfig(@NotNull VastCompanion companion, boolean z, float f, boolean z2, @NotNull Functions<Boolean> autoCloseAllowed, long j) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(autoCloseAllowed, "autoCloseAllowed");
        this.companion = companion;
        this.isClosable = z;
        this.closeButtonDelaySeconds = f;
        this.isThumbnailSize = z2;
        this.autoCloseAllowed = autoCloseAllowed;
        this.autoCloseDelayMillis = j;
    }

    public static /* synthetic */ EndCardConfig copy$default(EndCardConfig endCardConfig, VastCompanion vastCompanion, boolean z, float f, boolean z2, Functions functions, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            vastCompanion = endCardConfig.companion;
        }
        if ((i & 2) != 0) {
            z = endCardConfig.isClosable;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            f = endCardConfig.closeButtonDelaySeconds;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            z2 = endCardConfig.isThumbnailSize;
        }
        boolean z4 = z2;
        Functions<Boolean> functions2 = functions;
        if ((i & 16) != 0) {
            functions2 = endCardConfig.autoCloseAllowed;
        }
        Functions functions3 = functions2;
        if ((i & 32) != 0) {
            j = endCardConfig.autoCloseDelayMillis;
        }
        return endCardConfig.copy(vastCompanion, z3, f2, z4, functions3, j);
    }

    @NotNull
    public final VastCompanion component1() {
        return this.companion;
    }

    public final boolean component2() {
        return this.isClosable;
    }

    public final float component3() {
        return this.closeButtonDelaySeconds;
    }

    public final boolean component4() {
        return this.isThumbnailSize;
    }

    @NotNull
    public final Functions<Boolean> component5() {
        return this.autoCloseAllowed;
    }

    public final long component6() {
        return this.autoCloseDelayMillis;
    }

    @NotNull
    public final EndCardConfig copy(@NotNull VastCompanion companion, boolean z, float f, boolean z2, @NotNull Functions<Boolean> autoCloseAllowed, long j) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(autoCloseAllowed, "autoCloseAllowed");
        return new EndCardConfig(companion, z, f, z2, autoCloseAllowed, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof EndCardConfig) {
                EndCardConfig endCardConfig = (EndCardConfig) obj;
                if (!Intrinsics.m17075f(this.companion, endCardConfig.companion) || this.isClosable != endCardConfig.isClosable || Float.compare(this.closeButtonDelaySeconds, endCardConfig.closeButtonDelaySeconds) != 0 || this.isThumbnailSize != endCardConfig.isThumbnailSize || !Intrinsics.m17075f(this.autoCloseAllowed, endCardConfig.autoCloseAllowed) || this.autoCloseDelayMillis != endCardConfig.autoCloseDelayMillis) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final Functions<Boolean> getAutoCloseAllowed() {
        return this.autoCloseAllowed;
    }

    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    public final float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @NotNull
    public final VastCompanion getCompanion() {
        return this.companion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        VastCompanion vastCompanion = this.companion;
        int i2 = 0;
        if (vastCompanion != null) {
            i = vastCompanion.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        boolean z = this.isClosable;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int hashCode = (((i3 + i5) * 31) + Float.hashCode(this.closeButtonDelaySeconds)) * 31;
        boolean z2 = this.isThumbnailSize;
        if (!z2) {
            i4 = z2 ? 1 : 0;
        }
        int i6 = (hashCode + i4) * 31;
        Functions<Boolean> functions = this.autoCloseAllowed;
        if (functions != null) {
            i2 = functions.hashCode();
        }
        return ((i6 + i2) * 31) + Long.hashCode(this.autoCloseDelayMillis);
    }

    public final boolean isClosable() {
        return this.isClosable;
    }

    public final boolean isThumbnailSize() {
        return this.isThumbnailSize;
    }

    @NotNull
    public String toString() {
        return "EndCardConfig(companion=" + this.companion + ", isClosable=" + this.isClosable + ", closeButtonDelaySeconds=" + this.closeButtonDelaySeconds + ", isThumbnailSize=" + this.isThumbnailSize + ", autoCloseAllowed=" + this.autoCloseAllowed + ", autoCloseDelayMillis=" + this.autoCloseDelayMillis + ")";
    }
}
