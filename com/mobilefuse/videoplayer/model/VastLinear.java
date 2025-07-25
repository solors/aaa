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
public final class VastLinear implements VastEventOwner {
    @Nullable
    private final VastClickThrough clickThrough;
    @Nullable
    private final VastTime duration;
    @NotNull
    private final Set<VastEvent> events;
    @NotNull
    private final List<VastIcon> icons;
    @NotNull
    private final List<VastMediaFile> mediaFiles;
    @Nullable
    private final VastTime skipOffset;
    @NotNull
    private final List<VastMediaFile> verifiedMediaFiles;

    public VastLinear(@Nullable VastTime vastTime, @Nullable VastTime vastTime2, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @NotNull List<VastMediaFile> mediaFiles, @NotNull List<VastMediaFile> verifiedMediaFiles, @NotNull List<VastIcon> icons) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(verifiedMediaFiles, "verifiedMediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.skipOffset = vastTime;
        this.duration = vastTime2;
        this.clickThrough = vastClickThrough;
        this.events = events;
        this.mediaFiles = mediaFiles;
        this.verifiedMediaFiles = verifiedMediaFiles;
        this.icons = icons;
    }

    public static /* synthetic */ VastLinear copy$default(VastLinear vastLinear, VastTime vastTime, VastTime vastTime2, VastClickThrough vastClickThrough, Set set, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            vastTime = vastLinear.skipOffset;
        }
        if ((i & 2) != 0) {
            vastTime2 = vastLinear.duration;
        }
        VastTime vastTime3 = vastTime2;
        if ((i & 4) != 0) {
            vastClickThrough = vastLinear.clickThrough;
        }
        VastClickThrough vastClickThrough2 = vastClickThrough;
        Set<VastEvent> set2 = set;
        if ((i & 8) != 0) {
            set2 = vastLinear.getEvents();
        }
        Set set3 = set2;
        List<VastMediaFile> list4 = list;
        if ((i & 16) != 0) {
            list4 = vastLinear.mediaFiles;
        }
        List list5 = list4;
        List<VastMediaFile> list6 = list2;
        if ((i & 32) != 0) {
            list6 = vastLinear.verifiedMediaFiles;
        }
        List list7 = list6;
        List<VastIcon> list8 = list3;
        if ((i & 64) != 0) {
            list8 = vastLinear.icons;
        }
        return vastLinear.copy(vastTime, vastTime3, vastClickThrough2, set3, list5, list7, list8);
    }

    @Nullable
    public final VastTime component1() {
        return this.skipOffset;
    }

    @Nullable
    public final VastTime component2() {
        return this.duration;
    }

    @Nullable
    public final VastClickThrough component3() {
        return this.clickThrough;
    }

    @NotNull
    public final Set<VastEvent> component4() {
        return getEvents();
    }

    @NotNull
    public final List<VastMediaFile> component5() {
        return this.mediaFiles;
    }

    @NotNull
    public final List<VastMediaFile> component6() {
        return this.verifiedMediaFiles;
    }

    @NotNull
    public final List<VastIcon> component7() {
        return this.icons;
    }

    @NotNull
    public final VastLinear copy(@Nullable VastTime vastTime, @Nullable VastTime vastTime2, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @NotNull List<VastMediaFile> mediaFiles, @NotNull List<VastMediaFile> verifiedMediaFiles, @NotNull List<VastIcon> icons) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(verifiedMediaFiles, "verifiedMediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new VastLinear(vastTime, vastTime2, vastClickThrough, events, mediaFiles, verifiedMediaFiles, icons);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastLinear) {
                VastLinear vastLinear = (VastLinear) obj;
                if (!Intrinsics.m17075f(this.skipOffset, vastLinear.skipOffset) || !Intrinsics.m17075f(this.duration, vastLinear.duration) || !Intrinsics.m17075f(this.clickThrough, vastLinear.clickThrough) || !Intrinsics.m17075f(getEvents(), vastLinear.getEvents()) || !Intrinsics.m17075f(this.mediaFiles, vastLinear.mediaFiles) || !Intrinsics.m17075f(this.verifiedMediaFiles, vastLinear.verifiedMediaFiles) || !Intrinsics.m17075f(this.icons, vastLinear.icons)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @Nullable
    public final VastTime getDuration() {
        return this.duration;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    @NotNull
    public final List<VastIcon> getIcons() {
        return this.icons;
    }

    @NotNull
    public final List<VastMediaFile> getMediaFiles() {
        return this.mediaFiles;
    }

    @Nullable
    public final VastTime getSkipOffset() {
        return this.skipOffset;
    }

    @NotNull
    public final List<VastMediaFile> getVerifiedMediaFiles() {
        return this.verifiedMediaFiles;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        VastTime vastTime = this.skipOffset;
        int i7 = 0;
        if (vastTime != null) {
            i = vastTime.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        VastTime vastTime2 = this.duration;
        if (vastTime2 != null) {
            i2 = vastTime2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        VastClickThrough vastClickThrough = this.clickThrough;
        if (vastClickThrough != null) {
            i3 = vastClickThrough.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        Set<VastEvent> events = getEvents();
        if (events != null) {
            i4 = events.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        List<VastMediaFile> list = this.mediaFiles;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        List<VastMediaFile> list2 = this.verifiedMediaFiles;
        if (list2 != null) {
            i6 = list2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        List<VastIcon> list3 = this.icons;
        if (list3 != null) {
            i7 = list3.hashCode();
        }
        return i13 + i7;
    }

    @NotNull
    public String toString() {
        return "VastLinear(skipOffset=" + this.skipOffset + ", duration=" + this.duration + ", clickThrough=" + this.clickThrough + ", events=" + getEvents() + ", mediaFiles=" + this.mediaFiles + ", verifiedMediaFiles=" + this.verifiedMediaFiles + ", icons=" + this.icons + ")";
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
