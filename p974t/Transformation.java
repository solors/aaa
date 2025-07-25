package p974t;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p853r.C39424i;

@Metadata
/* renamed from: t.a */
/* loaded from: classes2.dex */
public interface Transformation {
    @Nullable
    /* renamed from: a */
    Object m3283a(@NotNull Bitmap bitmap, @NotNull C39424i c39424i, @NotNull Continuation<? super Bitmap> continuation);

    @NotNull
    String getCacheKey();
}
