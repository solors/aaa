package androidx.compose.p015ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.key.KeyEvent */
/* loaded from: classes.dex */
public final class KeyEvent {
    @NotNull
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEvent m108744boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static android.view.KeyEvent m108745constructorimpl(@NotNull android.view.KeyEvent nativeKeyEvent) {
        Intrinsics.checkNotNullParameter(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108746equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        if (!(obj instanceof KeyEvent) || !Intrinsics.m17075f(keyEvent, ((KeyEvent) obj).m108750unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108747equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return Intrinsics.m17075f(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108748hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108749toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m108746equalsimpl(this.nativeKeyEvent, obj);
    }

    @NotNull
    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m108748hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m108749toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m108750unboximpl() {
        return this.nativeKeyEvent;
    }
}
