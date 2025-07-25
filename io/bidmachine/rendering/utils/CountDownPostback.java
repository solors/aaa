package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class CountDownPostback implements Runnable {

    /* renamed from: a */
    private final Runnable f97935a;

    /* renamed from: b */
    private final AtomicInteger f97936b;

    public CountDownPostback(int i, @NonNull Runnable runnable) {
        this.f97935a = runnable;
        this.f97936b = new AtomicInteger(i);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f97936b.decrementAndGet() > 0) {
            return;
        }
        this.f97935a.run();
    }
}
