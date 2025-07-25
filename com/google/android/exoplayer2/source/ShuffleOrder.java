package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes4.dex */
public interface ShuffleOrder {

    /* loaded from: classes4.dex */
    public static class DefaultShuffleOrder implements ShuffleOrder {

        /* renamed from: a */
        private final Random f34413a;

        /* renamed from: b */
        private final int[] f34414b;

        /* renamed from: c */
        private final int[] f34415c;

        public DefaultShuffleOrder(int i) {
            this(i, new Random());
        }

        /* renamed from: a */
        private static int[] m73712a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.f34413a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f34413a.nextInt(this.f34414b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f34413a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f34414b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f34414b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new DefaultShuffleOrder(iArr3, new Random(this.f34413a.nextLong()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f34414b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f34414b;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 >= i && i6 < i2) {
                        i5++;
                    } else {
                        int i7 = i4 - i5;
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i7] = i6;
                    }
                    i4++;
                } else {
                    return new DefaultShuffleOrder(iArr, new Random(this.f34413a.nextLong()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.f34414b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.f34414b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.f34414b.length;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i2 = this.f34415c[i] + 1;
            int[] iArr = this.f34414b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i2 = this.f34415c[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return this.f34414b[i2];
        }

        public DefaultShuffleOrder(int i, long j) {
            this(i, new Random(j));
        }

        public DefaultShuffleOrder(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private DefaultShuffleOrder(int i, Random random) {
            this(m73712a(i, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.f34414b = iArr;
            this.f34413a = random;
            this.f34415c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f34415c[iArr[i]] = i;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnshuffledShuffleOrder implements ShuffleOrder {

        /* renamed from: a */
        private final int f34416a;

        public UnshuffledShuffleOrder(int i) {
            this.f34416a = i;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i2) {
            return new UnshuffledShuffleOrder(this.f34416a + i2);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i2) {
            return new UnshuffledShuffleOrder((this.f34416a - i2) + i);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            if (this.f34416a > 0) {
                return 0;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int i = this.f34416a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.f34416a;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i2 = i + 1;
            if (i2 >= this.f34416a) {
                return -1;
            }
            return i2;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i2 = i - 1;
            if (i2 < 0) {
                return -1;
            }
            return i2;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i, int i2);

    ShuffleOrder cloneAndRemove(int i, int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
