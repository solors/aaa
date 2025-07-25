package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;

/* loaded from: classes9.dex */
public enum EventType implements KeyHolder {
    OnImpression("on_impression"),
    OnClick("on_click"),
    OnMute("on_mute"),
    OnUnMute("on_unmute"),
    OnPause("on_pause"),
    OnResume("on_resume"),
    OnSkip("on_skip"),
    OnClose("on_close"),
    OnStart("on_start"),
    OnFirstQuartile("on_first_quartile"),
    OnMidpoint("on_midpoint"),
    OnThirdQuartile("on_third_quartile"),
    OnComplete("on_complete"),
    OnProgress("on_progress"),
    OnUseCustomClose("on_use_custom_close"),
    OnScheduled("on_scheduled"),
    OnNavigate("on_navigate");
    

    /* renamed from: a */
    private final String f97915a;

    EventType(String str) {
        this.f97915a = str;
    }

    @Nullable
    public static EventType fromKey(@Nullable String str) {
        return (EventType) Utils.fromKey(str, values());
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97915a;
    }
}
