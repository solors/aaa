package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringUtil.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class StringUtil {
    @NotNull
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(@NotNull StringBuilder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            builder.append("?");
            if (i2 < i - 1) {
                builder.append(",");
            }
        }
    }

    @Nullable
    public static final String joinIntoString(@Nullable List<Integer> list) {
        String m17521z0;
        if (list != null) {
            m17521z0 = _Collections.m17521z0(list, ",", null, null, 0, null, null, 62, null);
            return m17521z0;
        }
        return null;
    }

    @NotNull
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r8 = kotlin.text.C37690r.m16612B0(r8, new char[]{','}, false, 0, 6, null);
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<java.lang.Integer> splitToIntList(@org.jetbrains.annotations.Nullable java.lang.String r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L46
            r1 = 1
            char[] r3 = new char[r1]
            r1 = 0
            r2 = 44
            r3[r1] = r2
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            java.util.List r8 = kotlin.text.C37686h.m16726B0(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L46
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L21:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L36
            goto L3f
        L36:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Malformed integer list"
            android.util.Log.e(r3, r4, r2)
            r2 = r0
        L3f:
            if (r2 == 0) goto L21
            r1.add(r2)
            goto L21
        L45:
            r0 = r1
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.StringUtil.splitToIntList(java.lang.String):java.util.List");
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }
}
