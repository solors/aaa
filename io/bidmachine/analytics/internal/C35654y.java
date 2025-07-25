package io.bidmachine.analytics.internal;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C37561t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.bidmachine.analytics.internal.y */
/* loaded from: classes9.dex */
public final class C35654y {

    /* renamed from: a */
    private final byte[] f96552a;

    /* renamed from: b */
    private final String f96553b;

    /* renamed from: c */
    private final byte[] f96554c;

    /* renamed from: d */
    private final boolean f96555d;

    /* renamed from: e */
    private final byte[] f96556e;

    /* renamed from: f */
    private final Key f96557f;

    /* renamed from: g */
    private final InterfaceC35653x f96558g;

    public C35654y(byte[] bArr, String str, byte[] bArr2, boolean z) {
        this.f96552a = bArr;
        this.f96553b = str;
        this.f96554c = bArr2;
        this.f96555d = z;
        KeyPair m20121b = new C35640o().m20121b();
        this.f96556e = m20121b.getPublic().getEncoded();
        this.f96557f = m20121b.getPrivate();
        this.f96558g = new C35646t();
    }

    /* renamed from: a */
    public final Key m20105a() {
        return m20103a(this.f96557f, this.f96556e, this.f96552a);
    }

    /* renamed from: b */
    public final byte[] m20101b() {
        return this.f96556e;
    }

    public /* synthetic */ C35654y(byte[] bArr, String str, byte[] bArr2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, str, (i & 4) != 0 ? null : bArr2, (i & 8) != 0 ? false : z);
    }

    /* renamed from: a */
    public final Key m20103a(Key key, byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(this.f96558g.mo20106a(m20104a(key, bArr2), this.f96555d ? m20102a(bArr, bArr2) : null, this.f96554c), this.f96553b);
    }

    /* renamed from: a */
    private final byte[] m20102a(byte[] bArr, byte[] bArr2) {
        List m17191s = C37561t.m17191s(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
        C37561t.m17265B(m17191s);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(((ByteBuffer) m17191s.get(0)).array());
        byteArrayOutputStream.write(((ByteBuffer) m17191s.get(1)).array());
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    private final byte[] m20104a(Key key, byte[] bArr) {
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(key);
        keyAgreement.doPhase(generatePublic, true);
        return keyAgreement.generateSecret();
    }
}
