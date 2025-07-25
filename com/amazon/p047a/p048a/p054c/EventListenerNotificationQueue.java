package com.amazon.p047a.p048a.p054c;

import com.amazon.p047a.p048a.p054c.Event;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.amazon.a.a.c.e */
/* loaded from: classes2.dex */
public class EventListenerNotificationQueue<EventType extends Event> implements Comparator<EventListener<EventType>> {

    /* renamed from: a */
    private static final KiwiLogger f2376a = new KiwiLogger("EventListenerNotificationQueue");

    /* renamed from: b */
    private List<EventListener<EventType>> f2377b = new ArrayList();

    /* renamed from: a */
    public void m103145a(EventListener<EventType> eventListener) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2376a;
            kiwiLogger.m102829a("Adding listener: " + eventListener);
        }
        this.f2377b.add(eventListener);
        Collections.sort(this.f2377b, this);
    }

    /* renamed from: a */
    public void m103146a(EventType eventtype) {
        for (EventListener<EventType> eventListener : this.f2377b) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2376a;
                kiwiLogger.m102829a("Notifying listener: " + eventListener);
            }
            eventListener.mo102723a(eventtype);
        }
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(EventListener<EventType> eventListener, EventListener<EventType> eventListener2) {
        return eventListener.mo102722b().compareTo(eventListener2.mo102722b());
    }
}
