package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* loaded from: classes4.dex */
final class ListChunk implements AviChunk {

    /* renamed from: a */
    private final int f32986a;
    public final ImmutableList<AviChunk> children;

    private ListChunk(int i, ImmutableList<AviChunk> immutableList) {
        this.f32986a = i;
        this.children = immutableList;
    }

    @Nullable
    /* renamed from: a */
    private static AviChunk m74673a(int i, int i2, ParsableByteArray parsableByteArray) {
        switch (i) {
            case 1718776947:
                return StreamFormatChunk.parseFrom(i2, parsableByteArray);
            case 1751742049:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case 1752331379:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case 1852994675:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        AviChunk m74673a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int limit = parsableByteArray.limit();
        int i2 = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            if (readLittleEndianInt == 1414744396) {
                m74673a = parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray);
            } else {
                m74673a = m74673a(readLittleEndianInt, i2, parsableByteArray);
            }
            if (m74673a != null) {
                if (m74673a.getType() == 1752331379) {
                    i2 = ((AviStreamHeaderChunk) m74673a).getTrackType();
                }
                builder.add((ImmutableList.Builder) m74673a);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(limit);
        }
        return new ListChunk(i, builder.build());
    }

    @Nullable
    public <T extends AviChunk> T getChild(Class<T> cls) {
        UnmodifiableIterator<AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return this.f32986a;
    }
}
