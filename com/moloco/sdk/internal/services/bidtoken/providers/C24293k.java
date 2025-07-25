package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import com.moloco.sdk.internal.services.AbstractC24347f;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.k */
/* loaded from: classes7.dex */
public final class C24293k {

    /* renamed from: a */
    public final boolean f62900a;
    @NotNull

    /* renamed from: b */
    public final MolocoPrivacy.PrivacySettings f62901b;
    @NotNull

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f62902c;
    @NotNull

    /* renamed from: d */
    public final C24283d f62903d;
    @NotNull

    /* renamed from: e */
    public final C24303q f62904e;
    @NotNull

    /* renamed from: f */
    public final C24289h f62905f;
    @NotNull

    /* renamed from: g */
    public final AbstractC24347f f62906g;
    @NotNull

    /* renamed from: h */
    public final C24298n f62907h;
    @NotNull

    /* renamed from: i */
    public final C24286f f62908i;
    @NotNull

    /* renamed from: j */
    public final C24278a f62909j;

    public C24293k(boolean z, @NotNull MolocoPrivacy.PrivacySettings privacySettings, @NotNull ActivityManager.MemoryInfo memoryInfo, @NotNull C24283d appDirInfo, @NotNull C24303q networkInfoSignal, @NotNull C24289h batteryInfoSignal, @NotNull AbstractC24347f adDataSignal, @NotNull C24298n deviceSignal, @NotNull C24286f audioSignal, @NotNull C24278a accessibilitySignal) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        this.f62900a = z;
        this.f62901b = privacySettings;
        this.f62902c = memoryInfo;
        this.f62903d = appDirInfo;
        this.f62904e = networkInfoSignal;
        this.f62905f = batteryInfoSignal;
        this.f62906g = adDataSignal;
        this.f62907h = deviceSignal;
        this.f62908i = audioSignal;
        this.f62909j = accessibilitySignal;
    }

    @NotNull
    /* renamed from: a */
    public final C24278a m46659a() {
        return this.f62909j;
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC24347f m46658b() {
        return this.f62906g;
    }

    @NotNull
    /* renamed from: c */
    public final C24283d m46657c() {
        return this.f62903d;
    }

    @NotNull
    /* renamed from: d */
    public final C24286f m46656d() {
        return this.f62908i;
    }

    @NotNull
    /* renamed from: e */
    public final C24289h m46655e() {
        return this.f62905f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24293k)) {
            return false;
        }
        C24293k c24293k = (C24293k) obj;
        if (this.f62900a == c24293k.f62900a && Intrinsics.m17075f(this.f62901b, c24293k.f62901b) && Intrinsics.m17075f(this.f62902c, c24293k.f62902c) && Intrinsics.m17075f(this.f62903d, c24293k.f62903d) && Intrinsics.m17075f(this.f62904e, c24293k.f62904e) && Intrinsics.m17075f(this.f62905f, c24293k.f62905f) && Intrinsics.m17075f(this.f62906g, c24293k.f62906g) && Intrinsics.m17075f(this.f62907h, c24293k.f62907h) && Intrinsics.m17075f(this.f62908i, c24293k.f62908i) && Intrinsics.m17075f(this.f62909j, c24293k.f62909j)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final C24298n m46654f() {
        return this.f62907h;
    }

    @NotNull
    /* renamed from: g */
    public final ActivityManager.MemoryInfo m46653g() {
        return this.f62902c;
    }

    @NotNull
    /* renamed from: h */
    public final C24303q m46652h() {
        return this.f62904e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public int hashCode() {
        boolean z = this.f62900a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((((((r0 * 31) + this.f62901b.hashCode()) * 31) + this.f62902c.hashCode()) * 31) + this.f62903d.hashCode()) * 31) + this.f62904e.hashCode()) * 31) + this.f62905f.hashCode()) * 31) + this.f62906g.hashCode()) * 31) + this.f62907h.hashCode()) * 31) + this.f62908i.hashCode()) * 31) + this.f62909j.hashCode();
    }

    @NotNull
    /* renamed from: i */
    public final MolocoPrivacy.PrivacySettings m46651i() {
        return this.f62901b;
    }

    /* renamed from: j */
    public final boolean m46650j() {
        return this.f62900a;
    }

    @NotNull
    public String toString() {
        return "ClientSignals(sdkInitialized=" + this.f62900a + ", privacySettings=" + this.f62901b + ", memoryInfo=" + this.f62902c + ", appDirInfo=" + this.f62903d + ", networkInfoSignal=" + this.f62904e + ", batteryInfoSignal=" + this.f62905f + ", adDataSignal=" + this.f62906g + ", deviceSignal=" + this.f62907h + ", audioSignal=" + this.f62908i + ", accessibilitySignal=" + this.f62909j + ')';
    }
}
