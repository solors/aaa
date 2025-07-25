package com.yandex.mobile.ads.impl;

import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class wf0 extends cu1 {

    /* renamed from: c */
    private static final Pattern f87246c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f87247a = C30572in.f80564c.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f87248b = C30572in.f80563b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.cu1
    /* renamed from: a */
    protected final Metadata mo26258a(gx0 gx0Var, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f87247a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f87248b.decode(byteBuffer).toString();
                this.f87248b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f87248b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f87248b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f87247a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f87246c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m32278b = C30784lf.m32278b(group);
                m32278b.getClass();
                if (!m32278b.equals("streamurl")) {
                    if (m32278b.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
