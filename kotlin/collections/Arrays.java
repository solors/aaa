package kotlin.collections;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.UByteArray;
import p804nd.UIntArray;
import p804nd.ULongArray;
import p804nd.UShortArray;
import p836pd._UArrays;

@Metadata
/* renamed from: kotlin.collections.n */
/* loaded from: classes7.dex */
public class Arrays extends ArraysJVM {
    @NotNull
    /* renamed from: c */
    public static <T> String m17416c(@Nullable T[] tArr) {
        int m16912j;
        if (tArr != null) {
            m16912j = _Ranges.m16912j(tArr.length, 429496729);
            StringBuilder sb2 = new StringBuilder((m16912j * 5) + 2);
            m17415d(tArr, sb2, new ArrayList());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
        return "null";
    }

    /* renamed from: d */
    private static final <T> void m17415d(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        int m17164o;
        String m13184d;
        String m13186b;
        String m13185c;
        String m13187a;
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb2.append(", ");
            }
            T t = tArr[i];
            if (t == null) {
                sb2.append("null");
            } else if (t instanceof Object[]) {
                m17415d((Object[]) t, sb2, list);
            } else if (t instanceof byte[]) {
                String arrays = java.util.Arrays.toString((byte[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                sb2.append(arrays);
            } else if (t instanceof short[]) {
                String arrays2 = java.util.Arrays.toString((short[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays2, "toString(...)");
                sb2.append(arrays2);
            } else if (t instanceof int[]) {
                String arrays3 = java.util.Arrays.toString((int[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays3, "toString(...)");
                sb2.append(arrays3);
            } else if (t instanceof long[]) {
                String arrays4 = java.util.Arrays.toString((long[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays4, "toString(...)");
                sb2.append(arrays4);
            } else if (t instanceof float[]) {
                String arrays5 = java.util.Arrays.toString((float[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays5, "toString(...)");
                sb2.append(arrays5);
            } else if (t instanceof double[]) {
                String arrays6 = java.util.Arrays.toString((double[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays6, "toString(...)");
                sb2.append(arrays6);
            } else if (t instanceof char[]) {
                String arrays7 = java.util.Arrays.toString((char[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays7, "toString(...)");
                sb2.append(arrays7);
            } else if (t instanceof boolean[]) {
                String arrays8 = java.util.Arrays.toString((boolean[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays8, "toString(...)");
                sb2.append(arrays8);
            } else if (t instanceof UByteArray) {
                m13187a = _UArrays.m13187a(((UByteArray) t).m14510s());
                sb2.append(m13187a);
            } else if (t instanceof UShortArray) {
                m13185c = _UArrays.m13185c(((UShortArray) t).m14568s());
                sb2.append(m13185c);
            } else if (t instanceof UIntArray) {
                m13186b = _UArrays.m13186b(((UIntArray) t).m14487s());
                sb2.append(m13186b);
            } else if (t instanceof ULongArray) {
                m13184d = _UArrays.m13184d(((ULongArray) t).m14595s());
                sb2.append(m13184d);
            } else {
                sb2.append(t.toString());
            }
        }
        sb2.append(']');
        m17164o = C37563v.m17164o(list);
        list.remove(m17164o);
    }

    @NotNull
    /* renamed from: e */
    public static <T> List<T> m17414e(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        for (T[] tArr2 : tArr) {
            i += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] tArr3 : tArr) {
            MutableCollections.m17622F(arrayList, tArr3);
        }
        return arrayList;
    }
}
