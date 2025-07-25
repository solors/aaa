package com.mobilefuse.videoplayer;

import com.mobilefuse.videoplayer.model.VastPlayerCapability;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VideoPlayerCapabilities.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VideoPlayerCapabilities {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Set<VastPlayerCapability> restrictedCapabilitiesToChange;
    @NotNull
    private final Set<VastPlayerCapability> capabilities;

    /* compiled from: VideoPlayerCapabilities.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        restrictedCapabilitiesToChange = linkedHashSet;
        linkedHashSet.add(VastPlayerCapability.ICON);
        linkedHashSet.add(VastPlayerCapability.AUTOPLAY);
        linkedHashSet.add(VastPlayerCapability.MUTED_AUTOPLAY);
    }

    public VideoPlayerCapabilities() {
        HashSet hashSet = new HashSet();
        this.capabilities = hashSet;
        hashSet.add(VastPlayerCapability.ICON);
        hashSet.add(VastPlayerCapability.AUTOPLAY);
        hashSet.add(VastPlayerCapability.MUTED_AUTOPLAY);
    }

    public final void changeCapability(@NotNull VastPlayerCapability capability, boolean z) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        if (restrictedCapabilitiesToChange.contains(capability)) {
            return;
        }
        if (z) {
            this.capabilities.add(capability);
        } else {
            this.capabilities.remove(capability);
        }
    }

    @NotNull
    public final Set<VastPlayerCapability> getCapabilities() {
        return this.capabilities;
    }
}
