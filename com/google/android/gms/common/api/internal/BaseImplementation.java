package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public class BaseImplementation {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(@NonNull Status status);

        @KeepForSdk
        void setResult(@NonNull R r);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    /* loaded from: classes4.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @Nullable
        @KeepForSdk
        private final Api<?> api;
        @KeepForSdk
        private final Api.AnyClientKey<A> clientKey;

        @KeepForSdk
        @Deprecated
        protected ApiMethodImpl(@NonNull Api.AnyClientKey<A> anyClientKey, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.clientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.api = null;
        }

        @KeepForSdk
        private void setFailedResult(@NonNull RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        protected abstract void doExecute(@NonNull A a) throws RemoteException;

        @Nullable
        @KeepForSdk
        public final Api<?> getApi() {
            return this.api;
        }

        @NonNull
        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.clientKey;
        }

        @KeepForSdk
        public final void run(@NonNull A a) throws DeadObjectException {
            try {
                doExecute(a);
            } catch (DeadObjectException e) {
                setFailedResult(e);
                throw e;
            } catch (RemoteException e2) {
                setFailedResult(e2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@NonNull Object obj) {
            super.setResult((ApiMethodImpl<R, A>) ((Result) obj));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @KeepForSdk
        public ApiMethodImpl(@NonNull Api<?> api, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.checkNotNull(api, "Api must not be null");
            this.clientKey = api.zab();
            this.api = api;
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void setFailedResult(@NonNull Status status) {
            Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R createFailedResult = createFailedResult(status);
            setResult((ApiMethodImpl<R, A>) createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        @KeepForSdk
        @VisibleForTesting
        protected ApiMethodImpl(@NonNull BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.clientKey = new Api.AnyClientKey<>();
            this.api = null;
        }

        @KeepForSdk
        protected void onSetFailedResult(@NonNull R r) {
        }
    }
}
