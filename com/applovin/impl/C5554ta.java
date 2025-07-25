package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.ta */
/* loaded from: classes2.dex */
public final class C5554ta extends AbstractC4267dk {

    /* renamed from: c */
    private static final Pattern f10870c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f10871a = Charsets.UTF_8.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f10872b = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.impl.AbstractC4267dk
    /* renamed from: a */
    protected C4061af mo93618a(C4256df c4256df, ByteBuffer byteBuffer) {
        String m94485a = m94485a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m94485a == null) {
            return new C4061af(new C5685va(bArr, null, null));
        }
        Matcher matcher = f10870c.matcher(m94485a);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.hashCode();
                if (lowerCase.equals("streamurl")) {
                    str2 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C4061af(new C5685va(bArr, str, str2));
    }

    /* renamed from: a */
    private String m94485a(ByteBuffer byteBuffer) {
        try {
            return this.f10871a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f10872b.decode(byteBuffer).toString();
                this.f10872b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f10872b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f10872b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f10871a.reset();
            byteBuffer.rewind();
        }
    }
}
