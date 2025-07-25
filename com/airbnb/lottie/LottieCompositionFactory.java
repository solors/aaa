package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mobilefuse.sdk.common.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.C39217m0;
import p001a0.LottieCompositionCache;
import p660f0.LottieCompositionMoshiParser;
import p677g0.AbstractC33178c;
import p690h0.C33453f;
import p690h0.C33454j;

/* renamed from: com.airbnb.lottie.e */
/* loaded from: classes2.dex */
public class LottieCompositionFactory {

    /* renamed from: a */
    private static final Map<String, LottieTask<LottieComposition>> f2137a = new HashMap();

    /* renamed from: b */
    private static final byte[] f2138b = {80, 75, 3, 4};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$a */
    /* loaded from: classes2.dex */
    public class C3488a implements LottieListener<LottieComposition> {

        /* renamed from: a */
        final /* synthetic */ String f2139a;

        C3488a(String str) {
            this.f2139a = str;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* renamed from: a */
        public void onResult(LottieComposition lottieComposition) {
            LottieCompositionFactory.f2137a.remove(this.f2139a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$b */
    /* loaded from: classes2.dex */
    public class C3489b implements LottieListener<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f2140a;

        C3489b(String str) {
            this.f2140a = str;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* renamed from: a */
        public void onResult(Throwable th) {
            LottieCompositionFactory.f2137a.remove(this.f2140a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$c */
    /* loaded from: classes2.dex */
    public class CallableC3490c implements Callable<LottieResult<LottieComposition>> {

        /* renamed from: b */
        final /* synthetic */ Context f2141b;

        /* renamed from: c */
        final /* synthetic */ String f2142c;

        /* renamed from: d */
        final /* synthetic */ String f2143d;

        CallableC3490c(Context context, String str, String str2) {
            this.f2141b = context;
            this.f2142c = str;
            this.f2143d = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public LottieResult<LottieComposition> call() {
            LottieResult<LottieComposition> m25533c = L.m103399d(this.f2141b).m25533c(this.f2142c, this.f2143d);
            if (this.f2143d != null && m25533c.m103256b() != null) {
                LottieCompositionCache.m105883b().m105882c(this.f2143d, m25533c.m103256b());
            }
            return m25533c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$d */
    /* loaded from: classes2.dex */
    public class CallableC3491d implements Callable<LottieResult<LottieComposition>> {

        /* renamed from: b */
        final /* synthetic */ Context f2144b;

        /* renamed from: c */
        final /* synthetic */ String f2145c;

        /* renamed from: d */
        final /* synthetic */ String f2146d;

        CallableC3491d(Context context, String str, String str2) {
            this.f2144b = context;
            this.f2145c = str;
            this.f2146d = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.m103370g(this.f2144b, this.f2145c, this.f2146d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$e */
    /* loaded from: classes2.dex */
    public class CallableC3492e implements Callable<LottieResult<LottieComposition>> {

        /* renamed from: b */
        final /* synthetic */ WeakReference f2147b;

        /* renamed from: c */
        final /* synthetic */ Context f2148c;

        /* renamed from: d */
        final /* synthetic */ int f2149d;

        /* renamed from: f */
        final /* synthetic */ String f2150f;

        CallableC3492e(WeakReference weakReference, Context context, int i, String str) {
            this.f2147b = weakReference;
            this.f2148c = context;
            this.f2149d = i;
            this.f2150f = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public LottieResult<LottieComposition> call() {
            Context context = (Context) this.f2147b.get();
            if (context == null) {
                context = this.f2148c;
            }
            return LottieCompositionFactory.m103361p(context, this.f2149d, this.f2150f);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$f */
    /* loaded from: classes2.dex */
    class CallableC3493f implements Callable<LottieResult<LottieComposition>> {

        /* renamed from: b */
        final /* synthetic */ InputStream f2151b;

        /* renamed from: c */
        final /* synthetic */ String f2152c;

        CallableC3493f(InputStream inputStream, String str) {
            this.f2151b = inputStream;
            this.f2152c = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public LottieResult<LottieComposition> call() {
            return LottieCompositionFactory.m103368i(this.f2151b, this.f2152c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$g */
    /* loaded from: classes2.dex */
    public class CallableC3494g implements Callable<LottieResult<LottieComposition>> {

        /* renamed from: b */
        final /* synthetic */ LottieComposition f2153b;

        CallableC3494g(LottieComposition lottieComposition) {
            this.f2153b = lottieComposition;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public LottieResult<LottieComposition> call() {
            return new LottieResult<>(this.f2153b);
        }
    }

    /* renamed from: b */
    private static LottieTask<LottieComposition> m103375b(@Nullable String str, Callable<LottieResult<LottieComposition>> callable) {
        LottieComposition m105884a;
        if (str == null) {
            m105884a = null;
        } else {
            m105884a = LottieCompositionCache.m105883b().m105884a(str);
        }
        if (m105884a != null) {
            return new LottieTask<>(new CallableC3494g(m105884a));
        }
        if (str != null) {
            Map<String, LottieTask<LottieComposition>> map = f2137a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        LottieTask<LottieComposition> lottieTask = new LottieTask<>(callable);
        if (str != null) {
            lottieTask.m103250f(new C3488a(str));
            lottieTask.m103251e(new C3489b(str));
            f2137a.put(str, lottieTask);
        }
        return lottieTask;
    }

    @Nullable
    /* renamed from: c */
    private static LottieImageAsset m103374c(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.m103389j().values()) {
            if (lottieImageAsset.m103263b().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static LottieTask<LottieComposition> m103373d(Context context, String str) {
        return m103372e(context, str, "asset_" + str);
    }

    /* renamed from: e */
    public static LottieTask<LottieComposition> m103372e(Context context, String str, @Nullable String str2) {
        return m103375b(str2, new CallableC3491d(context.getApplicationContext(), str, str2));
    }

    @WorkerThread
    /* renamed from: f */
    public static LottieResult<LottieComposition> m103371f(Context context, String str) {
        return m103370g(context, str, "asset_" + str);
    }

    @WorkerThread
    /* renamed from: g */
    public static LottieResult<LottieComposition> m103370g(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m103368i(context.getAssets().open(str), str2);
            }
            return m103358s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new LottieResult<>(e);
        }
    }

    /* renamed from: h */
    public static LottieTask<LottieComposition> m103369h(InputStream inputStream, @Nullable String str) {
        return m103375b(str, new CallableC3493f(inputStream, str));
    }

    @WorkerThread
    /* renamed from: i */
    public static LottieResult<LottieComposition> m103368i(InputStream inputStream, @Nullable String str) {
        return m103367j(inputStream, str, true);
    }

    @WorkerThread
    /* renamed from: j */
    private static LottieResult<LottieComposition> m103367j(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return m103366k(AbstractC33178c.m24523s(C39217m0.m13507d(C39217m0.m13500k(inputStream))), str);
        } finally {
            if (z) {
                C33454j.m23860c(inputStream);
            }
        }
    }

    @WorkerThread
    /* renamed from: k */
    public static LottieResult<LottieComposition> m103366k(AbstractC33178c abstractC33178c, @Nullable String str) {
        return m103365l(abstractC33178c, str, true);
    }

    /* renamed from: l */
    private static LottieResult<LottieComposition> m103365l(AbstractC33178c abstractC33178c, @Nullable String str, boolean z) {
        try {
            try {
                LottieComposition m24972a = LottieCompositionMoshiParser.m24972a(abstractC33178c);
                if (str != null) {
                    LottieCompositionCache.m105883b().m105882c(str, m24972a);
                }
                LottieResult<LottieComposition> lottieResult = new LottieResult<>(m24972a);
                if (z) {
                    C33454j.m23860c(abstractC33178c);
                }
                return lottieResult;
            } catch (Exception e) {
                LottieResult<LottieComposition> lottieResult2 = new LottieResult<>(e);
                if (z) {
                    C33454j.m23860c(abstractC33178c);
                }
                return lottieResult2;
            }
        } catch (Throwable th) {
            if (z) {
                C33454j.m23860c(abstractC33178c);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static LottieTask<LottieComposition> m103364m(Context context, @RawRes int i) {
        return m103363n(context, i, m103354w(context, i));
    }

    /* renamed from: n */
    public static LottieTask<LottieComposition> m103363n(Context context, @RawRes int i, @Nullable String str) {
        return m103375b(str, new CallableC3492e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    @WorkerThread
    /* renamed from: o */
    public static LottieResult<LottieComposition> m103362o(Context context, @RawRes int i) {
        return m103361p(context, i, m103354w(context, i));
    }

    @WorkerThread
    /* renamed from: p */
    public static LottieResult<LottieComposition> m103361p(Context context, @RawRes int i, @Nullable String str) {
        try {
            BufferedSource m13507d = C39217m0.m13507d(C39217m0.m13500k(context.getResources().openRawResource(i)));
            if (m103355v(m13507d).booleanValue()) {
                return m103358s(new ZipInputStream(m13507d.inputStream()), str);
            }
            return m103368i(m13507d.inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new LottieResult<>(e);
        }
    }

    /* renamed from: q */
    public static LottieTask<LottieComposition> m103360q(Context context, String str) {
        return m103359r(context, str, "url_" + str);
    }

    /* renamed from: r */
    public static LottieTask<LottieComposition> m103359r(Context context, String str, @Nullable String str2) {
        return m103375b(str2, new CallableC3490c(context, str, str2));
    }

    @WorkerThread
    /* renamed from: s */
    public static LottieResult<LottieComposition> m103358s(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return m103357t(zipInputStream, str);
        } finally {
            C33454j.m23860c(zipInputStream);
        }
    }

    @WorkerThread
    /* renamed from: t */
    private static LottieResult<LottieComposition> m103357t(ZipInputStream zipInputStream, @Nullable String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase(BuildConfig.ASSET_MANIFEST_FILENAME)) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    lottieComposition = m103365l(AbstractC33178c.m24523s(C39217m0.m13507d(C39217m0.m13500k(zipInputStream))), null, false).m103256b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split(RemoteSettings.FORWARD_SLASH_STRING)[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                LottieImageAsset m103374c = m103374c(lottieComposition, (String) entry.getKey());
                if (m103374c != null) {
                    m103374c.m103259f(C33454j.m23851l((Bitmap) entry.getValue(), m103374c.m103260e(), m103374c.m103262c()));
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry2 : lottieComposition.m103389j().entrySet()) {
                if (entry2.getValue().m103264a() == null) {
                    return new LottieResult<>(new IllegalStateException("There is no image for " + entry2.getValue().m103263b()));
                }
            }
            if (str != null) {
                LottieCompositionCache.m105883b().m105882c(str, lottieComposition);
            }
            return new LottieResult<>(lottieComposition);
        } catch (IOException e) {
            return new LottieResult<>(e);
        }
    }

    /* renamed from: u */
    private static boolean m103356u(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private static Boolean m103355v(BufferedSource bufferedSource) {
        try {
            BufferedSource peek = bufferedSource.peek();
            for (byte b : f2138b) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C33453f.m23902b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: w */
    private static String m103354w(Context context, @RawRes int i) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        if (m103356u(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i);
        return sb2.toString();
    }
}
