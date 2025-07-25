package p748k;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p644e.InterfaceC32886e;
import p689h.DataSource;
import p748k.Fetcher;
import p837q.C39310n;

@Metadata
/* renamed from: k.b */
/* loaded from: classes2.dex */
public final class BitmapFetcher implements Fetcher {
    @NotNull

    /* renamed from: a */
    private final Bitmap f98621a;
    @NotNull

    /* renamed from: b */
    private final C39310n f98622b;

    /* compiled from: BitmapFetcher.kt */
    @Metadata
    /* renamed from: k.b$a */
    /* loaded from: classes2.dex */
    public static final class C37360a implements Fetcher.InterfaceC37366a<Bitmap> {
        @Override // p748k.Fetcher.InterfaceC37366a
        @NotNull
        /* renamed from: b */
        public Fetcher mo18281a(@NotNull Bitmap bitmap, @NotNull C39310n c39310n, @NotNull InterfaceC32886e interfaceC32886e) {
            return new BitmapFetcher(bitmap, c39310n);
        }
    }

    public BitmapFetcher(@NotNull Bitmap bitmap, @NotNull C39310n c39310n) {
        this.f98621a = bitmap;
        this.f98622b = c39310n;
    }

    @Override // p748k.Fetcher
    @Nullable
    /* renamed from: a */
    public Object mo18283a(@NotNull Continuation<? super AbstractC37365h> continuation) {
        return new FetchResult(new BitmapDrawable(this.f98622b.m13039g().getResources(), this.f98621a), false, DataSource.MEMORY);
    }
}
