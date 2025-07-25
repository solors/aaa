package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25413b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.events.c */
/* loaded from: classes7.dex */
public final class C24344c implements InterfaceC25413b {
    @NotNull

    /* renamed from: a */
    public C24346e f63039a;

    public C24344c() {
        C24346e c24346e;
        c24346e = C24345d.f63040a;
        this.f63039a = c24346e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25413b
    /* renamed from: a */
    public void mo44596a(boolean z, boolean z2, @NotNull String appForegroundUrl, @NotNull String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f63039a = new C24346e(z, z2, appForegroundUrl, appBackgroundUrl);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25413b
    /* renamed from: b */
    public boolean mo44595b() {
        return this.f63039a.m46554d();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25413b
    /* renamed from: c */
    public boolean mo44594c() {
        return this.f63039a.m46555c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25413b
    @NotNull
    /* renamed from: d */
    public String mo44593d() {
        return this.f63039a.m46556b();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25413b
    @NotNull
    /* renamed from: a */
    public String mo44597a() {
        return this.f63039a.m46557a();
    }
}
