package com.smaato.sdk.core.util.notifier;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* renamed from: com.smaato.sdk.core.util.notifier.c */
/* loaded from: classes7.dex */
public class DebounceChangeSender<D> extends StandardChangeSender<D> {
    @NonNull

    /* renamed from: d */
    private final Handler f71972d;

    /* renamed from: e */
    private final long f71973e;
    @Nullable

    /* renamed from: f */
    private Runnable f71974f;
    @NonNull

    /* renamed from: g */
    private final Consumer<Runnable> f71975g;

    public DebounceChangeSender(@NonNull D d, @NonNull final Handler handler, long j) {
        super(d);
        this.f71972d = (Handler) Objects.requireNonNull(handler);
        this.f71973e = j;
        this.f71975g = new Consumer() { // from class: com.smaato.sdk.core.util.notifier.b
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DebounceChangeSender.m39333b(DebounceChangeSender.this, handler, (Runnable) obj);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m39333b(DebounceChangeSender debounceChangeSender, Handler handler, Runnable runnable) {
        debounceChangeSender.m39331d(handler, runnable);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39332c(DebounceChangeSender debounceChangeSender, Object obj) {
        debounceChangeSender.m39330e(obj);
    }

    /* renamed from: d */
    public /* synthetic */ void m39331d(Handler handler, Runnable runnable) {
        handler.removeCallbacks(runnable);
        this.f71974f = null;
    }

    /* renamed from: e */
    public /* synthetic */ void m39330e(Object obj) {
        super.newValue(obj);
    }

    @Override // com.smaato.sdk.core.util.notifier.StandardChangeSender, com.smaato.sdk.core.util.notifier.ChangeSender
    public void newValue(@NonNull final D d) {
        synchronized (this.f71976a) {
            Objects.onNotNull(this.f71974f, this.f71975g);
            Runnable runnable = new Runnable() { // from class: com.smaato.sdk.core.util.notifier.a
                @Override // java.lang.Runnable
                public final void run() {
                    DebounceChangeSender.m39332c(DebounceChangeSender.this, d);
                }
            };
            this.f71974f = runnable;
            this.f71972d.postDelayed(runnable, this.f71973e);
        }
    }
}
