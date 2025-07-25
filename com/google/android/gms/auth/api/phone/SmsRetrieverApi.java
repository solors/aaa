package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes4.dex */
public interface SmsRetrieverApi {
    @NonNull
    Task<Void> startSmsRetriever();

    @NonNull
    Task<Void> startSmsUserConsent(@Nullable String str);
}
