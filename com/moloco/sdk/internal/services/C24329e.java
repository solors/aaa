package com.moloco.sdk.internal.services;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.e */
/* loaded from: classes7.dex */
public final class C24329e implements InterfaceC24319c {
    @NotNull

    /* renamed from: a */
    public final Context f62998a;

    public C24329e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62998a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24319c
    /* renamed from: a */
    public boolean mo46590a() {
        if (Settings.Secure.getInt(this.f62998a.getContentResolver(), "reduce_bright_colors_activated") == 1) {
            return true;
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24319c
    /* renamed from: b */
    public boolean mo46589b() {
        Object systemService = this.f62998a.getSystemService("accessibility");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (!((AccessibilityManager) systemService).isEnabled() || Settings.Secure.getInt(this.f62998a.getContentResolver(), "accessibility_large_pointer_icon", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24319c
    /* renamed from: c */
    public boolean mo46588c() {
        Object systemService = this.f62998a.getSystemService("captioning");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
        return ((CaptioningManager) systemService).isEnabled();
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24319c
    public float getFontScale() {
        Object systemService = this.f62998a.getSystemService("accessibility");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((AccessibilityManager) systemService).isEnabled()) {
            return this.f62998a.getResources().getConfiguration().fontScale;
        }
        return 1.0f;
    }
}
