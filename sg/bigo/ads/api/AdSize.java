package sg.bigo.ads.api;

import sg.bigo.ads.common.C43746p;

/* loaded from: classes10.dex */
public final class AdSize extends C43746p {

    /* renamed from: c */
    private final String f114001c;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250");
    public static final AdSize LARGE_RECTANGLE = new AdSize(336, 280, "336x280");

    private AdSize(int i, int i2, String str) {
        super(i, i2);
        this.f114001c = str;
    }

    @Override // sg.bigo.ads.common.C43746p
    public final int getHeight() {
        return super.getHeight();
    }

    @Override // sg.bigo.ads.common.C43746p
    public final int getWidth() {
        return super.getWidth();
    }
}
