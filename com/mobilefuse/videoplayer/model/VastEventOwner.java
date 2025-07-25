package com.mobilefuse.videoplayer.model;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface VastEventOwner {

    /* compiled from: VastDataModel.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastEventOwner vastEventOwner, @NotNull EventType eventType) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return vastEventOwner.getEvents(eventType, null);
        }

        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastEventOwner vastEventOwner, @NotNull EventType eventType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (VastEvent vastEvent : vastEventOwner.getEvents()) {
                if (vastEvent.getEventType() == eventType) {
                    if (str == null) {
                        linkedHashSet.add(vastEvent);
                    } else if (vastEvent.getEventName() != null && Intrinsics.m17075f(vastEvent.getEventName(), str)) {
                        linkedHashSet.add(vastEvent);
                    }
                }
            }
            return linkedHashSet;
        }
    }

    @NotNull
    Set<VastEvent> getEvents();

    @NotNull
    Set<VastEvent> getEvents(@NotNull EventType eventType);

    @NotNull
    Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str);
}
