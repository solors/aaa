package androidx.compose.p015ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageVector.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.Stack */
/* loaded from: classes.dex */
final class Stack<T> {
    @NotNull
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Stack m108112boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> ArrayList<T> m108113constructorimpl(@NotNull ArrayList<T> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        return backing;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ ArrayList m108114constructorimpl$default(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m108113constructorimpl(arrayList);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108115equalsimpl(ArrayList<T> arrayList, Object obj) {
        if (!(obj instanceof Stack) || !Intrinsics.m17075f(arrayList, ((Stack) obj).m108123unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108116equalsimpl0(ArrayList<?> arrayList, ArrayList<?> arrayList2) {
        return Intrinsics.m17075f(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static final int m108117getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108118hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: peek-impl  reason: not valid java name */
    public static final T m108119peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m108117getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl  reason: not valid java name */
    public static final T m108120popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m108117getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl  reason: not valid java name */
    public static final boolean m108121pushimpl(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108122toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m108115equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m108118hashCodeimpl(this.backing);
    }

    public String toString() {
        return m108122toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ ArrayList m108123unboximpl() {
        return this.backing;
    }
}
