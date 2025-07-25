package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class CCTDestination implements EncodedDestination {
    public static final CCTDestination INSTANCE;
    public static final CCTDestination LEGACY_INSTANCE;

    /* renamed from: c */
    static final String f30857c;

    /* renamed from: d */
    static final String f30858d;

    /* renamed from: e */
    private static final String f30859e;

    /* renamed from: f */
    private static final Set<Encoding> f30860f;
    @NonNull

    /* renamed from: a */
    private final String f30861a;
    @Nullable

    /* renamed from: b */
    private final String f30862b;

    static {
        String m76330a = StringMerger.m76330a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f30857c = m76330a;
        String m76330a2 = StringMerger.m76330a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f30858d = m76330a2;
        String m76330a3 = StringMerger.m76330a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f30859e = m76330a3;
        f30860f = Collections.unmodifiableSet(new HashSet(Arrays.asList(Encoding.m76344of("proto"), Encoding.m76344of("json"))));
        INSTANCE = new CCTDestination(m76330a, null);
        LEGACY_INSTANCE = new CCTDestination(m76330a2, m76330a3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f30861a = str;
        this.f30862b = str2;
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Nullable
    public byte[] asByteArray() {
        String str = this.f30862b;
        if (str == null && this.f30861a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f30861a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String getAPIKey() {
        return this.f30862b;
    }

    @NonNull
    public String getEndPoint() {
        return this.f30861a;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @Nullable
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @NonNull
    public String getName() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
        return f30860f;
    }
}
