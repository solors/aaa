package com.inmobi.media;

import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.z0 */
/* loaded from: classes6.dex */
public final class C19545z0 {

    /* renamed from: a */
    public final String f48950a;

    /* renamed from: b */
    public String f48951b;

    /* renamed from: c */
    public Boolean f48952c;

    public C19545z0() {
        String simpleName = C19545z0.class.getSimpleName();
        this.f48950a = simpleName;
        Intrinsics.m17074g(simpleName);
    }

    @Nullable
    /* renamed from: a */
    public final String m59530a() {
        return this.f48951b;
    }

    /* renamed from: b */
    public final String m59527b() {
        return this.f48950a;
    }

    @Nullable
    /* renamed from: c */
    public final Boolean m59526c() {
        return this.f48952c;
    }

    /* renamed from: a */
    public final void m59529a(@Nullable String str) {
        this.f48951b = str;
    }

    @VisibleForTesting(otherwise = 4)
    /* renamed from: a */
    public final void m59528a(boolean z) {
        Intrinsics.m17074g(this.f48950a);
        this.f48952c = Boolean.valueOf(z);
    }
}
