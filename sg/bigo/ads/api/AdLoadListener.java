package sg.bigo.ads.api;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.InterfaceC43501Ad;

/* loaded from: classes10.dex */
public interface AdLoadListener<T extends InterfaceC43501Ad> {
    @MainThread
    void onAdLoaded(@NonNull T t);

    @MainThread
    void onError(@NonNull AdError adError);
}
