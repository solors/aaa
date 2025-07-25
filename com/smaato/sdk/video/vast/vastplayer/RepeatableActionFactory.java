package com.smaato.sdk.video.vast.vastplayer;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.utils.RepeatableAction;

/* loaded from: classes7.dex */
public class RepeatableActionFactory {
    @NonNull
    private final Handler handler;

    public RepeatableActionFactory(@NonNull Handler handler) {
        this.handler = (Handler) Objects.requireNonNull(handler);
    }

    @NonNull
    public RepeatableAction createRepeatableAction(@NonNull RepeatableAction.Listener listener) {
        return new RepeatableAction(this.handler, listener);
    }
}
