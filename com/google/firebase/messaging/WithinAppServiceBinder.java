package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

/* loaded from: classes4.dex */
class WithinAppServiceBinder extends Binder {

    /* renamed from: b */
    private final IntentHandler f43313b;

    /* loaded from: classes4.dex */
    interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.f43313b = intentHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m66485c(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "service received new intent via bind strategy");
            }
            this.f43313b.handle(bindRequest.f43320a).addOnCompleteListener(new ExecutorC2515a(), new OnCompleteListener() { // from class: com.google.firebase.messaging.e0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    WithinAppServiceConnection.BindRequest.this.m66477d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
