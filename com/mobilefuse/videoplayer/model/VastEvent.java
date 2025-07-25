package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastEvent {
    @Nullable
    private final String eventName;
    @NotNull
    private final EventType eventType;
    @Nullable

    /* renamed from: id */
    private final String f61733id;
    @Nullable
    private final VastTime offset;
    @Nullable
    private final String url;

    public VastEvent(@NotNull EventType eventType, @Nullable String str, @Nullable String str2, @Nullable VastTime vastTime, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.eventName = str;
        this.f61733id = str2;
        this.offset = vastTime;
        this.url = str3;
    }

    public static /* synthetic */ VastEvent copy$default(VastEvent vastEvent, EventType eventType, String str, String str2, VastTime vastTime, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = vastEvent.eventType;
        }
        if ((i & 2) != 0) {
            str = vastEvent.eventName;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = vastEvent.f61733id;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            vastTime = vastEvent.offset;
        }
        VastTime vastTime2 = vastTime;
        if ((i & 16) != 0) {
            str3 = vastEvent.url;
        }
        return vastEvent.copy(eventType, str4, str5, vastTime2, str3);
    }

    @NotNull
    public final EventType component1() {
        return this.eventType;
    }

    @Nullable
    public final String component2() {
        return this.eventName;
    }

    @Nullable
    public final String component3() {
        return this.f61733id;
    }

    @Nullable
    public final VastTime component4() {
        return this.offset;
    }

    @Nullable
    public final String component5() {
        return this.url;
    }

    @NotNull
    public final VastEvent copy(@NotNull EventType eventType, @Nullable String str, @Nullable String str2, @Nullable VastTime vastTime, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new VastEvent(eventType, str, str2, vastTime, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastEvent) {
                VastEvent vastEvent = (VastEvent) obj;
                if (!Intrinsics.m17075f(this.eventType, vastEvent.eventType) || !Intrinsics.m17075f(this.eventName, vastEvent.eventName) || !Intrinsics.m17075f(this.f61733id, vastEvent.f61733id) || !Intrinsics.m17075f(this.offset, vastEvent.offset) || !Intrinsics.m17075f(this.url, vastEvent.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getId() {
        return this.f61733id;
    }

    @Nullable
    public final VastTime getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        EventType eventType = this.eventType;
        int i5 = 0;
        if (eventType != null) {
            i = eventType.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.eventName;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f61733id;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        VastTime vastTime = this.offset;
        if (vastTime != null) {
            i4 = vastTime.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i9 + i5;
    }

    @NotNull
    public String toString() {
        return "VastEvent(eventType=" + this.eventType + ", eventName=" + this.eventName + ", id=" + this.f61733id + ", offset=" + this.offset + ", url=" + this.url + ")";
    }
}
