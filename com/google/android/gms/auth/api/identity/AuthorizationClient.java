package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes4.dex */
public interface AuthorizationClient extends HasApiKey<zbc> {
    @NonNull
    Task<AuthorizationResult> authorize(@NonNull AuthorizationRequest authorizationRequest);

    @NonNull
    AuthorizationResult getAuthorizationResultFromIntent(@Nullable Intent intent) throws ApiException;
}
