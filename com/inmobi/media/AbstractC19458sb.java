package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sb */
/* loaded from: classes6.dex */
public abstract class AbstractC19458sb {
    /* renamed from: a */
    public static final short m59910a(EnumC19506w3 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 12:
                    return (short) 2123;
                case 13:
                    return (short) 2124;
                case 14:
                    return (short) 2125;
                case 15:
                    return (short) 2126;
                case 16:
                    return (short) 2127;
            }
        }
        return (short) 2122;
    }
}
