package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.inmobi.media.d9 */
/* loaded from: classes6.dex */
public abstract class AbstractC19246d9 {
    /* renamed from: a */
    public static final EnumC19232c9 m60379a(byte b) {
        if (b == 1) {
            return EnumC19232c9.f48131a;
        }
        if (b == 2) {
            return EnumC19232c9.f48133c;
        }
        if (b == 3) {
            return EnumC19232c9.f48132b;
        }
        if (b == 4) {
            return EnumC19232c9.f48134d;
        }
        return EnumC19232c9.f48131a;
    }

    /* renamed from: b */
    public static final boolean m60377b(EnumC19232c9 enumC19232c9) {
        Intrinsics.checkNotNullParameter(enumC19232c9, "<this>");
        if (enumC19232c9 != EnumC19232c9.f48132b && enumC19232c9 != EnumC19232c9.f48134d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m60378a(EnumC19232c9 enumC19232c9) {
        Intrinsics.checkNotNullParameter(enumC19232c9, "<this>");
        int ordinal = enumC19232c9.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 270;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }
}
