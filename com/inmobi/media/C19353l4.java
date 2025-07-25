package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.l4 */
/* loaded from: classes6.dex */
public final class C19353l4 implements InterfaceC19274f9 {

    /* renamed from: a */
    public final WeakReference f48462a;

    /* renamed from: b */
    public InterfaceC19432r f48463b;

    /* renamed from: c */
    public AbstractC18859B f48464c;

    /* renamed from: d */
    public RelativeLayout f48465d;

    /* renamed from: e */
    public C19366m3 f48466e;

    /* renamed from: f */
    public EnumC19232c9 f48467f;

    /* renamed from: g */
    public float f48468g;

    /* renamed from: h */
    public InterfaceC18850A4 f48469h;

    /* renamed from: i */
    public final C19339k4 f48470i;

    /* renamed from: j */
    public final C19325j4 f48471j;

    public C19353l4(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f48462a = new WeakReference(activity);
        this.f48467f = AbstractC19246d9.m60379a(AbstractC19338k3.m60124g());
        this.f48468g = 1.0f;
        this.f48470i = new C19339k4(this);
        this.f48471j = new C19325j4(this);
    }

    /* renamed from: a */
    public final void m60075a(Intent intent, SparseArray adContainers) {
        C19366m3 c19366m3;
        Window window;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(adContainers, "adContainers");
        if (intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            InterfaceC19432r interfaceC19432r = (InterfaceC19432r) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
            if (interfaceC19432r == null) {
                m60071b();
                return;
            }
            int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
            if (intExtra == 0) {
                InterfaceC19418q fullScreenEventsListener = interfaceC19432r.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.mo59957a();
                }
                m60071b();
                return;
            }
            if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f48462a.get() instanceof InMobiAdActivity)) {
                Object obj = this.f48462a.get();
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                if (!((InMobiAdActivity) obj).f47061g) {
                    Object obj2 = this.f48462a.get();
                    Intrinsics.m17073h(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                    ((InMobiAdActivity) obj2).f47061g = true;
                    if (!(interfaceC19432r instanceof GestureDetector$OnGestureListenerC19100S9) ? false : ((GestureDetector$OnGestureListenerC19100S9) interfaceC19432r).f47715D0) {
                        InterfaceC18850A4 interfaceC18850A4 = this.f48469h;
                        if (interfaceC18850A4 != null) {
                            ((C18864B4) interfaceC18850A4).m61259a("InMobiActivityViewHandler", "showInImmersiveMode");
                        }
                        Object obj3 = this.f48462a.get();
                        InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                        if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                            C19212b3 c19212b3 = C19212b3.f48088a;
                            if (c19212b3.m60476E()) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.layoutInDisplayCutoutMode = 3;
                                window.setAttributes(attributes);
                                WindowCompat.setDecorFitsSystemWindows(window, false);
                            }
                            if (c19212b3.m60478C()) {
                                WindowManager.LayoutParams attributes2 = window.getAttributes();
                                attributes2.layoutInDisplayCutoutMode = 1;
                                window.setAttributes(attributes2);
                                WindowCompat.setDecorFitsSystemWindows(window, false);
                            }
                            if (c19212b3.m60476E()) {
                                WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                                if (insetsController != null) {
                                    insetsController.setSystemBarsBehavior(2);
                                }
                                if (insetsController != null) {
                                    insetsController.hide(WindowInsetsCompat.Type.systemBars());
                                }
                                if (insetsController != null) {
                                    insetsController.hide(WindowInsetsCompat.Type.displayCutout());
                                }
                            } else if (c19212b3.m60439x()) {
                                window.getDecorView().setSystemUiVisibility(5638);
                            }
                        }
                    } else {
                        Activity activity = (Activity) this.f48462a.get();
                        if (activity != null) {
                            Intrinsics.checkNotNullParameter(activity, "<this>");
                            try {
                                activity.requestWindowFeature(1);
                                activity.getWindow().setFlags(1024, 1024);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if ((200 == intExtra && !Intrinsics.m17075f("html", interfaceC19432r.getMarkupType())) || ((202 == intExtra && !Intrinsics.m17075f("htmlUrl", interfaceC19432r.getMarkupType())) || (201 == intExtra && !Intrinsics.m17075f("inmobiJson", interfaceC19432r.getMarkupType())))) {
                InterfaceC19418q fullScreenEventsListener2 = interfaceC19432r.getFullScreenEventsListener();
                if (fullScreenEventsListener2 != null) {
                    fullScreenEventsListener2.mo59957a();
                }
                m60071b();
                return;
            }
            try {
                this.f48463b = interfaceC19432r;
                interfaceC19432r.setFullScreenActivityContext((Activity) this.f48462a.get());
                m60077a();
                Activity activity2 = (Activity) this.f48462a.get();
                if (activity2 != null) {
                    RelativeLayout relativeLayout = new RelativeLayout(activity2);
                    relativeLayout.setId(65534);
                    this.f48465d = relativeLayout;
                }
                m60072a(interfaceC19432r);
                AbstractC18859B abstractC18859B = this.f48464c;
                if (abstractC18859B != null) {
                    abstractC18859B.mo59899f();
                }
                Activity activity3 = (Activity) this.f48462a.get();
                if (activity3 != null) {
                    FrameLayout frameLayout = (FrameLayout) activity3.findViewById(16908290);
                    RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                    RelativeLayout relativeLayout3 = this.f48465d;
                    if (relativeLayout3 != null && relativeLayout2 != null) {
                        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                        if (relativeLayout4 != null) {
                            relativeLayout2.removeView(relativeLayout4);
                        }
                        relativeLayout2.addView(relativeLayout3);
                        AbstractC18859B abstractC18859B2 = this.f48464c;
                        if (abstractC18859B2 != null) {
                            abstractC18859B2.m61262e();
                        }
                    }
                }
                if (interfaceC19432r instanceof GestureDetector$OnGestureListenerC19100S9) {
                    ((GestureDetector$OnGestureListenerC19100S9) interfaceC19432r).setEmbeddedBrowserJSCallbacks(this.f48471j);
                }
                if ((interfaceC19432r instanceof GestureDetector$OnGestureListenerC19100S9) && (c19366m3 = this.f48466e) != null) {
                    c19366m3.setUserLeftApplicationListener(((GestureDetector$OnGestureListenerC19100S9) interfaceC19432r).getListener());
                    return;
                }
                return;
            } catch (Exception e) {
                interfaceC19432r.setFullScreenActivityContext(null);
                InterfaceC19418q fullScreenEventsListener3 = interfaceC19432r.getFullScreenEventsListener();
                if (fullScreenEventsListener3 != null) {
                    fullScreenEventsListener3.mo59957a();
                }
                m60071b();
                C19070Q4 c19070q4 = C19070Q4.f47635a;
                C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
                return;
            }
        }
        m60071b();
    }

    /* renamed from: b */
    public final void m60071b() {
        Activity activity = (Activity) this.f48462a.get();
        if (!(activity instanceof InMobiAdActivity)) {
            return;
        }
        ((InMobiAdActivity) activity).finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60070c() {
        /*
            r5 = this;
            com.inmobi.media.m3 r0 = r5.f48466e
            if (r0 != 0) goto L5
            return
        L5:
            com.inmobi.media.r r0 = r5.f48463b
            r1 = 1
            if (r0 == 0) goto L1b
            boolean r2 = r0 instanceof com.inmobi.media.GestureDetector$OnGestureListenerC19100S9
            if (r2 != 0) goto L10
            r0 = 0
            goto L14
        L10:
            com.inmobi.media.S9 r0 = (com.inmobi.media.GestureDetector$OnGestureListenerC19100S9) r0
            boolean r0 = r0.f47715D0
        L14:
            if (r0 != r1) goto L1b
            com.inmobi.media.l3 r0 = com.inmobi.media.AbstractC19338k3.m60123h()
            goto L1f
        L1b:
            com.inmobi.media.l3 r0 = com.inmobi.media.AbstractC19338k3.m60127d()
        L1f:
            int r2 = r0.f48459a
            float r2 = (float) r2
            float r3 = r0.f48461c
            float r2 = r2 * r3
            int r0 = r0.f48460b
            float r0 = (float) r0
            float r0 = r0 * r3
            com.inmobi.media.c9 r3 = r5.f48467f
            boolean r3 = com.inmobi.media.AbstractC19246d9.m60377b(r3)
            r4 = -1
            if (r3 == 0) goto L3f
            float r0 = (float) r1
            float r1 = r5.f48468g
            float r0 = r0 - r1
            float r0 = r0 * r2
            int r0 = be.C3396a.m103797d(r0)
            r5.m60076a(r0, r4)
            goto L4b
        L3f:
            float r1 = (float) r1
            float r2 = r5.f48468g
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r0 = be.C3396a.m103797d(r1)
            r5.m60076a(r4, r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19353l4.m60070c():void");
    }

    /* renamed from: a */
    public final void m60077a() {
        Activity activity = (Activity) this.f48462a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r1 = new com.inmobi.media.C19159X3(r4.f48462a, r5, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60072a(com.inmobi.media.InterfaceC19432r r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f48462a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.widget.RelativeLayout r0 = r4.f48465d
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.String r1 = r5.getMarkupType()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r2 == r3) goto L40
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L30
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 != r3) goto Lab
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            goto L38
        L30:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
        L38:
            com.inmobi.media.X3 r1 = new com.inmobi.media.X3
            java.lang.ref.WeakReference r2 = r4.f48462a
            r1.<init>(r2, r5, r0)
            goto L4f
        L40:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            com.inmobi.media.t5 r1 = new com.inmobi.media.t5
            java.lang.ref.WeakReference r2 = r4.f48462a
            r1.<init>(r2, r5, r0)
        L4f:
            r4.f48464c = r1
            com.inmobi.media.c9 r0 = r4.f48467f
            r1.mo60565a(r0)
            float r0 = r4.f48468g
            r1.f47105c = r0
            boolean r0 = r5 instanceof com.inmobi.media.GestureDetector$OnGestureListenerC19100S9
            r2 = 0
            if (r0 != 0) goto L61
            r3 = r2
            goto L66
        L61:
            r3 = r5
            com.inmobi.media.S9 r3 = (com.inmobi.media.GestureDetector$OnGestureListenerC19100S9) r3
            boolean r3 = r3.f47715D0
        L66:
            r1.f47106d = r3
            boolean r3 = r1 instanceof com.inmobi.media.C19159X3
            if (r3 == 0) goto Laa
            if (r0 != 0) goto L6f
            goto L73
        L6f:
            com.inmobi.media.S9 r5 = (com.inmobi.media.GestureDetector$OnGestureListenerC19100S9) r5
            boolean r2 = r5.f47715D0
        L73:
            if (r2 == 0) goto Laa
            com.inmobi.media.X3 r1 = (com.inmobi.media.C19159X3) r1
            com.inmobi.media.Aa r5 = new com.inmobi.media.Aa
            java.lang.ref.WeakReference r0 = r1.f47953e
            com.inmobi.media.r r2 = r1.f47954f
            java.lang.String r3 = "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView"
            kotlin.jvm.internal.Intrinsics.m17073h(r2, r3)
            com.inmobi.media.S9 r2 = (com.inmobi.media.GestureDetector$OnGestureListenerC19100S9) r2
            r5.<init>(r0, r2)
            boolean r2 = com.inmobi.media.AbstractC19338k3.f48438i
            if (r2 != 0) goto L8c
            goto La8
        L8c:
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L95
            goto La8
        L95:
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L9c
            goto La8
        L9c:
            android.view.View r0 = r0.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r5.m61269a(r0)
        La8:
            r1.f47957i = r5
        Laa:
            return
        Lab:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InMobiActivityViewHandler: Unknown Markup type"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19353l4.m60072a(com.inmobi.media.r):void");
    }

    @Override // com.inmobi.media.InterfaceC19274f9
    /* renamed from: a */
    public final void mo60074a(EnumC19232c9 orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (((Activity) this.f48462a.get()) == null) {
            return;
        }
        AbstractC18859B abstractC18859B = this.f48464c;
        if (abstractC18859B != null) {
            abstractC18859B.mo60565a(orientation);
        }
        EnumC19232c9 enumC19232c9 = this.f48467f;
        if (enumC19232c9 != orientation && AbstractC19246d9.m60377b(enumC19232c9) != AbstractC19246d9.m60377b(orientation)) {
            Objects.toString(orientation);
            this.f48467f = orientation;
            AbstractC18859B abstractC18859B2 = this.f48464c;
            if (abstractC18859B2 != null) {
                abstractC18859B2.m61262e();
            }
            m60070c();
            return;
        }
        Objects.toString(orientation);
        this.f48467f = orientation;
    }

    /* renamed from: a */
    public static final void m60073a(C19353l4 c19353l4) {
        C19366m3 c19366m3 = c19353l4.f48466e;
        if (c19366m3 != null) {
            c19366m3.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        C19366m3 c19366m32 = c19353l4.f48466e;
        if (c19366m32 != null) {
            ViewParent parent = c19366m32.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c19366m32);
            }
        }
        C19366m3 c19366m33 = c19353l4.f48466e;
        if (c19366m33 != null) {
            C19450s3 c19450s3 = c19366m33.f48488b;
            if (c19450s3 != null) {
                c19450s3.destroy();
            }
            c19366m33.f48488b = null;
            c19366m33.f48489c = null;
            c19366m33.f48490d = null;
            c19366m33.removeAllViews();
        }
        c19353l4.f48466e = null;
        c19353l4.f48468g = 1.0f;
        AbstractC18859B abstractC18859B = c19353l4.f48464c;
        if (abstractC18859B != null) {
            abstractC18859B.f47105c = 1.0f;
            abstractC18859B.m61262e();
        }
    }

    /* renamed from: a */
    public final void m60076a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.f48462a.get();
        if (activity == null) {
            return;
        }
        AbstractC19246d9.m60377b(this.f48467f);
        if (AbstractC19246d9.m60377b(this.f48467f)) {
            layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(65519);
        Intrinsics.m17074g(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            C19366m3 c19366m3 = this.f48466e;
            if (c19366m3 == null) {
                return;
            }
            c19366m3.setLayoutParams(layoutParams);
            return;
        }
        C19366m3 c19366m32 = this.f48466e;
        if (c19366m32 != null) {
            relativeLayout.addView(c19366m32, layoutParams);
        }
    }
}
