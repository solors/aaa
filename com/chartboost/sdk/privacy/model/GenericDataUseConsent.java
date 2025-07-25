package com.chartboost.sdk.privacy.model;

import com.chartboost.sdk.impl.AbstractC10024la;
import com.chartboost.sdk.impl.AbstractC9870ga;
import com.chartboost.sdk.impl.C10161r3;
import com.chartboost.sdk.impl.C9833ea;
import com.chartboost.sdk.impl.C9986ja;
import com.chartboost.sdk.impl.InterfaceC10062n4;
import com.chartboost.sdk.impl.InterfaceC10068na;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public abstract class GenericDataUseConsent implements DataUseConsent, InterfaceC10062n4 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10062n4 f23790a;

    /* renamed from: b */
    public String f23791b;

    /* renamed from: c */
    public Object f23792c;

    public GenericDataUseConsent() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public final Object m79717a() {
        return this.f23792c;
    }

    /* renamed from: b */
    public final void m79714b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f23791b = str;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    public void clear(@NotNull String type, @NotNull String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f23790a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    @NotNull
    public AbstractC10024la clearFromStorage(@NotNull AbstractC10024la abstractC10024la) {
        Intrinsics.checkNotNullParameter(abstractC10024la, "<this>");
        return this.f23790a.clearFromStorage(abstractC10024la);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @NotNull
    public String getPrivacyStandard() {
        return this.f23791b;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    @NotNull
    public AbstractC10024la persist(@NotNull AbstractC10024la abstractC10024la) {
        Intrinsics.checkNotNullParameter(abstractC10024la, "<this>");
        return this.f23790a.persist(abstractC10024la);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    @NotNull
    public C9986ja refresh(@NotNull C9986ja c9986ja) {
        Intrinsics.checkNotNullParameter(c9986ja, "<this>");
        return this.f23790a.refresh(c9986ja);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    @NotNull
    public C9833ea store(@NotNull C9833ea c9833ea) {
        Intrinsics.checkNotNullParameter(c9833ea, "<this>");
        return this.f23790a.store(c9833ea);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10062n4
    @NotNull
    public AbstractC10024la track(@NotNull AbstractC10024la abstractC10024la) {
        Intrinsics.checkNotNullParameter(abstractC10024la, "<this>");
        return this.f23790a.track(abstractC10024la);
    }

    public GenericDataUseConsent(@NotNull InterfaceC10062n4 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f23790a = eventTracker;
        this.f23791b = "";
        this.f23792c = "";
    }

    /* renamed from: a */
    public final void m79716a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f23792c = obj;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: clearFromStorage */
    public void mo110017clearFromStorage(@NotNull AbstractC10024la event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f23790a.mo110017clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: persist */
    public void mo110018persist(@NotNull AbstractC10024la event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f23790a.mo110018persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: refresh */
    public void mo110019refresh(@NotNull C9986ja config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f23790a.mo110019refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: store */
    public void mo110020store(@NotNull C9833ea ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f23790a.mo110020store(ad2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10045m4
    /* renamed from: track */
    public void mo110021track(@NotNull AbstractC10024la event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f23790a.mo110021track(event);
    }

    /* renamed from: a */
    public final void m79715a(String str) {
        try {
            track((AbstractC10024la) new C10161r3(InterfaceC10068na.EnumC10073d.f22692e, str == null ? "no message" : str, "", "", null, null, 48, null));
            throw new Exception(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ GenericDataUseConsent(InterfaceC10062n4 interfaceC10062n4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC9870ga.m81607a() : interfaceC10062n4);
    }
}
