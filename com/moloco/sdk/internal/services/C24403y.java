package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.y */
/* loaded from: classes7.dex */
public final class C24403y implements InterfaceC24402x {
    @NotNull

    /* renamed from: a */
    public final Context f63138a;

    public C24403y(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63138a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24402x
    /* renamed from: a */
    public int mo46492a() {
        Intent registerReceiver = this.f63138a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return 1;
        }
        return registerReceiver.getIntExtra("status", 1);
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24402x
    /* renamed from: b */
    public int mo46491b() {
        Intent registerReceiver = this.f63138a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("scale", -1);
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24402x
    /* renamed from: c */
    public boolean mo46490c() {
        Object systemService = this.f63138a.getSystemService("power");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }
}
