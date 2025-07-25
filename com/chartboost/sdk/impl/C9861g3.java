package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.InterfaceC10068na;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.g3 */
/* loaded from: classes3.dex */
public final class C9861g3 implements InterfaceC9844f3, InterfaceC10062n4 {

    /* renamed from: a */
    public final String f22070a;

    /* renamed from: b */
    public final String f22071b;

    /* renamed from: c */
    public final Mediation f22072c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10062n4 f22073d;

    public C9861g3(String adType, String location, Mediation mediation, InterfaceC10062n4 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f22070a = adType;
        this.f22071b = location;
        this.f22072c = mediation;
        this.f22073d = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9844f3
    /* renamed from: a */
    public void mo80101a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        track((AbstractC10024la) new C10187s6(InterfaceC10068na.EnumC10076g.f22712c, message, this.f22070a, this.f22071b, this.f22072c, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9844f3
    /* renamed from: b */
    public void mo80099b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        track((AbstractC10024la) new C9997k4(InterfaceC10068na.EnumC10076g.f22713d, message, this.f22070a, this.f22071b, this.f22072c));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f22073d.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    public AbstractC10024la clearFromStorage(AbstractC10024la abstractC10024la) {
        Intrinsics.checkNotNullParameter(abstractC10024la, "<this>");
        return this.f22073d.clearFromStorage(abstractC10024la);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    public AbstractC10024la persist(AbstractC10024la abstractC10024la) {
        Intrinsics.checkNotNullParameter(abstractC10024la, "<this>");
        return this.f22073d.persist(abstractC10024la);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    public C9986ja refresh(C9986ja c9986ja) {
        Intrinsics.checkNotNullParameter(c9986ja, "<this>");
        return this.f22073d.refresh(c9986ja);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    public C9833ea store(C9833ea c9833ea) {
        Intrinsics.checkNotNullParameter(c9833ea, "<this>");
        return this.f22073d.store(c9833ea);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    public AbstractC10024la track(AbstractC10024la abstractC10024la) {
        Intrinsics.checkNotNullParameter(abstractC10024la, "<this>");
        return this.f22073d.track(abstractC10024la);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: clearFromStorage */
    public void mo110017clearFromStorage(AbstractC10024la event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f22073d.mo110017clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: persist */
    public void mo110018persist(AbstractC10024la event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f22073d.mo110018persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: refresh */
    public void mo110019refresh(C9986ja config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f22073d.mo110019refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: store */
    public void mo110020store(C9833ea ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f22073d.mo110020store(ad2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: track */
    public void mo110021track(AbstractC10024la event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f22073d.mo110021track(event);
    }
}
