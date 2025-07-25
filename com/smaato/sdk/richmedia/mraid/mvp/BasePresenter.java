package com.smaato.sdk.richmedia.mraid.mvp;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.mvp.BaseView;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public abstract class BasePresenter<T extends BaseView> implements Presenter<T> {
    @NonNull
    private WeakReference<T> weakView = new WeakReference<>(null);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smaato.sdk.richmedia.mraid.mvp.Presenter
    @CallSuper
    public /* bridge */ /* synthetic */ void attachView(@NonNull Object obj) {
        attachView((BasePresenter<T>) ((BaseView) obj));
    }

    @Override // com.smaato.sdk.richmedia.mraid.mvp.Presenter
    @CallSuper
    public void detachView() {
        Threads.ensureMainThread();
        this.weakView.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ifViewAttached(@NonNull Consumer<T> consumer) {
        Objects.requireNonNull(consumer);
        Threads.ensureMainThread();
        T t = this.weakView.get();
        if (t != null) {
            consumer.accept(t);
        }
    }

    @CallSuper
    public void attachView(@NonNull T t) {
        Threads.ensureMainThread();
        this.weakView = new WeakReference<>(t);
    }
}
