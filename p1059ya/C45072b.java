package p1059ya;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Collections.kt */
@Metadata
/* renamed from: ya.b */
/* loaded from: classes8.dex */
public final class C45072b {
    /* renamed from: a */
    public static final boolean m1012a(@NotNull List<?>... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int length = items.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            List<?> list = items[i];
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final <K, V> Map<K, V> m1011b() {
        return new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: c */
    public static final <T> List<T> m1010c(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (TypeIntrinsics.m16999l(list)) {
            List<T> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n        Collections.un…st(ArrayList(this))\n    }");
            return unmodifiableList;
        }
        return list;
    }
}
