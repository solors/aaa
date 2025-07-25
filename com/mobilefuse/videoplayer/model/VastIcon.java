package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastIcon implements VastEventOwner {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static int NEXT_ICON_ID = 1;
    @Nullable
    private final VastClickThrough clickThrough;
    @Nullable
    private final VastTime duration;
    @NotNull
    private final Set<VastEvent> events;
    @Nullable
    private final Integer height;
    @Nullable
    private final VastTime offset;
    @Nullable
    private final String program;
    @Nullable
    private final VastBaseResource resource;
    @NotNull
    private final String uid;
    @Nullable
    private final Integer width;

    /* compiled from: VastDataModel.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VastIcon(@Nullable String str, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource vastBaseResource, @Nullable Integer num, @Nullable Integer num2, @Nullable VastTime vastTime, @Nullable VastTime vastTime2) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.program = str;
        this.clickThrough = vastClickThrough;
        this.events = events;
        this.resource = vastBaseResource;
        this.width = num;
        this.height = num2;
        this.offset = vastTime;
        this.duration = vastTime2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("icon-");
        int i = NEXT_ICON_ID;
        NEXT_ICON_ID = i + 1;
        sb2.append(i);
        this.uid = sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastIcon copy$default(VastIcon vastIcon, String str, VastClickThrough vastClickThrough, Set set, VastBaseResource vastBaseResource, Integer num, Integer num2, VastTime vastTime, VastTime vastTime2, int i, Object obj) {
        String str2;
        VastClickThrough vastClickThrough2;
        Set<VastEvent> set2;
        VastBaseResource vastBaseResource2;
        Integer num3;
        Integer num4;
        VastTime vastTime3;
        VastTime vastTime4;
        if ((i & 1) != 0) {
            str2 = vastIcon.program;
        } else {
            str2 = str;
        }
        if ((i & 2) != 0) {
            vastClickThrough2 = vastIcon.clickThrough;
        } else {
            vastClickThrough2 = vastClickThrough;
        }
        if ((i & 4) != 0) {
            set2 = vastIcon.getEvents();
        } else {
            set2 = set;
        }
        if ((i & 8) != 0) {
            vastBaseResource2 = vastIcon.resource;
        } else {
            vastBaseResource2 = vastBaseResource;
        }
        if ((i & 16) != 0) {
            num3 = vastIcon.width;
        } else {
            num3 = num;
        }
        if ((i & 32) != 0) {
            num4 = vastIcon.height;
        } else {
            num4 = num2;
        }
        if ((i & 64) != 0) {
            vastTime3 = vastIcon.offset;
        } else {
            vastTime3 = vastTime;
        }
        if ((i & 128) != 0) {
            vastTime4 = vastIcon.duration;
        } else {
            vastTime4 = vastTime2;
        }
        return vastIcon.copy(str2, vastClickThrough2, set2, vastBaseResource2, num3, num4, vastTime3, vastTime4);
    }

    @Nullable
    public final String component1() {
        return this.program;
    }

    @Nullable
    public final VastClickThrough component2() {
        return this.clickThrough;
    }

    @NotNull
    public final Set<VastEvent> component3() {
        return getEvents();
    }

    @Nullable
    public final VastBaseResource component4() {
        return this.resource;
    }

    @Nullable
    public final Integer component5() {
        return this.width;
    }

    @Nullable
    public final Integer component6() {
        return this.height;
    }

    @Nullable
    public final VastTime component7() {
        return this.offset;
    }

    @Nullable
    public final VastTime component8() {
        return this.duration;
    }

    @NotNull
    public final VastIcon copy(@Nullable String str, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource vastBaseResource, @Nullable Integer num, @Nullable Integer num2, @Nullable VastTime vastTime, @Nullable VastTime vastTime2) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new VastIcon(str, vastClickThrough, events, vastBaseResource, num, num2, vastTime, vastTime2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastIcon) {
                VastIcon vastIcon = (VastIcon) obj;
                if (!Intrinsics.m17075f(this.program, vastIcon.program) || !Intrinsics.m17075f(this.clickThrough, vastIcon.clickThrough) || !Intrinsics.m17075f(getEvents(), vastIcon.getEvents()) || !Intrinsics.m17075f(this.resource, vastIcon.resource) || !Intrinsics.m17075f(this.width, vastIcon.width) || !Intrinsics.m17075f(this.height, vastIcon.height) || !Intrinsics.m17075f(this.offset, vastIcon.offset) || !Intrinsics.m17075f(this.duration, vastIcon.duration)) {
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

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final VastTime getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getProgram() {
        return this.program;
    }

    @Nullable
    public final VastBaseResource getResource() {
        return this.resource;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.program;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        VastClickThrough vastClickThrough = this.clickThrough;
        if (vastClickThrough != null) {
            i2 = vastClickThrough.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        Set<VastEvent> events = getEvents();
        if (events != null) {
            i3 = events.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        VastBaseResource vastBaseResource = this.resource;
        if (vastBaseResource != null) {
            i4 = vastBaseResource.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        Integer num = this.width;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i6 = num2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        VastTime vastTime = this.offset;
        if (vastTime != null) {
            i7 = vastTime.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        VastTime vastTime2 = this.duration;
        if (vastTime2 != null) {
            i8 = vastTime2.hashCode();
        }
        return i15 + i8;
    }

    @NotNull
    public String toString() {
        return "VastIcon(program=" + this.program + ", clickThrough=" + this.clickThrough + ", events=" + getEvents() + ", resource=" + this.resource + ", width=" + this.width + ", height=" + this.height + ", offset=" + this.offset + ", duration=" + this.duration + ")";
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
