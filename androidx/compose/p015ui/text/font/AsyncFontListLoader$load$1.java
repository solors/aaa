package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.text.font.AsyncFontListLoader", m17094f = "FontListFontFamilyTypefaceAdapter.kt", m17093l = {272, 285}, m17092m = "load")
@Metadata
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
/* loaded from: classes.dex */
public final class AsyncFontListLoader$load$1 extends AbstractC37589d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, Continuation<? super AsyncFontListLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(this);
    }
}
