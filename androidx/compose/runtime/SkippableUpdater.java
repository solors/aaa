package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    @NotNull
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m107172boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m107173constructorimpl(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107174equalsimpl(Composer composer, Object obj) {
        if (!(obj instanceof SkippableUpdater) || !Intrinsics.m17075f(composer, ((SkippableUpdater) obj).m107179unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107175equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.m17075f(composer, composer2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107176hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107177toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final void m107178updateimpl(Composer composer, @NotNull Function1<? super Updater<T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(509942095);
        block.invoke(Updater.m107181boximpl(Updater.m107182constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m107174equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m107176hashCodeimpl(this.composer);
    }

    public String toString() {
        return m107177toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m107179unboximpl() {
        return this.composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }
}
