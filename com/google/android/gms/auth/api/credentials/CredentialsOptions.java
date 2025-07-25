package com.google.android.gms.auth.api.credentials;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@Deprecated
/* loaded from: classes4.dex */
public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    @NonNull
    public static final CredentialsOptions DEFAULT = new Builder().build();

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    /* loaded from: classes4.dex */
    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        @NonNull
        public CredentialsOptions build() {
            return new CredentialsOptions(this, null);
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        @NonNull
        public final /* bridge */ /* synthetic */ Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
            forceEnableSaveDialog();
            return this;
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        @NonNull
        public Builder forceEnableSaveDialog() {
            this.zba = Boolean.TRUE;
            return this;
        }
    }

    /* synthetic */ CredentialsOptions(Builder builder, zbd zbdVar) {
        super(builder);
    }
}
