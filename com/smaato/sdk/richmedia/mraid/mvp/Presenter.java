package com.smaato.sdk.richmedia.mraid.mvp;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface Presenter<T> {
    void attachView(@NonNull T t);

    void destroy();

    void detachView();
}
