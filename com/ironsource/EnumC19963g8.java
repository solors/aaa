package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.g8 */
/* loaded from: classes6.dex */
public enum EnumC19963g8 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);
    
    @NotNull

    /* renamed from: c */
    public static final C19964a f50190c = new C19964a(null);
    @NotNull

    /* renamed from: a */
    private final String f50195a;

    /* renamed from: b */
    private final long f50196b;

    @Metadata
    /* renamed from: com.ironsource.g8$a */
    /* loaded from: classes6.dex */
    public static final class C19964a {
        private C19964a() {
        }

        public /* synthetic */ C19964a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final EnumC19963g8 m58448a(@Nullable String str) {
            EnumC19963g8[] values;
            for (EnumC19963g8 enumC19963g8 : EnumC19963g8.values()) {
                if (Intrinsics.m17075f(enumC19963g8.f50195a, str)) {
                    return enumC19963g8;
                }
            }
            return null;
        }
    }

    EnumC19963g8(String str, long j) {
        this.f50195a = str;
        this.f50196b = j;
    }

    /* renamed from: a */
    public static /* synthetic */ long m58450a(EnumC19963g8 enumC19963g8, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = 1;
            }
            return enumC19963g8.m58449a(num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
    }

    /* renamed from: a */
    public final long m58449a(@Nullable Integer num) {
        return (num != null ? num.intValue() : 1) * this.f50196b;
    }
}
