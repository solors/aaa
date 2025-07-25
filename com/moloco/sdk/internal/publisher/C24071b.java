package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.C23980h;
import com.moloco.sdk.internal.C24414w;
import com.moloco.sdk.internal.InterfaceC23978f;
import com.moloco.sdk.internal.InterfaceC24408u;
import com.moloco.sdk.internal.ortb.model.C24049o;
import com.moloco.sdk.internal.services.InterfaceC24377m;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.publisher.b */
/* loaded from: classes7.dex */
public final class C24071b {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC24117g0 m47063a(@Nullable AdShowListener adShowListener, @NotNull InterfaceC24377m appLifecycleTrackerService, @NotNull InterfaceC25403a customUserEventBuilderService, @NotNull Functions<C24049o> provideSdkEvents, @NotNull Functions<C24213s> provideBUrlData, @NotNull InterfaceC24408u sdkEventUrlTracker, @NotNull InterfaceC23978f bUrlTracker, @NotNull AdFormatType adType) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new C24119h0(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, sdkEventUrlTracker, bUrlTracker, adType);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC24117g0 m47062b(AdShowListener adShowListener, InterfaceC24377m interfaceC24377m, InterfaceC25403a interfaceC25403a, Functions functions, Functions functions2, InterfaceC24408u interfaceC24408u, InterfaceC23978f interfaceC23978f, AdFormatType adFormatType, int i, Object obj) {
        InterfaceC24408u interfaceC24408u2;
        InterfaceC23978f interfaceC23978f2;
        if ((i & 32) != 0) {
            interfaceC24408u2 = C24414w.m46475a();
        } else {
            interfaceC24408u2 = interfaceC24408u;
        }
        if ((i & 64) != 0) {
            interfaceC23978f2 = C23980h.m47245a();
        } else {
            interfaceC23978f2 = interfaceC23978f;
        }
        return m47063a(adShowListener, interfaceC24377m, interfaceC25403a, functions, functions2, interfaceC24408u2, interfaceC23978f2, adFormatType);
    }
}
