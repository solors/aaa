package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface VastAdContent extends VastEventOwner {

    /* compiled from: VastDataModel.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastAdContent vastAdContent, @NotNull EventType eventType) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return VastEventOwner.DefaultImpls.getEvents(vastAdContent, eventType);
        }

        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastAdContent vastAdContent, @NotNull EventType eventType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return VastEventOwner.DefaultImpls.getEvents(vastAdContent, eventType, str);
        }
    }

    @Nullable
    String getAdServingId();

    @Nullable
    String getAdSystem();

    @Nullable
    String getAdTitle();

    @Nullable
    String getAdvertiser();

    @NotNull
    List<VastCreative> getCreativeList();

    @Nullable
    String getDescription();

    @NotNull
    List<VastVerification> getVerificationList();
}
