package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1865b implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f686b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f686b.post(runnable);
    }
}
