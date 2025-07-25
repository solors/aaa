package com.facebook.internal.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CertificateUtil.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CertificateUtil {
    @NotNull
    public static final String DELIMITER = ":";
    @NotNull
    public static final CertificateUtil INSTANCE = new CertificateUtil();

    private CertificateUtil() {
    }

    @NotNull
    public static final String getCertificateHash(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            int length = signatures.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Signature signature = signatures[i];
                i++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                z = true;
            }
            if (z) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getDELIMITER$facebook_core_release$annotations() {
    }
}
