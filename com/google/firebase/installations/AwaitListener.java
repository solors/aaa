package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class AwaitListener implements OnCompleteListener<Void> {

    /* renamed from: a */
    private final CountDownLatch f43054a = new CountDownLatch(1);

    AwaitListener() {
    }

    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f43054a.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task<Void> task) {
        this.f43054a.countDown();
    }

    public void onSuccess() {
        this.f43054a.countDown();
    }
}
