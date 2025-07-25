package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugMetadata.kt */
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.g */
/* loaded from: classes7.dex */
public final class C37590g {
    /* renamed from: a */
    private static final void m17090a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final DebugMetadata m17089b(ContinuationImpl continuationImpl) {
        return (DebugMetadata) continuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    /* renamed from: c */
    private static final int m17088c(ContinuationImpl continuationImpl) {
        Integer num;
        int i;
        try {
            Field declaredField = continuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(continuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    /* renamed from: d */
    public static final StackTraceElement m17087d(@NotNull ContinuationImpl continuationImpl) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(continuationImpl, "<this>");
        DebugMetadata m17089b = m17089b(continuationImpl);
        if (m17089b == null) {
            return null;
        }
        m17090a(1, m17089b.m17091v());
        int m17088c = m17088c(continuationImpl);
        if (m17088c < 0) {
            i = -1;
        } else {
            i = m17089b.m17093l()[m17088c];
        }
        String m17082b = C37592i.f99294a.m17082b(continuationImpl);
        if (m17082b == null) {
            str = m17089b.m17095c();
        } else {
            str = m17082b + '/' + m17089b.m17095c();
        }
        return new StackTraceElement(str, m17089b.m17092m(), m17089b.m17094f(), i);
    }
}
