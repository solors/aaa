package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.QF */
/* loaded from: assets/audience_network.dex */
public class C12437QF extends AbstractRunnableC12086KY {
    public static String[] A02 = {"8bjSuFnY7Px2kfd2c5FIfhC79mNHlBDm", "1JhoOK1lCeFzNpWXu7eAiStn9xCsTPmH", "7NMloe4KmVhX4mabvoc5ZBvAFXalYV3E", "rfM3ikXL5SaocWaOB9TmjD2vsiJkKlJd", "sACTLZEyycWa5kMyrq", "mxP57EI80C5Gyk8oclCuNkT0toI", "e5qOGa2bHvCngaVTbxNZ2TaAb3gIhyF7", "QbLt5R1wGXlKwPtnoTvKgxPj8Dj"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12486R2 A01;

    public C12437QF(C12486R2 c12486r2, int i) {
        this.A01 = c12486r2;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C12614T7 videoView;
        C12614T7 videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null && this.A00 <= 0) {
            C12486R2 c12486r2 = this.A01;
            String[] strArr = A02;
            if (strArr[6].charAt(3) == strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "CD7DGdNDLCY4UALZZjKA1HiDkec";
            strArr2[7] = "uQvfAiBAn4mqA7tCqZPrCPt4Ck3";
            videoView2 = c12486r2.A00.A00.getVideoView();
            videoView2.A0e(false, 9);
        }
    }
}
