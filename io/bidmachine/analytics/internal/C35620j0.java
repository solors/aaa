package io.bidmachine.analytics.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.j0 */
/* loaded from: classes9.dex */
public final class C35620j0 {

    /* renamed from: a */
    private final String f96494a;

    /* renamed from: b */
    private final EnumC35621a f96495b;

    /* renamed from: c */
    private final String f96496c;

    /* renamed from: io.bidmachine.analytics.internal.j0$a */
    /* loaded from: classes9.dex */
    public enum EnumC35621a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public C35620j0(String str, EnumC35621a enumC35621a, String str2) {
        this.f96494a = str;
        this.f96495b = enumC35621a;
        this.f96496c = str2;
    }

    /* renamed from: a */
    public final String m20187a() {
        return this.f96494a;
    }

    /* renamed from: b */
    public final String m20186b() {
        return this.f96496c;
    }

    /* renamed from: c */
    public final EnumC35621a m20185c() {
        return this.f96495b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35620j0)) {
            return false;
        }
        C35620j0 c35620j0 = (C35620j0) obj;
        if (Intrinsics.m17075f(this.f96494a, c35620j0.f96494a) && this.f96495b == c35620j0.f96495b && Intrinsics.m17075f(this.f96496c, c35620j0.f96496c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f96494a.hashCode() * 31) + this.f96495b.hashCode()) * 31) + this.f96496c.hashCode();
    }

    public String toString() {
        return "TrackerError(name=" + this.f96494a + ", type=" + this.f96495b + ", reason=" + this.f96496c + ')';
    }

    public /* synthetic */ C35620j0(String str, EnumC35621a enumC35621a, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC35621a, (i & 4) != 0 ? "" : str2);
    }
}
