package com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.analytics.C32805atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;

/* loaded from: classes8.dex */
public class EventAction extends Action {
    protected static final String EVENT_DEFAULT_PARAM = "_event_default_param_";
    private String mEventName;

    public EventAction(String str) {
        this(str, null);
    }

    public EventAction(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C32821atntntntanaan.atntatt("EventAction", "eventName is null when constructing EventAction!");
        }
        this.mEventName = str;
        addEventId(str);
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            addParam("_event_default_param_", str2);
        }
        this.mMap.put(C32805atnntnannta.atnananannnt, str);
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        this.mMap.put("_event_default_param_", str2);
    }
}
