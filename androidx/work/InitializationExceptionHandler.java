package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface InitializationExceptionHandler {
    void handleException(@NonNull Throwable th);
}
