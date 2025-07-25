package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.C24229q;
import com.moloco.sdk.internal.ortb.model.C24049o;
import com.moloco.sdk.internal.services.InterfaceC24377m;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.publisher.f */
/* loaded from: classes7.dex */
public final class C24107f<T extends AdShowListener> implements InterfaceC24117g0 {
    @NotNull

    /* renamed from: a */
    public final T f62384a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC24377m f62385b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC25403a f62386c;
    @NotNull

    /* renamed from: d */
    public final AdFormatType f62387d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC24117g0 f62388e;

    public C24107f(@NotNull T adShowListener, @NotNull InterfaceC24377m appLifecycleTrackerService, @NotNull InterfaceC25403a customUserEventBuilderService, @NotNull Functions<C24049o> provideSdkEvents, @NotNull Functions<C24213s> provideBUrlData, @NotNull AdFormatType adFormatType) {
        Intrinsics.checkNotNullParameter(adShowListener, "adShowListener");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f62384a = adShowListener;
        this.f62385b = appLifecycleTrackerService;
        this.f62386c = customUserEventBuilderService;
        this.f62387d = adFormatType;
        this.f62388e = C24071b.m47062b(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adFormatType, 96, null);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    /* renamed from: a */
    public void mo46949a(@NotNull C24229q internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f62388e.mo46949a(internalError);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62388e.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62388e.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62388e.onAdShowSuccess(molocoAd);
    }
}
