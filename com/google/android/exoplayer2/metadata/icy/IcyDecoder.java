package com.google.android.exoplayer2.metadata.icy;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class IcyDecoder extends SimpleMetadataDecoder {

    /* renamed from: c */
    private static final Pattern f33915c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f33916a = Charsets.UTF_8.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f33917b = Charsets.ISO_8859_1.newDecoder();

    @Nullable
    /* renamed from: b */
    private String m74089b(ByteBuffer byteBuffer) {
        try {
            return this.f33916a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f33917b.decode(byteBuffer).toString();
                this.f33917b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f33917b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f33917b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f33916a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    /* renamed from: a */
    protected Metadata mo74054a(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        String m74089b = m74089b(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m74089b == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f33915c.matcher(m74089b);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.hashCode();
                if (!lowerCase.equals("streamurl")) {
                    if (lowerCase.equals("streamtitle")) {
                        str = group2;
                    }
                } else {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
