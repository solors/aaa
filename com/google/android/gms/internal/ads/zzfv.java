package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfv extends zzfr {
    private final ContentResolver zza;
    @Nullable
    private Uri zzb;
    @Nullable
    private AssetFileDescriptor zzc;
    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfv(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzfu {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfu(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i3 = zzei.zza;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws zzfu {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri normalizeScheme = zzgdVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzgdVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, Headers.VALUE_ACCEPT_ALL, bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i2 != 0 && zzgdVar.zze > length) {
                        throw new zzfu(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzgdVar.zze + startOffset) - startOffset;
                    if (skip == zzgdVar.zze) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.zze = j;
                                if (j < 0) {
                                    throw new zzfu(null, 2008);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.zze = j;
                            if (j < 0) {
                                throw new zzfu(null, 2008);
                            }
                        }
                        long j2 = zzgdVar.zzf;
                        if (j2 != -1) {
                            if (j != -1) {
                                j2 = Math.min(j, j2);
                            }
                            this.zze = j2;
                        }
                        this.zzf = true;
                        zzj(zzgdVar);
                        long j3 = zzgdVar.zzf;
                        if (j3 != -1) {
                            return j3;
                        }
                        return this.zze;
                    }
                    throw new zzfu(null, 2008);
                }
                i = 2000;
                try {
                    throw new zzfu(new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme)), 2000);
                } catch (IOException e) {
                    e = e;
                    if (true == (e instanceof FileNotFoundException)) {
                        i = 2005;
                    }
                    throw new zzfu(e, i);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (zzfu e3) {
            throw e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzfu {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e) {
                    throw new zzfu(e, 2000);
                }
            } finally {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            }
        } catch (IOException e2) {
            throw new zzfu(e2, 2000);
        }
    }
}
