package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes6.dex */
public final class NoSubscriberEvent {
    public final EventBus eventBus;
    public final Object originalEvent;

    public NoSubscriberEvent(EventBus eventBus, Object obj) {
        this.eventBus = eventBus;
        this.originalEvent = obj;
    }
}
