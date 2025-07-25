package com.unity3d.services.ads.gmascar.utils;

import androidx.annotation.NonNull;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* loaded from: classes7.dex */
public class GMAEventSender implements IEventSender {
    private final IEventSender _eventSender;

    public GMAEventSender() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return this._eventSender.canSend();
    }

    public void send(GMAEvent gMAEvent, Object... objArr) {
        this._eventSender.sendEvent(WebViewEventCategory.GMA, gMAEvent, objArr);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NonNull Enum<?> r2, @NonNull Enum<?> r3, @NonNull Object... objArr) {
        return this._eventSender.sendEvent(r2, r3, objArr);
    }

    public void sendVersion(String str) {
        this._eventSender.sendEvent(WebViewEventCategory.INIT_GMA, GMAEvent.VERSION, str);
    }

    public GMAEventSender(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }
}
