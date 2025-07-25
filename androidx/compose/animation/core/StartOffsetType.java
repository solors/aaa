package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public final class StartOffsetType {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m106039constructorimpl(-1);
    private static final int FastForward = m106039constructorimpl(1);
    private final int value;

    /* compiled from: AnimationSpec.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q  reason: not valid java name */
        public final int m106045getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q  reason: not valid java name */
        public final int m106046getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }
    }

    private /* synthetic */ StartOffsetType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m106038boximpl(int i) {
        return new StartOffsetType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106040equalsimpl(int i, Object obj) {
        if (!(obj instanceof StartOffsetType) || i != ((StartOffsetType) obj).m106044unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106041equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106042hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106043toStringimpl(int i) {
        return "StartOffsetType(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m106040equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m106042hashCodeimpl(this.value);
    }

    public String toString() {
        return m106043toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m106044unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m106039constructorimpl(int i) {
        return i;
    }
}
