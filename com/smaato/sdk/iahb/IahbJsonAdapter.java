package com.smaato.sdk.iahb;

import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.iahb.IahbResponse;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.iahb.f */
/* loaded from: classes7.dex */
public final class IahbJsonAdapter {

    /* renamed from: a */
    private final Logger f72056a;

    public IahbJsonAdapter(Logger logger) {
        this.f72056a = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.smaato.sdk.iahb.IahbBid m39262b(@androidx.annotation.NonNull android.util.JsonReader r7) throws java.io.IOException {
        /*
            r6 = this;
            if (r7 == 0) goto L98
            r7.beginArray()
        L5:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8e
            r7.beginObject()     // Catch: java.lang.Throwable -> L93
            com.smaato.sdk.iahb.IahbBid$a r0 = com.smaato.sdk.iahb.IahbBid.builder()     // Catch: java.lang.Throwable -> L93
        L12:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L75
            java.lang.String r1 = r7.nextName()     // Catch: java.lang.Throwable -> L93
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L93
            r3 = -1377881982(0xffffffffaddf3082, float:-2.5373707E-11)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L46
            r3 = 96426(0x178aa, float:1.35122E-40)
            if (r2 == r3) goto L3c
            r3 = 100897(0x18a21, float:1.41387E-40)
            if (r2 == r3) goto L32
            goto L50
        L32:
            java.lang.String r2 = "ext"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L50
            r1 = r4
            goto L51
        L3c:
            java.lang.String r2 = "adm"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L50
            r1 = 0
            goto L51
        L46:
            java.lang.String r2 = "bundle"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L50
            r1 = r5
            goto L51
        L50:
            r1 = -1
        L51:
            if (r1 == 0) goto L6d
            if (r1 == r5) goto L65
            if (r1 == r4) goto L5b
            r7.skipValue()     // Catch: java.lang.Throwable -> L93
            goto L12
        L5b:
            com.smaato.sdk.iahb.IahbExt r1 = r6.m39261c(r7)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L12
            r0.mo39278e(r1)     // Catch: java.lang.Throwable -> L93
            goto L12
        L65:
            java.lang.String r1 = r7.nextString()     // Catch: java.lang.Throwable -> L93
            r0.mo39279d(r1)     // Catch: java.lang.Throwable -> L93
            goto L12
        L6d:
            java.lang.String r1 = r7.nextString()     // Catch: java.lang.Throwable -> L93
            r0.mo39281a(r1)     // Catch: java.lang.Throwable -> L93
            goto L12
        L75:
            r7.endObject()     // Catch: java.lang.Throwable -> L93
            com.smaato.sdk.core.log.Logger r1 = r6.f72056a     // Catch: java.lang.Throwable -> L93
            com.smaato.sdk.iahb.IahbBid r0 = r0.m39288c(r1)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L5
        L80:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L8a
            r7.skipValue()     // Catch: java.lang.Throwable -> L93
            goto L80
        L8a:
            r7.endArray()
            return r0
        L8e:
            r7.endArray()
            r7 = 0
            return r7
        L93:
            r0 = move-exception
            r7.endArray()
            throw r0
        L98:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "'reader' specified as non-null is null"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.iahb.IahbJsonAdapter.m39262b(android.util.JsonReader):com.smaato.sdk.iahb.IahbBid");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006f A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.smaato.sdk.iahb.IahbExt m39261c(@androidx.annotation.NonNull android.util.JsonReader r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto Lc1
            r8.beginObject()
        L5:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "smt"
            java.lang.String r1 = r8.nextName()     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb2
            com.smaato.sdk.iahb.IahbExt$a r0 = com.smaato.sdk.iahb.IahbExt.builder()     // Catch: java.lang.Throwable -> Lbc
            r8.beginObject()     // Catch: java.lang.Throwable -> Lbc
        L1e:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto La7
            java.lang.String r1 = r8.nextName()     // Catch: java.lang.Throwable -> Lbc
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> Lbc
            r3 = -1422011939(0xffffffffab3dd1dd, float:-6.743753E-13)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L62
            r3 = -1309235404(0xffffffffb1f6a734, float:-7.178551E-9)
            if (r2 == r3) goto L58
            r3 = -1001268717(0xffffffffc451da13, float:-839.4074)
            if (r2 == r3) goto L4e
            r3 = 1240754974(0x49f46b1e, float:2002275.8)
            if (r2 == r3) goto L44
            goto L6c
        L44:
            java.lang.String r2 = "adspaceid"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L6c
            r1 = 0
            goto L6d
        L4e:
            java.lang.String r2 = "impressionmeasurement"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L6c
            r1 = r4
            goto L6d
        L58:
            java.lang.String r2 = "expires"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L6c
            r1 = r5
            goto L6d
        L62:
            java.lang.String r2 = "adtype"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L6c
            r1 = r6
            goto L6d
        L6c:
            r1 = -1
        L6d:
            if (r1 == 0) goto L9e
            if (r1 == r6) goto L96
            if (r1 == r5) goto L8e
            if (r1 == r4) goto L79
            r8.skipValue()     // Catch: java.lang.Throwable -> Lbc
            goto L1e
        L79:
            java.lang.String r1 = r8.nextString()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = "viewable"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L88
            com.smaato.sdk.core.api.ImpressionCountingType r1 = com.smaato.sdk.core.api.ImpressionCountingType.VIEWABLE     // Catch: java.lang.Throwable -> Lbc
            goto L8a
        L88:
            com.smaato.sdk.core.api.ImpressionCountingType r1 = com.smaato.sdk.core.api.ImpressionCountingType.STANDARD     // Catch: java.lang.Throwable -> Lbc
        L8a:
            r0.mo39273f(r1)     // Catch: java.lang.Throwable -> Lbc
            goto L1e
        L8e:
            long r1 = r8.nextLong()     // Catch: java.lang.Throwable -> Lbc
            r0.mo39274e(r1)     // Catch: java.lang.Throwable -> Lbc
            goto L1e
        L96:
            java.lang.String r1 = r8.nextString()     // Catch: java.lang.Throwable -> Lbc
            r0.mo39276b(r1)     // Catch: java.lang.Throwable -> Lbc
            goto L1e
        L9e:
            java.lang.String r1 = r8.nextString()     // Catch: java.lang.Throwable -> Lbc
            r0.mo39277a(r1)     // Catch: java.lang.Throwable -> Lbc
            goto L1e
        La7:
            r8.endObject()     // Catch: java.lang.Throwable -> Lbc
            com.smaato.sdk.iahb.IahbExt r0 = r0.m39287d()     // Catch: java.lang.Throwable -> Lbc
            r8.endObject()
            return r0
        Lb2:
            r8.skipValue()     // Catch: java.lang.Throwable -> Lbc
            goto L5
        Lb7:
            r8.endObject()
            r8 = 0
            return r8
        Lbc:
            r0 = move-exception
            r8.endObject()
            throw r0
        Lc1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "'reader' specified as non-null is null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.iahb.IahbJsonAdapter.m39261c(android.util.JsonReader):com.smaato.sdk.iahb.IahbExt");
    }

    @NonNull
    /* renamed from: d */
    private IahbResponse m39260d(@NonNull JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            jsonReader.beginObject();
            IahbResponse.AbstractC27340a builder = IahbResponse.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (!nextName.equals("bidid")) {
                    if (!nextName.equals("seatbid")) {
                        jsonReader.skipValue();
                    } else {
                        IahbBid m39259e = m39259e(jsonReader);
                        if (m39259e != null) {
                            builder.mo39272a(m39259e);
                        }
                    }
                } else {
                    builder.mo39271b(jsonReader.nextString());
                }
            }
            jsonReader.endObject();
            return builder.mo39270c();
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    @Nullable
    /* renamed from: e */
    private IahbBid m39259e(@NonNull JsonReader jsonReader) throws IOException {
        IahbBid iahbBid;
        if (jsonReader != null) {
            jsonReader.beginArray();
            do {
                try {
                    iahbBid = null;
                    if (!jsonReader.hasNext()) {
                        return null;
                    }
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("bid".equals(jsonReader.nextName())) {
                            iahbBid = m39262b(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                } finally {
                    jsonReader.endArray();
                }
            } while (iahbBid == null);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return iahbBid;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    @NonNull
    /* renamed from: a */
    public IahbResponse m39263a(@NonNull JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            try {
                return m39260d(jsonReader);
            } catch (IllegalStateException e) {
                throw new IOException(e);
            }
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }
}
