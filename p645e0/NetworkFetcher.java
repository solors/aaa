package p645e0;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p690h0.C33453f;

/* renamed from: e0.h */
/* loaded from: classes2.dex */
public class NetworkFetcher {
    @NonNull

    /* renamed from: a */
    private final NetworkCache f89703a;
    @NonNull

    /* renamed from: b */
    private final LottieNetworkFetcher f89704b;

    public NetworkFetcher(@NonNull NetworkCache networkCache, @NonNull LottieNetworkFetcher lottieNetworkFetcher) {
        this.f89703a = networkCache;
        this.f89704b = lottieNetworkFetcher;
    }

    @Nullable
    @WorkerThread
    /* renamed from: a */
    private LottieComposition m25535a(@NonNull String str, @Nullable String str2) {
        Pair<FileExtension, InputStream> m25541a;
        LottieResult<LottieComposition> m103368i;
        if (str2 == null || (m25541a = this.f89703a.m25541a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) m25541a.first;
        InputStream inputStream = (InputStream) m25541a.second;
        if (fileExtension == FileExtension.ZIP) {
            m103368i = LottieCompositionFactory.m103358s(new ZipInputStream(inputStream), str);
        } else {
            m103368i = LottieCompositionFactory.m103368i(inputStream, str);
        }
        if (m103368i.m103256b() == null) {
            return null;
        }
        return m103368i.m103256b();
    }

    @NonNull
    @WorkerThread
    /* renamed from: b */
    private LottieResult<LottieComposition> m25534b(@NonNull String str, @Nullable String str2) {
        boolean z;
        C33453f.m23903a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                LottieFetchResult mo25542a = this.f89704b.mo25542a(str);
                if (mo25542a.isSuccessful()) {
                    LottieResult<LottieComposition> m25532d = m25532d(str, mo25542a.mo25544G(), mo25542a.contentType(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    if (m25532d.m103256b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb2.append(z);
                    C33453f.m23903a(sb2.toString());
                    try {
                        mo25542a.close();
                    } catch (IOException e) {
                        C33453f.m23900d("LottieFetchResult close failed ", e);
                    }
                    return m25532d;
                }
                LottieResult<LottieComposition> lottieResult = new LottieResult<>(new IllegalArgumentException(mo25542a.mo25545B()));
                try {
                    mo25542a.close();
                } catch (IOException e2) {
                    C33453f.m23900d("LottieFetchResult close failed ", e2);
                }
                return lottieResult;
            } catch (Exception e3) {
                LottieResult<LottieComposition> lottieResult2 = new LottieResult<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        C33453f.m23900d("LottieFetchResult close failed ", e4);
                    }
                }
                return lottieResult2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    C33453f.m23900d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @NonNull
    /* renamed from: d */
    private LottieResult<LottieComposition> m25532d(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        FileExtension fileExtension;
        LottieResult<LottieComposition> m25530f;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str.split("\\?")[0].endsWith(".lottie")) {
            C33453f.m23903a("Received json response.");
            fileExtension = FileExtension.JSON;
            m25530f = m25531e(str, inputStream, str3);
        } else {
            C33453f.m23903a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            m25530f = m25530f(str, inputStream, str3);
        }
        if (str3 != null && m25530f.m103256b() != null) {
            this.f89703a.m25537e(str, fileExtension);
        }
        return m25530f;
    }

    @NonNull
    /* renamed from: e */
    private LottieResult<LottieComposition> m25531e(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        if (str2 == null) {
            return LottieCompositionFactory.m103368i(inputStream, null);
        }
        return LottieCompositionFactory.m103368i(new FileInputStream(new File(this.f89703a.m25536f(str, inputStream, FileExtension.JSON).getAbsolutePath())), str);
    }

    @NonNull
    /* renamed from: f */
    private LottieResult<LottieComposition> m25530f(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        if (str2 == null) {
            return LottieCompositionFactory.m103358s(new ZipInputStream(inputStream), null);
        }
        return LottieCompositionFactory.m103358s(new ZipInputStream(new FileInputStream(this.f89703a.m25536f(str, inputStream, FileExtension.ZIP))), str);
    }

    @NonNull
    @WorkerThread
    /* renamed from: c */
    public LottieResult<LottieComposition> m25533c(@NonNull String str, @Nullable String str2) {
        LottieComposition m25535a = m25535a(str, str2);
        if (m25535a != null) {
            return new LottieResult<>(m25535a);
        }
        C33453f.m23903a("Animation for " + str + " not found in cache. Fetching from network.");
        return m25534b(str, str2);
    }
}
