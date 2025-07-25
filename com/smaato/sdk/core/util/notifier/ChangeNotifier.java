package com.smaato.sdk.core.util.notifier;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface ChangeNotifier<T> {

    /* loaded from: classes7.dex */
    public interface Listener<T> {
        void onNextValue(@NonNull T t);
    }

    void addListener(@NonNull Listener<T> listener);

    void removeListener(@Nullable Listener<T> listener);
}
