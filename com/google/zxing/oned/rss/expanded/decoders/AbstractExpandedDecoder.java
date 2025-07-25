package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import net.pubnative.lite.sdk.models.Protocol;

/* loaded from: classes5.dex */
public abstract class AbstractExpandedDecoder {

    /* renamed from: a */
    private final BitArray f44569a;

    /* renamed from: b */
    private final GeneralAppIdDecoder f44570b;

    public AbstractExpandedDecoder(BitArray bitArray) {
        this.f44569a = bitArray;
        this.f44570b = new GeneralAppIdDecoder(bitArray);
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
        if (bitArray.get(1)) {
            return new AI01AndOtherAIs(bitArray);
        }
        if (!bitArray.get(2)) {
            return new AnyAIDecoder(bitArray);
        }
        int m65742g = GeneralAppIdDecoder.m65742g(bitArray, 1, 4);
        if (m65742g != 4) {
            if (m65742g != 5) {
                int m65742g2 = GeneralAppIdDecoder.m65742g(bitArray, 1, 5);
                if (m65742g2 != 12) {
                    if (m65742g2 != 13) {
                        switch (GeneralAppIdDecoder.m65742g(bitArray, 1, 7)) {
                            case 56:
                                return new AI013x0x1xDecoder(bitArray, "310", Protocol.VAST_4_1);
                            case 57:
                                return new AI013x0x1xDecoder(bitArray, "320", Protocol.VAST_4_1);
                            case 58:
                                return new AI013x0x1xDecoder(bitArray, "310", Protocol.VAST_4_2);
                            case 59:
                                return new AI013x0x1xDecoder(bitArray, "320", Protocol.VAST_4_2);
                            case 60:
                                return new AI013x0x1xDecoder(bitArray, "310", "15");
                            case 61:
                                return new AI013x0x1xDecoder(bitArray, "320", "15");
                            case 62:
                                return new AI013x0x1xDecoder(bitArray, "310", "17");
                            case 63:
                                return new AI013x0x1xDecoder(bitArray, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(bitArray)));
                        }
                    }
                    return new AI01393xDecoder(bitArray);
                }
                return new AI01392xDecoder(bitArray);
            }
            return new AI01320xDecoder(bitArray);
        }
        return new AI013103decoder(bitArray);
    }

    /* renamed from: a */
    public final GeneralAppIdDecoder m65773a() {
        return this.f44570b;
    }

    /* renamed from: b */
    public final BitArray m65772b() {
        return this.f44569a;
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
