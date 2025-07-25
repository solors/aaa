package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.internal.ServiceWorkerControllerImpl;

/* loaded from: classes2.dex */
public abstract class ServiceWorkerControllerCompat {

    /* loaded from: classes2.dex */
    private static class LAZY_HOLDER {
        static final ServiceWorkerControllerCompat INSTANCE = new ServiceWorkerControllerImpl();

        private LAZY_HOLDER() {
        }
    }

    @NonNull
    public static ServiceWorkerControllerCompat getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }

    @NonNull
    public abstract ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat);
}
