package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.text.font.AsyncTypefaceCache", m17094f = "FontListFontFamilyTypefaceAdapter.kt", m17093l = {399}, m17092m = "runCached")
@Metadata
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
/* loaded from: classes.dex */
public final class AsyncTypefaceCache$runCached$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, Continuation<? super AsyncTypefaceCache$runCached$1> continuation) {
        super(continuation);
        this.this$0 = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runCached(null, null, false, null, this);
    }
}
