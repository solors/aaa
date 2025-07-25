package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.pgl.ssdk.j */
/* loaded from: classes7.dex */
public class C26640j {
    @DungeonFlag
    /* renamed from: a */
    public static List<C26626e> m40849a(File file) {
        CertificateFactory certificateFactory;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream = null;
        try {
            certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException unused) {
            certificateFactory = null;
        }
        if (certificateFactory == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    ZipInputStream zipInputStream2 = new ZipInputStream(fileInputStream);
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream2.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (name.startsWith("META-INF/")) {
                                    if (!name.endsWith(".RSA") && !name.endsWith(".DSA") && !name.endsWith(".EC")) {
                                        zipInputStream2.closeEntry();
                                    } else {
                                        try {
                                            for (Certificate certificate : certificateFactory.generateCertificates(new ByteArrayInputStream(m40848a(zipInputStream2)))) {
                                                if (certificate instanceof X509Certificate) {
                                                    arrayList.add(new C26626e(String.valueOf(((X509Certificate) certificate).getSubjectDN()), certificate.getEncoded()));
                                                }
                                            }
                                        } catch (CertificateException unused2) {
                                        }
                                    }
                                }
                            } else {
                                try {
                                    break;
                                } catch (IOException unused3) {
                                }
                            }
                        } catch (IOException unused4) {
                            zipInputStream = zipInputStream2;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            zipInputStream = zipInputStream2;
                            th = th;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            throw th;
                        }
                    }
                    zipInputStream2.close();
                    fileInputStream.close();
                } catch (IOException unused8) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused9) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (IOException unused10) {
            return arrayList;
        }
    }

    /* renamed from: a */
    private static byte[] m40848a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
