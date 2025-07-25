package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mn */
/* loaded from: classes6.dex */
public final class C20479mn {

    /* renamed from: a */
    private final boolean f52073a;

    /* renamed from: b */
    private final int f52074b;

    public C20479mn() {
        this(false, 0, 3, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C20479mn m56260a(C20479mn c20479mn, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c20479mn.f52073a;
        }
        if ((i2 & 2) != 0) {
            i = c20479mn.f52074b;
        }
        return c20479mn.m56259a(z, i);
    }

    /* renamed from: b */
    public final int m56258b() {
        return this.f52074b;
    }

    /* renamed from: c */
    public final int m56257c() {
        return this.f52074b;
    }

    /* renamed from: d */
    public final boolean m56256d() {
        return this.f52073a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20479mn)) {
            return false;
        }
        C20479mn c20479mn = (C20479mn) obj;
        if (this.f52073a == c20479mn.f52073a && this.f52074b == c20479mn.f52074b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f52073a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.f52074b);
    }

    @NotNull
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f52073a + ", flags=" + this.f52074b + ')';
    }

    public C20479mn(boolean z, int i) {
        this.f52073a = z;
        this.f52074b = i;
    }

    @NotNull
    /* renamed from: a */
    public final C20479mn m56259a(boolean z, int i) {
        return new C20479mn(z, i);
    }

    public /* synthetic */ C20479mn(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }

    /* renamed from: a */
    public final boolean m56261a() {
        return this.f52073a;
    }
}
