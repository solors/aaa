package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.s1 */
/* loaded from: classes9.dex */
public interface InterfaceC34871s1 {
    /* renamed from: a */
    /* synthetic */ void mo20991a(Intent intent);

    /* renamed from: a */
    /* synthetic */ void mo20990a(Intent intent, int i);

    /* renamed from: a */
    /* synthetic */ void mo20989a(Intent intent, int i, int i2);

    /* renamed from: a */
    void mo20988a(@NonNull InterfaceC34845r1 interfaceC34845r1);

    /* renamed from: b */
    /* synthetic */ void mo20987b(Intent intent);

    /* renamed from: c */
    /* synthetic */ void mo20986c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(@NonNull Bundle bundle);

    void reportData(int i, Bundle bundle);

    void resumeUserSession(@NonNull Bundle bundle);
}
