package io.ktor.client.engine.android;

import cc.Android;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p033bc.InterfaceC3387h;
import p1060yb.HttpClientJvm;

/* compiled from: Android.kt */
@Metadata
/* loaded from: classes9.dex */
public final class AndroidEngineContainer implements HttpClientJvm {
    @NotNull

    /* renamed from: a */
    private final InterfaceC3387h<?> f98013a = Android.f1951a;

    @Override // p1060yb.HttpClientJvm
    @NotNull
    /* renamed from: a */
    public InterfaceC3387h<?> mo937a() {
        return this.f98013a;
    }

    @NotNull
    public String toString() {
        return "Android";
    }
}
