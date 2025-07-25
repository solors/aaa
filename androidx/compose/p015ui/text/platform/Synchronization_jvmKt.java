package androidx.compose.p015ui.text.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Synchronization.jvm.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.Synchronization_jvmKt */
/* loaded from: classes.dex */
public final class Synchronization_jvmKt {
    @NotNull
    public static final SynchronizedObject createSynchronizedObject() {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m109576synchronized(@NotNull SynchronizedObject lock, @NotNull Functions<? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                invoke = block.invoke();
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        return invoke;
    }
}
