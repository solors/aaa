package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scaffold.kt */
@Metadata
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Center = m106956constructorimpl(0);
    private static final int End = m106956constructorimpl(1);

    /* compiled from: Scaffold.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-5ygKITE  reason: not valid java name */
        public final int m106962getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE  reason: not valid java name */
        public final int m106963getEnd5ygKITE() {
            return FabPosition.End;
        }
    }

    private /* synthetic */ FabPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FabPosition m106955boximpl(int i) {
        return new FabPosition(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106957equalsimpl(int i, Object obj) {
        if (!(obj instanceof FabPosition) || i != ((FabPosition) obj).m106961unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106958equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106959hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106960toStringimpl(int i) {
        if (m106958equalsimpl0(i, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m106957equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m106959hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m106960toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m106961unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m106956constructorimpl(int i) {
        return i;
    }
}
