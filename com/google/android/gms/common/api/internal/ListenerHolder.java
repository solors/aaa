package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;
    @Nullable
    private volatile Object zab;
    @Nullable
    private volatile ListenerKey zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    /* loaded from: classes4.dex */
    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        /* JADX INFO: Access modifiers changed from: package-private */
        @KeepForSdk
        public ListenerKey(L l, String str) {
            this.zaa = l;
            this.zab = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            if (this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab)) {
                return true;
            }
            return false;
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            int identityHashCode = System.identityHashCode(this.zaa);
            return this.zab + "@" + identityHashCode;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@NonNull L l);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @KeepForSdk
    public ListenerHolder(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = Preconditions.checkNotNull(l, "Listener must not be null");
        this.zac = new ListenerKey(l, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        if (this.zab != null) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.zaa(notifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(Notifier notifier) {
        Object obj = this.zab;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @KeepForSdk
    public ListenerHolder(@NonNull Executor executor, @NonNull L l, @NonNull String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = Preconditions.checkNotNull(l, "Listener must not be null");
        this.zac = new ListenerKey(l, Preconditions.checkNotEmpty(str));
    }
}
