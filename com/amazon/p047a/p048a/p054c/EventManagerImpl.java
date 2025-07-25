package com.amazon.p047a.p048a.p054c;

import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.a.a.c.g */
/* loaded from: classes2.dex */
public class EventManagerImpl implements EventManager {

    /* renamed from: a */
    private static final KiwiLogger f2378a = new KiwiLogger("EventManagerImpl");

    /* renamed from: b */
    private final Map<EventIdentity, EventListenerNotificationQueue<?>> f2379b = new HashMap();

    @Override // com.amazon.p047a.p048a.p054c.EventManager
    /* renamed from: a */
    public <T extends Event> void mo103142a(EventListener<T> eventListener) {
        Assert.m102872a((Object) eventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Assert.m102876a();
        EventIdentity mo102725a = eventListener.mo102725a();
        KiwiLogger kiwiLogger = f2378a;
        kiwiLogger.m102829a("Registering listener for event: " + mo102725a + ", " + eventListener);
        EventListenerNotificationQueue<?> eventListenerNotificationQueue = this.f2379b.get(mo102725a);
        if (eventListenerNotificationQueue == null) {
            eventListenerNotificationQueue = new EventListenerNotificationQueue<>();
            this.f2379b.put(mo102725a, eventListenerNotificationQueue);
        }
        eventListenerNotificationQueue.m103145a((EventListener<?>) eventListener);
    }

    @Override // com.amazon.p047a.p048a.p054c.EventManager
    /* renamed from: a */
    public void mo103143a(Event event) {
        EventIdentity mo103147a = event.mo103147a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2378a;
            kiwiLogger.m102829a("Posting event: " + mo103147a);
        }
        if (!this.f2379b.containsKey(mo103147a)) {
            if (KiwiLogger.f2770a) {
                f2378a.m102829a("No registered listeners, returning");
                return;
            }
            return;
        }
        this.f2379b.get(mo103147a).m103146a((EventListenerNotificationQueue<?>) event);
    }
}
