package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b */
/* loaded from: classes9.dex */
public final class C34412b implements InterfaceC33839D8 {

    /* renamed from: a */
    public final AESEncrypter f94000a;

    public C34412b() {
        this(new C34385a(C34693la.m21444h().m21447e()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33839D8
    @NonNull
    /* renamed from: a */
    public final C35008x8 mo21958a(@NonNull C34247U5 c34247u5) {
        byte[] encrypt;
        String encodeToString;
        String value = c34247u5.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f94000a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                c34247u5.setValue(encodeToString);
                return new C35008x8(c34247u5, EnumC33889F8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        c34247u5.setValue(encodeToString);
        return new C35008x8(c34247u5, EnumC33889F8.AES_VALUE_ENCRYPTION);
    }

    public C34412b(C34385a c34385a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c34385a.m22026b(), c34385a.m22027a()));
    }

    public C34412b(AESEncrypter aESEncrypter) {
        this.f94000a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33839D8
    @NonNull
    /* renamed from: a */
    public final byte[] mo21957a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f94000a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    @NonNull
    /* renamed from: a */
    public final EnumC33889F8 m21959a() {
        return EnumC33889F8.AES_VALUE_ENCRYPTION;
    }
}
