package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class DvbParser {

    /* renamed from: h */
    private static final byte[] f34879h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f34880i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f34881j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f34882a;

    /* renamed from: b */
    private final Paint f34883b;

    /* renamed from: c */
    private final Canvas f34884c;

    /* renamed from: d */
    private final DisplayDefinition f34885d;

    /* renamed from: e */
    private final ClutDefinition f34886e;

    /* renamed from: f */
    private final SubtitleService f34887f;

    /* renamed from: g */
    private Bitmap f34888g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;

        /* renamed from: id */
        public final int f34889id;

        public ClutDefinition(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f34889id = i;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i, int i2, int i3, int i4, int i5, int i6) {
            this.width = i;
            this.height = i2;
            this.horizontalPositionMinimum = i3;
            this.horizontalPositionMaximum = i4;
            this.verticalPositionMinimum = i5;
            this.verticalPositionMaximum = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ObjectData {
        public final byte[] bottomFieldData;

        /* renamed from: id */
        public final int f34890id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f34890id = i;
            this.nonModifyingColorFlag = z;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i, int i2, int i3, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i;
            this.version = i2;
            this.state = i3;
            this.regions = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i, int i2) {
            this.horizontalAddress = i;
            this.verticalAddress = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;

        /* renamed from: id */
        public final int f34891id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<RegionObject> sparseArray) {
            this.f34891id = i;
            this.fillFlag = z;
            this.width = i2;
            this.height = i3;
            this.levelOfCompatibility = i4;
            this.depth = i5;
            this.clutId = i6;
            this.pixelCode8Bit = i7;
            this.pixelCode4Bit = i8;
            this.pixelCode2Bit = i9;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(RegionComposition regionComposition) {
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.regionObjects.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i, int i2, int i3, int i4, int i5, int i6) {
            this.type = i;
            this.provider = i2;
            this.horizontalPosition = i3;
            this.verticalPosition = i4;
            this.foregroundPixelCode = i5;
            this.backgroundPixelCode = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SubtitleService {
        public final int ancillaryPageId;
        @Nullable
        public DisplayDefinition displayDefinition;
        @Nullable
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i, int i2) {
            this.subtitlePageId = i;
            this.ancillaryPageId = i2;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(int i, int i2) {
        Paint paint = new Paint();
        this.f34882a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f34883b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f34884c = new Canvas();
        this.f34885d = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.f34886e = new ClutDefinition(0, m73484b(), m73483c(), m73482d());
        this.f34887f = new SubtitleService(i, i2);
    }

    /* renamed from: a */
    private static byte[] m73485a(int i, int i2, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) parsableBitArray.readBits(i2);
        }
        return bArr;
    }

    /* renamed from: b */
    private static int[] m73484b() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* renamed from: c */
    private static int[] m73483c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m73481e(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m73481e(255, i, i2, i7);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private static int[] m73482d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = m73481e(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 != 0) {
                    if (i21 != 8) {
                        int i24 = 43;
                        if (i21 != 128) {
                            if (i21 == 136) {
                                if ((i19 & 1) != 0) {
                                    i13 = 43;
                                } else {
                                    i13 = 0;
                                }
                                if ((i19 & 16) != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                int i25 = i13 + i14;
                                if ((i19 & 2) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i19 & 32) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i26 = i15 + i16;
                                if ((i19 & 4) == 0) {
                                    i24 = 0;
                                }
                                if ((i19 & 64) == 0) {
                                    i23 = 0;
                                }
                                iArr[i19] = m73481e(255, i25, i26, i24 + i23);
                            }
                        } else {
                            if ((i19 & 1) != 0) {
                                i9 = 43;
                            } else {
                                i9 = 0;
                            }
                            int i27 = i9 + 127;
                            if ((i19 & 16) != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i27 + i10;
                            if ((i19 & 2) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + 127;
                            if ((i19 & 32) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i19 & 4) == 0) {
                                i24 = 0;
                            }
                            int i31 = i24 + 127;
                            if ((i19 & 64) == 0) {
                                i23 = 0;
                            }
                            iArr[i19] = m73481e(255, i28, i30, i31 + i23);
                        }
                    } else {
                        if ((i19 & 1) != 0) {
                            i5 = 85;
                        } else {
                            i5 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        int i32 = i5 + i6;
                        if ((i19 & 2) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i33 = i7 + i8;
                        if ((i19 & 4) == 0) {
                            i23 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i22 = 0;
                        }
                        iArr[i19] = m73481e(127, i32, i33, i23 + i22);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i34 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i35 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m73481e(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int m73481e(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: f */
    private static int m73480f(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int readBits;
        int readBits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte readBits3 = parsableBitArray.readBits(2);
            if (readBits3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(3) + 3;
                    readBits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        z = z2;
                        i3 = 1;
                    } else {
                        int readBits4 = parsableBitArray.readBits(2);
                        if (readBits4 != 0) {
                            if (readBits4 != 1) {
                                if (readBits4 != 2) {
                                    if (readBits4 != 3) {
                                        z = z2;
                                    } else {
                                        readBits = parsableBitArray.readBits(8) + 29;
                                        readBits2 = parsableBitArray.readBits(2);
                                    }
                                } else {
                                    readBits = parsableBitArray.readBits(4) + 12;
                                    readBits2 = parsableBitArray.readBits(2);
                                }
                            } else {
                                z = z2;
                                i3 = 2;
                            }
                        } else {
                            z = true;
                        }
                        readBits3 = 0;
                        i3 = 0;
                    }
                    readBits3 = 0;
                }
                z = z2;
                i3 = readBits;
                readBits3 = readBits2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: g */
    private static int m73479g(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int readBits;
        int readBits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte readBits3 = parsableBitArray.readBits(4);
            if (readBits3 != 0) {
                z = z2;
                i3 = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits4 = parsableBitArray.readBits(3);
                if (readBits4 != 0) {
                    z = z2;
                    i3 = readBits4 + 2;
                    readBits3 = 0;
                } else {
                    z = true;
                    readBits3 = 0;
                    i3 = 0;
                }
            } else {
                if (!parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(2) + 4;
                    readBits2 = parsableBitArray.readBits(4);
                } else {
                    int readBits5 = parsableBitArray.readBits(2);
                    if (readBits5 != 0) {
                        if (readBits5 != 1) {
                            if (readBits5 != 2) {
                                if (readBits5 != 3) {
                                    z = z2;
                                    readBits3 = 0;
                                    i3 = 0;
                                } else {
                                    readBits = parsableBitArray.readBits(8) + 25;
                                    readBits2 = parsableBitArray.readBits(4);
                                }
                            } else {
                                readBits = parsableBitArray.readBits(4) + 9;
                                readBits2 = parsableBitArray.readBits(4);
                            }
                        } else {
                            z = z2;
                            i3 = 2;
                        }
                    } else {
                        z = z2;
                        i3 = 1;
                    }
                    readBits3 = 0;
                }
                z = z2;
                i3 = readBits;
                readBits3 = readBits2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: h */
    private static int m73478h(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int readBits;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            byte readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z = z2;
                readBits = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z = z2;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    z = true;
                    readBits2 = 0;
                    readBits = 0;
                }
            } else {
                z = z2;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i3, i2, i3 + readBits, i2 + 1, paint);
            }
            i3 += readBits;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    /* renamed from: i */
    private static void m73477i(byte[] bArr, int[] iArr, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        if (i == 3) {
                            if (bArr6 == null) {
                                bArr3 = f34880i;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else if (i == 2) {
                            if (bArr8 == null) {
                                bArr3 = f34879h;
                            } else {
                                bArr3 = bArr8;
                            }
                        } else {
                            bArr2 = null;
                            i4 = m73480f(parsableBitArray, iArr, bArr2, i4, i5, paint, canvas);
                            parsableBitArray.byteAlign();
                            continue;
                        }
                        bArr2 = bArr3;
                        i4 = m73480f(parsableBitArray, iArr, bArr2, i4, i5, paint, canvas);
                        parsableBitArray.byteAlign();
                        continue;
                    case 17:
                        if (i == 3) {
                            if (bArr7 == null) {
                                bArr5 = f34881j;
                            } else {
                                bArr5 = bArr7;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i4 = m73479g(parsableBitArray, iArr, bArr4, i4, i5, paint, canvas);
                        parsableBitArray.byteAlign();
                        continue;
                    case 18:
                        i4 = m73478h(parsableBitArray, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (readBits) {
                            case 32:
                                bArr8 = m73485a(4, 4, parsableBitArray);
                                continue;
                            case 33:
                                bArr6 = m73485a(4, 8, parsableBitArray);
                                continue;
                            case 34:
                                bArr7 = m73485a(16, 8, parsableBitArray);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    /* renamed from: j */
    private static void m73476j(ObjectData objectData, ClutDefinition clutDefinition, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else if (i == 2) {
            iArr = clutDefinition.clutEntries4Bit;
        } else {
            iArr = clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        m73477i(objectData.topFieldData, iArr2, i, i2, i3, paint, canvas);
        m73477i(objectData.bottomFieldData, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    /* renamed from: k */
    private static ClutDefinition m73475k(ParsableBitArray parsableBitArray, int i) {
        int[] iArr;
        int readBits;
        int i2;
        int readBits2;
        int readBits3;
        int i3;
        int i4 = 8;
        int readBits4 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i5 = 2;
        int i6 = i - 2;
        int[] m73484b = m73484b();
        int[] m73483c = m73483c();
        int[] m73482d = m73482d();
        while (i6 > 0) {
            int readBits5 = parsableBitArray.readBits(i4);
            int readBits6 = parsableBitArray.readBits(i4);
            int i7 = i6 - 2;
            if ((readBits6 & 128) != 0) {
                iArr = m73484b;
            } else if ((readBits6 & 64) != 0) {
                iArr = m73483c;
            } else {
                iArr = m73482d;
            }
            if ((readBits6 & 1) != 0) {
                readBits3 = parsableBitArray.readBits(i4);
                i3 = parsableBitArray.readBits(i4);
                readBits = parsableBitArray.readBits(i4);
                readBits2 = parsableBitArray.readBits(i4);
                i2 = i7 - 4;
            } else {
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i2 = i7 - 2;
                readBits2 = parsableBitArray.readBits(i5) << 6;
                readBits3 = parsableBitArray.readBits(6) << i5;
                i3 = readBits7;
            }
            if (readBits3 == 0) {
                readBits2 = 255;
                i3 = 0;
                readBits = 0;
            }
            double d = readBits3;
            double d2 = i3 - 128;
            double d3 = readBits - 128;
            iArr[readBits5] = m73481e((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) (d + (1.402d * d2)), 0, 255), Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.constrainValue((int) (d + (d3 * 1.772d)), 0, 255));
            i6 = i2;
            readBits4 = readBits4;
            i4 = 8;
            i5 = 2;
        }
        return new ClutDefinition(readBits4, m73484b, m73483c, m73482d);
    }

    /* renamed from: l */
    private static DisplayDefinition m73474l(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int i3;
        int i4;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i4 = parsableBitArray.readBits(16);
            i3 = readBits4;
            i2 = readBits5;
            i = readBits3;
        } else {
            i = 0;
            i2 = 0;
            i3 = readBits;
            i4 = readBits2;
        }
        return new DisplayDefinition(readBits, readBits2, i, i3, i2, i4);
    }

    /* renamed from: m */
    private static ObjectData m73473m(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int readBits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int readBits2 = parsableBitArray.readBits(2);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (readBits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                parsableBitArray.readBytes(bArr2, 0, readBits3);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                parsableBitArray.readBytes(bArr, 0, readBits4);
                return new ObjectData(readBits, readBit, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(readBits, readBit, bArr2, bArr);
    }

    /* renamed from: n */
    private static PageComposition m73472n(ParsableBitArray parsableBitArray, int i) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i2 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    /* renamed from: o */
    private static RegionComposition m73471o(ParsableBitArray parsableBitArray, int i) {
        int readBits;
        int readBits2;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i2 = 16;
        int readBits4 = parsableBitArray.readBits(16);
        int readBits5 = parsableBitArray.readBits(16);
        int readBits6 = parsableBitArray.readBits(3);
        int readBits7 = parsableBitArray.readBits(3);
        int i3 = 2;
        parsableBitArray.skipBits(2);
        int readBits8 = parsableBitArray.readBits(8);
        int readBits9 = parsableBitArray.readBits(8);
        int readBits10 = parsableBitArray.readBits(4);
        int readBits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int readBits12 = parsableBitArray.readBits(i2);
            int readBits13 = parsableBitArray.readBits(i3);
            int readBits14 = parsableBitArray.readBits(i3);
            int readBits15 = parsableBitArray.readBits(12);
            int i5 = readBits11;
            parsableBitArray.skipBits(4);
            int readBits16 = parsableBitArray.readBits(12);
            i4 -= 6;
            if (readBits13 != 1 && readBits13 != 2) {
                readBits = 0;
                readBits2 = 0;
            } else {
                i4 -= 2;
                readBits = parsableBitArray.readBits(8);
                readBits2 = parsableBitArray.readBits(8);
            }
            sparseArray.put(readBits12, new RegionObject(readBits13, readBits14, readBits15, readBits16, readBits, readBits2));
            readBits11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new RegionComposition(readBits3, readBit, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, readBits10, readBits11, sparseArray);
    }

    /* renamed from: p */
    private static void m73470p(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        RegionComposition regionComposition;
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + readBits3;
        if (readBits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.m72602w("DvbParser", "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (readBits) {
            case 16:
                if (readBits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition m73472n = m73472n(parsableBitArray, readBits3);
                    if (m73472n.state != 0) {
                        subtitleService.pageComposition = m73472n;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    } else if (pageComposition != null && pageComposition.version != m73472n.version) {
                        subtitleService.pageComposition = m73472n;
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition2 = subtitleService.pageComposition;
                if (readBits2 == subtitleService.subtitlePageId && pageComposition2 != null) {
                    RegionComposition m73471o = m73471o(parsableBitArray, readBits3);
                    if (pageComposition2.state == 0 && (regionComposition = subtitleService.regions.get(m73471o.f34891id)) != null) {
                        m73471o.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(m73471o.f34891id, m73471o);
                    break;
                }
                break;
            case 18:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ClutDefinition m73475k = m73475k(parsableBitArray, readBits3);
                    subtitleService.cluts.put(m73475k.f34889id, m73475k);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ClutDefinition m73475k2 = m73475k(parsableBitArray, readBits3);
                    subtitleService.ancillaryCluts.put(m73475k2.f34889id, m73475k2);
                    break;
                }
                break;
            case 19:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ObjectData m73473m = m73473m(parsableBitArray);
                    subtitleService.objects.put(m73473m.f34890id, m73473m);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ObjectData m73473m2 = m73473m(parsableBitArray);
                    subtitleService.ancillaryObjects.put(m73473m2.f34890id, m73473m2);
                    break;
                }
                break;
            case 20:
                if (readBits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = m73474l(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    public List<Cue> decode(byte[] bArr, int i) {
        int i2;
        ObjectData objectData;
        int i3;
        SparseArray<RegionObject> sparseArray;
        Paint paint;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            m73470p(parsableBitArray, this.f34887f);
        }
        SubtitleService subtitleService = this.f34887f;
        PageComposition pageComposition = subtitleService.pageComposition;
        if (pageComposition == null) {
            return Collections.emptyList();
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.f34885d;
        }
        Bitmap bitmap = this.f34888g;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.f34888g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.f34888g = createBitmap;
            this.f34884c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = pageComposition.regions;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f34884c.save();
            PageRegion valueAt = sparseArray2.valueAt(i4);
            RegionComposition regionComposition = this.f34887f.regions.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i6 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.f34884c.clipRect(i5, i6, Math.min(regionComposition.width + i5, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i6, displayDefinition.verticalPositionMaximum));
            ClutDefinition clutDefinition = this.f34887f.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.f34887f.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.f34886e;
            }
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                RegionObject valueAt2 = sparseArray3.valueAt(i7);
                ObjectData objectData2 = this.f34887f.objects.get(keyAt);
                if (objectData2 == null) {
                    objectData = this.f34887f.ancillaryObjects.get(keyAt);
                } else {
                    objectData = objectData2;
                }
                if (objectData != null) {
                    if (objectData.nonModifyingColorFlag) {
                        paint = null;
                    } else {
                        paint = this.f34882a;
                    }
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m73476j(objectData, clutDefinition, regionComposition.depth, valueAt2.horizontalPosition + i5, i6 + valueAt2.verticalPosition, paint, this.f34884c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (regionComposition.fillFlag) {
                int i8 = regionComposition.depth;
                if (i8 == 3) {
                    i2 = clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (i8 == 2) {
                    i2 = clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i2 = clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.f34883b.setColor(i2);
                this.f34884c.drawRect(i5, i6, regionComposition.width + i5, regionComposition.height + i6, this.f34883b);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.f34888g, i5, i6, regionComposition.width, regionComposition.height)).setPosition(i5 / displayDefinition.width).setPositionAnchor(0).setLine(i6 / displayDefinition.height, 0).setLineAnchor(0).setSize(regionComposition.width / displayDefinition.width).setBitmapHeight(regionComposition.height / displayDefinition.height).build());
            this.f34884c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f34884c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void reset() {
        this.f34887f.reset();
    }
}
