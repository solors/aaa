package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import io.bidmachine.internal.utils.LogSafeRunnable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.bidmachine.y0 */
/* loaded from: classes9.dex */
public class AppIdDataManager {
    @Nullable
    private volatile String ifv;
    @NonNull
    private final AtomicBoolean isUpdateExecuted = new AtomicBoolean(false);

    /* compiled from: AppIdDataManager.java */
    /* renamed from: io.bidmachine.y0$a */
    /* loaded from: classes9.dex */
    public class C37138a implements OnSuccessListener<AppSetIdInfo> {
        C37138a() {
            AppIdDataManager.this = r1;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        @UiThread
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            if (appSetIdInfo.getScope() == 2) {
                AppIdDataManager.this.ifv = appSetIdInfo.getId();
            }
        }
    }

    public /* synthetic */ void lambda$updateIfv$0(Context context) throws Throwable {
        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new C37138a());
    }

    @Nullable
    public String getIfv() {
        return this.ifv;
    }

    public void updateIfv(@NonNull final Context context) {
        if (!this.isUpdateExecuted.compareAndSet(false, true)) {
            return;
        }
        CommonBackgroundTaskManager.get().execute(new LogSafeRunnable() { // from class: io.bidmachine.x0
            {
                AppIdDataManager.this = this;
            }

            @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
            public final void onRun() {
                AppIdDataManager.this.lambda$updateIfv$0(context);
            }
        });
    }
}
