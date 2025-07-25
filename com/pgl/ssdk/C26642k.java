package com.pgl.ssdk;

import com.pgl.ssdk.AbstractC26610c;
import com.pgl.ssdk.C26629f;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pgl.ssdk.k */
/* loaded from: classes7.dex */
public class C26642k {
    /* renamed from: a */
    public static List<C26626e> m40841a(InterfaceC26651o interfaceC26651o, AbstractC26610c.C26611a c26611a) throws IOException, C26629f.C26630a {
        return m40839b(C26629f.m40876a(interfaceC26651o, c26611a, 1896449818).f69902a);
    }

    /* renamed from: b */
    public static List<C26626e> m40839b(ByteBuffer byteBuffer) {
        try {
            ByteBuffer m40875a = C26629f.m40875a(byteBuffer);
            if (!m40875a.hasRemaining()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (m40875a.hasRemaining()) {
                try {
                    arrayList.add(m40840a(C26629f.m40875a(m40875a)));
                } catch (C26602a | BufferUnderflowException unused) {
                    return null;
                } catch (NoSuchAlgorithmException | CertificateException unused2) {
                }
            }
            return arrayList;
        } catch (C26602a unused3) {
            return null;
        }
    }

    @DungeonFlag
    /* renamed from: a */
    private static C26626e m40840a(ByteBuffer byteBuffer) throws C26602a, NoSuchAlgorithmException, CertificateException {
        ByteBuffer m40875a = C26629f.m40875a(byteBuffer);
        m40875a.get(new byte[m40875a.remaining()]);
        m40875a.flip();
        m40875a.position(0);
        C26629f.m40875a(m40875a);
        byte[] m40874b = C26629f.m40874b(C26629f.m40875a(m40875a));
        try {
            Certificate generateCertificate = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(m40874b));
            if (generateCertificate instanceof X509Certificate) {
                return new C26626e(String.valueOf(((X509Certificate) generateCertificate).getSubjectDN()), m40874b);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
