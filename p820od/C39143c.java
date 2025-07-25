package p820od;

import com.ironsource.C21114v8;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ListBuilder.kt */
@Metadata
/* renamed from: od.c */
/* loaded from: classes7.dex */
public final class C39143c {
    @NotNull
    /* renamed from: d */
    public static final <E> E[] m13821d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @NotNull
    /* renamed from: e */
    public static final <T> T[] m13820e(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    /* renamed from: f */
    public static final <E> void m13819f(@NotNull E[] eArr, int i) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i] = null;
    }

    /* renamed from: g */
    public static final <E> void m13818g(@NotNull E[] eArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i < i2) {
            m13819f(eArr, i);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final <T> boolean m13817h(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!Intrinsics.m17075f(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final <T> int m13816i(T[] tArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            T t = tArr[i + i5];
            int i6 = i4 * 31;
            if (t != null) {
                i3 = t.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final <T> String m13815j(T[] tArr, int i, int i2, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i2 * 3) + 2);
        sb2.append(C21114v8.C21123i.f54137d);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb2.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t);
            }
        }
        sb2.append(C21114v8.C21123i.f54139e);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
