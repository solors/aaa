package androidx.compose.p015ui.text;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TempListUtils.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.TempListUtilsKt */
/* loaded from: classes.dex */
public final class TempListUtilsKt {
    private static final <T> void appendElement(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        boolean z;
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    @NotNull
    public static final <T, K> List<T> fastDistinctBy(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (T) list.get(i);
            if (hashSet.add(selector.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> fastDrop(@NotNull List<? extends T> list, int i) {
        boolean z;
        Object m17577B0;
        List<T> m17175e;
        List<T> m17166m;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return list;
            }
            int size = list.size() - i;
            if (size <= 0) {
                m17166m = C37563v.m17166m();
                return m17166m;
            } else if (size == 1) {
                m17577B0 = _Collections.m17577B0(list);
                m17175e = CollectionsJVM.m17175e(m17577B0);
                return m17175e;
            } else {
                ArrayList arrayList = new ArrayList(size);
                int size2 = list.size();
                while (i < size2) {
                    arrayList.add(list.get(i));
                    i++;
                }
                return arrayList;
            }
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> fastFilter(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (T) list.get(i);
            if (predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilterNot(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (T) list.get(i);
            if (!predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilterNotNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastFlatMap(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MutableCollections.m17624D(arrayList, transform.invoke((T) list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@NotNull List<? extends T> list, R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = operation.mo105910invoke(r, (T) list.get(i));
        }
        return r;
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = APSSharedUtil.TRUNCATE_SEPARATOR;
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return fastJoinTo(list, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb2 = ((StringBuilder) fastJoinTo(list, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> selector) {
        int m17164o;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R invoke = selector.invoke(t);
        m17164o = C37563v.m17164o(list);
        int i = 1;
        if (1 <= m17164o) {
            while (true) {
                T t2 = list.get(i);
                R invoke2 = selector.invoke(t2);
                if (invoke.compareTo(invoke2) > 0) {
                    t = t2;
                    invoke = invoke2;
                }
                if (i == m17164o) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    @NotNull
    public static final <T> List<T> fastTakeWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (T) list.get(i);
            if (!predicate.invoke(obj).booleanValue()) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
