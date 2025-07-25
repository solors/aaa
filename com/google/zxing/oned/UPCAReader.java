package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: classes5.dex */
public final class UPCAReader extends UPCEANReader {

    /* renamed from: i */
    private final UPCEANReader f44507i = new EAN13Reader();

    /* renamed from: o */
    private static Result m65850o(Result result) throws FormatException {
        String text = result.getText();
        if (text.charAt(0) == '0') {
            Result result2 = new Result(text.substring(1), null, result.getResultPoints(), BarcodeFormat.UPC_A);
            if (result.getResultMetadata() != null) {
                result2.putAllMetadata(result.getResultMetadata());
            }
            return result2;
        }
        throw FormatException.getFormatInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return m65850o(this.f44507i.decode(binaryBitmap));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public Result decodeRow(int i, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m65850o(this.f44507i.decodeRow(i, bitArray, iArr, map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: i */
    public int mo65831i(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f44507i.mo65831i(bitArray, iArr, sb2);
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: m */
    BarcodeFormat mo65830m() {
        return BarcodeFormat.UPC_A;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return m65850o(this.f44507i.decode(binaryBitmap, map));
    }

    @Override // com.google.zxing.oned.UPCEANReader, com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m65850o(this.f44507i.decodeRow(i, bitArray, map));
    }
}
