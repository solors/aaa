package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.utils.event.Event;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* loaded from: classes9.dex */
public enum EventTaskType implements KeyHolder {
    Track(Event.DEFAULT_TYPE),
    Open("open"),
    NotifyOpen("notify_open"),
    Skip(EventConstants.SKIP),
    Close("close"),
    Mute("mute"),
    UnMute("unmute"),
    Show("show"),
    Hide("hide"),
    Progress("progress"),
    Schedule("schedule"),
    Start("start"),
    LockVisibility("lock_visibility"),
    UnlockVisibility("unlock_visibility"),
    SimulateClick("simulate_click");
    

    /* renamed from: a */
    private final String f97913a;

    EventTaskType(String str) {
        this.f97913a = str;
    }

    @Nullable
    public static EventTaskType fromKey(@Nullable String str) {
        return (EventTaskType) Utils.fromKey(str, values());
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97913a;
    }
}
