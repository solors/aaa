package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontFamilyResolver.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", m17094f = "FontFamilyResolver.kt", m17093l = {47}, m17092m = "preload")
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 */
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$preload$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FontFamilyResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(FontFamilyResolver fontFamilyResolver, Continuation<? super FontFamilyResolverImpl$preload$1> continuation) {
        super(continuation);
        this.this$0 = fontFamilyResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preload(null, this);
    }
}
