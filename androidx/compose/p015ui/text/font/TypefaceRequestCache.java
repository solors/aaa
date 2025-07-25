package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.caches.LruCache;
import androidx.compose.p015ui.text.font.TypefaceResult;
import androidx.compose.p015ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p015ui.text.platform.SynchronizedObject;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontFamilyResolver.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache */
/* loaded from: classes.dex */
public final class TypefaceRequestCache {
    @NotNull
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    @NotNull
    private final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache<>(16);

    @Nullable
    public final TypefaceResult get$ui_text_release(@NotNull TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        synchronized (this.lock) {
            typefaceResult = this.resultCache.get(typefaceRequest);
        }
        return typefaceResult;
    }

    @NotNull
    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.lock) {
            size = this.resultCache.size();
        }
        return size;
    }

    public final void preWarmCache(@NotNull List<TypefaceRequest> typefaceRequests, @NotNull Function1<? super TypefaceRequest, ? extends TypefaceResult> resolveTypeface) {
        TypefaceResult typefaceResult;
        Intrinsics.checkNotNullParameter(typefaceRequests, "typefaceRequests");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        int size = typefaceRequests.size();
        for (int i = 0; i < size; i++) {
            TypefaceRequest typefaceRequest = typefaceRequests.get(i);
            synchronized (this.lock) {
                typefaceResult = this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult invoke = resolveTypeface.invoke(typefaceRequest);
                    if (invoke instanceof TypefaceResult.Async) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.resultCache.put(typefaceRequest, invoke);
                        }
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            }
        }
    }

    @NotNull
    public final State<Object> runCached(@NotNull TypefaceRequest typefaceRequest, @NotNull Function1<? super Function1<? super TypefaceResult, Unit>, ? extends TypefaceResult> resolveTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (this.lock) {
            TypefaceResult typefaceResult = this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.resultCache.remove(typefaceRequest);
            }
            try {
                TypefaceResult invoke = resolveTypeface.invoke(new TypefaceRequestCache$runCached$currentTypefaceResult$1(this, typefaceRequest));
                synchronized (this.lock) {
                    if (this.resultCache.get(typefaceRequest) == null && invoke.getCacheable()) {
                        this.resultCache.put(typefaceRequest, invoke);
                    }
                    Unit unit = Unit.f99208a;
                }
                return invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
