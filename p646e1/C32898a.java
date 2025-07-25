package p646e1;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.security.spec.AlgorithmParameterSpec;
import p1049y0.C44996b;

/* renamed from: e1.a */
/* loaded from: classes3.dex */
public final class C32898a {
    /* renamed from: a */
    public final AlgorithmParameterSpec m25529a() {
        C44996b.m1101a("%s : create specs", "KeyGeneratorSpecCreator");
        return new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }
}
