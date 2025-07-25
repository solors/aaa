package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.K3 */
/* loaded from: classes9.dex */
public final class C34006K3 implements InterfaceC34106O7 {

    /* renamed from: a */
    public final C33982J3 f93098a;

    /* renamed from: b */
    public final List f93099b;

    public C34006K3(@NotNull C33982J3 c33982j3, @NotNull List<C33982J3> list) {
        this.f93098a = c33982j3;
        this.f93099b = list;
    }

    @NotNull
    /* renamed from: a */
    public final C34006K3 m22502a(@NotNull C33982J3 c33982j3, @NotNull List<C33982J3> list) {
        return new C34006K3(c33982j3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34106O7
    /* renamed from: b */
    public final Object mo20867b() {
        return this.f93098a;
    }

    @NotNull
    /* renamed from: c */
    public final C33982J3 m22500c() {
        return this.f93098a;
    }

    @NotNull
    /* renamed from: d */
    public final List<C33982J3> m22499d() {
        return this.f93099b;
    }

    @NotNull
    /* renamed from: e */
    public final C33982J3 m22498e() {
        return this.f93098a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34006K3)) {
            return false;
        }
        C34006K3 c34006k3 = (C34006K3) obj;
        if (Intrinsics.m17075f(this.f93098a, c34006k3.f93098a) && Intrinsics.m17075f(this.f93099b, c34006k3.f93099b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f93099b.hashCode() + (this.f93098a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClidsInfo(chosen=" + this.f93098a + ", candidates=" + this.f93099b + ')';
    }

    /* renamed from: a */
    public static C34006K3 m22501a(C34006K3 c34006k3, C33982J3 c33982j3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c33982j3 = c34006k3.f93098a;
        }
        if ((i & 2) != 0) {
            list = c34006k3.f93099b;
        }
        c34006k3.getClass();
        return new C34006K3(c33982j3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34106O7
    @NotNull
    /* renamed from: a */
    public final List<C33982J3> mo20868a() {
        return this.f93099b;
    }
}
