package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes5.dex */
final class BlockParsedResult {

    /* renamed from: a */
    private final DecodedInformation f44571a;

    /* renamed from: b */
    private final boolean f44572b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockParsedResult(boolean z) {
        this(null, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public DecodedInformation m65771a() {
        return this.f44571a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m65770b() {
        return this.f44572b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockParsedResult(DecodedInformation decodedInformation, boolean z) {
        this.f44572b = z;
        this.f44571a = decodedInformation;
    }
}
