package com.iabtcf.decoder;

import com.iabtcf.exceptions.ByteParseException;
import com.iabtcf.exceptions.UnsupportedVersionException;
import com.iabtcf.utils.BitReader;
import com.iabtcf.utils.FieldDefs;
import java.util.Base64;
import java.util.EnumSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class TCStringDecoder {
    TCStringDecoder() {
    }

    public static TCString decode(String str, DecoderOption... decoderOptionArr) throws IllegalArgumentException, ByteParseException, UnsupportedVersionException {
        TCStringV2 fromBitVector;
        EnumSet noneOf = EnumSet.noneOf(DecoderOption.class);
        for (DecoderOption decoderOption : decoderOptionArr) {
            noneOf.add(decoderOption);
        }
        String[] split = str.split("\\.");
        BitReader vectorFromString = vectorFromString(split[0]);
        byte readBits6 = vectorFromString.readBits6(FieldDefs.CORE_VERSION);
        if (readBits6 != 1) {
            if (readBits6 == 2) {
                if (split.length > 1) {
                    BitReader[] bitReaderArr = new BitReader[split.length - 1];
                    for (int i = 1; i < split.length; i++) {
                        bitReaderArr[i - 1] = vectorFromString(split[i]);
                    }
                    fromBitVector = TCStringV2.fromBitVector(vectorFromString, bitReaderArr);
                } else {
                    fromBitVector = TCStringV2.fromBitVector(vectorFromString, new BitReader[0]);
                }
                if (!noneOf.contains(DecoderOption.LAZY)) {
                    fromBitVector.hashCode();
                }
                return fromBitVector;
            }
            throw new UnsupportedVersionException("Version " + ((int) readBits6) + "is unsupported yet");
        }
        return TCStringV1.fromBitVector(vectorFromString);
    }

    static BitReader vectorFromString(String str) {
        Base64.Decoder urlDecoder;
        byte[] decode;
        urlDecoder = Base64.getUrlDecoder();
        decode = urlDecoder.decode(str);
        return new BitReader(decode);
    }
}
