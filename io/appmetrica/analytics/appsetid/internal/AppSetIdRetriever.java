package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a */
    private final Object f92265a = new Object();

    /* renamed from: b */
    private final ArrayList f92266b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i) {
        appSetIdRetriever.getClass();
        if (i != 1) {
            if (i != 2) {
                return AppSetIdScope.UNKNOWN;
            }
            return AppSetIdScope.DEVELOPER;
        }
        return AppSetIdScope.APP;
    }

    public static final /* synthetic */ List access$getListeners$p(AppSetIdRetriever appSetIdRetriever) {
        return appSetIdRetriever.f92266b;
    }

    public static final /* synthetic */ Object access$getListenersLock$p(AppSetIdRetriever appSetIdRetriever) {
        return appSetIdRetriever.f92265a;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(@NotNull Context context, @NotNull final AppSetIdListener appSetIdListener) throws Throwable {
        Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
        OnCompleteListener<AppSetIdInfo> onCompleteListener = new OnCompleteListener<AppSetIdInfo>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NotNull Task<AppSetIdInfo> task) {
                Object access$getListenersLock$p = AppSetIdRetriever.access$getListenersLock$p(AppSetIdRetriever.this);
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (access$getListenersLock$p) {
                    AppSetIdRetriever.access$getListeners$p(appSetIdRetriever).remove(this);
                }
                if (task.isSuccessful()) {
                    appSetIdListener.onAppSetIdRetrieved(task.getResult().getId(), AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, task.getResult().getScope()));
                } else {
                    appSetIdListener.onFailure(task.getException());
                }
            }
        };
        synchronized (this.f92265a) {
            this.f92266b.add(onCompleteListener);
        }
        appSetIdInfo.addOnCompleteListener(onCompleteListener);
    }
}
