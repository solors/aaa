package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.b2 */
/* loaded from: classes6.dex */
public final class C19612b2 {

    /* renamed from: a */
    private final long f49215a;

    public C19612b2(long j) {
        this.f49215a = j;
    }

    /* renamed from: a */
    public final long m59382a() {
        return this.f49215a;
    }

    /* renamed from: b */
    public final long m59379b() {
        return this.f49215a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19612b2) && this.f49215a == ((C19612b2) obj).f49215a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.f49215a);
    }

    @NotNull
    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f49215a + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19612b2 m59381a(long j) {
        return new C19612b2(j);
    }

    /* renamed from: a */
    public static /* synthetic */ C19612b2 m59380a(C19612b2 c19612b2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c19612b2.f49215a;
        }
        return c19612b2.m59381a(j);
    }
}
