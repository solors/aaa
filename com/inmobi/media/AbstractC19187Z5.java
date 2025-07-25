package com.inmobi.media;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.Z5 */
/* loaded from: classes6.dex */
public abstract class AbstractC19187Z5 {

    /* renamed from: a */
    public static byte f48035a;

    /* renamed from: b */
    public static boolean f48036b;

    /* renamed from: a */
    public static final void m60514a(byte b, @NotNull String tag, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (f48036b) {
            System.out.println((Object) str);
        }
        if (b == 1) {
            byte b2 = f48035a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Intrinsics.m17074g(str);
                Log.e("[InMobi]", str);
            }
        } else if (b == 2) {
            byte b3 = f48035a;
            if (2 == b3 || 3 == b3) {
                Intrinsics.m17074g(str);
                Log.d("[InMobi]", str);
            }
        } else if (b == 3) {
            Intrinsics.m17074g(str);
            if (str.length() > 4000) {
                m60509b(tag, str);
            } else {
                Log.d(tag, str);
            }
        }
    }

    /* renamed from: b */
    public static void m60509b(String str, String str2) {
        if (str2.length() > 4000) {
            String substring = str2.substring(0, 4000);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.d(str, substring);
            String substring2 = str2.substring(4000);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            m60509b(str, substring2);
            return;
        }
        Log.d(str, str2);
    }

    /* renamed from: a */
    public static final void m60512a(@NotNull String tag, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        m60514a((byte) 3, tag, str);
    }

    /* renamed from: a */
    public static final void m60511a(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        m60513a((byte) 3, str, str2, th);
    }

    /* renamed from: a */
    public static final void m60513a(byte b, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        if (f48036b) {
            System.out.println((Object) str2);
        }
        if (b == 1) {
            byte b2 = f48035a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Log.e("[InMobi]", str2, th);
            }
        } else if (b != 2) {
            if (b == 3) {
                Log.d(str, str2, th);
            }
        } else {
            byte b3 = f48035a;
            if (2 == b3 || 3 == b3) {
                Log.d("[InMobi]", str2, th);
            }
        }
    }

    /* renamed from: a */
    public static final void m60515a(byte b) {
        f48035a = b;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public static final void m60510a(boolean z) {
        f48036b = z;
    }
}
