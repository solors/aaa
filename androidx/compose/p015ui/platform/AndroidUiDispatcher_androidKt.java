package androidx.compose.p015ui.platform;

import android.os.Looper;
import kotlin.Metadata;

/* compiled from: AndroidUiDispatcher.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher_androidKt */
/* loaded from: classes.dex */
public final class AndroidUiDispatcher_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
