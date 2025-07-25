package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.AbstractC18986K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.inmobi.media.K0 */
/* loaded from: classes6.dex */
public abstract class AbstractC18986K0 {

    /* renamed from: a */
    public static AppSetIdInfo f47387a;

    static {
        m60984b();
    }

    /* renamed from: a */
    public static final void m60985a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public static void m60984b() {
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null || !m60986a()) {
            return;
        }
        AppSetIdClient client = AppSet.getClient(m61068d);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
        Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
        final C18972J0 c18972j0 = C18972J0.f47363a;
        appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: o3.f0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                AbstractC18986K0.m60985a(c18972j0, obj);
            }
        });
    }

    /* renamed from: a */
    public static boolean m60986a() {
        try {
            Reflection.m17042b(AppSetIdInfo.class).getSimpleName();
            Reflection.m17042b(Task.class).getSimpleName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }
}
