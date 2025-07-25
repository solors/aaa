package com.smaato.sdk.core.util.notifier;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface ChangeSender<T> extends ChangeNotifier<T> {
    @NonNull
    T getValue();

    void newValue(@NonNull T t);
}
