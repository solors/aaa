package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.internal.ortb.model.C24049o;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C24527f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24526e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC25373j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting(otherwise = 2)
/* renamed from: com.moloco.sdk.internal.publisher.b0 */
/* loaded from: classes7.dex */
public final class C24072b0<T extends AdShowListener> {
    @Nullable

    /* renamed from: a */
    public InterfaceC25373j<InterfaceC24526e, C24527f> f62240a;
    @Nullable

    /* renamed from: b */
    public C24049o f62241b;
    @Nullable

    /* renamed from: c */
    public C24213s f62242c;
    @Nullable

    /* renamed from: d */
    public InterfaceC37708b2 f62243d;
    @Nullable

    /* renamed from: e */
    public InterfaceC24117g0 f62244e;

    public C24072b0(@Nullable InterfaceC25373j<InterfaceC24526e, C24527f> interfaceC25373j, @Nullable C24049o c24049o, @Nullable C24213s c24213s, @Nullable InterfaceC37708b2 interfaceC37708b2, @Nullable InterfaceC24117g0 interfaceC24117g0) {
        this.f62240a = interfaceC25373j;
        this.f62241b = c24049o;
        this.f62242c = c24213s;
        this.f62243d = interfaceC37708b2;
        this.f62244e = interfaceC24117g0;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC25373j<InterfaceC24526e, C24527f> m47061a() {
        return this.f62240a;
    }

    /* renamed from: b */
    public final void m47060b(@Nullable C24049o c24049o) {
        this.f62241b = c24049o;
    }

    /* renamed from: c */
    public final void m47059c(@Nullable C24213s c24213s) {
        this.f62242c = c24213s;
    }

    /* renamed from: d */
    public final void m47058d(@Nullable InterfaceC24117g0 interfaceC24117g0) {
        this.f62244e = interfaceC24117g0;
    }

    /* renamed from: e */
    public final void m47057e(@Nullable InterfaceC25373j<InterfaceC24526e, C24527f> interfaceC25373j) {
        this.f62240a = interfaceC25373j;
    }

    /* renamed from: f */
    public final void m47056f(@Nullable InterfaceC37708b2 interfaceC37708b2) {
        this.f62243d = interfaceC37708b2;
    }

    @Nullable
    /* renamed from: g */
    public final InterfaceC37708b2 m47055g() {
        return this.f62243d;
    }

    @Nullable
    /* renamed from: h */
    public final C24213s m47054h() {
        return this.f62242c;
    }

    @Nullable
    /* renamed from: i */
    public final InterfaceC24117g0 m47053i() {
        return this.f62244e;
    }

    @Nullable
    /* renamed from: j */
    public final C24049o m47052j() {
        return this.f62241b;
    }

    public /* synthetic */ C24072b0(InterfaceC25373j interfaceC25373j, C24049o c24049o, C24213s c24213s, InterfaceC37708b2 interfaceC37708b2, InterfaceC24117g0 interfaceC24117g0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC25373j, (i & 2) != 0 ? null : c24049o, (i & 4) != 0 ? null : c24213s, (i & 8) != 0 ? null : interfaceC37708b2, (i & 16) != 0 ? null : interfaceC24117g0);
    }
}
