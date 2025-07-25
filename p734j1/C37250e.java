package p734j1;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.iab.vast.processor.AbstractC10588b;
import com.explorestack.iab.vast.processor.C10585a;
import com.explorestack.iab.vast.processor.C10589c;
import com.explorestack.iab.vast.processor.C10590d;
import com.explorestack.iab.vast.processor.VastAd;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21216x8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p678g1.C33182b;
import p678g1.EnumC33181a;
import p708i1.InterfaceC33594b;
import p708i1.InterfaceC33595c;
import p734j1.C37264h;
import p767l1.C37896e;
import p767l1.C37905n;

/* renamed from: j1.e */
/* loaded from: classes3.dex */
public class C37250e {

    /* renamed from: A */
    private static final C37264h.InterfaceC37266b f98360A = new C37259i();

    /* renamed from: z */
    private static int f98361z = 5;
    @Nullable

    /* renamed from: c */
    private Uri f98364c;
    @Nullable

    /* renamed from: d */
    private VastAd f98365d;
    @Nullable

    /* renamed from: f */
    private Bundle f98367f;
    @Nullable

    /* renamed from: g */
    private AbstractC10588b<C37905n> f98368g;
    @Nullable

    /* renamed from: h */
    private InterfaceC37274n f98369h;
    @Nullable

    /* renamed from: i */
    private InterfaceC33595c f98370i;
    @Nullable

    /* renamed from: k */
    private Float f98372k;

    /* renamed from: l */
    private float f98373l;

    /* renamed from: m */
    private boolean f98374m;

    /* renamed from: n */
    private int f98375n;

    /* renamed from: p */
    private boolean f98377p;
    @NonNull

    /* renamed from: b */
    private EnumC33181a f98363b = EnumC33181a.FullLoad;
    @NonNull

    /* renamed from: e */
    private EnumC37268j f98366e = EnumC37268j.NonRewarded;

    /* renamed from: j */
    private float f98371j = 3.0f;

    /* renamed from: o */
    private int f98376o = 0;

    /* renamed from: q */
    private boolean f98378q = false;

    /* renamed from: r */
    private boolean f98379r = true;

    /* renamed from: s */
    private boolean f98380s = true;

    /* renamed from: t */
    private boolean f98381t = false;

    /* renamed from: u */
    private boolean f98382u = false;

    /* renamed from: v */
    private int f98383v = -1;

    /* renamed from: w */
    private float f98384w = 5.0f;

    /* renamed from: x */
    private final AtomicBoolean f98385x = new AtomicBoolean(false);

    /* renamed from: y */
    private final AtomicBoolean f98386y = new AtomicBoolean(false);
    @NonNull

    /* renamed from: a */
    private final String f98362a = UUID.randomUUID().toString();

    /* renamed from: j1.e$a */
    /* loaded from: classes3.dex */
    public class C37251a {
        public C37251a() {
        }

        /* renamed from: a */
        public C37250e m18622a() {
            return C37250e.this;
        }

        /* renamed from: b */
        public C37251a m18621b(boolean z) {
            C37250e.this.f98374m = z;
            return this;
        }

        /* renamed from: c */
        public C37251a m18620c(@Nullable InterfaceC33595c interfaceC33595c) {
            C37250e.this.f98370i = interfaceC33595c;
            return this;
        }

        /* renamed from: d */
        public C37251a m18619d(@NonNull EnumC33181a enumC33181a) {
            C37250e.this.f98363b = enumC33181a;
            return this;
        }

        /* renamed from: e */
        public C37251a m18618e(int i) {
            C37250e.this.f98373l = i;
            return this;
        }

        /* renamed from: f */
        public C37251a m18617f(float f) {
            C37250e.this.f98371j = f;
            return this;
        }

