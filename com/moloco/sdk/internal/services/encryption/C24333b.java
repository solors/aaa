package com.moloco.sdk.internal.services.encryption;

import android.util.Base64;
import com.moloco.sdk.BuildConfig;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.internal.services.encryption.b */
/* loaded from: classes7.dex */
public final class C24333b implements InterfaceC24331a {
    @NotNull

    /* renamed from: b */
    public final InterfaceC38501j f63005b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC38501j f63006c;
    @NotNull

    /* renamed from: d */
    public final InterfaceC38501j f63007d;
    @NotNull

    /* renamed from: e */
    public final InterfaceC38501j f63008e;
    @NotNull

    /* renamed from: f */
    public final SecretKeySpec f63009f;
    @NotNull

    /* renamed from: g */
    public final InterfaceC38501j f63010g;

    /* renamed from: com.moloco.sdk.internal.services.encryption.b$a */
    /* loaded from: classes7.dex */
    public static final class C24334a extends Lambda implements Functions<String> {

        /* renamed from: g */
        public static final C24334a f63011g = new C24334a();

        public C24334a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final String invoke() {
            String m16619u;
            m16619u = StringsJVM.m16619u(new byte[]{65, 69, 83});
            return m16619u;
        }
    }

    /* renamed from: com.moloco.sdk.internal.services.encryption.b$b */
    /* loaded from: classes7.dex */
    public static final class C24335b extends Lambda implements Functions<String> {

        /* renamed from: g */
        public static final C24335b f63012g = new C24335b();

        public C24335b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final String invoke() {
            String m16619u;
            byte[] decode = Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, 61}, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(byteArrayOf(81, 8… 99, 61), Base64.DEFAULT)");
            m16619u = StringsJVM.m16619u(decode);
            return m16619u;
        }
    }

    /* renamed from: com.moloco.sdk.internal.services.encryption.b$c */
    /* loaded from: classes7.dex */
    public static final class C24336c extends Lambda implements Functions<String> {

        /* renamed from: g */
        public static final C24336c f63013g = new C24336c();

        public C24336c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final String invoke() {
            String m16619u;
            byte[] decode = Base64.decode(new byte[]{85, 108, 78, 66}, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(byteArrayOf(85, 1… 78, 66), Base64.DEFAULT)");
            m16619u = StringsJVM.m16619u(decode);
            return m16619u;
        }
    }

    /* renamed from: com.moloco.sdk.internal.services.encryption.b$d */
    /* loaded from: classes7.dex */
    public static final class C24337d extends Lambda implements Functions<String> {

        /* renamed from: g */
        public static final C24337d f63014g = new C24337d();

        public C24337d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final String invoke() {
            String m16619u;
            m16619u = StringsJVM.m16619u(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
            return m16619u;
        }
    }

    /* renamed from: com.moloco.sdk.internal.services.encryption.b$e */
    /* loaded from: classes7.dex */
    public static final class C24338e extends Lambda implements Functions<IvParameterSpec> {

        /* renamed from: g */
        public static final C24338e f63015g = new C24338e();

        public C24338e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final IvParameterSpec invoke() {
            return new IvParameterSpec(Base64.decode(BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
        }
    }

    public C24333b() {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        InterfaceC38501j m14554a3;
        InterfaceC38501j m14554a4;
        InterfaceC38501j m14554a5;
        m14554a = LazyJVM.m14554a(C24336c.f63013g);
        this.f63005b = m14554a;
        m14554a2 = LazyJVM.m14554a(C24337d.f63014g);
        this.f63006c = m14554a2;
        m14554a3 = LazyJVM.m14554a(C24334a.f63011g);
        this.f63007d = m14554a3;
        m14554a4 = LazyJVM.m14554a(C24335b.f63012g);
        this.f63008e = m14554a4;
        this.f63009f = m46579e();
        m14554a5 = LazyJVM.m14554a(C24338e.f63015g);
        this.f63010g = m14554a5;
    }

    @NotNull
    /* renamed from: a */
    public IvParameterSpec m46585a() {
        return (IvParameterSpec) this.f63010g.getValue();
    }

    @NotNull
    /* renamed from: b */
    public SecretKeySpec m46582b() {
        return this.f63009f;
    }

    @NotNull
    /* renamed from: c */
    public byte[] m46581c(@NotNull byte[] input, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Cipher cipher = Cipher.getInstance(m46575i());
        cipher.init(1, m46580d(publicKey));
        byte[] doFinal = cipher.doFinal(m46582b().getEncoded());
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(aesSecret.encoded)");
        return doFinal;
    }

    /* renamed from: d */
    public final PublicKey m46580d(String str) {
        PublicKey generatePublic = KeyFactory.getInstance(m46576h()).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "keyFactory.generatePublic(keySpec)");
        return generatePublic;
    }

    /* renamed from: e */
    public final SecretKeySpec m46579e() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(m46578f());
        keyGenerator.init(256);
        return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), m46578f());
    }

    /* renamed from: f */
    public final String m46578f() {
        return (String) this.f63007d.getValue();
    }

    /* renamed from: g */
    public final String m46577g() {
        return (String) this.f63008e.getValue();
    }

    /* renamed from: h */
    public final String m46576h() {
        return (String) this.f63005b.getValue();
    }

    /* renamed from: i */
    public final String m46575i() {
        return (String) this.f63006c.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.InterfaceC24331a
    @NotNull
    /* renamed from: a */
    public byte[] mo46583a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Cipher cipher = Cipher.getInstance(m46577g());
        cipher.init(1, m46582b(), m46585a());
        byte[] doFinal = cipher.doFinal(data);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
        return doFinal;
    }

    @Override // com.moloco.sdk.internal.services.encryption.InterfaceC24331a
    @NotNull
    /* renamed from: a */
    public byte[] mo46584a(@NotNull String rsaPublicKey) {
        Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
        byte[] encoded = m46582b().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "aesSecret.encoded");
        return m46581c(encoded, rsaPublicKey);
    }
}
