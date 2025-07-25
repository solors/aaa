package androidx.work.impl.constraints;

import androidx.annotation.MainThread;
import kotlin.Metadata;

/* compiled from: ConstraintListener.kt */
@Metadata
/* loaded from: classes2.dex */
public interface ConstraintListener<T> {
    @MainThread
    void onConstraintChanged(T t);
}
