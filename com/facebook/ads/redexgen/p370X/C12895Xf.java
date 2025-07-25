package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Xf */
/* loaded from: assets/audience_network.dex */
public final class C12895Xf implements InterfaceC11683Db {
    public static String[] A03 = {"Zyfxp29hq7sklehO3ZfSPk28lgQjOCUD", "mBhkfvnTYAx8", "jvl4p0IxGGxL", "hS3jxAKBsoqFh0ue9yc", "Tn0diXBh9wstxBqjs2vLzrYzruj", "Eld7aQHWlehNwiaMO32X2Ou2Wkiw9is4", "exrGaTHQQRDlPDs0MMy56kdJq", "kB5CLaxDFbzWNoxMouQGnJGTmKT"};
    public C11950IG A00;
    public final C11939I4 A02 = new C11939I4();
    public final C11938I3 A01 = new C11938I3();

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11683Db
    public final Metadata A5N(C11724EX c11724ex) throws AbstractC11684Dc {
        if (this.A00 == null || c11724ex.A00 != this.A00.A05()) {
            this.A00 = new C11950IG(((C12971Yw) c11724ex).A00);
            this.A00.A06(((C12971Yw) c11724ex).A00 - c11724ex.A00);
        }
        ByteBuffer buffer = c11724ex.A01;
        byte[] array = buffer.array();
        int limit = buffer.limit();
        this.A02.A0b(array, limit);
        this.A01.A0C(array, limit);
        this.A01.A08(39);
        long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        int A042 = this.A01.A04(8);
        Metadata.Entry entry = null;
        this.A02.A0Z(14);
        switch (A042) {
            case 0:
                entry = new SpliceNullCommand();
                break;
            case 4:
                C11939I4 c11939i4 = this.A02;
                if (A03[6].length() != 16) {
                    A03[0] = "CwfQiV2Na4jrWMhTKdMuzXbSEJtlJ6XB";
                    entry = SpliceScheduleCommand.A00(c11939i4);
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 5:
                entry = SpliceInsertCommand.A00(this.A02, A04, this.A00);
                break;
            case 6:
                entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
                break;
            case 255:
                entry = PrivateCommand.A00(this.A02, spliceCommandType, A04);
                break;
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
