package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes4.dex */
public interface SignInClient extends HasApiKey<zbu> {
    @NonNull
    Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest);

    @NonNull
    String getPhoneNumberFromIntent(@Nullable Intent intent) throws ApiException;

    @NonNull
    Task<PendingIntent> getPhoneNumberHintIntent(@NonNull GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @NonNull
    SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws ApiException;

    @NonNull
    Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest);

    @NonNull
    Task<Void> signOut();
}
