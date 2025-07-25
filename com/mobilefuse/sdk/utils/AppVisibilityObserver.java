package com.mobilefuse.sdk.utils;

import com.mobilefuse.sdk.AppLifecycleHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppVisibilityObserver.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AppVisibilityObserver {
    @Nullable
    private Function1<? super Boolean, Unit> onAppVisibilityChanged;
    private boolean appIsInForeground = true;
    private final AppVisibilityObserver$activityLifecycleObserver$1 activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.utils.AppVisibilityObserver$activityLifecycleObserver$1
        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInBackground() {
            AppVisibilityObserver.this.appIsInForeground = false;
            Function1<Boolean, Unit> onAppVisibilityChanged = AppVisibilityObserver.this.getOnAppVisibilityChanged();
            if (onAppVisibilityChanged != null) {
                onAppVisibilityChanged.invoke(Boolean.valueOf(AppVisibilityObserver.this.getAppIsInForeground()));
            }
        }

        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInForeground() {
            AppVisibilityObserver.this.appIsInForeground = true;
            Function1<Boolean, Unit> onAppVisibilityChanged = AppVisibilityObserver.this.getOnAppVisibilityChanged();
            if (onAppVisibilityChanged != null) {
                onAppVisibilityChanged.invoke(Boolean.valueOf(AppVisibilityObserver.this.getAppIsInForeground()));
            }
        }
    };

    public final boolean getAppIsInForeground() {
        return this.appIsInForeground;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnAppVisibilityChanged() {
        return this.onAppVisibilityChanged;
    }

    public final void setOnAppVisibilityChanged(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onAppVisibilityChanged = function1;
    }

    public final void startActivityLifecycleObserving() {
        AppLifecycleHelper.addActivityLifecycleObserver(this.activityLifecycleObserver);
    }
}
