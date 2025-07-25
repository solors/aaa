package androidx.compose.p015ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OwnerSnapshotObserver.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1 */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements Function1<Object, Boolean> {
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 INSTANCE = new OwnerSnapshotObserver$clearInvalidObservations$1();

    OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!((OwnerScope) it).isValid());
    }
}
