package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.smaato.sdk.core.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* loaded from: classes7.dex */
public enum VastEvent {
    CREATIVE_VIEW("creativeView", true),
    START("start", true),
    FIRST_QUARTILE("firstQuartile", true),
    MID_POINT("midpoint", true),
    THIRD_QUARTILE("thirdQuartile", true),
    COMPLETE("complete", true),
    OTHER_AD_INTERACTION(EventConstants.OTHER_AD_INTERACTION, false),
    PROGRESS("progress", false),
    CREATIVE_VIEW_COMPANION("creativeViewCompanion", true),
    PAUSE("pause", false),
    RESUME("resume", false),
    REWIND("rewind", false),
    SKIP(EventConstants.SKIP, false),
    MUTE("mute", false),
    UNMUTE("unmute", false),
    PLAYER_EXPAND(EventConstants.PLAYER_EXPAND, false),
    PLAYER_COLLAPSE(EventConstants.PLAYER_COLLAPSE, false),
    LOADED(C21114v8.C21122h.f54087r, true),
    CLOSE_LINEAR("closeLinear", true),
    CLOSE("close", true);
    
    public static final Set<VastEvent> EVENTS_WITH_OFFSET = getEvent();
    @NonNull
    public final String key;
    public final boolean oneTime;

    VastEvent(String str, boolean z) {
        this.key = (String) Objects.requireNonNull(str);
        this.oneTime = z;
    }

    private static Set<VastEvent> getEvent() {
        HashSet hashSet = new HashSet();
        hashSet.add(PROGRESS);
        hashSet.add(START);
        hashSet.add(FIRST_QUARTILE);
        hashSet.add(MID_POINT);
        hashSet.add(THIRD_QUARTILE);
        return Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    public static VastEvent parse(@Nullable String str) {
        VastEvent[] values;
        for (VastEvent vastEvent : values()) {
            if (vastEvent.key.equalsIgnoreCase(str)) {
                return vastEvent;
            }
        }
        return null;
    }
}
