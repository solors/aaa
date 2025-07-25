package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f */
/* loaded from: classes4.dex */
public final class C14867f {

    /* renamed from: a */
    public final BufferedReader f28494a;

    /* renamed from: b */
    public final Queue f28495b;

    /* renamed from: c */
    public String f28496c;

    public C14867f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f28495b = linkedList;
        this.f28494a = bufferedReader;
    }

    /* renamed from: a */
    public final boolean m77487a() {
        String trim;
        if (this.f28496c != null) {
            return true;
        }
        if (!this.f28495b.isEmpty()) {
            this.f28496c = (String) this.f28495b.poll();
            return true;
        }
        do {
            String readLine = this.f28494a.readLine();
            this.f28496c = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f28496c = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }
}
