package com.facebook.ads.redexgen.p370X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.X9 */
/* loaded from: assets/audience_network.dex */
public final class C12863X9 implements InterfaceC11872Gz {
    public static byte[] A07;
    public static String[] A08 = {"Qq", "sLav", "xXJIeuat1Un3oETUCUBgWYVlLTYdvUXR", "pXicUG6N1XHbCG5QhjJ94uJ", "HKhocTo1", "Z1k35KQ5uMLjnmzbQjJ", "rJGKNzEqvOEIyk4kxb4", "sIOIMXdckNxf1vD7TuVkHKtZXYRsYSsj"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final InterfaceC11894HL<? super C12863X9> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{105, 69, 95, 70, 78, 10, 68, 69, 94, 10, 69, 90, 79, 68, 10, 76, 67, 70, 79, 10, 78, 79, 89, 73, 88, 67, 90, 94, 69, 88, 10, 76, 69, 88, 16, 10, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws C11868Gv {
        try {
            this.A02 = c11876h3.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 106));
            if (this.A01 != null) {
                this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                long skip = this.A03.skip(c11876h3.A03 + startOffset) - startOffset;
                if (skip == c11876h3.A03) {
                    if (c11876h3.A02 != -1) {
                        this.A00 = c11876h3.A02;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            this.A00 = size != 0 ? size - channel.position() : -1L;
                        } else {
                            this.A00 = length - skip;
                        }
                    }
                    this.A04 = true;
                    if (this.A06 != null) {
                        this.A06.ADs(this, c11876h3);
                    }
                    return this.A00;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException(A00(0, 36, 0) + this.A02);
        } catch (IOException e) {
            throw new C11868Gv(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public C12863X9(Context context, InterfaceC11894HL<? super C12863X9> interfaceC11894HL) {
        this.A05 = context.getContentResolver();
        this.A06 = interfaceC11894HL;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws C11868Gv {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } catch (IOException e) {
                        throw new C11868Gv(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                }
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            if (A08[1].length() == 5) {
                                throw new RuntimeException();
                            }
                            A08[3] = "3rXXSzOuZYrIDyr67K";
                            if (this.A06 != null) {
                                this.A06.ADr(this);
                            }
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new C11868Gv(e2);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                }
            }
        } catch (IOException e3) {
            throw new C11868Gv(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws C11868Gv {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i2 = (int) Math.min(this.A00, i2);
            }
            int read = this.A03.read(bArr, i, i2);
            if (read == -1) {
                int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                if (bytesRead == 0) {
                    return -1;
                }
                throw new C11868Gv(new EOFException());
            }
            int bytesRead2 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead2 != 0) {
                this.A00 -= read;
            }
            if (this.A06 != null) {
                this.A06.ABS(this, read);
            }
            return read;
        } catch (IOException e) {
            throw new C11868Gv(e);
        }
    }
}
