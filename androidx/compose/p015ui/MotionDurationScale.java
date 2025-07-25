package androidx.compose.p015ui;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MotionDurationScale.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.MotionDurationScale */
/* loaded from: classes.dex */
public interface MotionDurationScale extends CoroutineContext.Element {
    @NotNull
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: MotionDurationScale.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.MotionDurationScale$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MotionDurationScale motionDurationScale, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.C37573a.m17118a(motionDurationScale, r, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull MotionDurationScale motionDurationScale, @NotNull CoroutineContext.InterfaceC37576b<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.C37573a.m17117b(motionDurationScale, key);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MotionDurationScale motionDurationScale, @NotNull CoroutineContext.InterfaceC37576b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.C37573a.m17116c(motionDurationScale, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MotionDurationScale motionDurationScale, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.C37573a.m17115d(motionDurationScale, context);
        }
    }

    /* compiled from: MotionDurationScale.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.MotionDurationScale$Key */
    /* loaded from: classes.dex */
    public static final class Key implements CoroutineContext.InterfaceC37576b<MotionDurationScale> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    /* synthetic */ <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    /* synthetic */ <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b);

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.InterfaceC37576b<?> getKey() {
        return Key;
    }

    float getScaleFactor();

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b);

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
