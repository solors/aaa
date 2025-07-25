package com.ironsource;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.i0 */
/* loaded from: classes6.dex */
public final class C20071i0 {
    @NotNull

    /* renamed from: a */
    public static final C20071i0 f50500a = new C20071i0();
    @NotNull

    /* renamed from: b */
    private static final HashMap<String, Long> f50501b = new HashMap<>();

    private C20071i0() {
    }

    @NotNull
    /* renamed from: a */
    public final HashMap<String, Long> m58068a() {
        return f50501b;
    }

    /* renamed from: b */
    public final long m58065b(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = f50501b.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    /* renamed from: c */
    public final long m58064c(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = f50501b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* renamed from: a */
    public final boolean m58067a(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> hashMap = f50501b;
        if (hashMap.get(instance) != null) {
            hashMap.remove(instance);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m58066a(@NotNull String instance, long j) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!(instance.length() == 0)) {
            HashMap<String, Long> hashMap = f50501b;
            if (!hashMap.containsKey(instance)) {
                hashMap.put(instance, Long.valueOf(j));
                return true;
            }
        }
        return false;
    }
}
