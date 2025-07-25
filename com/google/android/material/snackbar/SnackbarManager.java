package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
class SnackbarManager {

    /* renamed from: e */
    private static SnackbarManager f38400e;
    @NonNull

    /* renamed from: a */
    private final Object f38401a = new Object();
    @NonNull

    /* renamed from: b */
    private final Handler f38402b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager.this.m70836c((SnackbarRecord) message.obj);
            return true;
        }
    });
    @Nullable

    /* renamed from: c */
    private SnackbarRecord f38403c;
    @Nullable

    /* renamed from: d */
    private SnackbarRecord f38404d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Callback {
        void dismiss(int i);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class SnackbarRecord {
        @NonNull

        /* renamed from: a */
        final WeakReference<Callback> f38406a;

        /* renamed from: b */
        int f38407b;

        /* renamed from: c */
        boolean f38408c;

        SnackbarRecord(int i, Callback callback) {
            this.f38406a = new WeakReference<>(callback);
            this.f38407b = i;
        }

        /* renamed from: a */
        boolean m70831a(@Nullable Callback callback) {
            if (callback != null && this.f38406a.get() == callback) {
                return true;
            }
            return false;
        }
    }

    private SnackbarManager() {
    }

    /* renamed from: a */
    private boolean m70838a(@NonNull SnackbarRecord snackbarRecord, int i) {
        Callback callback = snackbarRecord.f38406a.get();
        if (callback != null) {
            this.f38402b.removeCallbacksAndMessages(snackbarRecord);
            callback.dismiss(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static SnackbarManager m70837b() {
        if (f38400e == null) {
            f38400e = new SnackbarManager();
        }
        return f38400e;
    }

    /* renamed from: d */
    private boolean m70835d(Callback callback) {
        SnackbarRecord snackbarRecord = this.f38403c;
        if (snackbarRecord != null && snackbarRecord.m70831a(callback)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m70834e(Callback callback) {
        SnackbarRecord snackbarRecord = this.f38404d;
        if (snackbarRecord != null && snackbarRecord.m70831a(callback)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m70833f(@NonNull SnackbarRecord snackbarRecord) {
        int i = snackbarRecord.f38407b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = 1500;
            } else {
                i = 2750;
            }
        }
        this.f38402b.removeCallbacksAndMessages(snackbarRecord);
        Handler handler = this.f38402b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), i);
    }

    /* renamed from: g */
    private void m70832g() {
        SnackbarRecord snackbarRecord = this.f38404d;
        if (snackbarRecord != null) {
            this.f38403c = snackbarRecord;
            this.f38404d = null;
            Callback callback = snackbarRecord.f38406a.get();
            if (callback != null) {
                callback.show();
            } else {
                this.f38403c = null;
            }
        }
    }

    /* renamed from: c */
    void m70836c(@NonNull SnackbarRecord snackbarRecord) {
        synchronized (this.f38401a) {
            if (this.f38403c == snackbarRecord || this.f38404d == snackbarRecord) {
                m70838a(snackbarRecord, 2);
            }
        }
    }

    public void dismiss(Callback callback, int i) {
        synchronized (this.f38401a) {
            if (m70835d(callback)) {
                m70838a(this.f38403c, i);
            } else if (m70834e(callback)) {
                m70838a(this.f38404d, i);
            }
        }
    }

    public boolean isCurrent(Callback callback) {
        boolean m70835d;
        synchronized (this.f38401a) {
            m70835d = m70835d(callback);
        }
        return m70835d;
    }

    public boolean isCurrentOrNext(Callback callback) {
        boolean z;
        synchronized (this.f38401a) {
            if (!m70835d(callback) && !m70834e(callback)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public void onDismissed(Callback callback) {
        synchronized (this.f38401a) {
            if (m70835d(callback)) {
                this.f38403c = null;
                if (this.f38404d != null) {
                    m70832g();
                }
            }
        }
    }

    public void onShown(Callback callback) {
        synchronized (this.f38401a) {
            if (m70835d(callback)) {
                m70833f(this.f38403c);
            }
        }
    }

    public void pauseTimeout(Callback callback) {
        synchronized (this.f38401a) {
            if (m70835d(callback)) {
                SnackbarRecord snackbarRecord = this.f38403c;
                if (!snackbarRecord.f38408c) {
                    snackbarRecord.f38408c = true;
                    this.f38402b.removeCallbacksAndMessages(snackbarRecord);
                }
            }
        }
    }

    public void restoreTimeoutIfPaused(Callback callback) {
        synchronized (this.f38401a) {
            if (m70835d(callback)) {
                SnackbarRecord snackbarRecord = this.f38403c;
                if (snackbarRecord.f38408c) {
                    snackbarRecord.f38408c = false;
                    m70833f(snackbarRecord);
                }
            }
        }
    }

    public void show(int i, Callback callback) {
        synchronized (this.f38401a) {
            if (m70835d(callback)) {
                SnackbarRecord snackbarRecord = this.f38403c;
                snackbarRecord.f38407b = i;
                this.f38402b.removeCallbacksAndMessages(snackbarRecord);
                m70833f(this.f38403c);
                return;
            }
            if (m70834e(callback)) {
                this.f38404d.f38407b = i;
            } else {
                this.f38404d = new SnackbarRecord(i, callback);
            }
            SnackbarRecord snackbarRecord2 = this.f38403c;
            if (snackbarRecord2 != null && m70838a(snackbarRecord2, 4)) {
                return;
            }
            this.f38403c = null;
            m70832g();
        }
    }
}
