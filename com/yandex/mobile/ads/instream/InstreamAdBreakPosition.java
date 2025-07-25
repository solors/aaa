package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

@Metadata
/* loaded from: classes8.dex */
public final class InstreamAdBreakPosition {
    @NotNull

    /* renamed from: a */
    private final Type f89176a;

    /* renamed from: b */
    private final long f89177b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes8.dex */
    public static final class Type {
        public static final Type MILLISECONDS;
        public static final Type PERCENTS;
        public static final Type POSITION;

        /* renamed from: b */
        private static final /* synthetic */ Type[] f89178b;

        static {
            Type type = new Type(0, "PERCENTS");
            PERCENTS = type;
            Type type2 = new Type(1, "MILLISECONDS");
            MILLISECONDS = type2;
            Type type3 = new Type(2, "POSITION");
            POSITION = type3;
            Type[] typeArr = {type, type2, type3};
            f89178b = typeArr;
            C44401b.m3113a(typeArr);
        }

        private Type(int i, String str) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f89178b.clone();
        }
    }

    public InstreamAdBreakPosition(@NotNull Type positionType, long j) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        this.f89176a = positionType;
        this.f89177b = j;
    }

    @NotNull
    public final Type getPositionType() {
        return this.f89176a;
    }

    public final long getValue() {
        return this.f89177b;
    }
}
