package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.caches.LruCache;
import androidx.compose.p015ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontFamilyResolver.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 */
/* loaded from: classes.dex */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements Function1<TypefaceResult, Unit> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult typefaceResult) {
        invoke2(typefaceResult);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TypefaceResult finalResult) {
        LruCache lruCache;
        LruCache lruCache2;
        Intrinsics.checkNotNullParameter(finalResult, "finalResult");
        SynchronizedObject lock$ui_text_release = this.this$0.getLock$ui_text_release();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        synchronized (lock$ui_text_release) {
            if (finalResult.getCacheable()) {
                lruCache2 = typefaceRequestCache.resultCache;
                lruCache2.put(typefaceRequest, finalResult);
            } else {
                lruCache = typefaceRequestCache.resultCache;
                lruCache.remove(typefaceRequest);
            }
            Unit unit = Unit.f99208a;
        }
    }
}
