package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.E3 */
/* loaded from: classes9.dex */
public final class C33859E3 {

    /* renamed from: a */
    public final Context f92762a;

    /* renamed from: b */
    public final C34778oe f92763b;

    /* renamed from: c */
    public final String f92764c;

    /* renamed from: d */
    public final SafePackageManager f92765d;

    public C33859E3(Context context, C34778oe c34778oe, String str, SafePackageManager safePackageManager) {
        this.f92762a = context;
        this.f92763b = c34778oe;
        this.f92764c = str;
        this.f92765d = safePackageManager;
    }

    /* renamed from: a */
    public final List m22684a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> m21198f = this.f92763b.m21198f();
        boolean isEmpty = m21198f.isEmpty();
        ArrayList arrayList = m21198f;
        if (isEmpty) {
            ArrayList arrayList2 = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f92765d.getPackageInfo(this.f92762a, this.f92764c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f92765d.getPackageInfo(this.f92762a, this.f92764c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList2);
            boolean isEmpty2 = arrayList2.isEmpty();
            arrayList = arrayList2;
            if (!isEmpty2) {
                this.f92763b.m21203a(arrayList2).m21149b();
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }
}
