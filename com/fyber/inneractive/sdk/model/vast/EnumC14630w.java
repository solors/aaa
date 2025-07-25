package com.fyber.inneractive.sdk.model.vast;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* renamed from: com.fyber.inneractive.sdk.model.vast.w */
/* loaded from: classes4.dex */
public enum EnumC14630w {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_PAUSE("pause"),
    EVENT_RESUME("resume"),
    EVENT_FULLSCREEN("fullscreen"),
    EVENT_EXIT_FULLSCREEN(C32664c2oc2i.c222o2o2c2o),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND("expand"),
    EVENT_COLLAPSE(C32664c2oc2i.ciio2c),
    EVENT_CLOSE_LINEAR("closeLinear"),
    EVENT_PROGRESS("progress"),
    EVENT_SKIP(EventConstants.SKIP),
    UNKNOWN("UnkownEvent");
    
    private static final Map<String, EnumC14630w> sEventsMap = new HashMap();
    private final String mKey;

    static {
        EnumC14630w[] values;
        for (EnumC14630w enumC14630w : values()) {
            sEventsMap.put(enumC14630w.mKey, enumC14630w);
        }
    }

    EnumC14630w(String str) {
        this.mKey = str;
    }

    /* renamed from: a */
    public final String m77746a() {
        return this.mKey;
    }

    /* renamed from: a */
    public static EnumC14630w m77745a(String str) {
        Map<String, EnumC14630w> map = sEventsMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
