package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public final class Updater<T> {
    @NotNull
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Updater m107181boximpl(Composer composer) {
        return new Updater(composer);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m107182constructorimpl(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107183equalsimpl(Composer composer, Object obj) {
        if (!(obj instanceof Updater) || !Intrinsics.m17075f(composer, ((Updater) obj).m107193unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107184equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.m17075f(composer, composer2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107185hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl  reason: not valid java name */
    public static final void m107186initimpl(Composer composer, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (composer.getInserting()) {
            composer.apply(Unit.f99208a, new Updater$init$1(block));
        }
    }

    /* renamed from: reconcile-impl  reason: not valid java name */
    public static final void m107187reconcileimpl(Composer composer, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.apply(Unit.f99208a, new Updater$reconcile$1(block));
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m107188setimpl(Composer composer, int i, @NotNull Function2<? super T, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (composer.getInserting() || !Intrinsics.m17075f(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            composer.apply(Integer.valueOf(i), block);
        }
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107190toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final void m107191updateimpl(Composer composer, int i, @NotNull Function2<? super T, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.m17075f(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i), block);
        }
    }

    public boolean equals(Object obj) {
        return m107183equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m107185hashCodeimpl(this.composer);
    }

    public String toString() {
        return m107190toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m107193unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final <V> void m107189setimpl(Composer composer, V v, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (composer.getInserting() || !Intrinsics.m17075f(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, block);
        }
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final <V> void m107192updateimpl(Composer composer, V v, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.m17075f(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            composer.apply(v, block);
        }
    }

    public static /* synthetic */ void getComposer$annotations() {
    }
}
