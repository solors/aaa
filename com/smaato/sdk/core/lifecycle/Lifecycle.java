package com.smaato.sdk.core.lifecycle;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class Lifecycle {
    protected final List<Observer> observerList = new ArrayList();

    public void addObserver(@NonNull Observer observer) {
        this.observerList.add(observer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyObservers(Consumer<Observer> consumer) {
        for (Observer observer : this.observerList) {
            consumer.accept(observer);
        }
    }

    public void removeObserver(@NonNull Observer observer) {
        this.observerList.remove(observer);
    }

    /* loaded from: classes7.dex */
    public interface Observer {
        default void onCreate(Lifecycle lifecycle) {
        }

        default void onDestroy(Lifecycle lifecycle) {
        }

        default void onPause(Lifecycle lifecycle) {
        }

        default void onResume(Lifecycle lifecycle) {
        }

        default void onStart(Lifecycle lifecycle) {
        }

        default void onStop(Lifecycle lifecycle) {
        }
    }
}
