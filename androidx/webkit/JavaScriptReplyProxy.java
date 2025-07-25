package androidx.webkit;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public abstract class JavaScriptReplyProxy {
    public abstract void postMessage(@NonNull String str);

    public abstract void postMessage(@NonNull byte[] bArr);
}
