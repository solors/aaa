package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidFontLoader.android.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", m17094f = "AndroidFontLoader.android.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2 */
/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt$loadAsync$2 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Typeface>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ResourceFont $this_loadAsync;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt$loadAsync$2(ResourceFont resourceFont, Context context, Continuation<? super AndroidFontLoader_androidKt$loadAsync$2> continuation) {
        super(2, continuation);
        this.$this_loadAsync = resourceFont;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.$this_loadAsync, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Typeface load;
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            load = AndroidFontLoader_androidKt.load(this.$this_loadAsync, this.$context);
            return load;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Typeface> continuation) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
