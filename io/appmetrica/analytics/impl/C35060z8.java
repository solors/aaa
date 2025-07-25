package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8 */
/* loaded from: classes9.dex */
public class C35060z8 implements StateSerializer {

    /* renamed from: a */
    public final StateSerializer f95688a;

    /* renamed from: b */
    public final AESEncrypter f95689b;

    public C35060z8(@NonNull StateSerializer<Object> stateSerializer, @NonNull AESEncrypter aESEncrypter) {
        this.f95688a = stateSerializer;
        this.f95689b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return this.f95688a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final byte[] toByteArray(@NonNull Object obj) {
        try {
            return this.f95689b.encrypt(this.f95688a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object toState(@NonNull byte[] bArr) throws IOException {
        try {
            return this.f95688a.toState(this.f95689b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
