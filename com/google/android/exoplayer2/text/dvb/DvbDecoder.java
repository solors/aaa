package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: classes4.dex */
public final class DvbDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private final DvbParser f34878o;

    public DvbDecoder(List<byte[]> list) {
        super("DvbDecoder");
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        this.f34878o = new DvbParser(parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: s */
    protected Subtitle mo73353s(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f34878o.reset();
        }
        return new DvbSubtitle(this.f34878o.decode(bArr, i));
    }
}
