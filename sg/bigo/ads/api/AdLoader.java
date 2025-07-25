package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public interface AdLoader<T> {

    /* loaded from: classes10.dex */
    public interface Builder<T extends InterfaceC43501Ad, S extends Builder, U extends AdLoader> {
        @NonNull
        U build();

        @NonNull
        S withAdLoadListener(@Nullable AdLoadListener<T> adLoadListener);

        @NonNull
        S withExt(String str);
    }
}