        /* renamed from: g */
        public C37251a m18616g(int i) {
            C37250e.this.f98372k = Float.valueOf(i);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$b */
    /* loaded from: classes3.dex */
    public class RunnableC37252b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C33182b f98388b;

        RunnableC37252b(C33182b c33182b) {
            this.f98388b = c33182b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C37250e.this.f98369h != null) {
                C37250e.this.f98369h.mo18594b(C37250e.this, this.f98388b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C37253c {

        /* renamed from: a */
        static final /* synthetic */ int[] f98390a;

        static {
            int[] iArr = new int[EnumC33181a.values().length];
            f98390a = iArr;
            try {
                iArr[EnumC33181a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98390a[EnumC33181a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98390a[EnumC33181a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: j1.e$d */
    /* loaded from: classes3.dex */
    class C37254d extends Thread {

        /* renamed from: b */
        final /* synthetic */ Context f98391b;

        /* renamed from: c */
        final /* synthetic */ String f98392c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC37262f f98393d;

        C37254d(Context context, String str, InterfaceC37262f interfaceC37262f) {
            this.f98391b = context;
            this.f98392c = str;
            this.f98393d = interfaceC37262f;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C37250e.this.m18657U(this.f98391b, this.f98392c, this.f98393d);
        }
    }

    /* renamed from: j1.e$e */
    /* loaded from: classes3.dex */
    class C37255e extends Thread {

        /* renamed from: b */
        final /* synthetic */ Context f98395b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC37262f f98396c;

        C37255e(Context context, InterfaceC37262f interfaceC37262f) {
            this.f98395b = context;
            this.f98396c = interfaceC37262f;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C37250e c37250e = C37250e.this;
            c37250e.m18640i(this.f98395b, c37250e.f98365d, this.f98396c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$f */
    /* loaded from: classes3.dex */
    public class RunnableC37256f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ InterfaceC37262f f98398b;

        RunnableC37256f(InterfaceC37262f interfaceC37262f) {
            this.f98398b = interfaceC37262f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98398b.onVastLoaded(C37250e.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$g */
    /* loaded from: classes3.dex */
    public class RunnableC37257g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C33182b f98400b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC37262f f98401c;

        RunnableC37257g(C33182b c33182b, InterfaceC37262f interfaceC37262f) {
            this.f98400b = c33182b;
            this.f98401c = interfaceC37262f;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC37262f interfaceC37262f;
            C37250e c37250e;
            C33182b c33182b;
            if (C37250e.this.f98370i != null) {
                C37250e.this.f98370i.onError(this.f98400b);
            }
            if (this.f98401c != null) {
                if (C37250e.this.f98363b == EnumC33181a.PartialLoad && C37250e.this.f98385x.get() && !C37250e.this.f98386y.get()) {
                    interfaceC37262f = this.f98401c;
                    c37250e = C37250e.this;
                    c33182b = C33182b.m24488b(String.format("%s load failed after display - %s", c37250e.f98363b, this.f98400b));
                } else {
                    interfaceC37262f = this.f98401c;
                    c37250e = C37250e.this;
                    c33182b = this.f98400b;
                }
                interfaceC37262f.onVastLoadFailed(c37250e, c33182b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$h */
    /* loaded from: classes3.dex */
    public class RunnableC37258h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ InterfaceC37247b f98403b;

        /* renamed from: c */
        final /* synthetic */ C33182b f98404c;

        RunnableC37258h(InterfaceC37247b interfaceC37247b, C33182b c33182b) {
            this.f98403b = interfaceC37247b;
            this.f98404c = c33182b;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC37247b interfaceC37247b = this.f98403b;
            if (interfaceC37247b != null) {
                interfaceC37247b.onVastShowFailed(C37250e.this, this.f98404c);
            }
        }
    }

    /* renamed from: j1.e$i */
    /* loaded from: classes3.dex */
    class C37259i implements C37264h.InterfaceC37266b {
        C37259i() {
        }

        @Override // p734j1.C37264h.InterfaceC37266b
        /* renamed from: a */
        public void mo18612a(String str) {
            C37248c.m18681a("VastRequest", "Fire url: %s", str);
            C10512g.m79295v(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$j */
    /* loaded from: classes3.dex */
    public class RunnableC37260j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ VastAd f98406b;

        RunnableC37260j(VastAd vastAd) {
            this.f98406b = vastAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C37250e.this.f98369h != null) {
                C37250e.this.f98369h.mo18595a(C37250e.this, this.f98406b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.e$k */
    /* loaded from: classes3.dex */
    public class C37261k implements Comparable {

        /* renamed from: b */
        public long f98408b;

        /* renamed from: c */
        public File f98409c;

        public C37261k(File file) {
            this.f98409c = file;
            this.f98408b = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Object obj) {
            int i = (this.f98408b > ((C37261k) obj).f98408b ? 1 : (this.f98408b == ((C37261k) obj).f98408b ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    private C37250e() {
    }

    /* renamed from: V */
    public static C37251a m18656V() {
        return new C37251a();
    }

    /* renamed from: Y */
    public static void m18653Y(int i) {
        if (i > 0) {
            f98361z = i;
        }
    }

    @Nullable
    /* renamed from: b */
    private Uri m18649b(@NonNull Context context, @NonNull String str) {
        String m18630s = m18630s(context);
        if (m18630s != null) {
            File file = new File(m18630s);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str2 = C21216x8.f54442D + System.currentTimeMillis();
            String replace = str.substring(0, Math.min(230 - file.getPath().length(), str.length())).replace(RemoteSettings.FORWARD_SLASH_STRING, "").replace(":", "");
            File file2 = new File(file, replace);
            if (file2.exists()) {
                return Uri.fromFile(file2);
            }
            File file3 = new File(file, str2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            long contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[1024];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += read;
            }
            fileOutputStream.close();
            if (contentLength == j) {
                file3.renameTo(new File(file, replace));
                return Uri.fromFile(new File(file, replace));
            }
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        throw new FileNotFoundException("No dir for caching file");
    }

    @NonNull
    /* renamed from: f */
    private Float m18643f(@NonNull VastAd vastAd, @Nullable InterfaceC37269k interfaceC37269k) {
        Float f;
        if (interfaceC37269k != null) {
            f = interfaceC37269k.mo15820g();
        } else {
            f = null;
        }
        if (m18661Q()) {
            f = C10512g.m79331B(f, m18664N());
        }
        Float m79330C = C10512g.m79330C(f, vastAd.m79006p());
        if (m79330C == null) {
            return Float.valueOf(5.0f);
        }
        return m79330C;
    }

    /* renamed from: h */
    private void m18641h(@NonNull Context context) {
        File[] listFiles;
        try {
            String m18630s = m18630s(context);
            if (m18630s != null && (listFiles = new File(m18630s).listFiles()) != null && listFiles.length > f98361z) {
                C37261k[] c37261kArr = new C37261k[listFiles.length];
                for (int i = 0; i < listFiles.length; i++) {
                    c37261kArr[i] = new C37261k(listFiles[i]);
                }
                Arrays.sort(c37261kArr);
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    listFiles[i2] = c37261kArr[i2].f98409c;
                }
                for (int i3 = f98361z; i3 < listFiles.length; i3++) {
                    if (!Uri.fromFile(listFiles[i3]).equals(this.f98364c)) {
                        listFiles[i3].delete();
                    }
                }
            }
        } catch (Exception e) {
            C37248c.m18680b("VastRequest", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m18640i(@NonNull Context context, @NonNull VastAd vastAd, @Nullable InterfaceC37262f interfaceC37262f) {
        String str;
        C33182b c33182b;
        long parseLong;
        int i;
        try {
            Uri m18649b = m18649b(context, vastAd.m79003s().m15752J());
            if (m18649b != null && !TextUtils.isEmpty(m18649b.getPath()) && new File(m18649b.getPath()).exists()) {
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(m18649b.getPath(), 1);
                if (createVideoThumbnail != null) {
                    if (!createVideoThumbnail.equals(Bitmap.createBitmap(createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), createVideoThumbnail.getConfig()))) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, m18649b);
                            parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            i = this.f98375n;
                        } catch (Exception e) {
                            C37248c.m18680b("VastRequest", e);
                            m18654X(C37263g.f98420k);
                            c33182b = C33182b.m24480j("Exception during metadata retrieval", e);
                        }
                        if (i != 0 && parseLong > i) {
                            m18654X(C37263g.f98413d);
                            m18636m(C33182b.m24489a("Estimated duration does not match actual duration"), interfaceC37262f);
                            m18641h(context);
                            return;
                        }
                        this.f98364c = m18649b;
                        m18639j(vastAd);
                        m18634o(interfaceC37262f);
                        m18641h(context);
                        return;
                    }
                    C37248c.m18681a("VastRequest", "Empty thumbnail", new Object[0]);
                    m18654X(C37263g.f98420k);
                    str = "Thumbnail is empty";
                } else {
                    C37248c.m18681a("VastRequest", "Video file not supported", new Object[0]);
                    m18654X(C37263g.f98420k);
                    str = "Failed to get thumbnail by file URI";
                }
                c33182b = C33182b.m24489a(str);
                m18636m(c33182b, interfaceC37262f);
                m18641h(context);
                return;
            }
            C37248c.m18681a("VastRequest", "fileUri is null", new Object[0]);
            m18654X(C37263g.f98415f);
            m18636m(C33182b.m24489a("Can't find video by local URI"), interfaceC37262f);
        } catch (Exception e2) {
            C37248c.m18680b("VastRequest", e2);
            m18654X(C37263g.f98415f);
            m18636m(C33182b.m24480j("Exception during caching media file", e2), interfaceC37262f);
        }
    }

    /* renamed from: j */
    private synchronized void m18639j(@NonNull VastAd vastAd) {
        if (this.f98369h == null) {
            return;
        }
        C10512g.m79328E(new RunnableC37260j(vastAd));
    }

    /* renamed from: k */
    private synchronized void m18638k(@NonNull C33182b c33182b) {
        if (this.f98369h == null) {
            return;
        }
        C10512g.m79328E(new RunnableC37252b(c33182b));
    }

    /* renamed from: l */
    private void m18637l(@NonNull C33182b c33182b, @Nullable InterfaceC37247b interfaceC37247b) {
        C37248c.m18681a("VastRequest", "sendShowFailed - %s", c33182b);
        C10512g.m79328E(new RunnableC37258h(interfaceC37247b, c33182b));
    }

    /* renamed from: m */
    private void m18636m(@NonNull C33182b c33182b, @Nullable InterfaceC37262f interfaceC37262f) {
        C37248c.m18681a("VastRequest", "sendLoadFailed - %s", c33182b);
        m18638k(c33182b);
        C10512g.m79328E(new RunnableC37257g(c33182b, interfaceC37262f));
    }

    /* renamed from: o */
    private void m18634o(@Nullable InterfaceC37262f interfaceC37262f) {
        if (this.f98385x.getAndSet(true)) {
            return;
        }
        C37248c.m18681a("VastRequest", "sendLoaded", new Object[0]);
        if (interfaceC37262f != null) {
            C10512g.m79328E(new RunnableC37256f(interfaceC37262f));
        }
    }

    /* renamed from: s */
    private String m18630s(@NonNull Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    /* renamed from: A */
    public void m18677A(@Nullable List<String> list, @Nullable Bundle bundle) {
        m18676B(list, bundle);
    }

    /* renamed from: B */
    public void m18676B(@Nullable List<String> list, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f98367f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            C37264h.m18613b(list, bundle2, f98360A);
        } else {
            C37248c.m18681a("VastRequest", "Url list is null", new Object[0]);
        }
    }

    @NonNull
    /* renamed from: C */
    public EnumC33181a m18675C() {
        return this.f98363b;
    }

    /* renamed from: D */
    public float m18674D() {
        return this.f98373l;
    }

    @Nullable
    /* renamed from: E */
    public Uri m18673E() {
        return this.f98364c;
    }

    /* renamed from: F */
    public int m18672F() {
        return this.f98383v;
    }

    /* renamed from: G */
    public float m18671G() {
        return this.f98384w;
    }

    @NonNull
    /* renamed from: H */
    public String m18670H() {
        return this.f98362a;
    }

    /* renamed from: I */
    public int m18669I() {
        return this.f98375n;
    }

    /* renamed from: J */
    public float m18668J() {
        return this.f98371j;
    }

    /* renamed from: K */
    public int m18667K() {
        if (!m18646c0()) {
            return 0;
        }
        VastAd vastAd = this.f98365d;
        if (vastAd != null) {
            C37905n m79003s = vastAd.m79003s();
            return C10512g.m79325H(m79003s.m15779T(), m79003s.m15781R());
        }
        return 2;
    }

    /* renamed from: L */
    public int m18666L() {
        return this.f98376o;
    }

    @Nullable
    /* renamed from: M */
    public VastAd m18665M() {
        return this.f98365d;
    }

    @Nullable
    /* renamed from: N */
    public Float m18664N() {
        return this.f98372k;
    }

    @NonNull
    /* renamed from: O */
    public EnumC37268j m18663O() {
        return this.f98366e;
    }

    /* renamed from: P */
    public boolean m18662P() {
        return this.f98377p;
    }

    /* renamed from: Q */
    public boolean m18661Q() {
        return this.f98374m;
    }

    /* renamed from: R */
    public boolean m18660R() {
        return this.f98381t;
    }

    /* renamed from: S */
    public boolean m18659S() {
        return this.f98382u;
    }

    /* renamed from: T */
    public void m18658T(@NonNull Context context, @NonNull String str, @Nullable InterfaceC37262f interfaceC37262f) {
        C33182b m24480j;
        C37248c.m18681a("VastRequest", "loadVideoWithData\n%s", str);
        this.f98365d = null;
        if (C10512g.m79292y(context)) {
            try {
                new C37254d(context, str, interfaceC37262f).start();
                return;
            } catch (Exception e) {
                C37248c.m18680b("VastRequest", e);
                m24480j = C33182b.m24480j("Exception during creating background thread", e);
            }
        } else {
            m24480j = C33182b.f90674c;
        }
        m18636m(m24480j, interfaceC37262f);
    }

    /* renamed from: U */
    public void m18657U(@NonNull Context context, @NonNull String str, @Nullable InterfaceC37262f interfaceC37262f) {
        String str2;
        AbstractC10588b abstractC10588b = this.f98368g;
        if (abstractC10588b == null) {
            abstractC10588b = new C10585a(context);
        }
        C10590d m78987b = new C10589c(this, abstractC10588b).m78987b(str);
        VastAd m78971f = m78987b.m78971f();
        this.f98365d = m78971f;
        if (m78971f == null) {
            C37263g m78970g = m78987b.m78970g();
            if (m78970g != null) {
                m18654X(m78970g);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(m78970g.m18615a()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            m18636m(C33182b.m24489a(str2), interfaceC37262f);
            return;
        }
        m78971f.m78999w(this);
        C37896e m79011k = this.f98365d.m79011k();
        if (m79011k != null) {
            Boolean mo15812o = m79011k.mo15812o();
            if (mo15812o != null) {
                if (mo15812o.booleanValue()) {
                    this.f98378q = false;
                    this.f98379r = false;
                } else {
                    this.f98378q = true;
                    this.f98379r = true;
                }
            }
            if (m79011k.mo15823d().m15777R() > 0.0f) {
                this.f98373l = m79011k.mo15823d().m15777R();
            }
            this.f98381t = m79011k.mo15815l();
            this.f98382u = m79011k.mo15817j();
            Integer mo15821f = m79011k.mo15821f();
            if (mo15821f != null) {
                this.f98383v = mo15821f.intValue();
            }
        }
        this.f98384w = m18643f(this.f98365d, m79011k).floatValue();
        InterfaceC33595c interfaceC33595c = this.f98370i;
        if (interfaceC33595c != null) {
            interfaceC33595c.onVastModelLoaded(this);
        }
        int i = C37253c.f98390a[this.f98363b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m18634o(interfaceC37262f);
                } else {
                    return;
                }
            } else {
                m18634o(interfaceC37262f);
                return;
            }
        }
        m18640i(context, this.f98365d, interfaceC37262f);
    }

    /* renamed from: W */
    public void m18655W(@NonNull Context context, @Nullable InterfaceC37262f interfaceC37262f) {
        if (this.f98365d == null) {
            m18636m(C33182b.m24484f("VastAd is null during performCache"), interfaceC37262f);
            return;
        }
        try {
            new C37255e(context, interfaceC37262f).start();
        } catch (Exception e) {
            C37248c.m18680b("VastRequest", e);
            m18636m(C33182b.m24480j("Exception during creating background thread", e), interfaceC37262f);
        }
    }

    /* renamed from: X */
    public void m18654X(@NonNull C37263g c37263g) {
        C37248c.m18681a("VastRequest", "sendVastSpecError - %s", c37263g);
        try {
            if (this.f98365d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("params_error_code", c37263g.m18615a());
                m18677A(this.f98365d.m79005q(), bundle);
            }
        } catch (Exception e) {
            C37248c.m18680b("VastRequest", e);
        }
    }

    /* renamed from: Z */
    public synchronized void m18652Z(@Nullable InterfaceC37274n interfaceC37274n) {
        this.f98369h = interfaceC37274n;
    }

    /* renamed from: a0 */
    public boolean m18650a0() {
        return this.f98380s;
    }

    /* renamed from: b0 */
    public boolean m18648b0() {
        return this.f98379r;
    }

    /* renamed from: c0 */
    public boolean m18646c0() {
        return this.f98378q;
    }

    /* renamed from: u */
    public boolean m18628u() {
        if (this.f98385x.get() && (this.f98363b != EnumC33181a.FullLoad || m18627v())) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean m18627v() {
        try {
            Uri uri = this.f98364c;
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return false;
            }
            if (!new File(this.f98364c.getPath()).exists()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: x */
    public void m18625x(@NonNull Context context, @NonNull EnumC37268j enumC37268j, @Nullable InterfaceC37247b interfaceC37247b, @Nullable VastView vastView, @Nullable InterfaceC37249d interfaceC37249d, @Nullable InterfaceC33594b interfaceC33594b) {
        C37248c.m18681a("VastRequest", "display", new Object[0]);
        this.f98386y.set(true);
        if (this.f98365d == null) {
            m18637l(C33182b.m24484f("VastAd is null during display VastActivity"), interfaceC37247b);
            return;
        }
        this.f98366e = enumC37268j;
        this.f98376o = context.getResources().getConfiguration().orientation;
        C33182b m79142b = new VastActivity.C10547a().m79137g(this).m79140d(interfaceC37247b).m79136h(vastView).m79139e(interfaceC37249d).m79141c(this.f98370i).m79138f(interfaceC33594b).m79142b(context);
        if (m79142b != null) {
            m18637l(m79142b, interfaceC37247b);
        }
    }
}
