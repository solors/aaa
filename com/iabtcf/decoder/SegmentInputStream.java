package com.iabtcf.decoder;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
class SegmentInputStream extends InputStream {
    private int end = -1;
    private int rpos;
    private final String src;
    private int start;

    public SegmentInputStream(String str, int i) {
        if (str != null) {
            if (i >= 0) {
                this.src = str;
                this.rpos = Math.min(i, str.length());
                return;
            }
            throw new IllegalArgumentException(String.format("start is invalid %d", Integer.valueOf(i)));
        }
        throw new IllegalArgumentException("src");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.rpos < this.src.length() && this.src.charAt(this.rpos) != '.') {
            return 1;
        }
        return 0;
    }

    protected boolean hasNextSegment() {
        for (int max = Math.max(this.rpos, this.end); max < this.src.length(); max++) {
            if (this.src.charAt(max) == '.') {
                this.end = max;
                return true;
            }
        }
        return false;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        char charAt;
        if (this.rpos >= this.src.length() || (charAt = this.src.charAt(this.rpos)) == '.') {
            return -1;
        }
        this.rpos++;
        if ((charAt & 255) != charAt) {
            return -1;
        }
        return charAt;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.rpos = this.start;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int segmentEnd() {
        if (this.end == -1) {
            int i = this.rpos;
            while (true) {
                this.end = i;
                if (this.end >= this.src.length() || this.src.charAt(this.end) == '.') {
                    break;
                }
                i = this.end + 1;
            }
        }
        return this.end;
    }
}
