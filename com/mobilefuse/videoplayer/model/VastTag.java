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
public final class VastTag implements VastEventOwner {
    @NotNull
    private final List<VastDataModel> adList;
    @NotNull
    private final Set<VastEvent> events;
    private final String vastVersion;

    public VastTag(@Nullable String str, @NotNull Set<VastEvent> events, @NotNull List<VastDataModel> adList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adList, "adList");
        this.vastVersion = str;
        this.events = events;
        this.adList = adList;
    }

    private final String component1() {
        return this.vastVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastTag copy$default(VastTag vastTag, String str, Set set, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastTag.vastVersion;
        }
        if ((i & 2) != 0) {
            set = vastTag.getEvents();
        }
        if ((i & 4) != 0) {
            list = vastTag.adList;
        }
        return vastTag.copy(str, set, list);
    }

    @NotNull
    public final Set<VastEvent> component2() {
        return getEvents();
    }

    @NotNull
    public final List<VastDataModel> component3() {
        return this.adList;
    }

    @NotNull
    public final VastTag copy(@Nullable String str, @NotNull Set<VastEvent> events, @NotNull List<VastDataModel> adList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adList, "adList");
        return new VastTag(str, events, adList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastTag) {
                VastTag vastTag = (VastTag) obj;
                if (!Intrinsics.m17075f(this.vastVersion, vastTag.vastVersion) || !Intrinsics.m17075f(getEvents(), vastTag.getEvents()) || !Intrinsics.m17075f(this.adList, vastTag.adList)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final List<VastDataModel> getAdList() {
        return this.adList;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.vastVersion;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Set<VastEvent> events = getEvents();
        if (events != null) {
            i2 = events.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<VastDataModel> list = this.adList;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i5 + i3;
    }

    @NotNull
    public String toString() {
        return "VastTag(vastVersion=" + this.vastVersion + ", events=" + getEvents() + ", adList=" + this.adList + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
